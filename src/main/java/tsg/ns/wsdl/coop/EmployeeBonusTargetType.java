
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeBonusTargetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
@XmlType(name = "EmployeeBonusTargetType", namespace = "urn:types.employees_2022_2.lists.webservices.netsuite.com")
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
