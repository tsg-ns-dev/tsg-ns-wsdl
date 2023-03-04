
package com.netsuite.webservices.lists.accounting_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2022_1.MerchandiseHierarchyNodeSearchRowBasic;
import com.netsuite.webservices.platform.core_2022_1.SearchRow;


/**
 * <p>Java class for MerchandiseHierarchyNodeSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MerchandiseHierarchyNodeSearchRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRow"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_1.platform.webservices.netsuite.com}MerchandiseHierarchyNodeSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="parentNodeJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}MerchandiseHierarchyNodeSearchRowBasic" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MerchandiseHierarchyNodeSearchRow", propOrder = {
    "basic",
    "parentNodeJoin"
})
public class MerchandiseHierarchyNodeSearchRow
    extends SearchRow
{

    protected MerchandiseHierarchyNodeSearchRowBasic basic;
    protected MerchandiseHierarchyNodeSearchRowBasic parentNodeJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link MerchandiseHierarchyNodeSearchRowBasic }
     *     
     */
    public MerchandiseHierarchyNodeSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchandiseHierarchyNodeSearchRowBasic }
     *     
     */
    public void setBasic(MerchandiseHierarchyNodeSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the parentNodeJoin property.
     * 
     * @return
     *     possible object is
     *     {@link MerchandiseHierarchyNodeSearchRowBasic }
     *     
     */
    public MerchandiseHierarchyNodeSearchRowBasic getParentNodeJoin() {
        return parentNodeJoin;
    }

    /**
     * Sets the value of the parentNodeJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchandiseHierarchyNodeSearchRowBasic }
     *     
     */
    public void setParentNodeJoin(MerchandiseHierarchyNodeSearchRowBasic value) {
        this.parentNodeJoin = value;
    }

}
