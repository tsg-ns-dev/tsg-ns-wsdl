
package com.netsuite.webservices.transactions.purchases_2022_1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InboundShipmentShipmentStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InboundShipmentShipmentStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_closed"/&gt;
 *     &lt;enumeration value="_inTransit"/&gt;
 *     &lt;enumeration value="_partiallyReceived"/&gt;
 *     &lt;enumeration value="_received"/&gt;
 *     &lt;enumeration value="_toBeShipped"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InboundShipmentShipmentStatus", namespace = "urn:types.purchases_2022_1.transactions.webservices.netsuite.com")
@XmlEnum
public enum InboundShipmentShipmentStatus {

    @XmlEnumValue("_closed")
    CLOSED("_closed"),
    @XmlEnumValue("_inTransit")
    IN_TRANSIT("_inTransit"),
    @XmlEnumValue("_partiallyReceived")
    PARTIALLY_RECEIVED("_partiallyReceived"),
    @XmlEnumValue("_received")
    RECEIVED("_received"),
    @XmlEnumValue("_toBeShipped")
    TO_BE_SHIPPED("_toBeShipped");
    private final String value;

    InboundShipmentShipmentStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InboundShipmentShipmentStatus fromValue(String v) {
        for (InboundShipmentShipmentStatus c: InboundShipmentShipmentStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
