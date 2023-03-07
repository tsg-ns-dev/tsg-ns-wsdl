
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemFulfillmentTermsOfSaleFedEx.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ItemFulfillmentTermsOfSaleFedEx"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_cfr"/&gt;
 *     &lt;enumeration value="_cif"/&gt;
 *     &lt;enumeration value="_cip"/&gt;
 *     &lt;enumeration value="_cpt"/&gt;
 *     &lt;enumeration value="_dap"/&gt;
 *     &lt;enumeration value="_dat"/&gt;
 *     &lt;enumeration value="_ddp"/&gt;
 *     &lt;enumeration value="_ddu"/&gt;
 *     &lt;enumeration value="_exw"/&gt;
 *     &lt;enumeration value="_fca"/&gt;
 *     &lt;enumeration value="_fob"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentTermsOfSaleFedEx", namespace = "urn:types.sales_2022_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentTermsOfSaleFedEx {

    @XmlEnumValue("_cfr")
    CFR("_cfr"),
    @XmlEnumValue("_cif")
    CIF("_cif"),
    @XmlEnumValue("_cip")
    CIP("_cip"),
    @XmlEnumValue("_cpt")
    CPT("_cpt"),
    @XmlEnumValue("_dap")
    DAP("_dap"),
    @XmlEnumValue("_dat")
    DAT("_dat"),
    @XmlEnumValue("_ddp")
    DDP("_ddp"),
    @XmlEnumValue("_ddu")
    DDU("_ddu"),
    @XmlEnumValue("_exw")
    EXW("_exw"),
    @XmlEnumValue("_fca")
    FCA("_fca"),
    @XmlEnumValue("_fob")
    FOB("_fob");
    private final String value;

    ItemFulfillmentTermsOfSaleFedEx(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentTermsOfSaleFedEx fromValue(String v) {
        for (ItemFulfillmentTermsOfSaleFedEx c: ItemFulfillmentTermsOfSaleFedEx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
