
package generated.zcsclient.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGcmSenderIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGcmSenderIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gcmSenderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGcmSenderIdResponse", propOrder = {
    "gcmSenderId"
})
public class testGetGcmSenderIdResponse {

    @XmlElement(required = true)
    protected String gcmSenderId;

    /**
     * Gets the value of the gcmSenderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGcmSenderId() {
        return gcmSenderId;
    }

    /**
     * Sets the value of the gcmSenderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGcmSenderId(String value) {
        this.gcmSenderId = value;
    }

}
