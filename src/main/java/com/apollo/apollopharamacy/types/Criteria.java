
package com.apollo.apollopharamacy.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Criteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Criteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="medicineName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="drugsId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="generic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Criteria", propOrder = {
    "medicineName",
    "drugsId",
    "generic",
    "manufacturer",
    "units"
})
public class Criteria {

    @XmlElement(required = true)
    protected String medicineName;
    @XmlElement(required = true)
    protected String drugsId;
    protected boolean generic;
    @XmlElement(required = true)
    protected String manufacturer;
    protected int units;

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
     * Gets the value of the drugsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrugsId() {
        return drugsId;
    }

    /**
     * Sets the value of the drugsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrugsId(String value) {
        this.drugsId = value;
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
     * Gets the value of the units property.
     * 
     */
    public int getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     */
    public void setUnits(int value) {
        this.units = value;
    }

}
