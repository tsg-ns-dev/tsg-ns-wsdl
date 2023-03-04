
package com.netsuite.webservices.lists.accounting_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2022_1.PaymentOptionSearchBasic;
import com.netsuite.webservices.platform.common_2022_1.TransactionSearchBasic;
import com.netsuite.webservices.platform.core_2022_1.SearchRecord;


/**
 * <p>Java class for PaymentOptionSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentOptionSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_1.platform.webservices.netsuite.com}PaymentOptionSearchBasic" minOccurs="0"/&gt;
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
@XmlType(name = "PaymentOptionSearch", propOrder = {
    "basic",
    "transactionJoin"
})
public class PaymentOptionSearch
    extends SearchRecord
{

    protected PaymentOptionSearchBasic basic;
    protected TransactionSearchBasic transactionJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentOptionSearchBasic }
     *     
     */
    public PaymentOptionSearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentOptionSearchBasic }
     *     
     */
    public void setBasic(PaymentOptionSearchBasic value) {
        this.basic = value;
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
