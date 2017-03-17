
package generated.zcsclient.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import generated.zcsclient.zm.testAttributeSelectorImpl;


/**
 * <p>Java class for getAlwaysOnClusterRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAlwaysOnClusterRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:zimbra}attributeSelectorImpl">
 *       &lt;sequence>
 *         &lt;element name="alwaysOnCluster" type="{urn:zimbraAdmin}alwaysOnClusterSelector" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAlwaysOnClusterRequest", propOrder = {
    "alwaysOnCluster"
})
public class testGetAlwaysOnClusterRequest
    extends testAttributeSelectorImpl
{

    protected testAlwaysOnClusterSelector alwaysOnCluster;

    /**
     * Gets the value of the alwaysOnCluster property.
     * 
     * @return
     *     possible object is
     *     {@link testAlwaysOnClusterSelector }
     *     
     */
    public testAlwaysOnClusterSelector getAlwaysOnCluster() {
        return alwaysOnCluster;
    }

    /**
     * Sets the value of the alwaysOnCluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link testAlwaysOnClusterSelector }
     *     
     */
    public void setAlwaysOnCluster(testAlwaysOnClusterSelector value) {
        this.alwaysOnCluster = value;
    }

}
