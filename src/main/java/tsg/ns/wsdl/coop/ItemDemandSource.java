
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemDemandSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ItemDemandSource"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_enteredAndPlannedOrders"/&gt;
 *     &lt;enumeration value="_forecastAndOrders"/&gt;
 *     &lt;enumeration value="_forecastConsumption"/&gt;
 *     &lt;enumeration value="_forecastFromDemandPlan"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemDemandSource", namespace = "urn:types.accounting_2022_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemDemandSource {

    @XmlEnumValue("_enteredAndPlannedOrders")
    ENTERED_AND_PLANNED_ORDERS("_enteredAndPlannedOrders"),
    @XmlEnumValue("_forecastAndOrders")
    FORECAST_AND_ORDERS("_forecastAndOrders"),
    @XmlEnumValue("_forecastConsumption")
    FORECAST_CONSUMPTION("_forecastConsumption"),
    @XmlEnumValue("_forecastFromDemandPlan")
    FORECAST_FROM_DEMAND_PLAN("_forecastFromDemandPlan");
    private final String value;

    ItemDemandSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemDemandSource fromValue(String v) {
        for (ItemDemandSource c: ItemDemandSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
