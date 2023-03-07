
package tsg.ns.wsdl.coop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InboundShipmentSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InboundShipmentSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_2.platform.webservices.netsuite.com}SearchRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_2.platform.webservices.netsuite.com}InboundShipmentSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="inventoryDetailJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}InventoryDetailSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="itemJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}ItemSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="itemReceiptJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrderJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="vendorJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}VendorSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="customSearchJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}CustomSearchJoin" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InboundShipmentSearch", namespace = "urn:purchases_2022_2.transactions.webservices.netsuite.com", propOrder = {
    "basic",
    "inventoryDetailJoin",
    "itemJoin",
    "itemReceiptJoin",
    "purchaseOrderJoin",
    "vendorJoin",
    "customSearchJoin"
})
public class InboundShipmentSearch
    extends SearchRecord
{

    protected InboundShipmentSearchBasic basic;
    protected InventoryDetailSearchBasic inventoryDetailJoin;
    protected ItemSearchBasic itemJoin;
    protected TransactionSearchBasic itemReceiptJoin;
    protected TransactionSearchBasic purchaseOrderJoin;
    protected VendorSearchBasic vendorJoin;
    protected List<CustomSearchJoin> customSearchJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link InboundShipmentSearchBasic }
     *     
     */
    public InboundShipmentSearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link InboundShipmentSearchBasic }
     *     
     */
    public void setBasic(InboundShipmentSearchBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the inventoryDetailJoin property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryDetailSearchBasic }
     *     
     */
    public InventoryDetailSearchBasic getInventoryDetailJoin() {
        return inventoryDetailJoin;
    }

    /**
     * Sets the value of the inventoryDetailJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryDetailSearchBasic }
     *     
     */
    public void setInventoryDetailJoin(InventoryDetailSearchBasic value) {
        this.inventoryDetailJoin = value;
    }

    /**
     * Gets the value of the itemJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchBasic }
     *     
     */
    public ItemSearchBasic getItemJoin() {
        return itemJoin;
    }

    /**
     * Sets the value of the itemJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchBasic }
     *     
     */
    public void setItemJoin(ItemSearchBasic value) {
        this.itemJoin = value;
    }

    /**
     * Gets the value of the itemReceiptJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getItemReceiptJoin() {
        return itemReceiptJoin;
    }

    /**
     * Sets the value of the itemReceiptJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setItemReceiptJoin(TransactionSearchBasic value) {
        this.itemReceiptJoin = value;
    }

    /**
     * Gets the value of the purchaseOrderJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getPurchaseOrderJoin() {
        return purchaseOrderJoin;
    }

    /**
     * Sets the value of the purchaseOrderJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setPurchaseOrderJoin(TransactionSearchBasic value) {
        this.purchaseOrderJoin = value;
    }

    /**
     * Gets the value of the vendorJoin property.
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchBasic }
     *     
     */
    public VendorSearchBasic getVendorJoin() {
        return vendorJoin;
    }

    /**
     * Sets the value of the vendorJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchBasic }
     *     
     */
    public void setVendorJoin(VendorSearchBasic value) {
        this.vendorJoin = value;
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
