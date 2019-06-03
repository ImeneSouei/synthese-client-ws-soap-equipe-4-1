package com.infotel.wssoap;

public class ProduitSOAPServiceProxy implements com.infotel.wssoap.ProduitSOAPService {
  private String _endpoint = null;
  private com.infotel.wssoap.ProduitSOAPService produitSOAPService = null;
  
  public ProduitSOAPServiceProxy() {
    _initProduitSOAPServiceProxy();
  }
  
  public ProduitSOAPServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initProduitSOAPServiceProxy();
  }
  
  private void _initProduitSOAPServiceProxy() {
    try {
      produitSOAPService = (new com.infotel.wssoap.ProduitSOAPServiceServiceLocator()).getProduitSOAPServicePort();
      if (produitSOAPService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)produitSOAPService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)produitSOAPService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (produitSOAPService != null)
      ((javax.xml.rpc.Stub)produitSOAPService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.infotel.wssoap.ProduitSOAPService getProduitSOAPService() {
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    return produitSOAPService;
  }
  
  public com.infotel.wssoap.Magasin[] findAllMagasins() throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    return produitSOAPService.findAllMagasins();
  }
  
  public com.infotel.wssoap.ProduitNonPerissable[] findAllProduitNonPerissable() throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    return produitSOAPService.findAllProduitNonPerissable();
  }
  
  public com.infotel.wssoap.ProduitNonPerissable getProduitNonPerissable(long idProduit) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    return produitSOAPService.getProduitNonPerissable(idProduit);
  }
  
  public void supprimerProduitNonPerissable(long idProduit) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    produitSOAPService.supprimerProduitNonPerissable(idProduit);
  }
  
  public void ajouterMagasin(java.lang.String nomMagasin, int codeMagasin, double prixDuLocal) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    produitSOAPService.ajouterMagasin(nomMagasin, codeMagasin, prixDuLocal);
  }
  
  public com.infotel.wssoap.ProduitPerissable getProduitPerissable(long idProduit) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    return produitSOAPService.getProduitPerissable(idProduit);
  }
  
  public void ajouterProduit(java.lang.String nomProduit, int stock, double prix, java.lang.String modeEmploi, long idMagasin) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    produitSOAPService.ajouterProduit(nomProduit, stock, prix, modeEmploi, idMagasin);
  }
  
  public com.infotel.wssoap.ProduitPerissable affichageProduitPerissable(long idProduit) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    return produitSOAPService.affichageProduitPerissable(idProduit);
  }
  
  public void setDao(com.infotel.wssoap.DaoImpl arg0) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    produitSOAPService.setDao(arg0);
  }
  
  public void ajouterProduitNonPerissable(java.lang.String nomProduit, int stock, double prix, java.lang.String modeEmploi) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    produitSOAPService.ajouterProduitNonPerissable(nomProduit, stock, prix, modeEmploi);
  }
  
  public void supprimerMagasin(long idMagasin) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    produitSOAPService.supprimerMagasin(idMagasin);
  }
  
  public com.infotel.wssoap.DaoImpl getDao() throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    return produitSOAPService.getDao();
  }
  
  public void modifierProduitPerissable(long idProduit, java.lang.String nomProduit, int stock, double prix) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    produitSOAPService.modifierProduitPerissable(idProduit, nomProduit, stock, prix);
  }
  
  public void modifierMagasin(long idMagasin, java.lang.String nomMagasin, int codeMagasin, double prixDuLocal) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    produitSOAPService.modifierMagasin(idMagasin, nomMagasin, codeMagasin, prixDuLocal);
  }
  
  public com.infotel.wssoap.ProduitNonPerissable affichageProduitNonPerissable(long idProduit) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    return produitSOAPService.affichageProduitNonPerissable(idProduit);
  }
  
  public void ajouterProduitP(java.lang.String nomProduit, int stock, double prix, long idMagasin) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    produitSOAPService.ajouterProduitP(nomProduit, stock, prix, idMagasin);
  }
  
  public com.infotel.wssoap.ProduitPerissable[] findAllProduitPerissable() throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    return produitSOAPService.findAllProduitPerissable();
  }
  
  public com.infotel.wssoap.Magasin affichageMagasin(long idMagasin) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    return produitSOAPService.affichageMagasin(idMagasin);
  }
  
  public void supprimerProduitPerissable(long idProduit) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    produitSOAPService.supprimerProduitPerissable(idProduit);
  }
  
  public void ajouterProduitPerissable(java.lang.String nomProduit, int stock, double prix) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    produitSOAPService.ajouterProduitPerissable(nomProduit, stock, prix);
  }
  
  public com.infotel.wssoap.Magasin getMagasin(long idMagasin) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    return produitSOAPService.getMagasin(idMagasin);
  }
  
  public void modifierProduitNonPerissable(long idProduit, java.lang.String nomProduit, int stock, double prix, java.lang.String modeEmploi) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    produitSOAPService.modifierProduitNonPerissable(idProduit, nomProduit, stock, prix, modeEmploi);
  }
  
  public void supprimerMagasin1(long idMagasin) throws java.rmi.RemoteException{
    if (produitSOAPService == null)
      _initProduitSOAPServiceProxy();
    produitSOAPService.supprimerMagasin1(idMagasin);
  }
  
  
}