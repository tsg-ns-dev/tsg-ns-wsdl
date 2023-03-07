
package tsg.ns.wsdl.coop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SerializedInventoryItemHierarchyVersionsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SerializedInventoryItemHierarchyVersionsList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serializedInventoryItemHierarchyVersions" type="{urn:accounting_2022_2.lists.webservices.netsuite.com}SerializedInventoryItemHierarchyVersions" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "SerializedInventoryItemHierarchyVersionsList", propOrder = {
    "serializedInventoryItemHierarchyVersions"
})
public class SerializedInventoryItemHierarchyVersionsList {

    protected List<SerializedInventoryItemHierarchyVersions> serializedInventoryItemHierarchyVersions;
    @XmlAttribute(name = "replaceAll")
    protected Boolean replaceAll;

    /**
     * Gets the value of the serializedInventoryItemHierarchyVersions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the serializedInventoryItemHierarchyVersions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerializedInventoryItemHierarchyVersions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SerializedInventoryItemHierarchyVersions }
     * 
     * 
     */
    public List<SerializedInventoryItemHierarchyVersions> getSerializedInventoryItemHierarchyVersions() {
        if (serializedInventoryItemHierarchyVersions == null) {
            serializedInventoryItemHierarchyVersions = new ArrayList<SerializedInventoryItemHierarchyVersions>();
        }
        return this.serializedInventoryItemHierarchyVersions;
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
