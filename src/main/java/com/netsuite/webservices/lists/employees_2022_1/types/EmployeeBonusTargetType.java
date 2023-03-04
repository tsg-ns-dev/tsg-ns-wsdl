
package com.netsuite.webservices.lists.employees_2022_1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeBonusTargetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmployeeBonusTargetType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_amount"/&gt;
 *     &lt;enumeration value="_percent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmployeeBonusTargetType", namespace = "urn:types.employees_2022_1.lists.webservices.netsuite.com")
@XmlEnum
public enum EmployeeBonusTargetType {

    @XmlEnumValue("_amount")
    AMOUNT("_amount"),
    @XmlEnumValue("_percent")
    PERCENT("_percent");
    private final String value;

    EmployeeBonusTargetType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmployeeBonusTargetType fromValue(String v) {
        for (EmployeeBonusTargetType c: EmployeeBonusTargetType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
