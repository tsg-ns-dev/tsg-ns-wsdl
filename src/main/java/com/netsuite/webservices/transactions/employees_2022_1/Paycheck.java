
package com.netsuite.webservices.transactions.employees_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.platform.core_2022_1.Record;
import com.netsuite.webservices.platform.core_2022_1.RecordRef;


/**
 * <p>Java class for Paycheck complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Paycheck"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}Record"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="batchNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entity" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="department" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="class" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="workplace" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="tranId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="account" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="payFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="tranDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="postingPeriod" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="periodEnding" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="payEarnList" type="{urn:employees_2022_1.transactions.webservices.netsuite.com}PaycheckPayEarnList" minOccurs="0"/&gt;
 *         &lt;element name="payTimeList" type="{urn:employees_2022_1.transactions.webservices.netsuite.com}PaycheckPayTimeList" minOccurs="0"/&gt;
 *         &lt;element name="payExpList" type="{urn:employees_2022_1.transactions.webservices.netsuite.com}PaycheckPayExpList" minOccurs="0"/&gt;
 *         &lt;element name="payPtoList" type="{urn:employees_2022_1.transactions.webservices.netsuite.com}PaycheckPayPtoList" minOccurs="0"/&gt;
 *         &lt;element name="payDeductList" type="{urn:employees_2022_1.transactions.webservices.netsuite.com}PaycheckPayDeductList" minOccurs="0"/&gt;
 *         &lt;element name="payContribList" type="{urn:employees_2022_1.transactions.webservices.netsuite.com}PaycheckPayContribList" minOccurs="0"/&gt;
 *         &lt;element name="payTaxList" type="{urn:employees_2022_1.transactions.webservices.netsuite.com}PaycheckPayTaxList" minOccurs="0"/&gt;
 *         &lt;element name="paySummaryList" type="{urn:employees_2022_1.transactions.webservices.netsuite.com}PaycheckPaySummaryList" minOccurs="0"/&gt;
 *         &lt;element name="payDisburseList" type="{urn:employees_2022_1.transactions.webservices.netsuite.com}PaycheckPayDisburseList" minOccurs="0"/&gt;
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
@XmlType(name = "Paycheck", propOrder = {
    "batchNumber",
    "createdDate",
    "lastModifiedDate",
    "status",
    "entity",
    "address",
    "department",
    "location",
    "clazz",
    "workplace",
    "tranId",
    "userAmount",
    "memo",
    "account",
    "payFrequency",
    "balance",
    "tranDate",
    "postingPeriod",
    "periodEnding",
    "payEarnList",
    "payTimeList",
    "payExpList",
    "payPtoList",
    "payDeductList",
    "payContribList",
    "payTaxList",
    "paySummaryList",
    "payDisburseList"
})
public class Paycheck
    extends Record
{

    protected String batchNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    protected String status;
    protected RecordRef entity;
    protected String address;
    protected RecordRef department;
    protected RecordRef location;
    @XmlElement(name = "class")
    protected RecordRef clazz;
    protected RecordRef workplace;
    protected String tranId;
    protected Double userAmount;
    protected String memo;
    protected RecordRef account;
    protected String payFrequency;
    protected Double balance;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tranDate;
    protected RecordRef postingPeriod;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar periodEnding;
    protected PaycheckPayEarnList payEarnList;
    protected PaycheckPayTimeList payTimeList;
    protected PaycheckPayExpList payExpList;
    protected PaycheckPayPtoList payPtoList;
    protected PaycheckPayDeductList payDeductList;
    protected PaycheckPayContribList payContribList;
    protected PaycheckPayTaxList payTaxList;
    protected PaycheckPaySummaryList paySummaryList;
    protected PaycheckPayDisburseList payDisburseList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * Gets the value of the batchNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchNumber() {
        return batchNumber;
    }

    /**
     * Sets the value of the batchNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchNumber(String value) {
        this.batchNumber = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDate(XMLGregorianCalendar value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
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
     * Gets the value of the workplace property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getWorkplace() {
        return workplace;
    }

    /**
     * Sets the value of the workplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setWorkplace(RecordRef value) {
        this.workplace = value;
    }

    /**
     * Gets the value of the tranId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranId() {
        return tranId;
    }

    /**
     * Sets the value of the tranId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranId(String value) {
        this.tranId = value;
    }

    /**
     * Gets the value of the userAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUserAmount() {
        return userAmount;
    }

    /**
     * Sets the value of the userAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUserAmount(Double value) {
        this.userAmount = value;
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
     * Gets the value of the payFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayFrequency() {
        return payFrequency;
    }

    /**
     * Sets the value of the payFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayFrequency(String value) {
        this.payFrequency = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBalance(Double value) {
        this.balance = value;
    }

    /**
     * Gets the value of the tranDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTranDate() {
        return tranDate;
    }

    /**
     * Sets the value of the tranDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTranDate(XMLGregorianCalendar value) {
        this.tranDate = value;
    }

    /**
     * Gets the value of the postingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPostingPeriod() {
        return postingPeriod;
    }

    /**
     * Sets the value of the postingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPostingPeriod(RecordRef value) {
        this.postingPeriod = value;
    }

    /**
     * Gets the value of the periodEnding property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodEnding() {
        return periodEnding;
    }

    /**
     * Sets the value of the periodEnding property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodEnding(XMLGregorianCalendar value) {
        this.periodEnding = value;
    }

    /**
     * Gets the value of the payEarnList property.
     * 
     * @return
     *     possible object is
     *     {@link PaycheckPayEarnList }
     *     
     */
    public PaycheckPayEarnList getPayEarnList() {
        return payEarnList;
    }

    /**
     * Sets the value of the payEarnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaycheckPayEarnList }
     *     
     */
    public void setPayEarnList(PaycheckPayEarnList value) {
        this.payEarnList = value;
    }

    /**
     * Gets the value of the payTimeList property.
     * 
     * @return
     *     possible object is
     *     {@link PaycheckPayTimeList }
     *     
     */
    public PaycheckPayTimeList getPayTimeList() {
        return payTimeList;
    }

    /**
     * Sets the value of the payTimeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaycheckPayTimeList }
     *     
     */
    public void setPayTimeList(PaycheckPayTimeList value) {
        this.payTimeList = value;
    }

    /**
     * Gets the value of the payExpList property.
     * 
     * @return
     *     possible object is
     *     {@link PaycheckPayExpList }
     *     
     */
    public PaycheckPayExpList getPayExpList() {
        return payExpList;
    }

    /**
     * Sets the value of the payExpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaycheckPayExpList }
     *     
     */
    public void setPayExpList(PaycheckPayExpList value) {
        this.payExpList = value;
    }

    /**
     * Gets the value of the payPtoList property.
     * 
     * @return
     *     possible object is
     *     {@link PaycheckPayPtoList }
     *     
     */
    public PaycheckPayPtoList getPayPtoList() {
        return payPtoList;
    }

    /**
     * Sets the value of the payPtoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaycheckPayPtoList }
     *     
     */
    public void setPayPtoList(PaycheckPayPtoList value) {
        this.payPtoList = value;
    }

    /**
     * Gets the value of the payDeductList property.
     * 
     * @return
     *     possible object is
     *     {@link PaycheckPayDeductList }
     *     
     */
    public PaycheckPayDeductList getPayDeductList() {
        return payDeductList;
    }

    /**
     * Sets the value of the payDeductList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaycheckPayDeductList }
     *     
     */
    public void setPayDeductList(PaycheckPayDeductList value) {
        this.payDeductList = value;
    }

    /**
     * Gets the value of the payContribList property.
     * 
     * @return
     *     possible object is
     *     {@link PaycheckPayContribList }
     *     
     */
    public PaycheckPayContribList getPayContribList() {
        return payContribList;
    }

    /**
     * Sets the value of the payContribList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaycheckPayContribList }
     *     
     */
    public void setPayContribList(PaycheckPayContribList value) {
        this.payContribList = value;
    }

    /**
     * Gets the value of the payTaxList property.
     * 
     * @return
     *     possible object is
     *     {@link PaycheckPayTaxList }
     *     
     */
    public PaycheckPayTaxList getPayTaxList() {
        return payTaxList;
    }

    /**
     * Sets the value of the payTaxList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaycheckPayTaxList }
     *     
     */
    public void setPayTaxList(PaycheckPayTaxList value) {
        this.payTaxList = value;
    }

    /**
     * Gets the value of the paySummaryList property.
     * 
     * @return
     *     possible object is
     *     {@link PaycheckPaySummaryList }
     *     
     */
    public PaycheckPaySummaryList getPaySummaryList() {
        return paySummaryList;
    }

    /**
     * Sets the value of the paySummaryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaycheckPaySummaryList }
     *     
     */
    public void setPaySummaryList(PaycheckPaySummaryList value) {
        this.paySummaryList = value;
    }

    /**
     * Gets the value of the payDisburseList property.
     * 
     * @return
     *     possible object is
     *     {@link PaycheckPayDisburseList }
     *     
     */
    public PaycheckPayDisburseList getPayDisburseList() {
        return payDisburseList;
    }

    /**
     * Sets the value of the payDisburseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaycheckPayDisburseList }
     *     
     */
    public void setPayDisburseList(PaycheckPayDisburseList value) {
        this.payDisburseList = value;
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
