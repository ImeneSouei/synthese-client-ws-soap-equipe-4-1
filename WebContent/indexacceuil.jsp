<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Acceuil</title>
<link rel="stylesheet" href="./resources/style.css" /><link rel="stylesheet" href="./css/bootstrap.css" />

</head>
<body>
<div class="bar">
		<nav class="container">
			<a href="indexmagasin.jsp">Liste des Magasins</a> 
			<a href="indexproduitsnonperissables.jsp">Liste des produits non perissables</a> 
			<a href="indexproduitsperissables.jsp">Liste des produits perissables</a> 
		</nav>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>NomMagasin</th>
                <th>codeMagasin</th>
                <th>PrixDuLocal</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${magasins}" var="mags">
                <tr>
                    <td>${mags.idMagasin}</td>
                    <td>${mags.nomMagasin}</td>
                    <td>${mags.codeMagasin}</td>
                    <td>${mags.prixDuLocal}</td>
                </tr>
            </c:forEach>      
        </tbody>
    </table>
</div>
</body>
</html>