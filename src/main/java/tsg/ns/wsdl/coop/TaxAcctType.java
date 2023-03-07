
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxAcctType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TaxAcctType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_sale"/&gt;
 *     &lt;enumeration value="_purchase"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxAcctType", namespace = "urn:types.accounting_2022_2.lists.webservices.netsuite.com")
@XmlEnum
public enum TaxAcctType {

    @XmlEnumValue("_sale")
    SALE("_sale"),
    @XmlEnumValue("_purchase")
    PURCHASE("_purchase");
    private final String value;

    TaxAcctType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxAcctType fromValue(String v) {
        for (TaxAcctType c: TaxAcctType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
