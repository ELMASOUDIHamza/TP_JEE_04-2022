<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Acceuil</title>
</head>
<body>
	<header>
		<%@ include file="header.html" %>
	</header>
	<div>
		<a href="AfficherSalaries">Afficher les salariés</a> <br> <br>
		<a href="Acceuil.html">Ajouter un salariés</a> <br> <br>
		<form action="TrouverSalarie" >
			<label>Trouver un salarié à l'aide de son code : </label>
			<input type="text" name="id" />
			<input type="submit" value="Chercher"/>
		</form>
		<form action="SupprimerSalarie" >
			<label>Supprimer un slarié : </label>
			<input type="text" name="ids" />
			<input type="submit" value="Supprimer"/>
		</form>
	</div>
	<footer>
		<%@ include file="footer.html" %>
	</footer>

</body>
</html>