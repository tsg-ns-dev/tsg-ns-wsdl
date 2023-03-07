
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DemandPlanMonth.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DemandPlanMonth"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_april"/&gt;
 *     &lt;enumeration value="_august"/&gt;
 *     &lt;enumeration value="_december"/&gt;
 *     &lt;enumeration value="_february"/&gt;
 *     &lt;enumeration value="_january"/&gt;
 *     &lt;enumeration value="_july"/&gt;
 *     &lt;enumeration value="_june"/&gt;
 *     &lt;enumeration value="_march"/&gt;
 *     &lt;enumeration value="_may"/&gt;
 *     &lt;enumeration value="_november"/&gt;
 *     &lt;enumeration value="_october"/&gt;
 *     &lt;enumeration value="_september"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DemandPlanMonth", namespace = "urn:types.demandplanning_2022_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum DemandPlanMonth {

    @XmlEnumValue("_april")
    APRIL("_april"),
    @XmlEnumValue("_august")
    AUGUST("_august"),
    @XmlEnumValue("_december")
    DECEMBER("_december"),
    @XmlEnumValue("_february")
    FEBRUARY("_february"),
    @XmlEnumValue("_january")
    JANUARY("_january"),
    @XmlEnumValue("_july")
    JULY("_july"),
    @XmlEnumValue("_june")
    JUNE("_june"),
    @XmlEnumValue("_march")
    MARCH("_march"),
    @XmlEnumValue("_may")
    MAY("_may"),
    @XmlEnumValue("_november")
    NOVEMBER("_november"),
    @XmlEnumValue("_october")
    OCTOBER("_october"),
    @XmlEnumValue("_september")
    SEPTEMBER("_september");
    private final String value;

    DemandPlanMonth(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DemandPlanMonth fromValue(String v) {
        for (DemandPlanMonth c: DemandPlanMonth.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
