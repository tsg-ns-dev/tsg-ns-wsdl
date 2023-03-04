
package com.netsuite.webservices.transactions.sales_2022_1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UsageStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UsageStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_active"/&gt;
 *     &lt;enumeration value="_voided"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UsageStatus", namespace = "urn:types.sales_2022_1.transactions.webservices.netsuite.com")
@XmlEnum
public enum UsageStatus {

    @XmlEnumValue("_active")
    ACTIVE("_active"),
    @XmlEnumValue("_voided")
    VOIDED("_voided");
    private final String value;

    UsageStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UsageStatus fromValue(String v) {
        for (UsageStatus c: UsageStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
