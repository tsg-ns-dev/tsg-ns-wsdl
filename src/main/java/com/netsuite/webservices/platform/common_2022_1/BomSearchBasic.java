
package com.netsuite.webservices.platform.common_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2022_1.SearchBooleanField;
import com.netsuite.webservices.platform.core_2022_1.SearchDateField;
import com.netsuite.webservices.platform.core_2022_1.SearchLongField;
import com.netsuite.webservices.platform.core_2022_1.SearchMultiSelectField;
import com.netsuite.webservices.platform.core_2022_1.SearchRecordBasic;
import com.netsuite.webservices.platform.core_2022_1.SearchStringField;


/**
 * <p>Java class for BomSearchBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BomSearchBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRecordBasic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="availableForAllAssemblies" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="availableForAllLocations" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="createdDate" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/&gt;
 *         &lt;element name="externalId" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="externalIdString" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="includeChildren" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="internalId" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="internalIdNumber" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="isInactive" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="legacyBomForAssembly" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="memo" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="restrictToAssemblies" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="restrictToLocations" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="subsidiary" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="useComponentYield" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="usedOnAssembly" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BomSearchBasic", propOrder = {
    "availableForAllAssemblies",
    "availableForAllLocations",
    "createdDate",
    "externalId",
    "externalIdString",
    "includeChildren",
    "internalId",
    "internalIdNumber",
    "isInactive",
    "legacyBomForAssembly",
    "memo",
    "name",
    "restrictToAssemblies",
    "restrictToLocations",
    "subsidiary",
    "useComponentYield",
    "usedOnAssembly"
})
public class BomSearchBasic
    extends SearchRecordBasic
{

    protected SearchBooleanField availableForAllAssemblies;
    protected SearchBooleanField availableForAllLocations;
    protected SearchDateField createdDate;
    protected SearchMultiSelectField externalId;
    protected SearchStringField externalIdString;
    protected SearchBooleanField includeChildren;
    protected SearchMultiSelectField internalId;
    protected SearchLongField internalIdNumber;
    protected SearchBooleanField isInactive;
    protected SearchMultiSelectField legacyBomForAssembly;
    protected SearchStringField memo;
    protected SearchStringField name;
    protected SearchMultiSelectField restrictToAssemblies;
    protected SearchMultiSelectField restrictToLocations;
    protected SearchMultiSelectField subsidiary;
    protected SearchBooleanField useComponentYield;
    protected SearchBooleanField usedOnAssembly;

    /**
     * Gets the value of the availableForAllAssemblies property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getAvailableForAllAssemblies() {
        return availableForAllAssemblies;
    }

    /**
     * Sets the value of the availableForAllAssemblies property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setAvailableForAllAssemblies(SearchBooleanField value) {
        this.availableForAllAssemblies = value;
    }

    /**
     * Gets the value of the availableForAllLocations property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getAvailableForAllLocations() {
        return availableForAllLocations;
    }

    /**
     * Sets the value of the availableForAllLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setAvailableForAllLocations(SearchBooleanField value) {
        this.availableForAllLocations = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setCreatedDate(SearchDateField value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setExternalId(SearchMultiSelectField value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the externalIdString property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getExternalIdString() {
        return externalIdString;
    }

    /**
     * Sets the value of the externalIdString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setExternalIdString(SearchStringField value) {
        this.externalIdString = value;
    }

    /**
     * Gets the value of the includeChildren property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIncludeChildren() {
        return includeChildren;
    }

    /**
     * Sets the value of the includeChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIncludeChildren(SearchBooleanField value) {
        this.includeChildren = value;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setInternalId(SearchMultiSelectField value) {
        this.internalId = value;
    }

    /**
     * Gets the value of the internalIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }

    /**
     * Sets the value of the internalIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setInternalIdNumber(SearchLongField value) {
        this.internalIdNumber = value;
    }

    /**
     * Gets the value of the isInactive property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsInactive() {
        return isInactive;
    }

    /**
     * Sets the value of the isInactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsInactive(SearchBooleanField value) {
        this.isInactive = value;
    }

    /**
     * Gets the value of the legacyBomForAssembly property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getLegacyBomForAssembly() {
        return legacyBomForAssembly;
    }

    /**
     * Sets the value of the legacyBomForAssembly property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setLegacyBomForAssembly(SearchMultiSelectField value) {
        this.legacyBomForAssembly = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setMemo(SearchStringField value) {
        this.memo = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setName(SearchStringField value) {
        this.name = value;
    }

    /**
     * Gets the value of the restrictToAssemblies property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getRestrictToAssemblies() {
        return restrictToAssemblies;
    }

    /**
     * Sets the value of the restrictToAssemblies property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setRestrictToAssemblies(SearchMultiSelectField value) {
        this.restrictToAssemblies = value;
    }

    /**
     * Gets the value of the restrictToLocations property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getRestrictToLocations() {
        return restrictToLocations;
    }

    /**
     * Sets the value of the restrictToLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setRestrictToLocations(SearchMultiSelectField value) {
        this.restrictToLocations = value;
    }

    /**
     * Gets the value of the subsidiary property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }

    /**
     * Sets the value of the subsidiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSubsidiary(SearchMultiSelectField value) {
        this.subsidiary = value;
    }

    /**
     * Gets the value of the useComponentYield property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getUseComponentYield() {
        return useComponentYield;
    }

    /**
     * Sets the value of the useComponentYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setUseComponentYield(SearchBooleanField value) {
        this.useComponentYield = value;
    }

    /**
     * Gets the value of the usedOnAssembly property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getUsedOnAssembly() {
        return usedOnAssembly;
    }

    /**
     * Sets the value of the usedOnAssembly property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setUsedOnAssembly(SearchBooleanField value) {
        this.usedOnAssembly = value;
    }

}
