
package tsg.ns.wsdl.coop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AsyncSearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AsyncSearchResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:messages_2022_2.platform.webservices.netsuite.com}AsyncResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:core_2022_2.platform.webservices.netsuite.com}searchResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsyncSearchResult", namespace = "urn:messages_2022_2.platform.webservices.netsuite.com", propOrder = {
    "searchResult"
})
public class AsyncSearchResult
    extends AsyncResult
{

    @XmlElement(namespace = "urn:core_2022_2.platform.webservices.netsuite.com", required = true)
    protected SearchResult searchResult;

    /**
     * Gets the value of the searchResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchResult }
     *     
     */
    public SearchResult getSearchResult() {
        return searchResult;
    }

    /**
     * Sets the value of the searchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResult }
     *     
     */
    public void setSearchResult(SearchResult value) {
        this.searchResult = value;
    }

}
