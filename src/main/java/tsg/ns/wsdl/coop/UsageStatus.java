
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UsageStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="UsageStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_active"/&gt;
 *     &lt;enumeration value="_voided"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UsageStatus", namespace = "urn:types.sales_2022_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum UsageStatus {

    @XmlEnumValue("_active")
    ACTIVE("_active"),
    @XmlEnumValue("_voided")
    VOIDED("_voided");
    private final String value;

    UsageStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UsageStatus fromValue(String v) {
        for (UsageStatus c: UsageStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
