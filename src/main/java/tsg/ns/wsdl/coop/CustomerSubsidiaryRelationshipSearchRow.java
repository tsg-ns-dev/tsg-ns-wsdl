
package tsg.ns.wsdl.coop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerSubsidiaryRelationshipSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerSubsidiaryRelationshipSearchRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_2.platform.webservices.netsuite.com}SearchRow"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_2.platform.webservices.netsuite.com}CustomerSubsidiaryRelationshipSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="customerJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}CustomerSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="subsidiaryJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}SubsidiarySearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="customSearchJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}CustomSearchRowBasic" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSubsidiaryRelationshipSearchRow", namespace = "urn:relationships_2022_2.lists.webservices.netsuite.com", propOrder = {
    "basic",
    "customerJoin",
    "subsidiaryJoin",
    "customSearchJoin"
})
public class CustomerSubsidiaryRelationshipSearchRow
    extends SearchRow
{

    protected CustomerSubsidiaryRelationshipSearchRowBasic basic;
    protected CustomerSearchRowBasic customerJoin;
    protected SubsidiarySearchRowBasic subsidiaryJoin;
    protected List<CustomSearchRowBasic> customSearchJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSubsidiaryRelationshipSearchRowBasic }
     *     
     */
    public CustomerSubsidiaryRelationshipSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSubsidiaryRelationshipSearchRowBasic }
     *     
     */
    public void setBasic(CustomerSubsidiaryRelationshipSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the customerJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public CustomerSearchRowBasic getCustomerJoin() {
        return customerJoin;
    }

    /**
     * Sets the value of the customerJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public void setCustomerJoin(CustomerSearchRowBasic value) {
        this.customerJoin = value;
    }

    /**
     * Gets the value of the subsidiaryJoin property.
     * 
     * @return
     *     possible object is
     *     {@link SubsidiarySearchRowBasic }
     *     
     */
    public SubsidiarySearchRowBasic getSubsidiaryJoin() {
        return subsidiaryJoin;
    }

    /**
     * Sets the value of the subsidiaryJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidiarySearchRowBasic }
     *     
     */
    public void setSubsidiaryJoin(SubsidiarySearchRowBasic value) {
        this.subsidiaryJoin = value;
    }

    /**
     * Gets the value of the customSearchJoin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
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
     * {@link CustomSearchRowBasic }
     * 
     * 
     */
    public List<CustomSearchRowBasic> getCustomSearchJoin() {
        if (customSearchJoin == null) {
            customSearchJoin = new ArrayList<CustomSearchRowBasic>();
        }
        return this.customSearchJoin;
    }

}
