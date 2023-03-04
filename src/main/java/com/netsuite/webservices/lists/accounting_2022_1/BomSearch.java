
package com.netsuite.webservices.lists.accounting_2022_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2022_1.AssemblyItemBomSearchBasic;
import com.netsuite.webservices.platform.common_2022_1.BomRevisionSearchBasic;
import com.netsuite.webservices.platform.common_2022_1.BomSearchBasic;
import com.netsuite.webservices.platform.common_2022_1.CustomSearchJoin;
import com.netsuite.webservices.platform.common_2022_1.TransactionSearchBasic;
import com.netsuite.webservices.platform.core_2022_1.SearchRecord;


/**
 * <p>Java class for BomSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BomSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_1.platform.webservices.netsuite.com}BomSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="assemblyItemJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}AssemblyItemBomSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="revisionJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}BomRevisionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="transactionJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/&gt;
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
@XmlType(name = "BomSearch", propOrder = {
    "basic",
    "assemblyItemJoin",
    "revisionJoin",
    "transactionJoin",
    "customSearchJoin"
})
public class BomSearch
    extends SearchRecord
{

    protected BomSearchBasic basic;
    protected AssemblyItemBomSearchBasic assemblyItemJoin;
    protected BomRevisionSearchBasic revisionJoin;
    protected TransactionSearchBasic transactionJoin;
    protected List<CustomSearchJoin> customSearchJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link BomSearchBasic }
     *     
     */
    public BomSearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link BomSearchBasic }
     *     
     */
    public void setBasic(BomSearchBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the assemblyItemJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AssemblyItemBomSearchBasic }
     *     
     */
    public AssemblyItemBomSearchBasic getAssemblyItemJoin() {
        return assemblyItemJoin;
    }

    /**
     * Sets the value of the assemblyItemJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssemblyItemBomSearchBasic }
     *     
     */
    public void setAssemblyItemJoin(AssemblyItemBomSearchBasic value) {
        this.assemblyItemJoin = value;
    }

    /**
     * Gets the value of the revisionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link BomRevisionSearchBasic }
     *     
     */
    public BomRevisionSearchBasic getRevisionJoin() {
        return revisionJoin;
    }

    /**
     * Sets the value of the revisionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BomRevisionSearchBasic }
     *     
     */
    public void setRevisionJoin(BomRevisionSearchBasic value) {
        this.revisionJoin = value;
    }

    /**
     * Gets the value of the transactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getTransactionJoin() {
        return transactionJoin;
    }

    /**
     * Sets the value of the transactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setTransactionJoin(TransactionSearchBasic value) {
        this.transactionJoin = value;
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
