/**
 * ProduitPerissable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.infotel.wssoap;

public class ProduitPerissable  extends com.infotel.wssoap.Produit  implements java.io.Serializable {
    private java.util.Calendar dateLimiteUtilisation;

    public ProduitPerissable() {
    }

    public ProduitPerissable(
           long idProduit,
           java.lang.String nomProduit,
           int stock,
           double prix,
           com.infotel.wssoap.Magasin magasin,
           java.util.Calendar dateLimiteUtilisation) {
        super(
            idProduit,
            nomProduit,
            stock,
            prix,
            magasin);
        this.dateLimiteUtilisation = dateLimiteUtilisation;
    }


    /**
     * Gets the dateLimiteUtilisation value for this ProduitPerissable.
     * 
     * @return dateLimiteUtilisation
     */
    public java.util.Calendar getDateLimiteUtilisation() {
        return dateLimiteUtilisation;
    }


    /**
     * Sets the dateLimiteUtilisation value for this ProduitPerissable.
     * 
     * @param dateLimiteUtilisation
     */
    public void setDateLimiteUtilisation(java.util.Calendar dateLimiteUtilisation) {
        this.dateLimiteUtilisation = dateLimiteUtilisation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProduitPerissable)) return false;
        ProduitPerissable other = (ProduitPerissable) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dateLimiteUtilisation==null && other.getDateLimiteUtilisation()==null) || 
             (this.dateLimiteUtilisation!=null &&
              this.dateLimiteUtilisation.equals(other.getDateLimiteUtilisation())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDateLimiteUtilisation() != null) {
            _hashCode += getDateLimiteUtilisation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProduitPerissable.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wssoap.infotel.com/", "produitPerissable"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateLimiteUtilisation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateLimiteUtilisation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
