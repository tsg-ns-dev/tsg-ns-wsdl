
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InboundShipmentLandedCostAllocationMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InboundShipmentLandedCostAllocationMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_quantity"/&gt;
 *     &lt;enumeration value="_value"/&gt;
 *     &lt;enumeration value="_weight"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InboundShipmentLandedCostAllocationMethod", namespace = "urn:types.purchases_2022_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum InboundShipmentLandedCostAllocationMethod {

    @XmlEnumValue("_quantity")
    QUANTITY("_quantity"),
    @XmlEnumValue("_value")
    VALUE("_value"),
    @XmlEnumValue("_weight")
    WEIGHT("_weight");
    private final String value;

    InboundShipmentLandedCostAllocationMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InboundShipmentLandedCostAllocationMethod fromValue(String v) {
        for (InboundShipmentLandedCostAllocationMethod c: InboundShipmentLandedCostAllocationMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
