<%@page import="java.util.ArrayList"%>
<%@page import="mvc.Salarie"%>
<%@page import="java.util.List"%>
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
		List<Salarie> listSalaries = new ArrayList<Salarie>();
	  	listSalaries = (ArrayList) request.getAttribute("listSalaries");

		  for(Salarie salarie : listSalaries){
			  out.println(salarie.getPrenom()+" "+salarie.getNom());
		  }
	  
	%>
</body>
</html>