<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro do Produto</title>
</head>
<body>

<h1>Cadastro Produto</h1>

<c:if test="${not empty erro}">
<div style="color: red;">${erro}</div>
</c:if>
<c:if test="${not empty sucesso}">
<div style="color: green;">${sucesso}</div>
</c:if>
<br />


<form action="${pageContext.request.contextPath}/ProdutoServlet" method="post">

<label for"nome">Nome do Produto</label>
<br>
<input type="text" id="nome" name="nome" value="${param.nome}">
<br>
<label for="quantidade">Quantidade</label>
<br>
<input type="number" id="quantidade" name="quantidade" value="${param.quantidade}">
<br>
<input type="submit" value="Cadastrar">
<a href="../index.jsp"><button type="button" >Voltar para Página Inicial</button></a>

</form>

</body>
</html>