<%@page import="dao.ClienteDao"%>
<%@page import="model.Cliente"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Response</h1>

<%
Cliente clienteCriado = new Cliente(request.getParameter("nome"), request.getParameter("cpf"), request.getParameter("email"), request.getParameter("senha"));

ClienteDao dao = new ClienteDao();

dao.inserir(clienteCriado);


%>

   


</body>
</html>