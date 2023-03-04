
package com.netsuite.webservices.lists.accounting_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2022_1.CustomerSearchBasic;
import com.netsuite.webservices.platform.common_2022_1.PaymentInstrumentSearchBasic;
import com.netsuite.webservices.platform.common_2022_1.TransactionSearchBasic;
import com.netsuite.webservices.platform.core_2022_1.SearchRecord;


/**
 * <p>Java class for PaymentInstrumentSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentInstrumentSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_1.platform.webservices.netsuite.com}PaymentInstrumentSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="customerJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}CustomerSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="transactionJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstrumentSearch", propOrder = {
    "basic",
    "customerJoin",
    "transactionJoin"
})
public class PaymentInstrumentSearch
    extends SearchRecord
{

    protected PaymentInstrumentSearchBasic basic;
    protected CustomerSearchBasic customerJoin;
    protected TransactionSearchBasic transactionJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrumentSearchBasic }
     *     
     */
    public PaymentInstrumentSearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrumentSearchBasic }
     *     
     */
    public void setBasic(PaymentInstrumentSearchBasic value) {
        this.basic = value;
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

}
