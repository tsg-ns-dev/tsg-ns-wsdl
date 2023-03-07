
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeWorkAssignment.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EmployeeWorkAssignment"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_job"/&gt;
 *     &lt;enumeration value="_position"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmployeeWorkAssignment", namespace = "urn:types.employees_2022_2.lists.webservices.netsuite.com")
@XmlEnum
public enum EmployeeWorkAssignment {

    @XmlEnumValue("_job")
    JOB("_job"),
    @XmlEnumValue("_position")
    POSITION("_position");
    private final String value;

    EmployeeWorkAssignment(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmployeeWorkAssignment fromValue(String v) {
        for (EmployeeWorkAssignment c: EmployeeWorkAssignment.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
