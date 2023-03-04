
package com.netsuite.webservices.lists.relationships_2022_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2022_1.CustomSearchJoin;
import com.netsuite.webservices.platform.common_2022_1.CustomerSearchBasic;
import com.netsuite.webservices.platform.common_2022_1.CustomerSubsidiaryRelationshipSearchBasic;
import com.netsuite.webservices.platform.common_2022_1.SubsidiarySearchBasic;
import com.netsuite.webservices.platform.core_2022_1.SearchRecord;


/**
 * <p>Java class for CustomerSubsidiaryRelationshipSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerSubsidiaryRelationshipSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_1.platform.webservices.netsuite.com}CustomerSubsidiaryRelationshipSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="customerJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}CustomerSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="subsidiaryJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}SubsidiarySearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="customSearchJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}CustomSearchJoin" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSubsidiaryRelationshipSearch", propOrder = {
    "basic",
    "customerJoin",
    "subsidiaryJoin",
    "customSearchJoin"
})
public class CustomerSubsidiaryRelationshipSearch
    extends SearchRecord
{

    protected CustomerSubsidiaryRelationshipSearchBasic basic;
    protected CustomerSearchBasic customerJoin;
    protected SubsidiarySearchBasic subsidiaryJoin;
    protected List<CustomSearchJoin> customSearchJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSubsidiaryRelationshipSearchBasic }
     *     
     */
    public CustomerSubsidiaryRelationshipSearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSubsidiaryRelationshipSearchBasic }
     *     
     */
    public void setBasic(CustomerSubsidiaryRelationshipSearchBasic value) {
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
     * Gets the value of the subsidiaryJoin property.
     * 
     * @return
     *     possible object is
     *     {@link SubsidiarySearchBasic }
     *     
     */
    public SubsidiarySearchBasic getSubsidiaryJoin() {
        return subsidiaryJoin;
    }

    /**
     * Sets the value of the subsidiaryJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidiarySearchBasic }
     *     
     */
    public void setSubsidiaryJoin(SubsidiarySearchBasic value) {
        this.subsidiaryJoin = value;
    }

    /**
     * Gets the value of the customSearchJoin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customSearchJoin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomSearchJoin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomSearchJoin }
     * 
     * 
     */
    public List<CustomSearchJoin> getCustomSearchJoin() {
        if (customSearchJoin == null) {
            customSearchJoin = new ArrayList<CustomSearchJoin>();
        }
        return this.customSearchJoin;
    }

}
