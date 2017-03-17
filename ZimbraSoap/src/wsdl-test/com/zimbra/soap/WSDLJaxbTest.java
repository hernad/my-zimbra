/*
 * ***** BEGIN LICENSE BLOCK *****
 * Zimbra Collaboration Suite Server
 * Copyright (C) 2011, 2013, 2014 Zimbra, Inc.
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software Foundation,
 * version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.
 * If not, see <http://www.gnu.org/licenses/>.
 * ***** END LICENSE BLOCK *****
 */
package com.zimbra.soap;

import generated.zcsclient.mail.testActionSelector;
import generated.zcsclient.mail.testConvActionRequest;
import generated.zcsclient.mail.testConvActionSelector;

import java.io.ByteArrayOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import junit.framework.Assert;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.w3c.dom.Node;

import com.zimbra.soap.account.message.GetInfoResponse;

/**
 * Unit test for {@link GetInfoResponse} which exercises
 * translation to and from Element
 *
 * @author Gren Elliot
 */
public class WSDLJaxbTest {
    private static final Logger LOG = Logger.getLogger(WSDLJaxbTest.class);

    static {
        BasicConfigurator.configure();
        Logger.getRootLogger().setLevel(Level.INFO);
        LOG.setLevel(Level.INFO);
    }

    @BeforeClass
    public static void init() throws Exception {
        // JAXBContext jaxb = JAXBContext.newInstance(GetInfoResponse.class);
        // unmarshaller = jaxb.createUnmarshaller();
        // getInfoResp = (GetInfoResponse) unmarshaller.unmarshal(
        //     JaxbToElementTest.class.getResourceAsStream("GetInfoResponse.xml"));
    }

    /**
     * Explore handling of Jaxb classes which specify an @XmlElement with
     * a super class.  How do subclasses get treated with this?
     */
    @Test
    public void ConvActionRequestJaxbSubclassHandlingTest() throws Exception {
        testConvActionSelector action = new testConvActionSelector();
        action.setId("ids");
        action.setOp("op");
        action.setL("folder");
        final String ACCT_REL_PATH = "acctRELATIVE-PATH";
        action.setAcctRelPath(ACCT_REL_PATH);
        testConvActionRequest car = new testConvActionRequest();
        car.setAction(action);
        Class<?> ctxClasses[] = new Class<?>[] { testConvActionRequest.class };
        JAXBContext jaxb = JAXBContext.newInstance(ctxClasses);
        Marshaller marshaller = jaxb.createMarshaller();
        DOMResult domRes = new DOMResult();
        // Specifying namespace in QName seems to cause problems, however, correct namespace seems to get there,
        // presumably from package-info
        JAXBElement<testConvActionRequest> jbe = new JAXBElement <testConvActionRequest>(
                new QName("ConvActionRequest"), testConvActionRequest.class, car);
        marshaller.marshal(jbe, domRes);
        Node docNode = domRes.getNode();
        String eXml = domToString((org.w3c.dom.Document) docNode);
        LOG.info("ConvActionRequestJaxbSubclassHandling: marshalled XML=" + eXml);
        Assert.assertTrue("Xml should contain recursive attribute", eXml.contains("l=\"folder\""));
        Unmarshaller unmarshaller = jaxb.createUnmarshaller();
        org.w3c.dom.Document doc = toW3cDom(eXml);
        jbe = unmarshaller.unmarshal(doc, testConvActionRequest.class);
        car = jbe.getValue();
        testActionSelector as = car.getAction();
        Assert.assertEquals("Folder attribute value", "folder", as.getL());
        if (as instanceof testConvActionSelector) {
            action = (testConvActionSelector)as;
            Assert.assertEquals("acctRelPath value", ACCT_REL_PATH, action.getAcctRelPath());
        } else {
            Assert.fail(String.format("Failed to get back correct class %s - got %s",
                    action.getClass().getName(), as.getClass().getName()));
        }
    }

    public static org.w3c.dom.Document toW3cDom(String xml)
    throws org.xml.sax.SAXException, java.io.IOException {
        return toW3cDom(new java.io.ByteArrayInputStream(xml.getBytes()));
    }

    public static org.w3c.dom.Document toW3cDom(java.io.InputStream is)
        throws org.xml.sax.SAXException, java.io.IOException {
        javax.xml.parsers.DocumentBuilderFactory factory =
                javax.xml.parsers.DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        javax.xml.parsers.DocumentBuilder builder = null;
        try {
            builder = factory.newDocumentBuilder();
        }
        catch (javax.xml.parsers.ParserConfigurationException ex) {
        }
        org.w3c.dom.Document doc = builder.parse(is);
        is.close();
        return doc;
    }

    public static String domToString(org.w3c.dom.Document document) {
        try {
            Source xmlSource = new DOMSource(document);
            StreamResult result = new StreamResult(new ByteArrayOutputStream());
            TransformerFactory transformerFactory =
                    TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty("indent", "yes"); //Java XML Indent
            transformer.transform(xmlSource, result);
            return result.getOutputStream().toString();
        } catch (TransformerFactoryConfigurationError factoryError) {
            LOG.error("Error creating TransformerFactory", factoryError);
        } catch (TransformerException transformerError) {
            LOG.error( "Error transforming document", transformerError);
        }
        return null;
    }

}
