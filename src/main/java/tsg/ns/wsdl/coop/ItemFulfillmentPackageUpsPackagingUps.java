
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemFulfillmentPackageUpsPackagingUps.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ItemFulfillmentPackageUpsPackagingUps"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_upsExpressBox"/&gt;
 *     &lt;enumeration value="_upsLetter"/&gt;
 *     &lt;enumeration value="_upsPak"/&gt;
 *     &lt;enumeration value="_upsTube"/&gt;
 *     &lt;enumeration value="_yourPackaging"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentPackageUpsPackagingUps", namespace = "urn:types.sales_2022_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentPackageUpsPackagingUps {

    @XmlEnumValue("_upsExpressBox")
    UPS_EXPRESS_BOX("_upsExpressBox"),
    @XmlEnumValue("_upsLetter")
    UPS_LETTER("_upsLetter"),
    @XmlEnumValue("_upsPak")
    UPS_PAK("_upsPak"),
    @XmlEnumValue("_upsTube")
    UPS_TUBE("_upsTube"),
    @XmlEnumValue("_yourPackaging")
    YOUR_PACKAGING("_yourPackaging");
    private final String value;

    ItemFulfillmentPackageUpsPackagingUps(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentPackageUpsPackagingUps fromValue(String v) {
        for (ItemFulfillmentPackageUpsPackagingUps c: ItemFulfillmentPackageUpsPackagingUps.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
