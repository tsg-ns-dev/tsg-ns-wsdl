
package com.netsuite.webservices.platform.common_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2022_1.SearchEnumMultiSelectField;
import com.netsuite.webservices.platform.core_2022_1.SearchLongField;
import com.netsuite.webservices.platform.core_2022_1.SearchMultiSelectField;
import com.netsuite.webservices.platform.core_2022_1.SearchRecordBasic;
import com.netsuite.webservices.platform.core_2022_1.SearchStringField;


/**
 * <p>Java class for EntityTaxRegistrationSearchBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityTaxRegistrationSearchBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRecordBasic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="nexusCountry" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="taxRegistrationNumber" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityTaxRegistrationSearchBasic", propOrder = {
    "address",
    "id",
    "nexusCountry",
    "taxRegistrationNumber"
})
public class EntityTaxRegistrationSearchBasic
    extends SearchRecordBasic
{

    protected SearchMultiSelectField address;
    protected SearchLongField id;
    protected SearchEnumMultiSelectField nexusCountry;
    protected SearchStringField taxRegistrationNumber;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAddress(SearchMultiSelectField value) {
        this.address = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setId(SearchLongField value) {
        this.id = value;
    }

    /**
     * Gets the value of the nexusCountry property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getNexusCountry() {
        return nexusCountry;
    }

    /**
     * Sets the value of the nexusCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setNexusCountry(SearchEnumMultiSelectField value) {
        this.nexusCountry = value;
    }

    /**
     * Gets the value of the taxRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getTaxRegistrationNumber() {
        return taxRegistrationNumber;
    }

    /**
     * Sets the value of the taxRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setTaxRegistrationNumber(SearchStringField value) {
        this.taxRegistrationNumber = value;
    }

}
