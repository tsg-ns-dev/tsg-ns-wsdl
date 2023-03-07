
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RevRecScheduleAmortizationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RevRecScheduleAmortizationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_standard"/&gt;
 *     &lt;enumeration value="_variable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RevRecScheduleAmortizationType", namespace = "urn:types.accounting_2022_2.lists.webservices.netsuite.com")
@XmlEnum
public enum RevRecScheduleAmortizationType {

    @XmlEnumValue("_standard")
    STANDARD("_standard"),
    @XmlEnumValue("_variable")
    VARIABLE("_variable");
    private final String value;

    RevRecScheduleAmortizationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RevRecScheduleAmortizationType fromValue(String v) {
        for (RevRecScheduleAmortizationType c: RevRecScheduleAmortizationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
