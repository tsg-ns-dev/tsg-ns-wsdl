
package tsg.ns.wsdl.coop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonInventorySaleItemHierarchyVersionsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonInventorySaleItemHierarchyVersionsList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nonInventorySaleItemHierarchyVersions" type="{urn:accounting_2022_2.lists.webservices.netsuite.com}NonInventorySaleItemHierarchyVersions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="replaceAll" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonInventorySaleItemHierarchyVersionsList", propOrder = {
    "nonInventorySaleItemHierarchyVersions"
})
public class NonInventorySaleItemHierarchyVersionsList {

    protected List<NonInventorySaleItemHierarchyVersions> nonInventorySaleItemHierarchyVersions;
    @XmlAttribute(name = "replaceAll")
    protected Boolean replaceAll;

    /**
     * Gets the value of the nonInventorySaleItemHierarchyVersions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the nonInventorySaleItemHierarchyVersions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonInventorySaleItemHierarchyVersions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonInventorySaleItemHierarchyVersions }
     * 
     * 
     */
    public List<NonInventorySaleItemHierarchyVersions> getNonInventorySaleItemHierarchyVersions() {
        if (nonInventorySaleItemHierarchyVersions == null) {
            nonInventorySaleItemHierarchyVersions = new ArrayList<NonInventorySaleItemHierarchyVersions>();
        }
        return this.nonInventorySaleItemHierarchyVersions;
    }

    /**
     * Gets the value of the replaceAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReplaceAll() {
        if (replaceAll == null) {
            return true;
        } else {
            return replaceAll;
        }
    }

    /**
     * Sets the value of the replaceAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplaceAll(Boolean value) {
        this.replaceAll = value;
    }

}
