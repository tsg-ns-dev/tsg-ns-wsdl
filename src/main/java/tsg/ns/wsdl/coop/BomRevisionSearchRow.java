
package tsg.ns.wsdl.coop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BomRevisionSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BomRevisionSearchRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_2.platform.webservices.netsuite.com}SearchRow"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_2.platform.webservices.netsuite.com}BomRevisionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="billOfMaterialsJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}BomSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="componentJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}BomRevisionComponentSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="transactionJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/&gt;
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
@XmlType(name = "BomRevisionSearchRow", propOrder = {
    "basic",
    "billOfMaterialsJoin",
    "componentJoin",
    "transactionJoin",
    "customSearchJoin"
})
public class BomRevisionSearchRow
    extends SearchRow
{

    protected BomRevisionSearchRowBasic basic;
    protected BomSearchRowBasic billOfMaterialsJoin;
    protected BomRevisionComponentSearchRowBasic componentJoin;
    protected TransactionSearchRowBasic transactionJoin;
    protected List<CustomSearchRowBasic> customSearchJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link BomRevisionSearchRowBasic }
     *     
     */
    public BomRevisionSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link BomRevisionSearchRowBasic }
     *     
     */
    public void setBasic(BomRevisionSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the billOfMaterialsJoin property.
     * 
     * @return
     *     possible object is
     *     {@link BomSearchRowBasic }
     *     
     */
    public BomSearchRowBasic getBillOfMaterialsJoin() {
        return billOfMaterialsJoin;
    }

    /**
     * Sets the value of the billOfMaterialsJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BomSearchRowBasic }
     *     
     */
    public void setBillOfMaterialsJoin(BomSearchRowBasic value) {
        this.billOfMaterialsJoin = value;
    }

    /**
     * Gets the value of the componentJoin property.
     * 
     * @return
     *     possible object is
     *     {@link BomRevisionComponentSearchRowBasic }
     *     
     */
    public BomRevisionComponentSearchRowBasic getComponentJoin() {
        return componentJoin;
    }

    /**
     * Sets the value of the componentJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BomRevisionComponentSearchRowBasic }
     *     
     */
    public void setComponentJoin(BomRevisionComponentSearchRowBasic value) {
        this.componentJoin = value;
    }

    /**
     * Gets the value of the transactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getTransactionJoin() {
        return transactionJoin;
    }

    /**
     * Sets the value of the transactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setTransactionJoin(TransactionSearchRowBasic value) {
        this.transactionJoin = value;
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
