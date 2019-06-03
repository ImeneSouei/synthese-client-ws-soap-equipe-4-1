package com.infotel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotel.wssoap.ProduitSOAPService;
import com.infotel.wssoap.ProduitSOAPServiceProxy;

@WebServlet("/SupprimerMagasin")
public class SupprimerMagasin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SupprimerMagasin() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProduitSOAPService service = new ProduitSOAPServiceProxy();
		long idMagasin = Long.parseLong((request.getParameter("idMagasin")));
		service.supprimerMagasin(idMagasin);
		// 3-préparation à l'envoi
		request.setAttribute("magasins", service.findAllMagasins());

		// 4-appel de la jsp
		request.getRequestDispatcher("indexmagasin.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
