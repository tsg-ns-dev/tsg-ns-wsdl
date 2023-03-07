
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerStage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CustomerStage"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_customer"/&gt;
 *     &lt;enumeration value="_lead"/&gt;
 *     &lt;enumeration value="_prospect"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomerStage", namespace = "urn:types.relationships_2022_2.lists.webservices.netsuite.com")
@XmlEnum
public enum CustomerStage {

    @XmlEnumValue("_customer")
    CUSTOMER("_customer"),
    @XmlEnumValue("_lead")
    LEAD("_lead"),
    @XmlEnumValue("_prospect")
    PROSPECT("_prospect");
    private final String value;

    CustomerStage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerStage fromValue(String v) {
        for (CustomerStage c: CustomerStage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
