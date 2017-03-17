
package generated.zcsclient.zm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for msgContent.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="msgContent">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="full"/>
 *     &lt;enumeration value="original"/>
 *     &lt;enumeration value="both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "msgContent")
@XmlEnum
public enum testMsgContent {

    @XmlEnumValue("full")
    FULL("full"),
    @XmlEnumValue("original")
    ORIGINAL("original"),
    @XmlEnumValue("both")
    BOTH("both");
    private final String value;

    testMsgContent(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static testMsgContent fromValue(String v) {
        for (testMsgContent c: testMsgContent.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
