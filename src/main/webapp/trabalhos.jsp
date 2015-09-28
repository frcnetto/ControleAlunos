<%@page import="br.estacio.dsw.model.Trabalho"%>
<%@page import="java.util.List"%>
<%@page import="br.estacio.dsw.dao.TrabalhoDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listar trabalhos</title>
</head>
<body>
	<a href="cadastrarTrabalho.jsp">Cadastrar</a>
	<a href="filtrarTrabalho.jsp">Filtrar</a>
	<table>
	<%
		TrabalhoDao trabalhoDao = new TrabalhoDao();
		List<Trabalho> trabalhos = trabalhoDao.lstTrabalho();
	%>
	<tr>
		<th>Código</th>
		<th>Nota</th>
		<th>Nota Máxima</th>
		<th>Prova</th>
		<th>Ação</th>
	</tr>
	<% for(Trabalho trabalho : trabalhos){%>
		<tr>
			<td name="cod"><%= trabalho.getId()%></td> 
			<td name="nota"><%= trabalho.getNota()%></td>
			<td name="notaMaxima"><%= trabalho.getNotaMaxima()%></td>
			<td name="prova"><%= trabalho.getProva()%></td>
			<td><a href="atualizarTrabalho.jsp?cod=<%= trabalho.getId()%>&nota=<%= trabalho.getNota()%>&notaMaxima=<%= trabalho.getNotaMaxima()%>">Editar</a></td>
			<td><a href="excluirAction.jsp?cod=<%= trabalho.getId()%>&excluir=trabalho">Excluir</a></td>
		</tr>
	<%}%>
	</table>
</body>
</html>