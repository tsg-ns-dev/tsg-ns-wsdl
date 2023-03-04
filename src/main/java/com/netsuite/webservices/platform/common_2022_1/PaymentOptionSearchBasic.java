
package com.netsuite.webservices.platform.common_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2022_1.SearchEnumMultiSelectField;
import com.netsuite.webservices.platform.core_2022_1.SearchLongField;
import com.netsuite.webservices.platform.core_2022_1.SearchMultiSelectField;
import com.netsuite.webservices.platform.core_2022_1.SearchRecordBasic;


/**
 * <p>Java class for PaymentOptionSearchBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentOptionSearchBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRecordBasic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="internalId" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="internalIdNumber" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="paymentInstrumentType" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentOptionSearchBasic", propOrder = {
    "internalId",
    "internalIdNumber",
    "paymentInstrumentType"
})
public class PaymentOptionSearchBasic
    extends SearchRecordBasic
{

    protected SearchMultiSelectField internalId;
    protected SearchLongField internalIdNumber;
    protected SearchEnumMultiSelectField paymentInstrumentType;

    /**
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setInternalId(SearchMultiSelectField value) {
        this.internalId = value;
    }

    /**
     * Gets the value of the internalIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }

    /**
     * Sets the value of the internalIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setInternalIdNumber(SearchLongField value) {
        this.internalIdNumber = value;
    }

    /**
     * Gets the value of the paymentInstrumentType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getPaymentInstrumentType() {
        return paymentInstrumentType;
    }

    /**
     * Sets the value of the paymentInstrumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setPaymentInstrumentType(SearchEnumMultiSelectField value) {
        this.paymentInstrumentType = value;
    }

}
