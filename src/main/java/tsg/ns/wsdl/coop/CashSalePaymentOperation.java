
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashSalePaymentOperation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CashSalePaymentOperation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_authorization"/&gt;
 *     &lt;enumeration value="_capture"/&gt;
 *     &lt;enumeration value="_sale"/&gt;
 *     &lt;enumeration value="_refund"/&gt;
 *     &lt;enumeration value="_credit"/&gt;
 *     &lt;enumeration value="_refresh"/&gt;
 *     &lt;enumeration value="_void"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CashSalePaymentOperation", namespace = "urn:types.sales_2022_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum CashSalePaymentOperation {

    @XmlEnumValue("_authorization")
    AUTHORIZATION("_authorization"),
    @XmlEnumValue("_capture")
    CAPTURE("_capture"),
    @XmlEnumValue("_sale")
    SALE("_sale"),
    @XmlEnumValue("_refund")
    REFUND("_refund"),
    @XmlEnumValue("_credit")
    CREDIT("_credit"),
    @XmlEnumValue("_refresh")
    REFRESH("_refresh"),
    @XmlEnumValue("_void")
    VOID("_void");
    private final String value;

    CashSalePaymentOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CashSalePaymentOperation fromValue(String v) {
        for (CashSalePaymentOperation c: CashSalePaymentOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
