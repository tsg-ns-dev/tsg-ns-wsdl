
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayrollItemAccountCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PayrollItemAccountCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_expense"/&gt;
 *     &lt;enumeration value="_liability"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PayrollItemAccountCategory", namespace = "urn:types.employees_2022_2.lists.webservices.netsuite.com")
@XmlEnum
public enum PayrollItemAccountCategory {

    @XmlEnumValue("_expense")
    EXPENSE("_expense"),
    @XmlEnumValue("_liability")
    LIABILITY("_liability");
    private final String value;

    PayrollItemAccountCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PayrollItemAccountCategory fromValue(String v) {
        for (PayrollItemAccountCategory c: PayrollItemAccountCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
