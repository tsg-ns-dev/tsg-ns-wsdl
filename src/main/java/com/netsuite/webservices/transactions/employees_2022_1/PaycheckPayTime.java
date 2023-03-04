
package com.netsuite.webservices.transactions.employees_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PaycheckPayTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaycheckPayTime"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apply" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="line" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="payItem" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="payItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ddate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="custJob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaycheckPayTime", propOrder = {
    "apply",
    "line",
    "payItem",
    "payItemName",
    "ddate",
    "custJob",
    "serviceItem",
    "count",
    "rate",
    "amount"
})
public class PaycheckPayTime {

    protected Boolean apply;
    protected Long line;
    protected Long payItem;
    protected String payItemName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ddate;
    protected String custJob;
    protected String serviceItem;
    protected Double count;
    protected Double rate;
    protected Double amount;

    /**
     * Gets the value of the apply property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApply() {
        return apply;
    }

    /**
     * Sets the value of the apply property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApply(Boolean value) {
        this.apply = value;
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
     * Gets the value of the ddate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDdate() {
        return ddate;
    }

    /**
     * Sets the value of the ddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDdate(XMLGregorianCalendar value) {
        this.ddate = value;
    }

    /**
     * Gets the value of the custJob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustJob() {
        return custJob;
    }

    /**
     * Sets the value of the custJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustJob(String value) {
        this.custJob = value;
    }

    /**
     * Gets the value of the serviceItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceItem() {
        return serviceItem;
    }

    /**
     * Sets the value of the serviceItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceItem(String value) {
        this.serviceItem = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCount(Double value) {
        this.count = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRate(Double value) {
        this.rate = value;
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

}
