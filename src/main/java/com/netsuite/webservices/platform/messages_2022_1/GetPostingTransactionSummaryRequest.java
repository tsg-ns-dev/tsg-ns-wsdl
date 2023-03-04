
package com.netsuite.webservices.platform.messages_2022_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2022_1.PostingTransactionSummaryField;
import com.netsuite.webservices.platform.core_2022_1.PostingTransactionSummaryFilter;


/**
 * <p>Java class for GetPostingTransactionSummaryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPostingTransactionSummaryRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fields" type="{urn:core_2022_1.platform.webservices.netsuite.com}PostingTransactionSummaryField" minOccurs="0"/&gt;
 *         &lt;element name="filters" type="{urn:core_2022_1.platform.webservices.netsuite.com}PostingTransactionSummaryFilter" minOccurs="0"/&gt;
 *         &lt;element name="pageIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="operationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPostingTransactionSummaryRequest", propOrder = {
    "fields",
    "filters",
    "pageIndex",
    "operationId"
})
public class GetPostingTransactionSummaryRequest {

    protected PostingTransactionSummaryField fields;
    protected PostingTransactionSummaryFilter filters;
    protected int pageIndex;
    protected String operationId;

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link PostingTransactionSummaryField }
     *     
     */
    public PostingTransactionSummaryField getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingTransactionSummaryField }
     *     
     */
    public void setFields(PostingTransactionSummaryField value) {
        this.fields = value;
    }

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link PostingTransactionSummaryFilter }
     *     
     */
    public PostingTransactionSummaryFilter getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingTransactionSummaryFilter }
     *     
     */
    public void setFilters(PostingTransactionSummaryFilter value) {
        this.filters = value;
    }

    /**
     * Gets the value of the pageIndex property.
     * 
     */
    public int getPageIndex() {
        return pageIndex;
    }

    /**
     * Sets the value of the pageIndex property.
     * 
     */
    public void setPageIndex(int value) {
        this.pageIndex = value;
    }

    /**
     * Gets the value of the operationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationId() {
        return operationId;
    }

    /**
     * Sets the value of the operationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationId(String value) {
        this.operationId = value;
    }

}
