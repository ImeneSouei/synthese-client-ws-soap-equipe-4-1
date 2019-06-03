/**
 * ProduitNonPerissable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.infotel.wssoap;

public class ProduitNonPerissable  extends com.infotel.wssoap.Produit  implements java.io.Serializable {
    private java.lang.String modeEmploi;

    public ProduitNonPerissable() {
    }

    public ProduitNonPerissable(
           long idProduit,
           java.lang.String nomProduit,
           int stock,
           double prix,
           com.infotel.wssoap.Magasin magasin,
           java.lang.String modeEmploi) {
        super(
            idProduit,
            nomProduit,
            stock,
            prix,
            magasin);
        this.modeEmploi = modeEmploi;
    }


    /**
     * Gets the modeEmploi value for this ProduitNonPerissable.
     * 
     * @return modeEmploi
     */
    public java.lang.String getModeEmploi() {
        return modeEmploi;
    }


    /**
     * Sets the modeEmploi value for this ProduitNonPerissable.
     * 
     * @param modeEmploi
     */
    public void setModeEmploi(java.lang.String modeEmploi) {
        this.modeEmploi = modeEmploi;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProduitNonPerissable)) return false;
        ProduitNonPerissable other = (ProduitNonPerissable) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.modeEmploi==null && other.getModeEmploi()==null) || 
             (this.modeEmploi!=null &&
              this.modeEmploi.equals(other.getModeEmploi())));
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
        if (getModeEmploi() != null) {
            _hashCode += getModeEmploi().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProduitNonPerissable.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wssoap.infotel.com/", "produitNonPerissable"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modeEmploi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modeEmploi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
