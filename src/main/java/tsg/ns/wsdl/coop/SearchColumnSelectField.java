
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchColumnSelectField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchColumnSelectField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_2.platform.webservices.netsuite.com}SearchColumnField"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="searchValue" type="{urn:core_2022_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchColumnSelectField", namespace = "urn:core_2022_2.platform.webservices.netsuite.com", propOrder = {
    "searchValue"
})
public class SearchColumnSelectField
    extends SearchColumnField
{

    protected RecordRef searchValue;

    /**
     * Gets the value of the searchValue property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSearchValue() {
        return searchValue;
    }

    /**
     * Sets the value of the searchValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSearchValue(RecordRef value) {
        this.searchValue = value;
    }

}
