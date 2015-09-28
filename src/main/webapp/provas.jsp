<%@page import="br.estacio.dsw.model.Prova"%>
<%@page import="java.util.List"%>
<%@page import="br.estacio.dsw.dao.ProvaDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listar provas</title>
</head>
<body>
	<a href="cadastrarProva.jsp">Cadastrar</a>
	<a href="filtrarProva.jsp">Filtrar</a>
	<table>
	<%
		ProvaDao provaDao = new ProvaDao();
		List<Prova> provas = provaDao.lstProva();
	%>
	<tr>
		<th>Código</th>
		<th>Nota</th>
		<th>Peso</th>
		<th>Nota Final</th>
		<th>Ação</th>
	</tr>
	<% for(Prova prova : provas){%>
		<tr>
			<td name="cod"><%= prova.getId()%></td> 
			<td name="nota"><%= prova.getNota()%></td>
			<td name="notaMaxima"><%= prova.getPeso()%></td>
			<td name="prova"><%= prova.getNotaFinal()%></td>
			<td><a href="atualizarProva.jsp?cod=<%= prova.getId()%>&nota=<%= prova.getNota()%>&peso=<%= prova.getPeso()%>&notaFinal=<%= prova.getNotaFinal()%>">Editar</a></td>
			<td><a href="excluirAction.jsp?cod=<%= prova.getId()%>&excluir=prova">Excluir</a></td>
		</tr>
	<%}%>
	</table>
</body>
</html>