
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeBaseWageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EmployeeBaseWageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_annualSalary"/&gt;
 *     &lt;enumeration value="_hourly"/&gt;
 *     &lt;enumeration value="_monthlySalary"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmployeeBaseWageType", namespace = "urn:types.employees_2022_2.lists.webservices.netsuite.com")
@XmlEnum
public enum EmployeeBaseWageType {

    @XmlEnumValue("_annualSalary")
    ANNUAL_SALARY("_annualSalary"),
    @XmlEnumValue("_hourly")
    HOURLY("_hourly"),
    @XmlEnumValue("_monthlySalary")
    MONTHLY_SALARY("_monthlySalary");
    private final String value;

    EmployeeBaseWageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmployeeBaseWageType fromValue(String v) {
        for (EmployeeBaseWageType c: EmployeeBaseWageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
