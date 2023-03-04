
package com.netsuite.webservices.transactions.customers_2022_1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerPaymentHandlingMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerPaymentHandlingMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_process"/&gt;
 *     &lt;enumeration value="_recordExternalEvent"/&gt;
 *     &lt;enumeration value="_saveOnly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomerPaymentHandlingMode", namespace = "urn:types.customers_2022_1.transactions.webservices.netsuite.com")
@XmlEnum
public enum CustomerPaymentHandlingMode {

    @XmlEnumValue("_process")
    PROCESS("_process"),
    @XmlEnumValue("_recordExternalEvent")
    RECORD_EXTERNAL_EVENT("_recordExternalEvent"),
    @XmlEnumValue("_saveOnly")
    SAVE_ONLY("_saveOnly");
    private final String value;

    CustomerPaymentHandlingMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerPaymentHandlingMode fromValue(String v) {
        for (CustomerPaymentHandlingMode c: CustomerPaymentHandlingMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
