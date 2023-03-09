
package tsg.ns.wsdl.coop;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentCardType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentCardType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_credit"/&gt;
 *     &lt;enumeration value="_debit"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentCardType", namespace = "urn:types.accounting_2022_2.lists.webservices.netsuite.com")
@XmlEnum
public enum PaymentCardType {

    @XmlEnumValue("_credit")
    CREDIT("_credit"),
    @XmlEnumValue("_debit")
    DEBIT("_debit");
    private final String value;

    PaymentCardType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentCardType fromValue(String v) {
        for (PaymentCardType c: PaymentCardType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
