//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.01 at 04:31:36 PM EDT 
//


package com.emv.tlv;

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
 *         &lt;element ref="{}tagname"/>
 *         &lt;element ref="{}tag"/>
 *         &lt;element ref="{}taglength"/>
 *         &lt;element ref="{}tagvalue"/>
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
    "tagname",
    "tag",
    "taglength",
    "tagvalue"
})
@XmlRootElement(name = "tagelement")
public class Tagelement {

    @XmlElement(required = true)
    protected Tagname tagname;
    @XmlElement(required = true)
    protected String tag;
    protected int taglength;
    @XmlElement(required = true)
    protected String tagvalue;

    /**
     * Gets the value of the tagname property.
     * 
     * @return
     *     possible object is
     *     {@link Tagname }
     *     
     */
    public Tagname getTagname() {
        return tagname;
    }

    /**
     * Sets the value of the tagname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tagname }
     *     
     */
    public void setTagname(Tagname value) {
        this.tagname = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
    }

    /**
     * Gets the value of the taglength property.
     * 
     */
    public int getTaglength() {
        return taglength;
    }

    /**
     * Sets the value of the taglength property.
     * 
     */
    public void setTaglength(int value) {
        this.taglength = value;
    }

    /**
     * Gets the value of the tagvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagvalue() {
        return tagvalue;
    }

    /**
     * Sets the value of the tagvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagvalue(String value) {
        this.tagvalue = value;
    }

}