
package com.apollo.apollopharamacy.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MedicineList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicineList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="medicineList" type="{http://www.apollo.com/apollopharamacy/types}Medicine" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicineList", propOrder = {
    "medicineList"
})
public class MedicineList {

    protected List<Medicine> medicineList;

    /**
     * Gets the value of the medicineList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medicineList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedicineList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Medicine }
     * 
     * 
     */
    public List<Medicine> getMedicineList() {
        if (medicineList == null) {
            medicineList = new ArrayList<Medicine>();
        }
        return this.medicineList;
    }

}
