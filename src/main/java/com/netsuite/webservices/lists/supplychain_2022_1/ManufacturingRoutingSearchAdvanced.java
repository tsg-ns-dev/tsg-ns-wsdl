
package com.netsuite.webservices.lists.supplychain_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2022_1.SearchRecord;


/**
 * <p>Java class for ManufacturingRoutingSearchAdvanced complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManufacturingRoutingSearchAdvanced"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="criteria" type="{urn:supplychain_2022_1.lists.webservices.netsuite.com}ManufacturingRoutingSearch" minOccurs="0"/&gt;
 *         &lt;element name="columns" type="{urn:supplychain_2022_1.lists.webservices.netsuite.com}ManufacturingRoutingSearchRow" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="savedSearchId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="savedSearchScriptId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManufacturingRoutingSearchAdvanced", propOrder = {
    "criteria",
    "columns"
})
public class ManufacturingRoutingSearchAdvanced
    extends SearchRecord
{

    protected ManufacturingRoutingSearch criteria;
    protected ManufacturingRoutingSearchRow columns;
    @XmlAttribute(name = "savedSearchId")
    protected String savedSearchId;
    @XmlAttribute(name = "savedSearchScriptId")
    protected String savedSearchScriptId;

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingRoutingSearch }
     *     
     */
    public ManufacturingRoutingSearch getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingRoutingSearch }
     *     
     */
    public void setCriteria(ManufacturingRoutingSearch value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingRoutingSearchRow }
     *     
     */
    public ManufacturingRoutingSearchRow getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingRoutingSearchRow }
     *     
     */
    public void setColumns(ManufacturingRoutingSearchRow value) {
        this.columns = value;
    }

    /**
     * Gets the value of the savedSearchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSavedSearchId() {
        return savedSearchId;
    }

    /**
     * Sets the value of the savedSearchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSavedSearchId(String value) {
        this.savedSearchId = value;
    }

    /**
     * Gets the value of the savedSearchScriptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSavedSearchScriptId() {
        return savedSearchScriptId;
    }

    /**
     * Sets the value of the savedSearchScriptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSavedSearchScriptId(String value) {
        this.savedSearchScriptId = value;
    }

}
