//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.14 at 01:02:12 PM PDT 
//


package com.celexus.conniption.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="amt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="exdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="paydate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="yield" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "amt",
    "exdate",
    "paydate",
    "yield"
})
public class Dividenddata {

    protected double amt;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exdate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paydate;
    protected double yield;

    /**
     * Gets the value of the amt property.
     * 
     */
    public double getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     */
    public void setAmt(double value) {
        this.amt = value;
    }

    /**
     * Gets the value of the exdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExdate() {
        return exdate;
    }

    /**
     * Sets the value of the exdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExdate(XMLGregorianCalendar value) {
        this.exdate = value;
    }

    /**
     * Gets the value of the paydate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaydate() {
        return paydate;
    }

    /**
     * Sets the value of the paydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaydate(XMLGregorianCalendar value) {
        this.paydate = value;
    }

    /**
     * Gets the value of the yield property.
     * 
     */
    public double getYield() {
        return yield;
    }

    /**
     * Sets the value of the yield property.
     * 
     */
    public void setYield(double value) {
        this.yield = value;
    }

}