/**
 * Magasin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.infotel.wssoap;

public class Magasin  implements java.io.Serializable {
    private long idMagasin;

    private java.lang.String nomMagasin;

    private int codeMagasin;

    private double prixDuLocal;

    public Magasin() {
    }

    public Magasin(
           long idMagasin,
           java.lang.String nomMagasin,
           int codeMagasin,
           double prixDuLocal) {
           this.idMagasin = idMagasin;
           this.nomMagasin = nomMagasin;
           this.codeMagasin = codeMagasin;
           this.prixDuLocal = prixDuLocal;
    }


    /**
     * Gets the idMagasin value for this Magasin.
     * 
     * @return idMagasin
     */
    public long getIdMagasin() {
        return idMagasin;
    }


    /**
     * Sets the idMagasin value for this Magasin.
     * 
     * @param idMagasin
     */
    public void setIdMagasin(long idMagasin) {
        this.idMagasin = idMagasin;
    }


    /**
     * Gets the nomMagasin value for this Magasin.
     * 
     * @return nomMagasin
     */
    public java.lang.String getNomMagasin() {
        return nomMagasin;
    }


    /**
     * Sets the nomMagasin value for this Magasin.
     * 
     * @param nomMagasin
     */
    public void setNomMagasin(java.lang.String nomMagasin) {
        this.nomMagasin = nomMagasin;
    }


    /**
     * Gets the codeMagasin value for this Magasin.
     * 
     * @return codeMagasin
     */
    public int getCodeMagasin() {
        return codeMagasin;
    }


    /**
     * Sets the codeMagasin value for this Magasin.
     * 
     * @param codeMagasin
     */
    public void setCodeMagasin(int codeMagasin) {
        this.codeMagasin = codeMagasin;
    }


    /**
     * Gets the prixDuLocal value for this Magasin.
     * 
     * @return prixDuLocal
     */
    public double getPrixDuLocal() {
        return prixDuLocal;
    }


    /**
     * Sets the prixDuLocal value for this Magasin.
     * 
     * @param prixDuLocal
     */
    public void setPrixDuLocal(double prixDuLocal) {
        this.prixDuLocal = prixDuLocal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Magasin)) return false;
        Magasin other = (Magasin) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idMagasin == other.getIdMagasin() &&
            ((this.nomMagasin==null && other.getNomMagasin()==null) || 
             (this.nomMagasin!=null &&
              this.nomMagasin.equals(other.getNomMagasin()))) &&
            this.codeMagasin == other.getCodeMagasin() &&
            this.prixDuLocal == other.getPrixDuLocal();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getIdMagasin()).hashCode();
        if (getNomMagasin() != null) {
            _hashCode += getNomMagasin().hashCode();
        }
        _hashCode += getCodeMagasin();
        _hashCode += new Double(getPrixDuLocal()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Magasin.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wssoap.infotel.com/", "magasin"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idMagasin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idMagasin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomMagasin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomMagasin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeMagasin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codeMagasin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prixDuLocal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prixDuLocal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
