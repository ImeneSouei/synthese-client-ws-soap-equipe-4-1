/**
 * ProduitSOAPService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.infotel.wssoap;

public interface ProduitSOAPService extends java.rmi.Remote {
    public com.infotel.wssoap.Magasin[] findAllMagasins() throws java.rmi.RemoteException;
    public com.infotel.wssoap.ProduitNonPerissable[] findAllProduitNonPerissable() throws java.rmi.RemoteException;
    public com.infotel.wssoap.ProduitNonPerissable getProduitNonPerissable(long idProduit) throws java.rmi.RemoteException;
    public void supprimerProduitNonPerissable(long idProduit) throws java.rmi.RemoteException;
    public void ajouterMagasin(java.lang.String nomMagasin, int codeMagasin, double prixDuLocal) throws java.rmi.RemoteException;
    public com.infotel.wssoap.ProduitPerissable getProduitPerissable(long idProduit) throws java.rmi.RemoteException;
    public void ajouterProduit(java.lang.String nomProduit, int stock, double prix, java.lang.String modeEmploi, long idMagasin) throws java.rmi.RemoteException;
    public com.infotel.wssoap.ProduitPerissable affichageProduitPerissable(long idProduit) throws java.rmi.RemoteException;
    public void setDao(com.infotel.wssoap.DaoImpl arg0) throws java.rmi.RemoteException;
    public void ajouterProduitNonPerissable(java.lang.String nomProduit, int stock, double prix, java.lang.String modeEmploi) throws java.rmi.RemoteException;
    public void supprimerMagasin(long idMagasin) throws java.rmi.RemoteException;
    public com.infotel.wssoap.DaoImpl getDao() throws java.rmi.RemoteException;
    public void modifierProduitPerissable(long idProduit, java.lang.String nomProduit, int stock, double prix) throws java.rmi.RemoteException;
    public void modifierMagasin(long idMagasin, java.lang.String nomMagasin, int codeMagasin, double prixDuLocal) throws java.rmi.RemoteException;
    public com.infotel.wssoap.ProduitNonPerissable affichageProduitNonPerissable(long idProduit) throws java.rmi.RemoteException;
    public void ajouterProduitP(java.lang.String nomProduit, int stock, double prix, long idMagasin) throws java.rmi.RemoteException;
    public com.infotel.wssoap.ProduitPerissable[] findAllProduitPerissable() throws java.rmi.RemoteException;
    public com.infotel.wssoap.Magasin affichageMagasin(long idMagasin) throws java.rmi.RemoteException;
    public void supprimerProduitPerissable(long idProduit) throws java.rmi.RemoteException;
    public void ajouterProduitPerissable(java.lang.String nomProduit, int stock, double prix) throws java.rmi.RemoteException;
    public com.infotel.wssoap.Magasin getMagasin(long idMagasin) throws java.rmi.RemoteException;
    public void modifierProduitNonPerissable(long idProduit, java.lang.String nomProduit, int stock, double prix, java.lang.String modeEmploi) throws java.rmi.RemoteException;
    public void supprimerMagasin1(long idMagasin) throws java.rmi.RemoteException;
}
