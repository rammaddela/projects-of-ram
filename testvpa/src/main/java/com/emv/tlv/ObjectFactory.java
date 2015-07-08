//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.01 at 04:31:36 PM EDT 
//


package com.emv.tlv;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.emv.tlv package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Tag_QNAME = new QName("", "tag");
    private final static QName _Tagvalue_QNAME = new QName("", "tagvalue");
    private final static QName _Taglength_QNAME = new QName("", "taglength");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.emv.tlv
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Tagelement }
     * 
     */
    public Tagelement createTagelement() {
        return new Tagelement();
    }

    /**
     * Create an instance of {@link Config }
     * 
     */
    public Config createConfig() {
        return new Config();
    }

    /**
     * Create an instance of {@link Tagname }
     * 
     */
    public Tagname createTagname() {
        return new Tagname();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tag")
    public JAXBElement<String> createTag(String value) {
        return new JAXBElement<String>(_Tag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tagvalue")
    public JAXBElement<String> createTagvalue(String value) {
        return new JAXBElement<String>(_Tagvalue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "taglength")
    public JAXBElement<Integer> createTaglength(Integer value) {
        return new JAXBElement<Integer>(_Taglength_QNAME, Integer.class, null, value);
    }

}
