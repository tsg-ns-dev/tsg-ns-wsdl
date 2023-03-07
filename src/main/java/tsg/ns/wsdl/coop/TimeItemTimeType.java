
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeItemTimeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TimeItemTimeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_actualTime"/&gt;
 *     &lt;enumeration value="_plannedTime"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TimeItemTimeType", namespace = "urn:types.common_2022_2.platform.webservices.netsuite.com")
@XmlEnum
public enum TimeItemTimeType {

    @XmlEnumValue("_actualTime")
    ACTUAL_TIME("_actualTime"),
    @XmlEnumValue("_plannedTime")
    PLANNED_TIME("_plannedTime");
    private final String value;

    TimeItemTimeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeItemTimeType fromValue(String v) {
        for (TimeItemTimeType c: TimeItemTimeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
