
package com.netsuite.webservices.transactions.employees_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaycheckPayPto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaycheckPayPto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="payItem" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="payItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hoursAccrued" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="hoursUsed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="hoursBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaycheckPayPto", propOrder = {
    "payItem",
    "payItemName",
    "hoursAccrued",
    "hoursUsed",
    "hoursBalance"
})
public class PaycheckPayPto {

    protected Long payItem;
    protected String payItemName;
    protected Double hoursAccrued;
    protected Double hoursUsed;
    protected Double hoursBalance;

    /**
     * Gets the value of the payItem property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayItem() {
        return payItem;
    }

    /**
     * Sets the value of the payItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayItem(Long value) {
        this.payItem = value;
    }

    /**
     * Gets the value of the payItemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayItemName() {
        return payItemName;
    }

    /**
     * Sets the value of the payItemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayItemName(String value) {
        this.payItemName = value;
    }

    /**
     * Gets the value of the hoursAccrued property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHoursAccrued() {
        return hoursAccrued;
    }

    /**
     * Sets the value of the hoursAccrued property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHoursAccrued(Double value) {
        this.hoursAccrued = value;
    }

    /**
     * Gets the value of the hoursUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHoursUsed() {
        return hoursUsed;
    }

    /**
     * Sets the value of the hoursUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHoursUsed(Double value) {
        this.hoursUsed = value;
    }

    /**
     * Gets the value of the hoursBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHoursBalance() {
        return hoursBalance;
    }

    /**
     * Sets the value of the hoursBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHoursBalance(Double value) {
        this.hoursBalance = value;
    }

}
