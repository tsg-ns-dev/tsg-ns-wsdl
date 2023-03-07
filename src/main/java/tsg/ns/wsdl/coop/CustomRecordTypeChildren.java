
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomRecordTypeChildren complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomRecordTypeChildren"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="childDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="childTab" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomRecordTypeChildren", namespace = "urn:customization_2022_2.setup.webservices.netsuite.com", propOrder = {
    "childDescr",
    "childTab"
})
public class CustomRecordTypeChildren {

    protected String childDescr;
    protected RecordRef childTab;

    /**
     * Gets the value of the childDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildDescr() {
        return childDescr;
    }

    /**
     * Sets the value of the childDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildDescr(String value) {
        this.childDescr = value;
    }

    /**
     * Gets the value of the childTab property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getChildTab() {
        return childTab;
    }

    /**
     * Sets the value of the childTab property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setChildTab(RecordRef value) {
        this.childTab = value;
    }

}
