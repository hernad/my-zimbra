
package generated.zcsclient.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modifyAlwaysOnClusterResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifyAlwaysOnClusterResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:zimbraAdmin}alwaysOnCluster" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifyAlwaysOnClusterResponse", propOrder = {
    "alwaysOnCluster"
})
public class testModifyAlwaysOnClusterResponse {

    protected testAlwaysOnClusterInfo alwaysOnCluster;

    /**
     * Gets the value of the alwaysOnCluster property.
     * 
     * @return
     *     possible object is
     *     {@link testAlwaysOnClusterInfo }
     *     
     */
    public testAlwaysOnClusterInfo getAlwaysOnCluster() {
        return alwaysOnCluster;
    }

    /**
     * Sets the value of the alwaysOnCluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link testAlwaysOnClusterInfo }
     *     
     */
    public void setAlwaysOnCluster(testAlwaysOnClusterInfo value) {
        this.alwaysOnCluster = value;
    }

}
