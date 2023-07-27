<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@page import="mvc.Salarie"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Notification</title>
</head>
<body>
	<p>
	 <% 
	 	
		  String notification = (String) request.getAttribute("notification");
		  out.print(notification);
			 
	 %>
	</p>
</body>
</html>