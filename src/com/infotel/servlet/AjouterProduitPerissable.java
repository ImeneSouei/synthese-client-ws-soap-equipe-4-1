package com.infotel.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.infotel.wssoap.Magasin;
import com.infotel.wssoap.ProduitPerissable;
import com.infotel.wssoap.ProduitSOAPService;
import com.infotel.wssoap.ProduitSOAPServiceProxy;

@WebServlet("/AjouterProduitPerissable")
public class AjouterProduitPerissable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AjouterProduitPerissable() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProduitSOAPService service = new ProduitSOAPServiceProxy();
		ProduitPerissable[] produitsPerissables= service.findAllProduitPerissable();
			request.setAttribute("produitsPerissables", service.findAllProduitPerissable());
		
			long idProduit;
			String nomProduit;
			int stock;
			double prix;
	    	 Date dateLimiteUtilisation = new Date();
	    	 
		// Faire traitement
			if (request.getParameter("nomProduit") != null) { // lastname se trouve dans jsp
				stock = Integer.parseInt(request.getParameter("stock"));
				nomProduit = request.getParameter("nomProduit");
				prix = Double.parseDouble(request.getParameter("prix"));
		

			// 2-envoyer à la couche service
				ProduitPerissable p = new ProduitPerissable();
	             p.setNomProduit(nomProduit);
	             p.setPrix(prix);
	             p.setStock(stock);
	             p.setDateLimiteUtilisation(null);
			
		service.ajouterProduitPerissable(nomProduit, stock, prix);
				if (request.getParameter("ajouter") != null) {
					service.ajouterProduitPerissable(nomProduit, stock, prix);
				}

				if (request.getParameter("modifier") != null) {
					idProduit =Long.parseLong(request.getParameter("idProduit"));
				p.setIdProduit(idProduit);
					service.modifierProduitPerissable(idProduit, nomProduit, stock, prix);
				}
			}
		

		// 4-appel de la jsp
		request.getRequestDispatcher("indexproduitsperissables.jsp").forward(request, response); 
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
