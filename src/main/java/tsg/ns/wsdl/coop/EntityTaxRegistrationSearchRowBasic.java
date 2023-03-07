
package tsg.ns.wsdl.coop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityTaxRegistrationSearchRowBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityTaxRegistrationSearchRowBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_2.platform.webservices.netsuite.com}SearchRowBasic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nexusCountry" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="taxRegistrationNumber" type="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityTaxRegistrationSearchRowBasic", namespace = "urn:common_2022_2.platform.webservices.netsuite.com", propOrder = {
    "address",
    "id",
    "nexusCountry",
    "taxRegistrationNumber"
})
public class EntityTaxRegistrationSearchRowBasic
    extends SearchRowBasic
{

    protected List<SearchColumnSelectField> address;
    protected List<SearchColumnLongField> id;
    protected List<SearchColumnEnumSelectField> nexusCountry;
    protected List<SearchColumnStringField> taxRegistrationNumber;

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getAddress() {
        if (address == null) {
            address = new ArrayList<SearchColumnSelectField>();
        }
        return this.address;
    }

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getId() {
        if (id == null) {
            id = new ArrayList<SearchColumnLongField>();
        }
        return this.id;
    }

    /**
     * Gets the value of the nexusCountry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the nexusCountry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNexusCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getNexusCountry() {
        if (nexusCountry == null) {
            nexusCountry = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.nexusCountry;
    }

    /**
     * Gets the value of the taxRegistrationNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the taxRegistrationNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxRegistrationNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getTaxRegistrationNumber() {
        if (taxRegistrationNumber == null) {
            taxRegistrationNumber = new ArrayList<SearchColumnStringField>();
        }
        return this.taxRegistrationNumber;
    }

}
