
package com.apollo.apollopharamacy.types;

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
 *         &lt;element name="ListOfMedicine" type="{http://www.apollo.com/apollopharamacy/types}MedicineList"/>
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
    "listOfMedicine"
})
@XmlRootElement(name = "searchResponse")
public class SearchResponse {

    @XmlElement(name = "ListOfMedicine", required = true)
    protected MedicineList listOfMedicine;

    /**
     * Gets the value of the listOfMedicine property.
     * 
     * @return
     *     possible object is
     *     {@link MedicineList }
     *     
     */
    public MedicineList getListOfMedicine() {
        return listOfMedicine;
    }

    /**
     * Sets the value of the listOfMedicine property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicineList }
     *     
     */
    public void setListOfMedicine(MedicineList value) {
        this.listOfMedicine = value;
    }

}
