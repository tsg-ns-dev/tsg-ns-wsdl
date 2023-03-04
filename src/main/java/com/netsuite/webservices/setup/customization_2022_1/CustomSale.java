
package com.netsuite.webservices.setup.customization_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.platform.common_2022_1.AccountingBookDetailList;
import com.netsuite.webservices.platform.common_2022_1.Address;
import com.netsuite.webservices.platform.common_2022_1.GiftCertRedemptionList;
import com.netsuite.webservices.platform.common_2022_1.InstallmentList;
import com.netsuite.webservices.platform.common_2022_1.PromotionsList;
import com.netsuite.webservices.platform.common_2022_1.TaxDetailsList;
import com.netsuite.webservices.platform.common_2022_1.types.RevenueStatus;
import com.netsuite.webservices.platform.core_2022_1.CustomFieldList;
import com.netsuite.webservices.platform.core_2022_1.Record;
import com.netsuite.webservices.platform.core_2022_1.RecordRef;


/**
 * <p>Java class for CustomSale complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomSale"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}Record"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="tranType" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="nexus" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="subsidiaryTaxRegNum" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="taxRegOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="taxDetailsOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="customForm" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="entity" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="billingAccount" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="tranDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="tranId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entityTaxRegNum" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdFrom" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="postingPeriod" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="opportunity" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="department" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="class" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="terms" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="subsidiary" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="discountDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="discountAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="salesRep" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="partner" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="leadSource" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="otherRefNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tranStatus" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="salesEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="excludeCommission" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="totalCostEstimate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="estGrossProfit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="estGrossProfitPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="revRecSchedule" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="revRecStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="revRecEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="account" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="exchangeRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="currencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="promoCode" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="discountItem" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="discountRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isMultiShipTo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isTaxable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="toBePrinted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="toBeEmailed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="toBeFaxed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="messageSel" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billingAddress" type="{urn:common_2022_1.platform.webservices.netsuite.com}Address" minOccurs="0"/&gt;
 *         &lt;element name="billAddressList" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="shippingAddress" type="{urn:common_2022_1.platform.webservices.netsuite.com}Address" minOccurs="0"/&gt;
 *         &lt;element name="shipIsResidential" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="shipAddressList" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="fob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="shipMethod" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="shippingCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="handlingCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="trackingNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="linkedTrackingNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salesGroup" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="subTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="revenueStatus" type="{urn:types.common_2022_1.platform.webservices.netsuite.com}RevenueStatus" minOccurs="0"/&gt;
 *         &lt;element name="recognizedRevenue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="deferredRevenue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="revRecOnRevCommitment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="syncSalesTeams" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="discountTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="taxTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="altShippingCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="altHandlingCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="job" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="giftCertApplied" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="tranIsVsoeBundle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="vsoeAutoCalc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="syncPartnerTeams" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="shipGroupList" type="{urn:customization_2022_1.setup.webservices.netsuite.com}CustomSaleShipGroupList" minOccurs="0"/&gt;
 *         &lt;element name="overrideInstallments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="installmentList" type="{urn:common_2022_1.platform.webservices.netsuite.com}InstallmentList" minOccurs="0"/&gt;
 *         &lt;element name="partnersList" type="{urn:customization_2022_1.setup.webservices.netsuite.com}CustomSalePartnersList" minOccurs="0"/&gt;
 *         &lt;element name="promotionsList" type="{urn:common_2022_1.platform.webservices.netsuite.com}PromotionsList" minOccurs="0"/&gt;
 *         &lt;element name="itemList" type="{urn:customization_2022_1.setup.webservices.netsuite.com}CustomSaleItemList" minOccurs="0"/&gt;
 *         &lt;element name="giftCertRedemptionList" type="{urn:common_2022_1.platform.webservices.netsuite.com}GiftCertRedemptionList" minOccurs="0"/&gt;
 *         &lt;element name="accountingBookDetailList" type="{urn:common_2022_1.platform.webservices.netsuite.com}AccountingBookDetailList" minOccurs="0"/&gt;
 *         &lt;element name="salesTeamList" type="{urn:customization_2022_1.setup.webservices.netsuite.com}CustomSaleSalesTeamList" minOccurs="0"/&gt;
 *         &lt;element name="taxDetailsList" type="{urn:common_2022_1.platform.webservices.netsuite.com}TaxDetailsList" minOccurs="0"/&gt;
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
@XmlType(name = "CustomSale", propOrder = {
    "createdDate",
    "lastModifiedDate",
    "tranType",
    "nexus",
    "subsidiaryTaxRegNum",
    "taxRegOverride",
    "taxDetailsOverride",
    "customForm",
    "entity",
    "billingAccount",
    "tranDate",
    "tranId",
    "entityTaxRegNum",
    "source",
    "createdFrom",
    "postingPeriod",
    "opportunity",
    "department",
    "clazz",
    "terms",
    "location",
    "subsidiary",
    "currency",
    "dueDate",
    "discountDate",
    "discountAmount",
    "salesRep",
    "partner",
    "leadSource",
    "startDate",
    "endDate",
    "otherRefNum",
    "memo",
    "tranStatus",
    "salesEffectiveDate",
    "excludeCommission",
    "totalCostEstimate",
    "estGrossProfit",
    "estGrossProfitPercent",
    "revRecSchedule",
    "revRecStartDate",
    "revRecEndDate",
    "account",
    "exchangeRate",
    "currencyName",
    "promoCode",
    "discountItem",
    "discountRate",
    "isMultiShipTo",
    "isTaxable",
    "toBePrinted",
    "toBeEmailed",
    "toBeFaxed",
    "fax",
    "messageSel",
    "message",
    "billingAddress",
    "billAddressList",
    "shippingAddress",
    "shipIsResidential",
    "shipAddressList",
    "fob",
    "shipDate",
    "shipMethod",
    "shippingCost",
    "handlingCost",
    "trackingNumbers",
    "linkedTrackingNumbers",
    "salesGroup",
    "subTotal",
    "revenueStatus",
    "recognizedRevenue",
    "deferredRevenue",
    "revRecOnRevCommitment",
    "syncSalesTeams",
    "discountTotal",
    "taxTotal",
    "altShippingCost",
    "altHandlingCost",
    "total",
    "status",
    "job",
    "email",
    "giftCertApplied",
    "tranIsVsoeBundle",
    "vsoeAutoCalc",
    "syncPartnerTeams",
    "shipGroupList",
    "overrideInstallments",
    "installmentList",
    "partnersList",
    "promotionsList",
    "itemList",
    "giftCertRedemptionList",
    "accountingBookDetailList",
    "salesTeamList",
    "taxDetailsList",
    "customFieldList"
})
public class CustomSale
    extends Record
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    protected RecordRef tranType;
    protected RecordRef nexus;
    protected RecordRef subsidiaryTaxRegNum;
    protected Boolean taxRegOverride;
    protected Boolean taxDetailsOverride;
    protected RecordRef customForm;
    protected RecordRef entity;
    protected RecordRef billingAccount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tranDate;
    protected String tranId;
    protected RecordRef entityTaxRegNum;
    protected String source;
    protected RecordRef createdFrom;
    protected RecordRef postingPeriod;
    protected RecordRef opportunity;
    protected RecordRef department;
    @XmlElement(name = "class")
    protected RecordRef clazz;
    protected RecordRef terms;
    protected RecordRef location;
    protected RecordRef subsidiary;
    protected RecordRef currency;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dueDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar discountDate;
    protected Double discountAmount;
    protected RecordRef salesRep;
    protected RecordRef partner;
    protected RecordRef leadSource;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected String otherRefNum;
    protected String memo;
    protected RecordRef tranStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar salesEffectiveDate;
    protected Boolean excludeCommission;
    protected Double totalCostEstimate;
    protected Double estGrossProfit;
    protected Double estGrossProfitPercent;
    protected RecordRef revRecSchedule;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar revRecStartDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar revRecEndDate;
    protected RecordRef account;
    protected Double exchangeRate;
    protected String currencyName;
    protected RecordRef promoCode;
    protected RecordRef discountItem;
    protected String discountRate;
    protected Boolean isMultiShipTo;
    protected Boolean isTaxable;
    protected Boolean toBePrinted;
    protected Boolean toBeEmailed;
    protected Boolean toBeFaxed;
    protected String fax;
    protected RecordRef messageSel;
    protected String message;
    protected Address billingAddress;
    protected RecordRef billAddressList;
    protected Address shippingAddress;
    protected Boolean shipIsResidential;
    protected RecordRef shipAddressList;
    protected String fob;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shipDate;
    protected RecordRef shipMethod;
    protected Double shippingCost;
    protected Double handlingCost;
    protected String trackingNumbers;
    protected String linkedTrackingNumbers;
    protected RecordRef salesGroup;
    protected Double subTotal;
    @XmlSchemaType(name = "string")
    protected RevenueStatus revenueStatus;
    protected Double recognizedRevenue;
    protected Double deferredRevenue;
    protected Boolean revRecOnRevCommitment;
    protected Boolean syncSalesTeams;
    protected Double discountTotal;
    protected Double taxTotal;
    protected Double altShippingCost;
    protected Double altHandlingCost;
    protected Double total;
    protected String status;
    protected RecordRef job;
    protected String email;
    protected Double giftCertApplied;
    protected Boolean tranIsVsoeBundle;
    protected Boolean vsoeAutoCalc;
    protected Boolean syncPartnerTeams;
    protected CustomSaleShipGroupList shipGroupList;
    protected Boolean overrideInstallments;
    protected InstallmentList installmentList;
    protected CustomSalePartnersList partnersList;
    protected PromotionsList promotionsList;
    protected CustomSaleItemList itemList;
    protected GiftCertRedemptionList giftCertRedemptionList;
    protected AccountingBookDetailList accountingBookDetailList;
    protected CustomSaleSalesTeamList salesTeamList;
    protected TaxDetailsList taxDetailsList;
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
     * Gets the value of the tranType property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTranType() {
        return tranType;
    }

    /**
     * Sets the value of the tranType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTranType(RecordRef value) {
        this.tranType = value;
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
     * Gets the value of the subsidiaryTaxRegNum property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSubsidiaryTaxRegNum() {
        return subsidiaryTaxRegNum;
    }

    /**
     * Sets the value of the subsidiaryTaxRegNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSubsidiaryTaxRegNum(RecordRef value) {
        this.subsidiaryTaxRegNum = value;
    }

    /**
     * Gets the value of the taxRegOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxRegOverride() {
        return taxRegOverride;
    }

    /**
     * Sets the value of the taxRegOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxRegOverride(Boolean value) {
        this.taxRegOverride = value;
    }

    /**
     * Gets the value of the taxDetailsOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxDetailsOverride() {
        return taxDetailsOverride;
    }

    /**
     * Sets the value of the taxDetailsOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxDetailsOverride(Boolean value) {
        this.taxDetailsOverride = value;
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
     * Gets the value of the billingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBillingAccount() {
        return billingAccount;
    }

    /**
     * Sets the value of the billingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBillingAccount(RecordRef value) {
        this.billingAccount = value;
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
     * Gets the value of the entityTaxRegNum property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getEntityTaxRegNum() {
        return entityTaxRegNum;
    }

    /**
     * Sets the value of the entityTaxRegNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setEntityTaxRegNum(RecordRef value) {
        this.entityTaxRegNum = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the createdFrom property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCreatedFrom() {
        return createdFrom;
    }

    /**
     * Sets the value of the createdFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCreatedFrom(RecordRef value) {
        this.createdFrom = value;
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
     * Gets the value of the opportunity property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getOpportunity() {
        return opportunity;
    }

    /**
     * Sets the value of the opportunity property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setOpportunity(RecordRef value) {
        this.opportunity = value;
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
     * Gets the value of the terms property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTerms() {
        return terms;
    }

    /**
     * Sets the value of the terms property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTerms(RecordRef value) {
        this.terms = value;
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
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the discountDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDiscountDate() {
        return discountDate;
    }

    /**
     * Sets the value of the discountDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDiscountDate(XMLGregorianCalendar value) {
        this.discountDate = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscountAmount(Double value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the salesRep property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSalesRep() {
        return salesRep;
    }

    /**
     * Sets the value of the salesRep property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSalesRep(RecordRef value) {
        this.salesRep = value;
    }

    /**
     * Gets the value of the partner property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPartner() {
        return partner;
    }

    /**
     * Sets the value of the partner property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPartner(RecordRef value) {
        this.partner = value;
    }

    /**
     * Gets the value of the leadSource property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLeadSource() {
        return leadSource;
    }

    /**
     * Sets the value of the leadSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLeadSource(RecordRef value) {
        this.leadSource = value;
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
     * Gets the value of the otherRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherRefNum() {
        return otherRefNum;
    }

    /**
     * Sets the value of the otherRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherRefNum(String value) {
        this.otherRefNum = value;
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
     * Gets the value of the tranStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTranStatus() {
        return tranStatus;
    }

    /**
     * Sets the value of the tranStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTranStatus(RecordRef value) {
        this.tranStatus = value;
    }

    /**
     * Gets the value of the salesEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSalesEffectiveDate() {
        return salesEffectiveDate;
    }

    /**
     * Sets the value of the salesEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSalesEffectiveDate(XMLGregorianCalendar value) {
        this.salesEffectiveDate = value;
    }

    /**
     * Gets the value of the excludeCommission property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeCommission() {
        return excludeCommission;
    }

    /**
     * Sets the value of the excludeCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeCommission(Boolean value) {
        this.excludeCommission = value;
    }

    /**
     * Gets the value of the totalCostEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalCostEstimate() {
        return totalCostEstimate;
    }

    /**
     * Sets the value of the totalCostEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalCostEstimate(Double value) {
        this.totalCostEstimate = value;
    }

    /**
     * Gets the value of the estGrossProfit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstGrossProfit() {
        return estGrossProfit;
    }

    /**
     * Sets the value of the estGrossProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstGrossProfit(Double value) {
        this.estGrossProfit = value;
    }

    /**
     * Gets the value of the estGrossProfitPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstGrossProfitPercent() {
        return estGrossProfitPercent;
    }

    /**
     * Sets the value of the estGrossProfitPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstGrossProfitPercent(Double value) {
        this.estGrossProfitPercent = value;
    }

    /**
     * Gets the value of the revRecSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRevRecSchedule() {
        return revRecSchedule;
    }

    /**
     * Sets the value of the revRecSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRevRecSchedule(RecordRef value) {
        this.revRecSchedule = value;
    }

    /**
     * Gets the value of the revRecStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRevRecStartDate() {
        return revRecStartDate;
    }

    /**
     * Sets the value of the revRecStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRevRecStartDate(XMLGregorianCalendar value) {
        this.revRecStartDate = value;
    }

    /**
     * Gets the value of the revRecEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRevRecEndDate() {
        return revRecEndDate;
    }

    /**
     * Sets the value of the revRecEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRevRecEndDate(XMLGregorianCalendar value) {
        this.revRecEndDate = value;
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
     * Gets the value of the promoCode property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPromoCode() {
        return promoCode;
    }

    /**
     * Sets the value of the promoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPromoCode(RecordRef value) {
        this.promoCode = value;
    }

    /**
     * Gets the value of the discountItem property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDiscountItem() {
        return discountItem;
    }

    /**
     * Sets the value of the discountItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDiscountItem(RecordRef value) {
        this.discountItem = value;
    }

    /**
     * Gets the value of the discountRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountRate() {
        return discountRate;
    }

    /**
     * Sets the value of the discountRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountRate(String value) {
        this.discountRate = value;
    }

    /**
     * Gets the value of the isMultiShipTo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMultiShipTo() {
        return isMultiShipTo;
    }

    /**
     * Sets the value of the isMultiShipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMultiShipTo(Boolean value) {
        this.isMultiShipTo = value;
    }

    /**
     * Gets the value of the isTaxable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTaxable() {
        return isTaxable;
    }

    /**
     * Sets the value of the isTaxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTaxable(Boolean value) {
        this.isTaxable = value;
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
     * Gets the value of the toBeEmailed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToBeEmailed() {
        return toBeEmailed;
    }

    /**
     * Sets the value of the toBeEmailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToBeEmailed(Boolean value) {
        this.toBeEmailed = value;
    }

    /**
     * Gets the value of the toBeFaxed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToBeFaxed() {
        return toBeFaxed;
    }

    /**
     * Sets the value of the toBeFaxed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToBeFaxed(Boolean value) {
        this.toBeFaxed = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the messageSel property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getMessageSel() {
        return messageSel;
    }

    /**
     * Sets the value of the messageSel property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setMessageSel(RecordRef value) {
        this.messageSel = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setBillingAddress(Address value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the billAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBillAddressList() {
        return billAddressList;
    }

    /**
     * Sets the value of the billAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBillAddressList(RecordRef value) {
        this.billAddressList = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setShippingAddress(Address value) {
        this.shippingAddress = value;
    }

    /**
     * Gets the value of the shipIsResidential property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShipIsResidential() {
        return shipIsResidential;
    }

    /**
     * Sets the value of the shipIsResidential property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShipIsResidential(Boolean value) {
        this.shipIsResidential = value;
    }

    /**
     * Gets the value of the shipAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getShipAddressList() {
        return shipAddressList;
    }

    /**
     * Sets the value of the shipAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setShipAddressList(RecordRef value) {
        this.shipAddressList = value;
    }

    /**
     * Gets the value of the fob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFob() {
        return fob;
    }

    /**
     * Sets the value of the fob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFob(String value) {
        this.fob = value;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipDate(XMLGregorianCalendar value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the shipMethod property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getShipMethod() {
        return shipMethod;
    }

    /**
     * Sets the value of the shipMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setShipMethod(RecordRef value) {
        this.shipMethod = value;
    }

    /**
     * Gets the value of the shippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShippingCost() {
        return shippingCost;
    }

    /**
     * Sets the value of the shippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShippingCost(Double value) {
        this.shippingCost = value;
    }

    /**
     * Gets the value of the handlingCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHandlingCost() {
        return handlingCost;
    }

    /**
     * Sets the value of the handlingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHandlingCost(Double value) {
        this.handlingCost = value;
    }

    /**
     * Gets the value of the trackingNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumbers() {
        return trackingNumbers;
    }

    /**
     * Sets the value of the trackingNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumbers(String value) {
        this.trackingNumbers = value;
    }

    /**
     * Gets the value of the linkedTrackingNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedTrackingNumbers() {
        return linkedTrackingNumbers;
    }

    /**
     * Sets the value of the linkedTrackingNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedTrackingNumbers(String value) {
        this.linkedTrackingNumbers = value;
    }

    /**
     * Gets the value of the salesGroup property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSalesGroup() {
        return salesGroup;
    }

    /**
     * Sets the value of the salesGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSalesGroup(RecordRef value) {
        this.salesGroup = value;
    }

    /**
     * Gets the value of the subTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSubTotal() {
        return subTotal;
    }

    /**
     * Sets the value of the subTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSubTotal(Double value) {
        this.subTotal = value;
    }

    /**
     * Gets the value of the revenueStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RevenueStatus }
     *     
     */
    public RevenueStatus getRevenueStatus() {
        return revenueStatus;
    }

    /**
     * Sets the value of the revenueStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevenueStatus }
     *     
     */
    public void setRevenueStatus(RevenueStatus value) {
        this.revenueStatus = value;
    }

    /**
     * Gets the value of the recognizedRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRecognizedRevenue() {
        return recognizedRevenue;
    }

    /**
     * Sets the value of the recognizedRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRecognizedRevenue(Double value) {
        this.recognizedRevenue = value;
    }

    /**
     * Gets the value of the deferredRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeferredRevenue() {
        return deferredRevenue;
    }

    /**
     * Sets the value of the deferredRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeferredRevenue(Double value) {
        this.deferredRevenue = value;
    }

    /**
     * Gets the value of the revRecOnRevCommitment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRevRecOnRevCommitment() {
        return revRecOnRevCommitment;
    }

    /**
     * Sets the value of the revRecOnRevCommitment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRevRecOnRevCommitment(Boolean value) {
        this.revRecOnRevCommitment = value;
    }

    /**
     * Gets the value of the syncSalesTeams property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSyncSalesTeams() {
        return syncSalesTeams;
    }

    /**
     * Sets the value of the syncSalesTeams property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSyncSalesTeams(Boolean value) {
        this.syncSalesTeams = value;
    }

    /**
     * Gets the value of the discountTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscountTotal() {
        return discountTotal;
    }

    /**
     * Sets the value of the discountTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscountTotal(Double value) {
        this.discountTotal = value;
    }

    /**
     * Gets the value of the taxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxTotal() {
        return taxTotal;
    }

    /**
     * Sets the value of the taxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxTotal(Double value) {
        this.taxTotal = value;
    }

    /**
     * Gets the value of the altShippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAltShippingCost() {
        return altShippingCost;
    }

    /**
     * Sets the value of the altShippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAltShippingCost(Double value) {
        this.altShippingCost = value;
    }

    /**
     * Gets the value of the altHandlingCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAltHandlingCost() {
        return altHandlingCost;
    }

    /**
     * Sets the value of the altHandlingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAltHandlingCost(Double value) {
        this.altHandlingCost = value;
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
     * Gets the value of the job property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getJob() {
        return job;
    }

    /**
     * Sets the value of the job property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setJob(RecordRef value) {
        this.job = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the giftCertApplied property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGiftCertApplied() {
        return giftCertApplied;
    }

    /**
     * Sets the value of the giftCertApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGiftCertApplied(Double value) {
        this.giftCertApplied = value;
    }

    /**
     * Gets the value of the tranIsVsoeBundle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTranIsVsoeBundle() {
        return tranIsVsoeBundle;
    }

    /**
     * Sets the value of the tranIsVsoeBundle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTranIsVsoeBundle(Boolean value) {
        this.tranIsVsoeBundle = value;
    }

    /**
     * Gets the value of the vsoeAutoCalc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVsoeAutoCalc() {
        return vsoeAutoCalc;
    }

    /**
     * Sets the value of the vsoeAutoCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVsoeAutoCalc(Boolean value) {
        this.vsoeAutoCalc = value;
    }

    /**
     * Gets the value of the syncPartnerTeams property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSyncPartnerTeams() {
        return syncPartnerTeams;
    }

    /**
     * Sets the value of the syncPartnerTeams property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSyncPartnerTeams(Boolean value) {
        this.syncPartnerTeams = value;
    }

    /**
     * Gets the value of the shipGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomSaleShipGroupList }
     *     
     */
    public CustomSaleShipGroupList getShipGroupList() {
        return shipGroupList;
    }

    /**
     * Sets the value of the shipGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomSaleShipGroupList }
     *     
     */
    public void setShipGroupList(CustomSaleShipGroupList value) {
        this.shipGroupList = value;
    }

    /**
     * Gets the value of the overrideInstallments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideInstallments() {
        return overrideInstallments;
    }

    /**
     * Sets the value of the overrideInstallments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideInstallments(Boolean value) {
        this.overrideInstallments = value;
    }

    /**
     * Gets the value of the installmentList property.
     * 
     * @return
     *     possible object is
     *     {@link InstallmentList }
     *     
     */
    public InstallmentList getInstallmentList() {
        return installmentList;
    }

    /**
     * Sets the value of the installmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallmentList }
     *     
     */
    public void setInstallmentList(InstallmentList value) {
        this.installmentList = value;
    }

    /**
     * Gets the value of the partnersList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomSalePartnersList }
     *     
     */
    public CustomSalePartnersList getPartnersList() {
        return partnersList;
    }

    /**
     * Sets the value of the partnersList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomSalePartnersList }
     *     
     */
    public void setPartnersList(CustomSalePartnersList value) {
        this.partnersList = value;
    }

    /**
     * Gets the value of the promotionsList property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionsList }
     *     
     */
    public PromotionsList getPromotionsList() {
        return promotionsList;
    }

    /**
     * Sets the value of the promotionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionsList }
     *     
     */
    public void setPromotionsList(PromotionsList value) {
        this.promotionsList = value;
    }

    /**
     * Gets the value of the itemList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomSaleItemList }
     *     
     */
    public CustomSaleItemList getItemList() {
        return itemList;
    }

    /**
     * Sets the value of the itemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomSaleItemList }
     *     
     */
    public void setItemList(CustomSaleItemList value) {
        this.itemList = value;
    }

    /**
     * Gets the value of the giftCertRedemptionList property.
     * 
     * @return
     *     possible object is
     *     {@link GiftCertRedemptionList }
     *     
     */
    public GiftCertRedemptionList getGiftCertRedemptionList() {
        return giftCertRedemptionList;
    }

    /**
     * Sets the value of the giftCertRedemptionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCertRedemptionList }
     *     
     */
    public void setGiftCertRedemptionList(GiftCertRedemptionList value) {
        this.giftCertRedemptionList = value;
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
     * Gets the value of the salesTeamList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomSaleSalesTeamList }
     *     
     */
    public CustomSaleSalesTeamList getSalesTeamList() {
        return salesTeamList;
    }

    /**
     * Sets the value of the salesTeamList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomSaleSalesTeamList }
     *     
     */
    public void setSalesTeamList(CustomSaleSalesTeamList value) {
        this.salesTeamList = value;
    }

    /**
     * Gets the value of the taxDetailsList property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDetailsList }
     *     
     */
    public TaxDetailsList getTaxDetailsList() {
        return taxDetailsList;
    }

    /**
     * Sets the value of the taxDetailsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetailsList }
     *     
     */
    public void setTaxDetailsList(TaxDetailsList value) {
        this.taxDetailsList = value;
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
