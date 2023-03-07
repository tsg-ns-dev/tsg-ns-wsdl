
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TermRecurrenceFrequency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TermRecurrenceFrequency"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_annually"/&gt;
 *     &lt;enumeration value="_daily"/&gt;
 *     &lt;enumeration value="_monthly"/&gt;
 *     &lt;enumeration value="_weekly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TermRecurrenceFrequency", namespace = "urn:types.common_2022_2.platform.webservices.netsuite.com")
@XmlEnum
public enum TermRecurrenceFrequency {

    @XmlEnumValue("_annually")
    ANNUALLY("_annually"),
    @XmlEnumValue("_daily")
    DAILY("_daily"),
    @XmlEnumValue("_monthly")
    MONTHLY("_monthly"),
    @XmlEnumValue("_weekly")
    WEEKLY("_weekly");
    private final String value;

    TermRecurrenceFrequency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TermRecurrenceFrequency fromValue(String v) {
        for (TermRecurrenceFrequency c: TermRecurrenceFrequency.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
