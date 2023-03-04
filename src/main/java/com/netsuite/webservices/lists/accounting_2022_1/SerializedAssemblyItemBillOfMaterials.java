
package com.netsuite.webservices.lists.accounting_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2022_1.RecordRef;
import com.netsuite.webservices.platform.core_2022_1.RecordRefList;


/**
 * <p>Java class for SerializedAssemblyItemBillOfMaterials complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SerializedAssemblyItemBillOfMaterials"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billOfMaterials" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="currentRevision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="masterDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="defaultForLocationList" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRefList" minOccurs="0"/&gt;
 *         &lt;element name="inactive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SerializedAssemblyItemBillOfMaterials", propOrder = {
    "billOfMaterials",
    "currentRevision",
    "masterDefault",
    "defaultForLocationList",
    "inactive",
    "memo"
})
public class SerializedAssemblyItemBillOfMaterials {

    protected RecordRef billOfMaterials;
    protected String currentRevision;
    protected Boolean masterDefault;
    protected RecordRefList defaultForLocationList;
    protected String inactive;
    protected String memo;

    /**
     * Gets the value of the billOfMaterials property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBillOfMaterials() {
        return billOfMaterials;
    }

    /**
     * Sets the value of the billOfMaterials property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBillOfMaterials(RecordRef value) {
        this.billOfMaterials = value;
    }

    /**
     * Gets the value of the currentRevision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentRevision() {
        return currentRevision;
    }

    /**
     * Sets the value of the currentRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentRevision(String value) {
        this.currentRevision = value;
    }

    /**
     * Gets the value of the masterDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMasterDefault() {
        return masterDefault;
    }

    /**
     * Sets the value of the masterDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMasterDefault(Boolean value) {
        this.masterDefault = value;
    }

    /**
     * Gets the value of the defaultForLocationList property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRefList }
     *     
     */
    public RecordRefList getDefaultForLocationList() {
        return defaultForLocationList;
    }

    /**
     * Sets the value of the defaultForLocationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRefList }
     *     
     */
    public void setDefaultForLocationList(RecordRefList value) {
        this.defaultForLocationList = value;
    }

    /**
     * Gets the value of the inactive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInactive() {
        return inactive;
    }

    /**
     * Sets the value of the inactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInactive(String value) {
        this.inactive = value;
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

}
