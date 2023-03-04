
package com.netsuite.webservices.lists.employees_2022_1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeTerminationRegretted.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmployeeTerminationRegretted"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_no"/&gt;
 *     &lt;enumeration value="_unspecified"/&gt;
 *     &lt;enumeration value="_yes"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmployeeTerminationRegretted", namespace = "urn:types.employees_2022_1.lists.webservices.netsuite.com")
@XmlEnum
public enum EmployeeTerminationRegretted {

    @XmlEnumValue("_no")
    NO("_no"),
    @XmlEnumValue("_unspecified")
    UNSPECIFIED("_unspecified"),
    @XmlEnumValue("_yes")
    YES("_yes");
    private final String value;

    EmployeeTerminationRegretted(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmployeeTerminationRegretted fromValue(String v) {
        for (EmployeeTerminationRegretted c: EmployeeTerminationRegretted.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
