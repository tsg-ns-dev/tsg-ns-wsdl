
package com.netsuite.webservices.lists.relationships_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2022_1.types.Country;
import com.netsuite.webservices.platform.core_2022_1.RecordRef;


/**
 * <p>Java class for PartnerTaxRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartnerTaxRegistration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nexusCountry" type="{urn:types.common_2022_1.platform.webservices.netsuite.com}Country" minOccurs="0"/&gt;
 *         &lt;element name="nexus" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="taxRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartnerTaxRegistration", propOrder = {
    "nexusCountry",
    "nexus",
    "address",
    "taxRegistrationNumber",
    "id"
})
public class PartnerTaxRegistration {

    @XmlSchemaType(name = "string")
    protected Country nexusCountry;
    protected RecordRef nexus;
    protected RecordRef address;
    protected String taxRegistrationNumber;
    protected Long id;

    /**
     * Gets the value of the nexusCountry property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getNexusCountry() {
        return nexusCountry;
    }

    /**
     * Sets the value of the nexusCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setNexusCountry(Country value) {
        this.nexusCountry = value;
    }

    /**
     * Gets the value of the nexus property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getNexus() {
        return nexus;
    }

    /**
     * Sets the value of the nexus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setNexus(RecordRef value) {
        this.nexus = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setAddress(RecordRef value) {
        this.address = value;
    }

    /**
     * Gets the value of the taxRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRegistrationNumber() {
        return taxRegistrationNumber;
    }

    /**
     * Sets the value of the taxRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRegistrationNumber(String value) {
        this.taxRegistrationNumber = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

}
