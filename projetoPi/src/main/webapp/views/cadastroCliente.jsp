<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../css/cadastro.css">
<title>Cadastro do Cliente</title>
</head>
<body>



<form action="">

<div>
	<h1>Cadastro Cliente</h1>
	<input type="text" id="nome" placeholder="Nome Completo">
	<br><br>
	<input type="text" id="email" placeholder="Email">
	<br><br>
	<input type="text" id="cpf" placeholder="CPF">
	<br><br>
	<label for=dataNasc>Data de nascimento</label>
	<br>
	<input id="date" type="date" />
	<br><br>
	<input type="password" id="senha" placeholder="Senha">
	<br><br>
	<input class="btn-cadastrar" type="submit" value="Cadastrar">
	<a href="../index.jsp"><button type="button" >Voltar para Página Inicial</button></a>
</div>


</form>

</body>
</html>