
package com.netsuite.webservices.transactions.customers_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.platform.common_2022_1.AccountingBookDetailList;
import com.netsuite.webservices.platform.common_2022_1.Address;
import com.netsuite.webservices.platform.core_2022_1.CustomFieldList;
import com.netsuite.webservices.platform.core_2022_1.Record;
import com.netsuite.webservices.platform.core_2022_1.RecordRef;
import com.netsuite.webservices.transactions.customers_2022_1.types.CustomerRefundHandlingMode;
import com.netsuite.webservices.transactions.customers_2022_1.types.CustomerRefundPaymentOperation;


/**
 * <p>Java class for CustomerRefund complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerRefund"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}Record"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="customForm" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="arAcct" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="currencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exchangeRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="tranDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="voidJournal" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="postingPeriod" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentMethod" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="account" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="toBePrinted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="tranId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="debitCardIssueNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditCardProcessor" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="chargeIt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="pnRefNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="subsidiary" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="department" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="class" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="paymentOption" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="inputAuthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inputReferenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentCardCsc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentProcessingProfile" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="handlingMode" type="{urn:types.customers_2022_1.transactions.webservices.netsuite.com}CustomerRefundHandlingMode" minOccurs="0"/&gt;
 *         &lt;element name="outputAuthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outputReferenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentOperation" type="{urn:types.customers_2022_1.transactions.webservices.netsuite.com}CustomerRefundPaymentOperation" minOccurs="0"/&gt;
 *         &lt;element name="dynamicDescriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditCard" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="ccIsPurchaseCardBin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ccProcessAsPurchaseCard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ccExpireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ccName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ccStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ccZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ccApproved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="applyList" type="{urn:customers_2022_1.transactions.webservices.netsuite.com}CustomerRefundApplyList" minOccurs="0"/&gt;
 *         &lt;element name="depositList" type="{urn:customers_2022_1.transactions.webservices.netsuite.com}CustomerRefundDepositList" minOccurs="0"/&gt;
 *         &lt;element name="accountingBookDetailList" type="{urn:common_2022_1.platform.webservices.netsuite.com}AccountingBookDetailList" minOccurs="0"/&gt;
 *         &lt;element name="payeeAddressList" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="payeeAddress" type="{urn:common_2022_1.platform.webservices.netsuite.com}Address" minOccurs="0"/&gt;
 *         &lt;element name="customFieldList" type="{urn:core_2022_1.platform.webservices.netsuite.com}CustomFieldList" minOccurs="0"/&gt;
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
@XmlType(name = "CustomerRefund", propOrder = {
    "createdDate",
    "lastModifiedDate",
    "status",
    "transactionNumber",
    "customer",
    "customForm",
    "balance",
    "arAcct",
    "currencyName",
    "exchangeRate",
    "total",
    "currency",
    "tranDate",
    "voidJournal",
    "postingPeriod",
    "memo",
    "paymentMethod",
    "account",
    "toBePrinted",
    "tranId",
    "debitCardIssueNo",
    "creditCardProcessor",
    "chargeIt",
    "pnRefNum",
    "validFrom",
    "subsidiary",
    "department",
    "clazz",
    "location",
    "paymentOption",
    "inputAuthCode",
    "inputReferenceCode",
    "checkNumber",
    "paymentCardCsc",
    "paymentProcessingProfile",
    "handlingMode",
    "outputAuthCode",
    "outputReferenceCode",
    "paymentOperation",
    "dynamicDescriptor",
    "creditCard",
    "ccIsPurchaseCardBin",
    "ccNumber",
    "ccProcessAsPurchaseCard",
    "ccExpireDate",
    "ccName",
    "ccStreet",
    "ccZipCode",
    "ccApproved",
    "applyList",
    "depositList",
    "accountingBookDetailList",
    "payeeAddressList",
    "payeeAddress",
    "customFieldList"
})
public class CustomerRefund
    extends Record
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    protected String status;
    protected String transactionNumber;
    protected RecordRef customer;
    protected RecordRef customForm;
    protected Double balance;
    protected RecordRef arAcct;
    protected String currencyName;
    protected Double exchangeRate;
    protected Double total;
    protected RecordRef currency;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tranDate;
    protected RecordRef voidJournal;
    protected RecordRef postingPeriod;
    protected String memo;
    protected RecordRef paymentMethod;
    protected RecordRef account;
    protected Boolean toBePrinted;
    protected String tranId;
    protected String debitCardIssueNo;
    protected RecordRef creditCardProcessor;
    protected Boolean chargeIt;
    protected String pnRefNum;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validFrom;
    protected RecordRef subsidiary;
    protected RecordRef department;
    @XmlElement(name = "class")
    protected RecordRef clazz;
    protected RecordRef location;
    protected RecordRef paymentOption;
    protected String inputAuthCode;
    protected String inputReferenceCode;
    protected String checkNumber;
    protected String paymentCardCsc;
    protected RecordRef paymentProcessingProfile;
    @XmlSchemaType(name = "string")
    protected CustomerRefundHandlingMode handlingMode;
    protected String outputAuthCode;
    protected String outputReferenceCode;
    @XmlSchemaType(name = "string")
    protected CustomerRefundPaymentOperation paymentOperation;
    protected String dynamicDescriptor;
    protected RecordRef creditCard;
    protected Boolean ccIsPurchaseCardBin;
    protected String ccNumber;
    protected Boolean ccProcessAsPurchaseCard;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ccExpireDate;
    protected String ccName;
    protected String ccStreet;
    protected String ccZipCode;
    protected Boolean ccApproved;
    protected CustomerRefundApplyList applyList;
    protected CustomerRefundDepositList depositList;
    protected AccountingBookDetailList accountingBookDetailList;
    protected RecordRef payeeAddressList;
    protected Address payeeAddress;
    protected CustomFieldList customFieldList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

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
     * Gets the value of the transactionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionNumber() {
        return transactionNumber;
    }

    /**
     * Sets the value of the transactionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionNumber(String value) {
        this.transactionNumber = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCustomer(RecordRef value) {
        this.customer = value;
    }

    /**
     * Gets the value of the customForm property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCustomForm() {
        return customForm;
    }

    /**
     * Sets the value of the customForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCustomForm(RecordRef value) {
        this.customForm = value;
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
     * Gets the value of the arAcct property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getArAcct() {
        return arAcct;
    }

    /**
     * Sets the value of the arAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setArAcct(RecordRef value) {
        this.arAcct = value;
    }

    /**
     * Gets the value of the currencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyName() {
        return currencyName;
    }

    /**
     * Sets the value of the currencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyName(String value) {
        this.currencyName = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExchangeRate(Double value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotal(Double value) {
        this.total = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCurrency(RecordRef value) {
        this.currency = value;
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
     * Gets the value of the voidJournal property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getVoidJournal() {
        return voidJournal;
    }

    /**
     * Sets the value of the voidJournal property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setVoidJournal(RecordRef value) {
        this.voidJournal = value;
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
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPaymentMethod(RecordRef value) {
        this.paymentMethod = value;
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
     * Gets the value of the toBePrinted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToBePrinted() {
        return toBePrinted;
    }

    /**
     * Sets the value of the toBePrinted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToBePrinted(Boolean value) {
        this.toBePrinted = value;
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
     * Gets the value of the debitCardIssueNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitCardIssueNo() {
        return debitCardIssueNo;
    }

    /**
     * Sets the value of the debitCardIssueNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitCardIssueNo(String value) {
        this.debitCardIssueNo = value;
    }

    /**
     * Gets the value of the creditCardProcessor property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCreditCardProcessor() {
        return creditCardProcessor;
    }

    /**
     * Sets the value of the creditCardProcessor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCreditCardProcessor(RecordRef value) {
        this.creditCardProcessor = value;
    }

    /**
     * Gets the value of the chargeIt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChargeIt() {
        return chargeIt;
    }

    /**
     * Sets the value of the chargeIt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChargeIt(Boolean value) {
        this.chargeIt = value;
    }

    /**
     * Gets the value of the pnRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnRefNum() {
        return pnRefNum;
    }

    /**
     * Sets the value of the pnRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnRefNum(String value) {
        this.pnRefNum = value;
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFrom(XMLGregorianCalendar value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the subsidiary property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSubsidiary() {
        return subsidiary;
    }

    /**
     * Sets the value of the subsidiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSubsidiary(RecordRef value) {
        this.subsidiary = value;
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
     * Gets the value of the paymentOption property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPaymentOption() {
        return paymentOption;
    }

    /**
     * Sets the value of the paymentOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPaymentOption(RecordRef value) {
        this.paymentOption = value;
    }

    /**
     * Gets the value of the inputAuthCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputAuthCode() {
        return inputAuthCode;
    }

    /**
     * Sets the value of the inputAuthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputAuthCode(String value) {
        this.inputAuthCode = value;
    }

    /**
     * Gets the value of the inputReferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputReferenceCode() {
        return inputReferenceCode;
    }

    /**
     * Sets the value of the inputReferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputReferenceCode(String value) {
        this.inputReferenceCode = value;
    }

    /**
     * Gets the value of the checkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNumber(String value) {
        this.checkNumber = value;
    }

    /**
     * Gets the value of the paymentCardCsc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCardCsc() {
        return paymentCardCsc;
    }

    /**
     * Sets the value of the paymentCardCsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCardCsc(String value) {
        this.paymentCardCsc = value;
    }

    /**
     * Gets the value of the paymentProcessingProfile property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPaymentProcessingProfile() {
        return paymentProcessingProfile;
    }

    /**
     * Sets the value of the paymentProcessingProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPaymentProcessingProfile(RecordRef value) {
        this.paymentProcessingProfile = value;
    }

    /**
     * Gets the value of the handlingMode property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRefundHandlingMode }
     *     
     */
    public CustomerRefundHandlingMode getHandlingMode() {
        return handlingMode;
    }

    /**
     * Sets the value of the handlingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRefundHandlingMode }
     *     
     */
    public void setHandlingMode(CustomerRefundHandlingMode value) {
        this.handlingMode = value;
    }

    /**
     * Gets the value of the outputAuthCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputAuthCode() {
        return outputAuthCode;
    }

    /**
     * Sets the value of the outputAuthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputAuthCode(String value) {
        this.outputAuthCode = value;
    }

    /**
     * Gets the value of the outputReferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputReferenceCode() {
        return outputReferenceCode;
    }

    /**
     * Sets the value of the outputReferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputReferenceCode(String value) {
        this.outputReferenceCode = value;
    }

    /**
     * Gets the value of the paymentOperation property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRefundPaymentOperation }
     *     
     */
    public CustomerRefundPaymentOperation getPaymentOperation() {
        return paymentOperation;
    }

    /**
     * Sets the value of the paymentOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRefundPaymentOperation }
     *     
     */
    public void setPaymentOperation(CustomerRefundPaymentOperation value) {
        this.paymentOperation = value;
    }

    /**
     * Gets the value of the dynamicDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicDescriptor() {
        return dynamicDescriptor;
    }

    /**
     * Sets the value of the dynamicDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicDescriptor(String value) {
        this.dynamicDescriptor = value;
    }

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCreditCard(RecordRef value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the ccIsPurchaseCardBin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCcIsPurchaseCardBin() {
        return ccIsPurchaseCardBin;
    }

    /**
     * Sets the value of the ccIsPurchaseCardBin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCcIsPurchaseCardBin(Boolean value) {
        this.ccIsPurchaseCardBin = value;
    }

    /**
     * Gets the value of the ccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcNumber() {
        return ccNumber;
    }

    /**
     * Sets the value of the ccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcNumber(String value) {
        this.ccNumber = value;
    }

    /**
     * Gets the value of the ccProcessAsPurchaseCard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCcProcessAsPurchaseCard() {
        return ccProcessAsPurchaseCard;
    }

    /**
     * Sets the value of the ccProcessAsPurchaseCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCcProcessAsPurchaseCard(Boolean value) {
        this.ccProcessAsPurchaseCard = value;
    }

    /**
     * Gets the value of the ccExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCcExpireDate() {
        return ccExpireDate;
    }

    /**
     * Sets the value of the ccExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCcExpireDate(XMLGregorianCalendar value) {
        this.ccExpireDate = value;
    }

    /**
     * Gets the value of the ccName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcName() {
        return ccName;
    }

    /**
     * Sets the value of the ccName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcName(String value) {
        this.ccName = value;
    }

    /**
     * Gets the value of the ccStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcStreet() {
        return ccStreet;
    }

    /**
     * Sets the value of the ccStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcStreet(String value) {
        this.ccStreet = value;
    }

    /**
     * Gets the value of the ccZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcZipCode() {
        return ccZipCode;
    }

    /**
     * Sets the value of the ccZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcZipCode(String value) {
        this.ccZipCode = value;
    }

    /**
     * Gets the value of the ccApproved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCcApproved() {
        return ccApproved;
    }

    /**
     * Sets the value of the ccApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCcApproved(Boolean value) {
        this.ccApproved = value;
    }

    /**
     * Gets the value of the applyList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRefundApplyList }
     *     
     */
    public CustomerRefundApplyList getApplyList() {
        return applyList;
    }

    /**
     * Sets the value of the applyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRefundApplyList }
     *     
     */
    public void setApplyList(CustomerRefundApplyList value) {
        this.applyList = value;
    }

    /**
     * Gets the value of the depositList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRefundDepositList }
     *     
     */
    public CustomerRefundDepositList getDepositList() {
        return depositList;
    }

    /**
     * Sets the value of the depositList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRefundDepositList }
     *     
     */
    public void setDepositList(CustomerRefundDepositList value) {
        this.depositList = value;
    }

    /**
     * Gets the value of the accountingBookDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingBookDetailList }
     *     
     */
    public AccountingBookDetailList getAccountingBookDetailList() {
        return accountingBookDetailList;
    }

    /**
     * Sets the value of the accountingBookDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingBookDetailList }
     *     
     */
    public void setAccountingBookDetailList(AccountingBookDetailList value) {
        this.accountingBookDetailList = value;
    }

    /**
     * Gets the value of the payeeAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPayeeAddressList() {
        return payeeAddressList;
    }

    /**
     * Sets the value of the payeeAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPayeeAddressList(RecordRef value) {
        this.payeeAddressList = value;
    }

    /**
     * Gets the value of the payeeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getPayeeAddress() {
        return payeeAddress;
    }

    /**
     * Sets the value of the payeeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setPayeeAddress(Address value) {
        this.payeeAddress = value;
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
