package com.infotel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.infotel.wssoap.Magasin;
import com.infotel.wssoap.ProduitNonPerissable;
import com.infotel.wssoap.ProduitSOAPService;
import com.infotel.wssoap.ProduitSOAPServiceProxy;

@WebServlet("/AjouterProduitNonPerissable")
public class AjouterProduitNonPerissable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AjouterProduitNonPerissable() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProduitSOAPService service = new ProduitSOAPServiceProxy();
		ProduitNonPerissable[] produitsNonPerissables = service.findAllProduitNonPerissable();
		request.setAttribute("produitsNonPerissables", service.findAllProduitNonPerissable());

		long idProduit;
		String nomProduit;
		int stock;
		double prix;
		String modeEmploi;

		// Faire traitement
		if (request.getParameter("nomProduit") != null) { // lastname se trouve dans jsp
			stock = Integer.parseInt(request.getParameter("stock"));
			nomProduit = request.getParameter("nomProduit");
			prix = Double.parseDouble(request.getParameter("prix"));
			modeEmploi= request.getParameter("modeEmploi");

			// 2-envoyer à la couche service
			ProduitNonPerissable x = new ProduitNonPerissable();
			x.setNomProduit(nomProduit);
			x.setStock(stock);
			x.setPrix(prix);
			x.setModeEmploi(modeEmploi);

	      service.ajouterProduitNonPerissable(nomProduit, stock, prix, modeEmploi);
			if (request.getParameter("ajouter") != null) {
				service.ajouterProduitNonPerissable(nomProduit, stock, prix, modeEmploi);
			}

			if (request.getParameter("modifier") != null) {
				idProduit = Long.parseLong(request.getParameter("idProduit"));
	               x.setIdProduit(idProduit);
				service.modifierProduitNonPerissable(idProduit, nomProduit, stock, prix, modeEmploi);
			}
		}

		// 4-appel de la jsp
		request.getRequestDispatcher("indexproduitsnonperissables.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
