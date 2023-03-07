
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityGroupType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EntityGroupType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_contact"/&gt;
 *     &lt;enumeration value="_customer"/&gt;
 *     &lt;enumeration value="_employee"/&gt;
 *     &lt;enumeration value="_partner"/&gt;
 *     &lt;enumeration value="_vendor"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityGroupType", namespace = "urn:types.relationships_2022_2.lists.webservices.netsuite.com")
@XmlEnum
public enum EntityGroupType {

    @XmlEnumValue("_contact")
    CONTACT("_contact"),
    @XmlEnumValue("_customer")
    CUSTOMER("_customer"),
    @XmlEnumValue("_employee")
    EMPLOYEE("_employee"),
    @XmlEnumValue("_partner")
    PARTNER("_partner"),
    @XmlEnumValue("_vendor")
    VENDOR("_vendor");
    private final String value;

    EntityGroupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntityGroupType fromValue(String v) {
        for (EntityGroupType c: EntityGroupType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
