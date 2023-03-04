
package com.netsuite.webservices.setup.customization_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomSaleShipGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomSaleShipGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sourceAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destinationAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shippingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shippingRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="handlingRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="isFulfilled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="sourceAddressRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destinationAddressRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shippingMethodRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomSaleShipGroup", propOrder = {
    "sourceAddress",
    "destinationAddress",
    "shippingMethod",
    "shippingRate",
    "handlingRate",
    "id",
    "isFulfilled",
    "weight",
    "sourceAddressRef",
    "destinationAddressRef",
    "shippingMethodRef"
})
public class CustomSaleShipGroup {

    protected String sourceAddress;
    protected String destinationAddress;
    protected String shippingMethod;
    protected Double shippingRate;
    protected Double handlingRate;
    protected Long id;
    protected String isFulfilled;
    protected Double weight;
    protected String sourceAddressRef;
    protected String destinationAddressRef;
    protected String shippingMethodRef;

    /**
     * Gets the value of the sourceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceAddress() {
        return sourceAddress;
    }

    /**
     * Sets the value of the sourceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceAddress(String value) {
        this.sourceAddress = value;
    }

    /**
     * Gets the value of the destinationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationAddress() {
        return destinationAddress;
    }

    /**
     * Sets the value of the destinationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationAddress(String value) {
        this.destinationAddress = value;
    }

    /**
     * Gets the value of the shippingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingMethod() {
        return shippingMethod;
    }

    /**
     * Sets the value of the shippingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingMethod(String value) {
        this.shippingMethod = value;
    }

    /**
     * Gets the value of the shippingRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShippingRate() {
        return shippingRate;
    }

    /**
     * Sets the value of the shippingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShippingRate(Double value) {
        this.shippingRate = value;
    }

    /**
     * Gets the value of the handlingRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHandlingRate() {
        return handlingRate;
    }

    /**
     * Sets the value of the handlingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHandlingRate(Double value) {
        this.handlingRate = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the isFulfilled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsFulfilled() {
        return isFulfilled;
    }

    /**
     * Sets the value of the isFulfilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsFulfilled(String value) {
        this.isFulfilled = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeight(Double value) {
        this.weight = value;
    }

    /**
     * Gets the value of the sourceAddressRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceAddressRef() {
        return sourceAddressRef;
    }

    /**
     * Sets the value of the sourceAddressRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceAddressRef(String value) {
        this.sourceAddressRef = value;
    }

    /**
     * Gets the value of the destinationAddressRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationAddressRef() {
        return destinationAddressRef;
    }

    /**
     * Sets the value of the destinationAddressRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationAddressRef(String value) {
        this.destinationAddressRef = value;
    }

    /**
     * Gets the value of the shippingMethodRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingMethodRef() {
        return shippingMethodRef;
    }

    /**
     * Sets the value of the shippingMethodRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingMethodRef(String value) {
        this.shippingMethodRef = value;
    }

}
