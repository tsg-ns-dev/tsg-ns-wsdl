
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcoholRecipientType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AlcoholRecipientType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_consumer"/&gt;
 *     &lt;enumeration value="_licensee"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AlcoholRecipientType", namespace = "urn:types.common_2022_2.platform.webservices.netsuite.com")
@XmlEnum
public enum AlcoholRecipientType {

    @XmlEnumValue("_consumer")
    CONSUMER("_consumer"),
    @XmlEnumValue("_licensee")
    LICENSEE("_licensee");
    private final String value;

    AlcoholRecipientType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlcoholRecipientType fromValue(String v) {
        for (AlcoholRecipientType c: AlcoholRecipientType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
