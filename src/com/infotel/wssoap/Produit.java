/**
 * Produit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.infotel.wssoap;

public abstract class Produit  implements java.io.Serializable {
    private long idProduit;

    private java.lang.String nomProduit;

    private int stock;

    private double prix;

    private com.infotel.wssoap.Magasin magasin;

    public Produit() {
    }

    public Produit(
           long idProduit,
           java.lang.String nomProduit,
           int stock,
           double prix,
           com.infotel.wssoap.Magasin magasin) {
           this.idProduit = idProduit;
           this.nomProduit = nomProduit;
           this.stock = stock;
           this.prix = prix;
           this.magasin = magasin;
    }


    /**
     * Gets the idProduit value for this Produit.
     * 
     * @return idProduit
     */
    public long getIdProduit() {
        return idProduit;
    }


    /**
     * Sets the idProduit value for this Produit.
     * 
     * @param idProduit
     */
    public void setIdProduit(long idProduit) {
        this.idProduit = idProduit;
    }


    /**
     * Gets the nomProduit value for this Produit.
     * 
     * @return nomProduit
     */
    public java.lang.String getNomProduit() {
        return nomProduit;
    }


    /**
     * Sets the nomProduit value for this Produit.
     * 
     * @param nomProduit
     */
    public void setNomProduit(java.lang.String nomProduit) {
        this.nomProduit = nomProduit;
    }


    /**
     * Gets the stock value for this Produit.
     * 
     * @return stock
     */
    public int getStock() {
        return stock;
    }


    /**
     * Sets the stock value for this Produit.
     * 
     * @param stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }


    /**
     * Gets the prix value for this Produit.
     * 
     * @return prix
     */
    public double getPrix() {
        return prix;
    }


    /**
     * Sets the prix value for this Produit.
     * 
     * @param prix
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }


    /**
     * Gets the magasin value for this Produit.
     * 
     * @return magasin
     */
    public com.infotel.wssoap.Magasin getMagasin() {
        return magasin;
    }


    /**
     * Sets the magasin value for this Produit.
     * 
     * @param magasin
     */
    public void setMagasin(com.infotel.wssoap.Magasin magasin) {
        this.magasin = magasin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Produit)) return false;
        Produit other = (Produit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idProduit == other.getIdProduit() &&
            ((this.nomProduit==null && other.getNomProduit()==null) || 
             (this.nomProduit!=null &&
              this.nomProduit.equals(other.getNomProduit()))) &&
            this.stock == other.getStock() &&
            this.prix == other.getPrix() &&
            ((this.magasin==null && other.getMagasin()==null) || 
             (this.magasin!=null &&
              this.magasin.equals(other.getMagasin())));
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
        _hashCode += new Long(getIdProduit()).hashCode();
        if (getNomProduit() != null) {
            _hashCode += getNomProduit().hashCode();
        }
        _hashCode += getStock();
        _hashCode += new Double(getPrix()).hashCode();
        if (getMagasin() != null) {
            _hashCode += getMagasin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Produit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wssoap.infotel.com/", "produit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idProduit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idProduit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomProduit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomProduit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stock");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("magasin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "magasin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wssoap.infotel.com/", "magasin"));
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
