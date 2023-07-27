<%@page import="mvc.Salarie"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>
	 <% 
	 	
		  Salarie salarie = (Salarie) request.getAttribute("salarie");
		  out.print(salarie.getPrenom()+" "+salarie.getNom()+" "+salarie.getId());
			 
	 %>
	</p>
</body>
</html>