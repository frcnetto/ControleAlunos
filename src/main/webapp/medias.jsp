<%@page import="br.estacio.dsw.model.Media"%>
<%@page import="java.util.List"%>
<%@page import="br.estacio.dsw.dao.MediaDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Gerenciar medias</title>
</head>
<body>
	<a href="cadastrarMedia.jsp">Cadastrar</a>
	<a href="filtrarMedia.jsp">Filtrar</a>
	<table>
	<%
		MediaDao mediaDao = new MediaDao();
		List<Media> medias = mediaDao.lstMedia();
	%>
	<tr>
		<th>Código</th>
		<th>Expressão</th>
		<th>Ação</th>
	</tr>
	<% for(Media media : medias){%>
		<tr>
			<td name="cod"><%= media.getId()%></td>
			<td name="expressao"><%= media.getExpressao()%></td>
			<td><a href="atualizarMedia.jsp?cod=<%= media.getId()%>&expressao=<%= media.getExpressao()%>"><img alt="edit" src="images/edit.png"></a></td>
			<td><a href="excluirAction.jsp?cod=<%= media.getId()%>&excluir=media"><img alt="delete" src="images/delete.png"></a></td>
		</tr>
	<%}%>
	</table>
</body>
</html>