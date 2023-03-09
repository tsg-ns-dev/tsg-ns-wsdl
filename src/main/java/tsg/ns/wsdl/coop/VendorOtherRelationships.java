
package tsg.ns.wsdl.coop;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VendorOtherRelationships.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VendorOtherRelationships"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_customer"/&gt;
 *     &lt;enumeration value="_otherName"/&gt;
 *     &lt;enumeration value="_partner"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VendorOtherRelationships", namespace = "urn:types.relationships_2022_2.lists.webservices.netsuite.com")
@XmlEnum
public enum VendorOtherRelationships {

    @XmlEnumValue("_customer")
    CUSTOMER("_customer"),
    @XmlEnumValue("_otherName")
    OTHER_NAME("_otherName"),
    @XmlEnumValue("_partner")
    PARTNER("_partner");
    private final String value;

    VendorOtherRelationships(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VendorOtherRelationships fromValue(String v) {
        for (VendorOtherRelationships c: VendorOtherRelationships.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
