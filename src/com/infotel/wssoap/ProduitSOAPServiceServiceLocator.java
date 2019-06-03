/**
 * ProduitSOAPServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.infotel.wssoap;

public class ProduitSOAPServiceServiceLocator extends org.apache.axis.client.Service implements com.infotel.wssoap.ProduitSOAPServiceService {

    public ProduitSOAPServiceServiceLocator() {
    }


    public ProduitSOAPServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProduitSOAPServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProduitSOAPServicePort
    private java.lang.String ProduitSOAPServicePort_address = "http://localhost:8080/synthese-serveur-ejb-ws-equipe-4-1/ProduitSOAPService";

    public java.lang.String getProduitSOAPServicePortAddress() {
        return ProduitSOAPServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProduitSOAPServicePortWSDDServiceName = "ProduitSOAPServicePort";

    public java.lang.String getProduitSOAPServicePortWSDDServiceName() {
        return ProduitSOAPServicePortWSDDServiceName;
    }

    public void setProduitSOAPServicePortWSDDServiceName(java.lang.String name) {
        ProduitSOAPServicePortWSDDServiceName = name;
    }

    public com.infotel.wssoap.ProduitSOAPService getProduitSOAPServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProduitSOAPServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProduitSOAPServicePort(endpoint);
    }

    public com.infotel.wssoap.ProduitSOAPService getProduitSOAPServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.infotel.wssoap.ProduitSOAPServiceServiceSoapBindingStub _stub = new com.infotel.wssoap.ProduitSOAPServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getProduitSOAPServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProduitSOAPServicePortEndpointAddress(java.lang.String address) {
        ProduitSOAPServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.infotel.wssoap.ProduitSOAPService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.infotel.wssoap.ProduitSOAPServiceServiceSoapBindingStub _stub = new com.infotel.wssoap.ProduitSOAPServiceServiceSoapBindingStub(new java.net.URL(ProduitSOAPServicePort_address), this);
                _stub.setPortName(getProduitSOAPServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ProduitSOAPServicePort".equals(inputPortName)) {
            return getProduitSOAPServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://wssoap.infotel.com/", "ProduitSOAPServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://wssoap.infotel.com/", "ProduitSOAPServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProduitSOAPServicePort".equals(portName)) {
            setProduitSOAPServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
