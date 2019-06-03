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

@WebServlet("/ModifierProduitPerissable")
public class ModifierProduitPerissable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ModifierProduitPerissable() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProduitSOAPService service = new ProduitSOAPServiceProxy();
		ProduitNonPerissable x = service.affichageProduitNonPerissable(Long.parseLong(request.getParameter("idProduit")));

		request.setAttribute("idProduit",x.getIdProduit());
		request.setAttribute("nomProduit", x.getIdProduit());
		request.setAttribute("stock",x.getStock());
		request.setAttribute("prix", x.getPrix());
		// 3-pr�paration � l'envoi
		request.setAttribute("produitNonPerissables", service.findAllProduitNonPerissable());
		// 4-appel de la jsp
		request.getRequestDispatcher("indexproduitsperissables.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
