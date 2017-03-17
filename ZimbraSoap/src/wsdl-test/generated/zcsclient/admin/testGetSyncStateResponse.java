
package generated.zcsclient.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSyncStateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSyncStateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="domain" type="{urn:zimbraAdmin}syncStateInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSyncStateResponse", propOrder = {
    "domain"
})
public class testGetSyncStateResponse {

    @XmlElement(required = true)
    protected testSyncStateInfo domain;

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link testSyncStateInfo }
     *     
     */
    public testSyncStateInfo getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link testSyncStateInfo }
     *     
     */
    public void setDomain(testSyncStateInfo value) {
        this.domain = value;
    }

}
