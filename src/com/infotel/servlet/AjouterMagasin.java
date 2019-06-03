package com.infotel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.infotel.wssoap.Magasin;
import com.infotel.wssoap.ProduitSOAPService;
import com.infotel.wssoap.ProduitSOAPServiceProxy;

@WebServlet("/AjouterMagasin")
public class AjouterMagasin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AjouterMagasin() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProduitSOAPService service = new ProduitSOAPServiceProxy();
		   Magasin[] magasins = service.findAllMagasins();
			request.setAttribute("magasins", service.findAllMagasins());
		
		long idMagasin;
		String nomMagasin;
		int codeMagasin;
		double prixDuLocal;
		// Faire traitement
		if (request.getParameter("nomMagasin") != null) { // lastname se trouve dans jsp
			codeMagasin = Integer.parseInt(request.getParameter("codeMagasin"));
			nomMagasin = request.getParameter("nomMagasin");
		    prixDuLocal = Double.parseDouble(request.getParameter("prixDuLocal"));

			// 2-envoyer à la couche service
			Magasin m = new Magasin();
		    m.setCodeMagasin(codeMagasin);
		    m.setNomMagasin(nomMagasin);
		    m.setPrixDuLocal(prixDuLocal);
			
				service.ajouterMagasin(nomMagasin, codeMagasin, prixDuLocal);
				if (request.getParameter("ajouter") != null) {
					service.ajouterMagasin(nomMagasin, codeMagasin, prixDuLocal);
				}

				if (request.getParameter("modifier") != null) {
					idMagasin =Long.parseLong(request.getParameter("idMagasin"));
					m.setIdMagasin(idMagasin);
					service.modifierMagasin(idMagasin, nomMagasin, codeMagasin, prixDuLocal);
				}
			}
		

		// 4-appel de la jsp
		request.getRequestDispatcher("indexmagasin.jsp").forward(request, response); 
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
