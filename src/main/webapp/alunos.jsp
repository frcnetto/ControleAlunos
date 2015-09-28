<%@page import="br.estacio.dsw.model.Aluno"%>
<%@page import="java.util.List"%>
<%@page import="br.estacio.dsw.dao.AlunoDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bem-vindo</title>
</head>
<body>
	<a href="cadastrarAluno.jsp">Cadastrar</a>
	<a href="filtrarAluno.jsp">Filtrar</a>
	<table>
	<%
		AlunoDao alunoDao = new AlunoDao();
		List<Aluno> alunos = alunoDao.lstAluno();
	%>
	<tr>
		<th>Matrícula</th>
		<th>Nome</th>
		<th>Nota</th>
		<th>Ação</th>
	</tr>
	<% for(Aluno aluno : alunos){%>
		<tr>
			<td name="matricula"><%= aluno.getMatricula()%></td> 
			<td name="nome"><%= aluno.getNome()%></td>
			<td name="nota"><%= aluno.getNota()%></td>
			<td><a href="atualizarAluno.jsp?matricula=<%= aluno.getMatricula()%>&nome=<%= aluno.getNome()%>">Editar</a></td>
			<td><a href="excluirAction.jsp?matricula=<%= aluno.getMatricula()%>&excluir=aluno">Excluir</a></td>
		</tr>
	<%}%>
	</table>
</body>
</html>