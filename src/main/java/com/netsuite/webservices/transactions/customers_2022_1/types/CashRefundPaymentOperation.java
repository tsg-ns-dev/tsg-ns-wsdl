
package com.netsuite.webservices.transactions.customers_2022_1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashRefundPaymentOperation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CashRefundPaymentOperation"&gt;
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
@XmlType(name = "CashRefundPaymentOperation", namespace = "urn:types.customers_2022_1.transactions.webservices.netsuite.com")
@XmlEnum
public enum CashRefundPaymentOperation {

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

    CashRefundPaymentOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CashRefundPaymentOperation fromValue(String v) {
        for (CashRefundPaymentOperation c: CashRefundPaymentOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}