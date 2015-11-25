<%@page import="br.estacio.dsw.model.Aluno"%>
<%@page import="java.util.List"%>
<%@page import="br.estacio.dsw.dao.AlunoDao"%>
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
<title>Gerenciar alunos</title>
</head>
<body>
	<a class="mdl-button mdl-js-button mdl-button--fab mdl-button--mini-fab" href="cadastrarAluno.jsp"><i class="material-icons">add</i></a>
	<form action="#">
	  <div class="mdl-textfield mdl-js-textfield mdl-textfield--expandable">
	    <label class="mdl-button mdl-js-button mdl-button--icon" for="sample6">
	      <i class="material-icons">search</i>
	    </label>
	    <div class="mdl-textfield__expandable-holder">
	      <input class="mdl-textfield__input" type="text" id="sample6" />
	      <label class="mdl-textfield__label" for="sample-expandable">Expandable Input</label>
	    </div>
	  </div>
	</form>
	<table class="mdl-data-table mdl-js-data-table mdl-shadow--2dp">
	<%
		AlunoDao alunoDao = new AlunoDao();
		List<Aluno> alunos = alunoDao.lstAluno();
	%>
	<thead>
		<tr>
			<th>Matrícula</th>
			<th>Nome</th>
			<th>Nota 1</th>
			<th>Nota 2</th>
			<th>Nota 3</th>
			<th>Média</th>
			<th>Editar</th>
			<th>Deletar</th>
		</tr>
	</thead>
	<tbody>
		<% for(Aluno aluno : alunos){%>
			<tr>
				<td name="matricula"><%= aluno.getMatricula()%></td> 
				<td name="nome"><%= aluno.getNome()%></td>
				<td name="nota1"><%= aluno.getNota1()%></td>
				<td name="nota2"><%= aluno.getNota2()%></td>
				<td name="nota3"><%= aluno.getNota3()%></td>
				<td name="media"><%= aluno.getMedia()%></td>
				<!-- 
					<td>
						<a href="atualizarAluno.jsp?matricula=<%= aluno.getMatricula()%>&nome=<%= aluno.getNome()%>&nota1=<%= aluno.getNota1()%>&nota2=<%= aluno.getNota2()%>&nota3=<%= aluno.getNota3()%>">
							<img alt="edit" src="images/edit.png"> </a>
					</td>
				 -->
				<td>
					<form action="atualizarAluno.jsp" method="post">
						<input type="hidden" name="matricula" value="<%= aluno.getMatricula()%>"></imput>
						<input type="hidden" name="nome" value="<%= aluno.getNome()%>"></imput>
						<input type="hidden" name="nota1" value="<%= aluno.getNota1()%>"></imput>
						<input type="hidden" name="nota2" value="<%= aluno.getNota2()%>"></imput>
						<input type="hidden" name="nota3" value="<%= aluno.getNota3()%>"></imput>
						<input class="mdl-button mdl-js-button" type="submit" value="Editar"></input><br>
					</form>
				</td>
				<!-- 
					<td>
						<a href="excluirAction.jsp?matricula=<%= aluno.getMatricula()%>&excluir=aluno">
							<img alt="delete" src="images/delete.png"></a>
					</td>
				 -->
				<td>
					<form action="excluirAction.jsp" method="post">
						<input type="hidden" name="excluir" value="aluno"></imput>
						<input type="hidden" name="matricula" value="<%= aluno.getMatricula()%>"></imput>
						<input class="mdl-button mdl-js-button" type="submit" value="Excluir"></input><br>
					</form>
				</td>
			</tr>
		<%}%>
	</tbody>
	</table>
</body>
</html>