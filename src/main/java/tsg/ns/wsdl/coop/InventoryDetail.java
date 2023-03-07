
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_2.platform.webservices.netsuite.com}Record"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inventoryAssignmentList" type="{urn:common_2022_2.platform.webservices.netsuite.com}InventoryAssignmentList" minOccurs="0"/&gt;
 *         &lt;element name="customForm" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryDetail", namespace = "urn:common_2022_2.platform.webservices.netsuite.com", propOrder = {
    "inventoryAssignmentList",
    "customForm"
})
public class InventoryDetail
    extends Record
{

    protected InventoryAssignmentList inventoryAssignmentList;
    protected RecordRef customForm;

    /**
     * Gets the value of the inventoryAssignmentList property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryAssignmentList }
     *     
     */
    public InventoryAssignmentList getInventoryAssignmentList() {
        return inventoryAssignmentList;
    }

    /**
     * Sets the value of the inventoryAssignmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryAssignmentList }
     *     
     */
    public void setInventoryAssignmentList(InventoryAssignmentList value) {
        this.inventoryAssignmentList = value;
    }

    /**
     * Gets the value of the customForm property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCustomForm() {
        return customForm;
    }

    /**
     * Sets the value of the customForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCustomForm(RecordRef value) {
        this.customForm = value;
    }

}
