
package com.netsuite.webservices.transactions.general_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.platform.core_2022_1.CustomFieldList;
import com.netsuite.webservices.platform.core_2022_1.RecordRef;


/**
 * <p>Java class for JournalEntryLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JournalEntryLine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="account" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="line" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="debit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="credit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="taxAccount" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="lineTaxCode" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="lineTaxRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="debitTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="creditTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="taxBasis" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="taxCode" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxRate1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="entity" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="grossAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="department" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="class" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="revenueRecognitionRule" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="eliminate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="schedule" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="residual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scheduleNum" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="tax1Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="tax1Acct" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="customFieldList" type="{urn:core_2022_1.platform.webservices.netsuite.com}CustomFieldList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalEntryLine", propOrder = {
    "account",
    "line",
    "debit",
    "credit",
    "taxAccount",
    "lineTaxCode",
    "lineTaxRate",
    "debitTax",
    "creditTax",
    "taxBasis",
    "totalAmount",
    "taxCode",
    "memo",
    "taxRate1",
    "entity",
    "grossAmt",
    "department",
    "clazz",
    "location",
    "revenueRecognitionRule",
    "eliminate",
    "schedule",
    "startDate",
    "endDate",
    "residual",
    "scheduleNum",
    "tax1Amt",
    "tax1Acct",
    "customFieldList"
})
public class JournalEntryLine {

    protected RecordRef account;
    protected Long line;
    protected Double debit;
    protected Double credit;
    protected RecordRef taxAccount;
    protected RecordRef lineTaxCode;
    protected Double lineTaxRate;
    protected Double debitTax;
    protected Double creditTax;
    protected Double taxBasis;
    protected Double totalAmount;
    protected RecordRef taxCode;
    protected String memo;
    protected Double taxRate1;
    protected RecordRef entity;
    protected Double grossAmt;
    protected RecordRef department;
    @XmlElement(name = "class")
    protected RecordRef clazz;
    protected RecordRef location;
    protected RecordRef revenueRecognitionRule;
    protected Boolean eliminate;
    protected RecordRef schedule;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected String residual;
    protected RecordRef scheduleNum;
    protected Double tax1Amt;
    protected RecordRef tax1Acct;
    protected CustomFieldList customFieldList;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setAccount(RecordRef value) {
        this.account = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLine(Long value) {
        this.line = value;
    }

    /**
     * Gets the value of the debit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDebit() {
        return debit;
    }

    /**
     * Sets the value of the debit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDebit(Double value) {
        this.debit = value;
    }

    /**
     * Gets the value of the credit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCredit() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCredit(Double value) {
        this.credit = value;
    }

    /**
     * Gets the value of the taxAccount property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTaxAccount() {
        return taxAccount;
    }

    /**
     * Sets the value of the taxAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTaxAccount(RecordRef value) {
        this.taxAccount = value;
    }

    /**
     * Gets the value of the lineTaxCode property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLineTaxCode() {
        return lineTaxCode;
    }

    /**
     * Sets the value of the lineTaxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLineTaxCode(RecordRef value) {
        this.lineTaxCode = value;
    }

    /**
     * Gets the value of the lineTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLineTaxRate() {
        return lineTaxRate;
    }

    /**
     * Sets the value of the lineTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLineTaxRate(Double value) {
        this.lineTaxRate = value;
    }

    /**
     * Gets the value of the debitTax property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDebitTax() {
        return debitTax;
    }

    /**
     * Sets the value of the debitTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDebitTax(Double value) {
        this.debitTax = value;
    }

    /**
     * Gets the value of the creditTax property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCreditTax() {
        return creditTax;
    }

    /**
     * Sets the value of the creditTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCreditTax(Double value) {
        this.creditTax = value;
    }

    /**
     * Gets the value of the taxBasis property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxBasis() {
        return taxBasis;
    }

    /**
     * Sets the value of the taxBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxBasis(Double value) {
        this.taxBasis = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalAmount(Double value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the taxCode property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTaxCode(RecordRef value) {
        this.taxCode = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the taxRate1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxRate1() {
        return taxRate1;
    }

    /**
     * Sets the value of the taxRate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxRate1(Double value) {
        this.taxRate1 = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setEntity(RecordRef value) {
        this.entity = value;
    }

    /**
     * Gets the value of the grossAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGrossAmt() {
        return grossAmt;
    }

    /**
     * Sets the value of the grossAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGrossAmt(Double value) {
        this.grossAmt = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDepartment(RecordRef value) {
        this.department = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setClazz(RecordRef value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLocation(RecordRef value) {
        this.location = value;
    }

    /**
     * Gets the value of the revenueRecognitionRule property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRevenueRecognitionRule() {
        return revenueRecognitionRule;
    }

    /**
     * Sets the value of the revenueRecognitionRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRevenueRecognitionRule(RecordRef value) {
        this.revenueRecognitionRule = value;
    }

    /**
     * Gets the value of the eliminate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEliminate() {
        return eliminate;
    }

    /**
     * Sets the value of the eliminate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEliminate(Boolean value) {
        this.eliminate = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSchedule(RecordRef value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the residual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidual() {
        return residual;
    }

    /**
     * Sets the value of the residual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidual(String value) {
        this.residual = value;
    }

    /**
     * Gets the value of the scheduleNum property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getScheduleNum() {
        return scheduleNum;
    }

    /**
     * Sets the value of the scheduleNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setScheduleNum(RecordRef value) {
        this.scheduleNum = value;
    }

    /**
     * Gets the value of the tax1Amt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTax1Amt() {
        return tax1Amt;
    }

    /**
     * Sets the value of the tax1Amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTax1Amt(Double value) {
        this.tax1Amt = value;
    }

    /**
     * Gets the value of the tax1Acct property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTax1Acct() {
        return tax1Acct;
    }

    /**
     * Sets the value of the tax1Acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTax1Acct(RecordRef value) {
        this.tax1Acct = value;
    }

    /**
     * Gets the value of the customFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldList }
     *     
     */
    public CustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * Sets the value of the customFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldList }
     *     
     */
    public void setCustomFieldList(CustomFieldList value) {
        this.customFieldList = value;
    }

}
