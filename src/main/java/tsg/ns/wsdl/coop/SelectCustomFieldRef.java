
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectCustomFieldRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectCustomFieldRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_2.platform.webservices.netsuite.com}CustomFieldRef"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="value" type="{urn:core_2022_2.platform.webservices.netsuite.com}ListOrRecordRef"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectCustomFieldRef", namespace = "urn:core_2022_2.platform.webservices.netsuite.com", propOrder = {
    "value"
})
public class SelectCustomFieldRef
    extends CustomFieldRef
{

    @XmlElement(required = true)
    protected ListOrRecordRef value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ListOrRecordRef }
     *     
     */
    public ListOrRecordRef getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOrRecordRef }
     *     
     */
    public void setValue(ListOrRecordRef value) {
        this.value = value;
    }

}
