
package tsg.ns.wsdl.coop;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaycheckPaySummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaycheckPaySummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="payItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payItemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ytdAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaycheckPaySummary", namespace = "urn:employees_2022_2.transactions.webservices.netsuite.com", propOrder = {
    "payItem",
    "payItemType",
    "amount",
    "ytdAmount"
})
public class PaycheckPaySummary {

    protected String payItem;
    protected String payItemType;
    protected Double amount;
    protected Double ytdAmount;

    /**
     * Gets the value of the payItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayItem() {
        return payItem;
    }

    /**
     * Sets the value of the payItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayItem(String value) {
        this.payItem = value;
    }

    /**
     * Gets the value of the payItemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayItemType() {
        return payItemType;
    }

    /**
     * Sets the value of the payItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayItemType(String value) {
        this.payItemType = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the ytdAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getYtdAmount() {
        return ytdAmount;
    }

    /**
     * Sets the value of the ytdAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setYtdAmount(Double value) {
        this.ytdAmount = value;
    }

}
