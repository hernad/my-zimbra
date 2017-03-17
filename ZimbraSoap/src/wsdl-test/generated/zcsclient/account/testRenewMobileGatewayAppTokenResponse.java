
package generated.zcsclient.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for renewMobileGatewayAppTokenResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="renewMobileGatewayAppTokenResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authToken" type="{urn:zimbraAccount}authToken"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "renewMobileGatewayAppTokenResponse", propOrder = {
    "authToken"
})
public class testRenewMobileGatewayAppTokenResponse {

    @XmlElement(required = true)
    protected testAuthToken authToken;

    /**
     * Gets the value of the authToken property.
     * 
     * @return
     *     possible object is
     *     {@link testAuthToken }
     *     
     */
    public testAuthToken getAuthToken() {
        return authToken;
    }

    /**
     * Sets the value of the authToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link testAuthToken }
     *     
     */
    public void setAuthToken(testAuthToken value) {
        this.authToken = value;
    }

}
