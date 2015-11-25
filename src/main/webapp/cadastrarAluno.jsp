<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="mdl/material.min.css">
<link rel="stylesheet" href="mdl/material-font.css">
<script src="mdl/material.min.js"></script>
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<title>Cadastrar Alunos</title>
</head>
<body>
	<form action="cadastrarAction.jsp" method="post">
		<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
			<input class="mdl-textfield__input" type="text" name="nome"></input>
			<label class="mdl-textfield__label" for="nome">Nome...</label>
		</div><br>
		<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
			<input class="mdl-textfield__input" type="text" name="nota1"></input>
			<label class="mdl-textfield__label" for="nome">Primeira Nota...</label>
		</div><br>
		<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
			<input class="mdl-textfield__input" type="text" name="nota2"></input>
			<label class="mdl-textfield__label" for="nome">Segunda Nota...</label>
		</div><br>
		<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
			<input class="mdl-textfield__input" type="text" name="nota3"></input>
			<label class="mdl-textfield__label" for="nome">Terceira Nota...</label>
		</div><br>
		<input type="hidden" name="cadastrar" value="cadastrarAluno"></imput>
		<input class="mdl-button mdl-js-button" type="submit" value="Cadastrar Aluno"></input><br>
		<a class="mdl-button mdl-js-button" href="alunos.jsp">Cancelar</a>
	</form>
</body>
</html>