
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MerchandiseHierarchyNodeSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MerchandiseHierarchyNodeSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_2.platform.webservices.netsuite.com}SearchRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_2.platform.webservices.netsuite.com}MerchandiseHierarchyNodeSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="parentNodeJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}MerchandiseHierarchyNodeSearchBasic" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MerchandiseHierarchyNodeSearch", propOrder = {
    "basic",
    "parentNodeJoin"
})
public class MerchandiseHierarchyNodeSearch
    extends SearchRecord
{

    protected MerchandiseHierarchyNodeSearchBasic basic;
    protected MerchandiseHierarchyNodeSearchBasic parentNodeJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link MerchandiseHierarchyNodeSearchBasic }
     *     
     */
    public MerchandiseHierarchyNodeSearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchandiseHierarchyNodeSearchBasic }
     *     
     */
    public void setBasic(MerchandiseHierarchyNodeSearchBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the parentNodeJoin property.
     * 
     * @return
     *     possible object is
     *     {@link MerchandiseHierarchyNodeSearchBasic }
     *     
     */
    public MerchandiseHierarchyNodeSearchBasic getParentNodeJoin() {
        return parentNodeJoin;
    }

    /**
     * Sets the value of the parentNodeJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchandiseHierarchyNodeSearchBasic }
     *     
     */
    public void setParentNodeJoin(MerchandiseHierarchyNodeSearchBasic value) {
        this.parentNodeJoin = value;
    }

}
