
package org.tyaa.demo.java.testing.restandsoap.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="search" type="{libraryService}SearchParamsWithPagination"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "search"
})
@XmlRootElement(name = "getGenresRequest")
public class GetGenresRequest {

    @XmlElement(required = true)
    protected SearchParamsWithPagination search;

    /**
     * Gets the value of the search property.
     * 
     * @return
     *     possible object is
     *     {@link SearchParamsWithPagination }
     *     
     */
    public SearchParamsWithPagination getSearch() {
        return search;
    }

    /**
     * Sets the value of the search property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchParamsWithPagination }
     *     
     */
    public void setSearch(SearchParamsWithPagination value) {
        this.search = value;
    }

}
