
package tsg.ns.wsdl.coop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiSelectCustomFieldRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiSelectCustomFieldRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_2.platform.webservices.netsuite.com}CustomFieldRef"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="value" type="{urn:core_2022_2.platform.webservices.netsuite.com}ListOrRecordRef" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiSelectCustomFieldRef", namespace = "urn:core_2022_2.platform.webservices.netsuite.com", propOrder = {
    "value"
})
public class MultiSelectCustomFieldRef
    extends CustomFieldRef
{

    @XmlElement(required = true)
    protected List<ListOrRecordRef> value;

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListOrRecordRef }
     * 
     * 
     */
    public List<ListOrRecordRef> getValue() {
        if (value == null) {
            value = new ArrayList<ListOrRecordRef>();
        }
        return this.value;
    }

}
