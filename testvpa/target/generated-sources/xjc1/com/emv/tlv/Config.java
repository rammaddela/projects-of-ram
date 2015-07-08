//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.05 at 11:37:16 PM EDT 
//


package com.emv.tlv;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{}tagelement" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="pan" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="org" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="profile" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="profileid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tagelement"
})
@XmlRootElement(name = "config")
public class Config {

    @XmlElement(required = true)
    protected List<Tagelement> tagelement;
    @XmlAttribute(name = "pan")
    protected String pan;
    @XmlAttribute(name = "org")
    protected String org;
    @XmlAttribute(name = "profile", required = true)
    protected String profile;
    @XmlAttribute(name = "profileid", required = true)
    protected String profileid;

    /**
     * Gets the value of the tagelement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tagelement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTagelement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tagelement }
     * 
     * 
     */
    public List<Tagelement> getTagelement() {
        if (tagelement == null) {
            tagelement = new ArrayList<Tagelement>();
        }
        return this.tagelement;
    }

    /**
     * Gets the value of the pan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPan() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPan(String value) {
        this.pan = value;
    }

    /**
     * Gets the value of the org property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrg() {
        return org;
    }

    /**
     * Sets the value of the org property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrg(String value) {
        this.org = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfile(String value) {
        this.profile = value;
    }

    /**
     * Gets the value of the profileid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileid() {
        return profileid;
    }

    /**
     * Sets the value of the profileid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileid(String value) {
        this.profileid = value;
    }

}
