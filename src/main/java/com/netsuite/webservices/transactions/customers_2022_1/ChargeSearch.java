
package com.netsuite.webservices.transactions.customers_2022_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2022_1.BillingAccountSearchBasic;
import com.netsuite.webservices.platform.common_2022_1.BillingScheduleSearchBasic;
import com.netsuite.webservices.platform.common_2022_1.ChargeSearchBasic;
import com.netsuite.webservices.platform.common_2022_1.CustomSearchJoin;
import com.netsuite.webservices.platform.common_2022_1.CustomerSearchBasic;
import com.netsuite.webservices.platform.common_2022_1.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common_2022_1.ItemSearchBasic;
import com.netsuite.webservices.platform.common_2022_1.JobSearchBasic;
import com.netsuite.webservices.platform.common_2022_1.TimeBillSearchBasic;
import com.netsuite.webservices.platform.common_2022_1.TransactionSearchBasic;
import com.netsuite.webservices.platform.common_2022_1.UsageSearchBasic;
import com.netsuite.webservices.platform.core_2022_1.SearchRecord;


/**
 * <p>Java class for ChargeSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargeSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_1.platform.webservices.netsuite.com}ChargeSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="billingAccountJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}BillingAccountSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="billingScheduleJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}BillingScheduleSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="chargeEmployeeJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="customerJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}CustomerSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="invoiceJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="itemJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}ItemSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="jobJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}JobSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="salesOrderJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="timeJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}TimeBillSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="transactionJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="usageJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}UsageSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="userJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="customSearchJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}CustomSearchJoin" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeSearch", propOrder = {
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
public class ChargeSearch
    extends SearchRecord
{

    protected ChargeSearchBasic basic;
    protected BillingAccountSearchBasic billingAccountJoin;
    protected BillingScheduleSearchBasic billingScheduleJoin;
    protected EmployeeSearchBasic chargeEmployeeJoin;
    protected CustomerSearchBasic customerJoin;
    protected TransactionSearchBasic invoiceJoin;
    protected ItemSearchBasic itemJoin;
    protected JobSearchBasic jobJoin;
    protected TransactionSearchBasic salesOrderJoin;
    protected TimeBillSearchBasic timeJoin;
    protected TransactionSearchBasic transactionJoin;
    protected UsageSearchBasic usageJoin;
    protected EmployeeSearchBasic userJoin;
    protected List<CustomSearchJoin> customSearchJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeSearchBasic }
     *     
     */
    public ChargeSearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeSearchBasic }
     *     
     */
    public void setBasic(ChargeSearchBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the billingAccountJoin property.
     * 
     * @return
     *     possible object is
     *     {@link BillingAccountSearchBasic }
     *     
     */
    public BillingAccountSearchBasic getBillingAccountJoin() {
        return billingAccountJoin;
    }

    /**
     * Sets the value of the billingAccountJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingAccountSearchBasic }
     *     
     */
    public void setBillingAccountJoin(BillingAccountSearchBasic value) {
        this.billingAccountJoin = value;
    }

    /**
     * Gets the value of the billingScheduleJoin property.
     * 
     * @return
     *     possible object is
     *     {@link BillingScheduleSearchBasic }
     *     
     */
    public BillingScheduleSearchBasic getBillingScheduleJoin() {
        return billingScheduleJoin;
    }

    /**
     * Sets the value of the billingScheduleJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingScheduleSearchBasic }
     *     
     */
    public void setBillingScheduleJoin(BillingScheduleSearchBasic value) {
        this.billingScheduleJoin = value;
    }

    /**
     * Gets the value of the chargeEmployeeJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getChargeEmployeeJoin() {
        return chargeEmployeeJoin;
    }

    /**
     * Sets the value of the chargeEmployeeJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setChargeEmployeeJoin(EmployeeSearchBasic value) {
        this.chargeEmployeeJoin = value;
    }

    /**
     * Gets the value of the customerJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public CustomerSearchBasic getCustomerJoin() {
        return customerJoin;
    }

    /**
     * Sets the value of the customerJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public void setCustomerJoin(CustomerSearchBasic value) {
        this.customerJoin = value;
    }

    /**
     * Gets the value of the invoiceJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getInvoiceJoin() {
        return invoiceJoin;
    }

    /**
     * Sets the value of the invoiceJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setInvoiceJoin(TransactionSearchBasic value) {
        this.invoiceJoin = value;
    }

    /**
     * Gets the value of the itemJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchBasic }
     *     
     */
    public ItemSearchBasic getItemJoin() {
        return itemJoin;
    }

    /**
     * Sets the value of the itemJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchBasic }
     *     
     */
    public void setItemJoin(ItemSearchBasic value) {
        this.itemJoin = value;
    }

    /**
     * Gets the value of the jobJoin property.
     * 
     * @return
     *     possible object is
     *     {@link JobSearchBasic }
     *     
     */
    public JobSearchBasic getJobJoin() {
        return jobJoin;
    }

    /**
     * Sets the value of the jobJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobSearchBasic }
     *     
     */
    public void setJobJoin(JobSearchBasic value) {
        this.jobJoin = value;
    }

    /**
     * Gets the value of the salesOrderJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getSalesOrderJoin() {
        return salesOrderJoin;
    }

    /**
     * Sets the value of the salesOrderJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setSalesOrderJoin(TransactionSearchBasic value) {
        this.salesOrderJoin = value;
    }

    /**
     * Gets the value of the timeJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TimeBillSearchBasic }
     *     
     */
    public TimeBillSearchBasic getTimeJoin() {
        return timeJoin;
    }

    /**
     * Sets the value of the timeJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeBillSearchBasic }
     *     
     */
    public void setTimeJoin(TimeBillSearchBasic value) {
        this.timeJoin = value;
    }

    /**
     * Gets the value of the transactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getTransactionJoin() {
        return transactionJoin;
    }

    /**
     * Sets the value of the transactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setTransactionJoin(TransactionSearchBasic value) {
        this.transactionJoin = value;
    }

    /**
     * Gets the value of the usageJoin property.
     * 
     * @return
     *     possible object is
     *     {@link UsageSearchBasic }
     *     
     */
    public UsageSearchBasic getUsageJoin() {
        return usageJoin;
    }

    /**
     * Sets the value of the usageJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageSearchBasic }
     *     
     */
    public void setUsageJoin(UsageSearchBasic value) {
        this.usageJoin = value;
    }

    /**
     * Gets the value of the userJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }

    /**
     * Sets the value of the userJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchBasic value) {
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
     * {@link CustomSearchJoin }
     * 
     * 
     */
    public List<CustomSearchJoin> getCustomSearchJoin() {
        if (customSearchJoin == null) {
            customSearchJoin = new ArrayList<CustomSearchJoin>();
        }
        return this.customSearchJoin;
    }

}
