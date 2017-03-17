
package generated.zcsclient.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registerMobileGatewayAppRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registerMobileGatewayAppRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zmgDevice" type="{urn:zimbraAccount}zmgDeviceSpec"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registerMobileGatewayAppRequest", propOrder = {
    "zmgDevice"
})
public class testRegisterMobileGatewayAppRequest {

    @XmlElement(required = true)
    protected testZmgDeviceSpec zmgDevice;

    /**
     * Gets the value of the zmgDevice property.
     * 
     * @return
     *     possible object is
     *     {@link testZmgDeviceSpec }
     *     
     */
    public testZmgDeviceSpec getZmgDevice() {
        return zmgDevice;
    }

    /**
     * Sets the value of the zmgDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link testZmgDeviceSpec }
     *     
     */
    public void setZmgDevice(testZmgDeviceSpec value) {
        this.zmgDevice = value;
    }

}
