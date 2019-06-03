<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" href="./resources/style.css" />
<link rel="stylesheet" href="./css/bootstrap.css" />
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Lister les Magasins</title>
</head>
<body>
	<nav class="container">
		<a href="indexacceuil.jsp">Acceuil</a> 
			<a href="indexmagasin.jsp">Liste des Magasins</a> 
			<a href="indexproduitsnonperissables.jsp">Liste des produits non perissables</a> 
			<a href="indexproduitsperissables.jsp">Liste des produits perissables</a> 
	</nav>
	<section class="Container">
		<h1>Formulaire</h1>

		<form action="AjouterMagasin">


			<div class="form-group">
				<label for="nomMagasin">nom du Magasin</label> <input
					id="nomMagasin" class="form-control" type="text" name="nomMagasin"
					value="${nomMagasin}" required />
			</div>

			<div class="form-group">
				<label for="codeMagasin">codeMagasin</label> <input id="codeMagasin"
					class="form-control" type="text" placeholder="codeMagasin"
					name="codeMagasin" value="${codeMagasin}" />
			</div>
			<div class="form-group">
				<label for="prixDuLocal">Prix du Local</label> <input
					id="prixDuLocal" class="form-control" type="text"
					placeholder="prixDuLocal" name="prixDuLocal" value="${prixDuLocal}" />
			</div>
			<div>

				<input type="submit" name="ajouter" value="Ajouter" /> <input
					type="submit" name="modifier" value="Modifier" />
			</div>
		</form>
	</section>



	<div class=container>

		<h2>Liste des magasins</h2>
		<table class="table table-bordered">
			<thead class="green">
				<tr>
					<th>ID</th>
					<th>NomMagasin</th>
					<th>codeMagasin</th>
					<th>PrixDuLocal</th>

				</tr>
			</thead>
			<tbody>

				<c:if test="${!empty magasins}">

					<c:forEach items="${magasins}" var="mags">


						<tr>
							<td>${mags.idMagasin}</td>
							<td>${mags.nomMagasin}</td>
							<td>${mags.codeMagasin}</td>
							<td>${mags.prixDuLocal}</td>




							<td><a href="SupprimerMagasin?idMagasin=${mags.idMagasin}">supprimer</a></td>
							<td><a href="ModifierMagasin?idMagasin=${mags.idMagasin}">modifier</a></td>
						</tr>

					</c:forEach>
				</c:if>
			</tbody>
		</table>
	</div>
</body>
</html>