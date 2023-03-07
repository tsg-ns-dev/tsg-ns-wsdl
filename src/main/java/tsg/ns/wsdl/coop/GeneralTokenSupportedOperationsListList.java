
package tsg.ns.wsdl.coop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralTokenSupportedOperationsListList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralTokenSupportedOperationsListList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GeneralTokenSupportedOperationsList" type="{urn:types.accounting_2022_2.lists.webservices.netsuite.com}PaymentInstrumentSupportedOperation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralTokenSupportedOperationsListList", propOrder = {
    "generalTokenSupportedOperationsList"
})
public class GeneralTokenSupportedOperationsListList {

    @XmlElement(name = "GeneralTokenSupportedOperationsList")
    @XmlSchemaType(name = "string")
    protected List<PaymentInstrumentSupportedOperation> generalTokenSupportedOperationsList;

    /**
     * Gets the value of the generalTokenSupportedOperationsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the generalTokenSupportedOperationsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralTokenSupportedOperationsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentInstrumentSupportedOperation }
     * 
     * 
     */
    public List<PaymentInstrumentSupportedOperation> getGeneralTokenSupportedOperationsList() {
        if (generalTokenSupportedOperationsList == null) {
            generalTokenSupportedOperationsList = new ArrayList<PaymentInstrumentSupportedOperation>();
        }
        return this.generalTokenSupportedOperationsList;
    }

}
