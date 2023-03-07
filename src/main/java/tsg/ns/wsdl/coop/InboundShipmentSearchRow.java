
package tsg.ns.wsdl.coop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InboundShipmentSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InboundShipmentSearchRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_2.platform.webservices.netsuite.com}SearchRow"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_2.platform.webservices.netsuite.com}InboundShipmentSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="inventoryDetailJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}InventoryDetailSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="itemJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}ItemSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="itemReceiptJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrderJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="vendorJoin" type="{urn:common_2022_2.platform.webservices.netsuite.com}VendorSearchRowBasic" minOccurs="0"/&gt;
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
@XmlType(name = "InboundShipmentSearchRow", namespace = "urn:purchases_2022_2.transactions.webservices.netsuite.com", propOrder = {
    "basic",
    "inventoryDetailJoin",
    "itemJoin",
    "itemReceiptJoin",
    "purchaseOrderJoin",
    "vendorJoin",
    "customSearchJoin"
})
public class InboundShipmentSearchRow
    extends SearchRow
{

    protected InboundShipmentSearchRowBasic basic;
    protected InventoryDetailSearchRowBasic inventoryDetailJoin;
    protected ItemSearchRowBasic itemJoin;
    protected TransactionSearchRowBasic itemReceiptJoin;
    protected TransactionSearchRowBasic purchaseOrderJoin;
    protected VendorSearchRowBasic vendorJoin;
    protected List<CustomSearchRowBasic> customSearchJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link InboundShipmentSearchRowBasic }
     *     
     */
    public InboundShipmentSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link InboundShipmentSearchRowBasic }
     *     
     */
    public void setBasic(InboundShipmentSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the inventoryDetailJoin property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryDetailSearchRowBasic }
     *     
     */
    public InventoryDetailSearchRowBasic getInventoryDetailJoin() {
        return inventoryDetailJoin;
    }

    /**
     * Sets the value of the inventoryDetailJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryDetailSearchRowBasic }
     *     
     */
    public void setInventoryDetailJoin(InventoryDetailSearchRowBasic value) {
        this.inventoryDetailJoin = value;
    }

    /**
     * Gets the value of the itemJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public ItemSearchRowBasic getItemJoin() {
        return itemJoin;
    }

    /**
     * Sets the value of the itemJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public void setItemJoin(ItemSearchRowBasic value) {
        this.itemJoin = value;
    }

    /**
     * Gets the value of the itemReceiptJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getItemReceiptJoin() {
        return itemReceiptJoin;
    }

    /**
     * Sets the value of the itemReceiptJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setItemReceiptJoin(TransactionSearchRowBasic value) {
        this.itemReceiptJoin = value;
    }

    /**
     * Gets the value of the purchaseOrderJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getPurchaseOrderJoin() {
        return purchaseOrderJoin;
    }

    /**
     * Sets the value of the purchaseOrderJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setPurchaseOrderJoin(TransactionSearchRowBasic value) {
        this.purchaseOrderJoin = value;
    }

    /**
     * Gets the value of the vendorJoin property.
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public VendorSearchRowBasic getVendorJoin() {
        return vendorJoin;
    }

    /**
     * Sets the value of the vendorJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public void setVendorJoin(VendorSearchRowBasic value) {
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
