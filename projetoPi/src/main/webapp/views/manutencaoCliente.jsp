<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Manutenção Cliente</title>
</head>
<body>

<form class="formCliente">

<h1>Edite seus Dados</h1>
<label for"email">Email</label>
<br>
<input type="text" value="exemplo@email.com">
<br>
<label for"nome">Nome</label>
<br>
<input type="text" value="Exemplo">
<br>
<label for=dataNasc>Data de nascimento</label>
<br>
<input type="date" value="01/01/1969"/>
<br>
<label for"cpf">CPF</label>
<br>
<input type="text" value="000.000.000-00">
<br>
<label for"senha">Senha</label>
<br>
<input type="password" id="senha" placeholder="Nova Senha">
<br>
<label for"confirmarSenha">Confirmar Senha</label>
<br>
<input type="password" id="ConfirmarSenha" placeholder="Confirmar senha">
<br>

<button type="button">Alterar Dados</button>

</form>

</body>
</html>