
package com.netsuite.webservices.lists.relationships_2022_1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerThirdPartyCarrier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerThirdPartyCarrier"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_fedex"/&gt;
 *     &lt;enumeration value="_ups"/&gt;
 *     &lt;enumeration value="_usps"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomerThirdPartyCarrier", namespace = "urn:types.relationships_2022_1.lists.webservices.netsuite.com")
@XmlEnum
public enum CustomerThirdPartyCarrier {

    @XmlEnumValue("_fedex")
    FEDEX("_fedex"),
    @XmlEnumValue("_ups")
    UPS("_ups"),
    @XmlEnumValue("_usps")
    USPS("_usps");
    private final String value;

    CustomerThirdPartyCarrier(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerThirdPartyCarrier fromValue(String v) {
        for (CustomerThirdPartyCarrier c: CustomerThirdPartyCarrier.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
