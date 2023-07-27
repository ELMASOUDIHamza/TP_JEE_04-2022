<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	 <% 
	 	
		  int ids = (int)request.getAttribute("ids");
		  out.print("Le salarié avec le code "+ids+" est correctement supprimer !");
			 
	 %>
</body>
</html>