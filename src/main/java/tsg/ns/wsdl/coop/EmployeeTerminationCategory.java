
package tsg.ns.wsdl.coop;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeTerminationCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmployeeTerminationCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_involuntary"/&gt;
 *     &lt;enumeration value="_voluntary"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmployeeTerminationCategory", namespace = "urn:types.employees_2022_2.lists.webservices.netsuite.com")
@XmlEnum
public enum EmployeeTerminationCategory {

    @XmlEnumValue("_involuntary")
    INVOLUNTARY("_involuntary"),
    @XmlEnumValue("_voluntary")
    VOLUNTARY("_voluntary");
    private final String value;

    EmployeeTerminationCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmployeeTerminationCategory fromValue(String v) {
        for (EmployeeTerminationCategory c: EmployeeTerminationCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
