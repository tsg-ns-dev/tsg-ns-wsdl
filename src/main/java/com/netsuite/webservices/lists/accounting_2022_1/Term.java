
package com.netsuite.webservices.lists.accounting_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2022_1.types.TermRecurrenceFrequency;
import com.netsuite.webservices.platform.core_2022_1.Record;


/**
 * <p>Java class for Term complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Term"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}Record"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateDriven" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="daysUntilNetDue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="discountPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="daysUntilExpiry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="dayOfMonthNetDue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="dueNextMonthIfWithinDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="discountPercentDateDriven" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="dayDiscountExpires" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="preferred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="installment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="recurrenceFrequency" type="{urn:types.common_2022_1.platform.webservices.netsuite.com}TermRecurrenceFrequency" minOccurs="0"/&gt;
 *         &lt;element name="recurrenceCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="repeatEvery" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="splitEvenly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="percentagesList" type="{urn:accounting_2022_1.lists.webservices.netsuite.com}TermPercentagesList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Term", propOrder = {
    "name",
    "dateDriven",
    "daysUntilNetDue",
    "discountPercent",
    "daysUntilExpiry",
    "dayOfMonthNetDue",
    "dueNextMonthIfWithinDays",
    "discountPercentDateDriven",
    "dayDiscountExpires",
    "preferred",
    "isInactive",
    "installment",
    "recurrenceFrequency",
    "recurrenceCount",
    "repeatEvery",
    "splitEvenly",
    "percentagesList"
})
public class Term
    extends Record
{

    protected String name;
    protected Boolean dateDriven;
    protected Long daysUntilNetDue;
    protected Double discountPercent;
    protected Long daysUntilExpiry;
    protected Long dayOfMonthNetDue;
    protected Long dueNextMonthIfWithinDays;
    protected Double discountPercentDateDriven;
    protected Long dayDiscountExpires;
    protected Boolean preferred;
    protected Boolean isInactive;
    protected Boolean installment;
    @XmlSchemaType(name = "string")
    protected TermRecurrenceFrequency recurrenceFrequency;
    protected Long recurrenceCount;
    protected Long repeatEvery;
    protected Boolean splitEvenly;
    protected TermPercentagesList percentagesList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the dateDriven property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDateDriven() {
        return dateDriven;
    }

    /**
     * Sets the value of the dateDriven property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDateDriven(Boolean value) {
        this.dateDriven = value;
    }

    /**
     * Gets the value of the daysUntilNetDue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDaysUntilNetDue() {
        return daysUntilNetDue;
    }

    /**
     * Sets the value of the daysUntilNetDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDaysUntilNetDue(Long value) {
        this.daysUntilNetDue = value;
    }

    /**
     * Gets the value of the discountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscountPercent(Double value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the daysUntilExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDaysUntilExpiry() {
        return daysUntilExpiry;
    }

    /**
     * Sets the value of the daysUntilExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDaysUntilExpiry(Long value) {
        this.daysUntilExpiry = value;
    }

    /**
     * Gets the value of the dayOfMonthNetDue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDayOfMonthNetDue() {
        return dayOfMonthNetDue;
    }

    /**
     * Sets the value of the dayOfMonthNetDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDayOfMonthNetDue(Long value) {
        this.dayOfMonthNetDue = value;
    }

    /**
     * Gets the value of the dueNextMonthIfWithinDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDueNextMonthIfWithinDays() {
        return dueNextMonthIfWithinDays;
    }

    /**
     * Sets the value of the dueNextMonthIfWithinDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDueNextMonthIfWithinDays(Long value) {
        this.dueNextMonthIfWithinDays = value;
    }

    /**
     * Gets the value of the discountPercentDateDriven property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscountPercentDateDriven() {
        return discountPercentDateDriven;
    }

    /**
     * Sets the value of the discountPercentDateDriven property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscountPercentDateDriven(Double value) {
        this.discountPercentDateDriven = value;
    }

    /**
     * Gets the value of the dayDiscountExpires property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDayDiscountExpires() {
        return dayDiscountExpires;
    }

    /**
     * Sets the value of the dayDiscountExpires property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDayDiscountExpires(Long value) {
        this.dayDiscountExpires = value;
    }

    /**
     * Gets the value of the preferred property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferred() {
        return preferred;
    }

    /**
     * Sets the value of the preferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferred(Boolean value) {
        this.preferred = value;
    }

    /**
     * Gets the value of the isInactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInactive() {
        return isInactive;
    }

    /**
     * Sets the value of the isInactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInactive(Boolean value) {
        this.isInactive = value;
    }

    /**
     * Gets the value of the installment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstallment() {
        return installment;
    }

    /**
     * Sets the value of the installment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstallment(Boolean value) {
        this.installment = value;
    }

    /**
     * Gets the value of the recurrenceFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link TermRecurrenceFrequency }
     *     
     */
    public TermRecurrenceFrequency getRecurrenceFrequency() {
        return recurrenceFrequency;
    }

    /**
     * Sets the value of the recurrenceFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermRecurrenceFrequency }
     *     
     */
    public void setRecurrenceFrequency(TermRecurrenceFrequency value) {
        this.recurrenceFrequency = value;
    }

    /**
     * Gets the value of the recurrenceCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecurrenceCount() {
        return recurrenceCount;
    }

    /**
     * Sets the value of the recurrenceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecurrenceCount(Long value) {
        this.recurrenceCount = value;
    }

    /**
     * Gets the value of the repeatEvery property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRepeatEvery() {
        return repeatEvery;
    }

    /**
     * Sets the value of the repeatEvery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRepeatEvery(Long value) {
        this.repeatEvery = value;
    }

    /**
     * Gets the value of the splitEvenly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSplitEvenly() {
        return splitEvenly;
    }

    /**
     * Sets the value of the splitEvenly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSplitEvenly(Boolean value) {
        this.splitEvenly = value;
    }

    /**
     * Gets the value of the percentagesList property.
     * 
     * @return
     *     possible object is
     *     {@link TermPercentagesList }
     *     
     */
    public TermPercentagesList getPercentagesList() {
        return percentagesList;
    }

    /**
     * Sets the value of the percentagesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermPercentagesList }
     *     
     */
    public void setPercentagesList(TermPercentagesList value) {
        this.percentagesList = value;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalId(String value) {
        this.internalId = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

}
