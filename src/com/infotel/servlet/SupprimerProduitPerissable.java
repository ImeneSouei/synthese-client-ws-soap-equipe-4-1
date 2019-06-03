package com.infotel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotel.wssoap.ProduitSOAPService;
import com.infotel.wssoap.ProduitSOAPServiceProxy;

@WebServlet("/SupprimerProduitPerissable")
public class SupprimerProduitPerissable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SupprimerProduitPerissable() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProduitSOAPService service = new ProduitSOAPServiceProxy();
		long idProduit = Long.parseLong((request.getParameter("idProduit")));
		service.supprimerProduitPerissable(idProduit);
		// 3-préparation à l'envoi
		request.setAttribute("produitPerissables", service.findAllProduitPerissable());

		// 4-appel de la jsp
		request.getRequestDispatcher("indexproduitsperissables.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
