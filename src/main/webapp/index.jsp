<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bem-vindo</title>
<link rel="stylesheet" href="mdl/material.min.css">
<link rel="stylesheet" href="mdl/material-font.css">
<script src="mdl/material.min.js"></script>
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
</head>
<body>
<div class="mdl-layout mdl-js-layout mdl-layout--fixed-drawer">
	<div class="mdl-layout__drawer">
		<span class="mdl-layout-title">Controle de Alunos</span>
		<nav class="mdl-navigation">
			<a class="mdl-navigation__link mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect" href="alunos.jsp">
				<img alt="student" src="images/student.png"> Alunos</a>
	  		<a class="mdl-navigation__link mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect" href="provas.jsp">
	  			<img alt="exam" src="images/exam.jpg"> Provas</a>
	  		<a class="mdl-navigation__link mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect" href="trabalhos.jsp">
	  			<img alt="work" src="images/work.png"> Trabalhos</a>
	  		<a class="mdl-navigation__link mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect" href="medias.jsp">
	  			<img alt="media" src="images/media.png"> Médias</a>
	  </nav>
	</div>
	<main class="mdl-layout__content">
	  <div class="page-content"><!-- Your content goes here --></div>
	</main>
</div>
	<ul class="mdl-menu mdl-js-menu">
		
	</ul>
</body>
</html>