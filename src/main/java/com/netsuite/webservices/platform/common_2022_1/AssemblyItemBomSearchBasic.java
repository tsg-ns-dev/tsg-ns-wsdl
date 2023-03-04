
package com.netsuite.webservices.platform.common_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2022_1.SearchBooleanField;
import com.netsuite.webservices.platform.core_2022_1.SearchMultiSelectField;
import com.netsuite.webservices.platform.core_2022_1.SearchRecordBasic;


/**
 * <p>Java class for AssemblyItemBomSearchBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssemblyItemBomSearchBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRecordBasic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="assembly" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="billOfMaterials" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="default" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="locations" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssemblyItemBomSearchBasic", propOrder = {
    "assembly",
    "billOfMaterials",
    "_default",
    "locations"
})
public class AssemblyItemBomSearchBasic
    extends SearchRecordBasic
{

    protected SearchMultiSelectField assembly;
    protected SearchMultiSelectField billOfMaterials;
    @XmlElement(name = "default")
    protected SearchBooleanField _default;
    protected SearchMultiSelectField locations;

    /**
     * Gets the value of the assembly property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAssembly() {
        return assembly;
    }

    /**
     * Sets the value of the assembly property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAssembly(SearchMultiSelectField value) {
        this.assembly = value;
    }

    /**
     * Gets the value of the billOfMaterials property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getBillOfMaterials() {
        return billOfMaterials;
    }

    /**
     * Sets the value of the billOfMaterials property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setBillOfMaterials(SearchMultiSelectField value) {
        this.billOfMaterials = value;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setDefault(SearchBooleanField value) {
        this._default = value;
    }

    /**
     * Gets the value of the locations property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getLocations() {
        return locations;
    }

    /**
     * Sets the value of the locations property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setLocations(SearchMultiSelectField value) {
        this.locations = value;
    }

}
