
package com.netsuite.webservices.transactions.customers_2022_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2022_1.BillingAccountSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.BillingScheduleSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.ChargeSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.CustomSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.CustomerSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.ItemSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.JobSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.TimeBillSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.TransactionSearchRowBasic;
import com.netsuite.webservices.platform.common_2022_1.UsageSearchRowBasic;
import com.netsuite.webservices.platform.core_2022_1.SearchRow;


/**
 * <p>Java class for ChargeSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargeSearchRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRow"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_1.platform.webservices.netsuite.com}ChargeSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="billingAccountJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}BillingAccountSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="billingScheduleJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}BillingScheduleSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="chargeEmployeeJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="customerJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}CustomerSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="invoiceJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="itemJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}ItemSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="jobJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}JobSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="salesOrderJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="timeJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}TimeBillSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="transactionJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="usageJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}UsageSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="userJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="customSearchJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}CustomSearchRowBasic" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeSearchRow", propOrder = {
    "basic",
    "billingAccountJoin",
    "billingScheduleJoin",
    "chargeEmployeeJoin",
    "customerJoin",
    "invoiceJoin",
    "itemJoin",
    "jobJoin",
    "salesOrderJoin",
    "timeJoin",
    "transactionJoin",
    "usageJoin",
    "userJoin",
    "customSearchJoin"
})
public class ChargeSearchRow
    extends SearchRow
{

    protected ChargeSearchRowBasic basic;
    protected BillingAccountSearchRowBasic billingAccountJoin;
    protected BillingScheduleSearchRowBasic billingScheduleJoin;
    protected EmployeeSearchRowBasic chargeEmployeeJoin;
    protected CustomerSearchRowBasic customerJoin;
    protected TransactionSearchRowBasic invoiceJoin;
    protected ItemSearchRowBasic itemJoin;
    protected JobSearchRowBasic jobJoin;
    protected TransactionSearchRowBasic salesOrderJoin;
    protected TimeBillSearchRowBasic timeJoin;
    protected TransactionSearchRowBasic transactionJoin;
    protected UsageSearchRowBasic usageJoin;
    protected EmployeeSearchRowBasic userJoin;
    protected List<CustomSearchRowBasic> customSearchJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeSearchRowBasic }
     *     
     */
    public ChargeSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeSearchRowBasic }
     *     
     */
    public void setBasic(ChargeSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the billingAccountJoin property.
     * 
     * @return
     *     possible object is
     *     {@link BillingAccountSearchRowBasic }
     *     
     */
    public BillingAccountSearchRowBasic getBillingAccountJoin() {
        return billingAccountJoin;
    }

    /**
     * Sets the value of the billingAccountJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingAccountSearchRowBasic }
     *     
     */
    public void setBillingAccountJoin(BillingAccountSearchRowBasic value) {
        this.billingAccountJoin = value;
    }

    /**
     * Gets the value of the billingScheduleJoin property.
     * 
     * @return
     *     possible object is
     *     {@link BillingScheduleSearchRowBasic }
     *     
     */
    public BillingScheduleSearchRowBasic getBillingScheduleJoin() {
        return billingScheduleJoin;
    }

    /**
     * Sets the value of the billingScheduleJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingScheduleSearchRowBasic }
     *     
     */
    public void setBillingScheduleJoin(BillingScheduleSearchRowBasic value) {
        this.billingScheduleJoin = value;
    }

    /**
     * Gets the value of the chargeEmployeeJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getChargeEmployeeJoin() {
        return chargeEmployeeJoin;
    }

    /**
     * Sets the value of the chargeEmployeeJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setChargeEmployeeJoin(EmployeeSearchRowBasic value) {
        this.chargeEmployeeJoin = value;
    }

    /**
     * Gets the value of the customerJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public CustomerSearchRowBasic getCustomerJoin() {
        return customerJoin;
    }

    /**
     * Sets the value of the customerJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public void setCustomerJoin(CustomerSearchRowBasic value) {
        this.customerJoin = value;
    }

    /**
     * Gets the value of the invoiceJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getInvoiceJoin() {
        return invoiceJoin;
    }

    /**
     * Sets the value of the invoiceJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setInvoiceJoin(TransactionSearchRowBasic value) {
        this.invoiceJoin = value;
    }

    /**
     * Gets the value of the itemJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public ItemSearchRowBasic getItemJoin() {
        return itemJoin;
    }

    /**
     * Sets the value of the itemJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public void setItemJoin(ItemSearchRowBasic value) {
        this.itemJoin = value;
    }

    /**
     * Gets the value of the jobJoin property.
     * 
     * @return
     *     possible object is
     *     {@link JobSearchRowBasic }
     *     
     */
    public JobSearchRowBasic getJobJoin() {
        return jobJoin;
    }

    /**
     * Sets the value of the jobJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobSearchRowBasic }
     *     
     */
    public void setJobJoin(JobSearchRowBasic value) {
        this.jobJoin = value;
    }

    /**
     * Gets the value of the salesOrderJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getSalesOrderJoin() {
        return salesOrderJoin;
    }

    /**
     * Sets the value of the salesOrderJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setSalesOrderJoin(TransactionSearchRowBasic value) {
        this.salesOrderJoin = value;
    }

    /**
     * Gets the value of the timeJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TimeBillSearchRowBasic }
     *     
     */
    public TimeBillSearchRowBasic getTimeJoin() {
        return timeJoin;
    }

    /**
     * Sets the value of the timeJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeBillSearchRowBasic }
     *     
     */
    public void setTimeJoin(TimeBillSearchRowBasic value) {
        this.timeJoin = value;
    }

    /**
     * Gets the value of the transactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getTransactionJoin() {
        return transactionJoin;
    }

    /**
     * Sets the value of the transactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setTransactionJoin(TransactionSearchRowBasic value) {
        this.transactionJoin = value;
    }

    /**
     * Gets the value of the usageJoin property.
     * 
     * @return
     *     possible object is
     *     {@link UsageSearchRowBasic }
     *     
     */
    public UsageSearchRowBasic getUsageJoin() {
        return usageJoin;
    }

    /**
     * Sets the value of the usageJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageSearchRowBasic }
     *     
     */
    public void setUsageJoin(UsageSearchRowBasic value) {
        this.usageJoin = value;
    }

    /**
     * Gets the value of the userJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }

    /**
     * Sets the value of the userJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchRowBasic value) {
        this.userJoin = value;
    }

    /**
     * Gets the value of the customSearchJoin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customSearchJoin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomSearchJoin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomSearchRowBasic }
     * 
     * 
     */
    public List<CustomSearchRowBasic> getCustomSearchJoin() {
        if (customSearchJoin == null) {
            customSearchJoin = new ArrayList<CustomSearchRowBasic>();
        }
        return this.customSearchJoin;
    }

}
