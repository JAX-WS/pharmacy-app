
package com.apollo.apollopharamacy.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Medicine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Medicine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="medicineName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="generic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="availableQty" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pricePerUnit" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Medicine", propOrder = {
    "medicineName",
    "generic",
    "manufacturer",
    "availableQty",
    "pricePerUnit"
})
public class Medicine {

    @XmlElement(required = true)
    protected String medicineName;
    protected boolean generic;
    @XmlElement(required = true)
    protected String manufacturer;
    protected int availableQty;
    protected float pricePerUnit;

    /**
     * Gets the value of the medicineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicineName() {
        return medicineName;
    }

    /**
     * Sets the value of the medicineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicineName(String value) {
        this.medicineName = value;
    }

    /**
     * Gets the value of the generic property.
     * 
     */
    public boolean isGeneric() {
        return generic;
    }

    /**
     * Sets the value of the generic property.
     * 
     */
    public void setGeneric(boolean value) {
        this.generic = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the availableQty property.
     * 
     */
    public int getAvailableQty() {
        return availableQty;
    }

    /**
     * Sets the value of the availableQty property.
     * 
     */
    public void setAvailableQty(int value) {
        this.availableQty = value;
    }

    /**
     * Gets the value of the pricePerUnit property.
     * 
     */
    public float getPricePerUnit() {
        return pricePerUnit;
    }

    /**
     * Sets the value of the pricePerUnit property.
     * 
     */
    public void setPricePerUnit(float value) {
        this.pricePerUnit = value;
    }

}
