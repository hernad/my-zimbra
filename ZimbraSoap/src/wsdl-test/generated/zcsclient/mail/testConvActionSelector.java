
package generated.zcsclient.mail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for convActionSelector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="convActionSelector">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:zimbraMail}actionSelector">
 *       &lt;sequence>
 *         &lt;element name="acctRelPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "convActionSelector", propOrder = {
    "acctRelPath"
})
public class testConvActionSelector
    extends testActionSelector
{

    protected String acctRelPath;

    /**
     * Gets the value of the acctRelPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctRelPath() {
        return acctRelPath;
    }

    /**
     * Sets the value of the acctRelPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctRelPath(String value) {
        this.acctRelPath = value;
    }

}
