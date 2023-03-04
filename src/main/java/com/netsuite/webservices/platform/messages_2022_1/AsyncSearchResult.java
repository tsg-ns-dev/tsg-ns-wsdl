
package com.netsuite.webservices.platform.messages_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2022_1.SearchResult;


/**
 * <p>Java class for AsyncSearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AsyncSearchResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:messages_2022_1.platform.webservices.netsuite.com}AsyncResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:core_2022_1.platform.webservices.netsuite.com}searchResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsyncSearchResult", propOrder = {
    "searchResult"
})
public class AsyncSearchResult
    extends AsyncResult
{

    @XmlElement(namespace = "urn:core_2022_1.platform.webservices.netsuite.com", required = true)
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
