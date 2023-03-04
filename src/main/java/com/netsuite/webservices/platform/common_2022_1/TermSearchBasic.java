
package com.netsuite.webservices.platform.common_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2022_1.SearchBooleanField;
import com.netsuite.webservices.platform.core_2022_1.SearchDoubleField;
import com.netsuite.webservices.platform.core_2022_1.SearchEnumMultiSelectField;
import com.netsuite.webservices.platform.core_2022_1.SearchLongField;
import com.netsuite.webservices.platform.core_2022_1.SearchMultiSelectField;
import com.netsuite.webservices.platform.core_2022_1.SearchRecordBasic;
import com.netsuite.webservices.platform.core_2022_1.SearchStringField;


/**
 * <p>Java class for TermSearchBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TermSearchBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRecordBasic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateDriven" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="dayDiscountExpires" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="dayOfMonthNetDue" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="daysUntilExpiry" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="daysUntilNetDue" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="discountPercent" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="discountPercentDateDriven" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="dueNextMonthIfWithinDays" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="externalId" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="externalIdString" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="installment" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="internalId" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="internalIdNumber" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="isInactive" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="preferred" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="recurrenceCount" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="recurrenceFrequency" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="repeatEvery" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="splitEvenly" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TermSearchBasic", propOrder = {
    "dateDriven",
    "dayDiscountExpires",
    "dayOfMonthNetDue",
    "daysUntilExpiry",
    "daysUntilNetDue",
    "discountPercent",
    "discountPercentDateDriven",
    "dueNextMonthIfWithinDays",
    "externalId",
    "externalIdString",
    "installment",
    "internalId",
    "internalIdNumber",
    "isInactive",
    "name",
    "preferred",
    "recurrenceCount",
    "recurrenceFrequency",
    "repeatEvery",
    "splitEvenly"
})
public class TermSearchBasic
    extends SearchRecordBasic
{

    protected SearchBooleanField dateDriven;
    protected SearchLongField dayDiscountExpires;
    protected SearchLongField dayOfMonthNetDue;
    protected SearchLongField daysUntilExpiry;
    protected SearchLongField daysUntilNetDue;
    protected SearchDoubleField discountPercent;
    protected SearchDoubleField discountPercentDateDriven;
    protected SearchLongField dueNextMonthIfWithinDays;
    protected SearchMultiSelectField externalId;
    protected SearchStringField externalIdString;
    protected SearchBooleanField installment;
    protected SearchMultiSelectField internalId;
    protected SearchLongField internalIdNumber;
    protected SearchBooleanField isInactive;
    protected SearchStringField name;
    protected SearchBooleanField preferred;
    protected SearchLongField recurrenceCount;
    protected SearchEnumMultiSelectField recurrenceFrequency;
    protected SearchLongField repeatEvery;
    protected SearchBooleanField splitEvenly;

    /**
     * Gets the value of the dateDriven property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getDateDriven() {
        return dateDriven;
    }

    /**
     * Sets the value of the dateDriven property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setDateDriven(SearchBooleanField value) {
        this.dateDriven = value;
    }

    /**
     * Gets the value of the dayDiscountExpires property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getDayDiscountExpires() {
        return dayDiscountExpires;
    }

    /**
     * Sets the value of the dayDiscountExpires property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setDayDiscountExpires(SearchLongField value) {
        this.dayDiscountExpires = value;
    }

    /**
     * Gets the value of the dayOfMonthNetDue property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getDayOfMonthNetDue() {
        return dayOfMonthNetDue;
    }

    /**
     * Sets the value of the dayOfMonthNetDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setDayOfMonthNetDue(SearchLongField value) {
        this.dayOfMonthNetDue = value;
    }

    /**
     * Gets the value of the daysUntilExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getDaysUntilExpiry() {
        return daysUntilExpiry;
    }

    /**
     * Sets the value of the daysUntilExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setDaysUntilExpiry(SearchLongField value) {
        this.daysUntilExpiry = value;
    }

    /**
     * Gets the value of the daysUntilNetDue property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getDaysUntilNetDue() {
        return daysUntilNetDue;
    }

    /**
     * Sets the value of the daysUntilNetDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setDaysUntilNetDue(SearchLongField value) {
        this.daysUntilNetDue = value;
    }

    /**
     * Gets the value of the discountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setDiscountPercent(SearchDoubleField value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the discountPercentDateDriven property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getDiscountPercentDateDriven() {
        return discountPercentDateDriven;
    }

    /**
     * Sets the value of the discountPercentDateDriven property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setDiscountPercentDateDriven(SearchDoubleField value) {
        this.discountPercentDateDriven = value;
    }

    /**
     * Gets the value of the dueNextMonthIfWithinDays property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getDueNextMonthIfWithinDays() {
        return dueNextMonthIfWithinDays;
    }

    /**
     * Sets the value of the dueNextMonthIfWithinDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setDueNextMonthIfWithinDays(SearchLongField value) {
        this.dueNextMonthIfWithinDays = value;
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
     * Gets the value of the installment property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getInstallment() {
        return installment;
    }

    /**
     * Sets the value of the installment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setInstallment(SearchBooleanField value) {
        this.installment = value;
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
     * Gets the value of the preferred property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getPreferred() {
        return preferred;
    }

    /**
     * Sets the value of the preferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setPreferred(SearchBooleanField value) {
        this.preferred = value;
    }

    /**
     * Gets the value of the recurrenceCount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getRecurrenceCount() {
        return recurrenceCount;
    }

    /**
     * Sets the value of the recurrenceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setRecurrenceCount(SearchLongField value) {
        this.recurrenceCount = value;
    }

    /**
     * Gets the value of the recurrenceFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getRecurrenceFrequency() {
        return recurrenceFrequency;
    }

    /**
     * Sets the value of the recurrenceFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setRecurrenceFrequency(SearchEnumMultiSelectField value) {
        this.recurrenceFrequency = value;
    }

    /**
     * Gets the value of the repeatEvery property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getRepeatEvery() {
        return repeatEvery;
    }

    /**
     * Sets the value of the repeatEvery property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setRepeatEvery(SearchLongField value) {
        this.repeatEvery = value;
    }

    /**
     * Gets the value of the splitEvenly property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getSplitEvenly() {
        return splitEvenly;
    }

    /**
     * Sets the value of the splitEvenly property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setSplitEvenly(SearchBooleanField value) {
        this.splitEvenly = value;
    }

}
