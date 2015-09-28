<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="atualizarAction.jsp" method="post">
		<table>
			<tr>
				<th>Código</th>
				<th>Nota</th>
				<th>Peso</th>
				<th>Nota Final</th>
			</tr>
			<tr>
				<td><input type="hiddem" name="cod" value="<%= request.getParameter("cod")%>"></input></td>
				<td><input type="text" name="nota" value="<%= request.getParameter("nota")%>"></input></td>
				<td><input type="text" name="peso" value="<%= request.getParameter("peso")%>"></input></td>
				<td><input type="text" name="notaFinal" value="<%= request.getParameter("notaFinal")%>"></input></td>
				<td><input type="hidden" name="atualizar" value="atualizarProva"></imput></td>
			</tr>
		</table>
		<input type="submit" value="AtualizarProva"></input
		<a href="provas.jsp">cancelar</a>
	</form>
</body>
</html>