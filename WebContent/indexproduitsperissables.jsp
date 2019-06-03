<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lister les produits perissables</title>
<link rel="stylesheet" href="./resources/style.css" /><link rel="stylesheet" href="./css/bootstrap.css" />
 <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<nav class="container">
			<a href="indexacceuil.jsp">Acceuil</a> 
			<a href="indexmagasin.jsp">Liste des Magasins</a> 
			<a href="indexproduitsnonperissables.jsp">Liste des produits non perissables</a> 
			<a href="indexproduitsperissables.jsp">Liste des produits perissables</a> 
		</nav>
 	<section class="Container">

		<form action="AjouterProduitPerissable">


			<div class="form-group">
				<label for="nomProduit">nom du Produit</label> <input
					id="nomProduit" class="form-control" type="text" name="nomProduit"
					value="${nomProduit}" required />
			</div>

			<div class="form-group">
				<label for="stock">stock</label> <input id="stock"
					class="form-control" type="text" placeholder="stock" name="stock"
					value="${stock}" />
			</div>
			<div class="form-group">
				<label for="prix">Prix</label> <input id="prix" class="form-control"
					type="text" placeholder="prix" name="prixDuLocal" value="${prix}" />
			</div>
	
			<div>

				<input type="submit" name="ajouter" value="Ajouter" /> <input
					type="submit" name="modifier" value="Modifier" />
			</div>
		</form>
	</section>



	<div class=container>

		<h2>Liste des produits</h2>
		<table class="table table-bordered">
			<thead class="green">
				<tr class="w3-pink">
					<th>ID</th>
					<th>NomProduitsPerissables</th>
					<th>STOCK</th>
					<th>PRIX</th>

				</tr>

			</thead>
			<tbody>

				<c:if test="${!empty produitsPerissables}">


					<c:forEach items="${produitsPerissables}" var="pr">
						<tr>
							<td>${pr.idProduit}</td>
							<td>${pr.nomProduit}</td>
							<td>${pr.stock}</td>
							<td>${pr.prix}</td>
			


							<td><a href="SupprimerProduitPerissable?idProduit=${pr.idProduit}">supprimer</a></td>
							<td><a href="ModifierProduitPerissable?idProduit=${pr.idProduit}">modifier</a></td>
						</tr>

					</c:forEach>
				</c:if>
			</tbody>
		</table>
	</div>
</body>
</html>