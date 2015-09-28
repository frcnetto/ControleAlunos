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
				<td>Matricula</td>
				<td>Nome</td>
			</tr>
			<tr>
				<td><input type="hiddem" name="matricula" value="<%= request.getParameter("matricula")%>"></input></td>
				<td><input type="text" name="nome" value="<%= request.getParameter("nome")%>"></input></td>
				<td><input type="hidden" name="atualizar" value="atualizarAluno"></imput></td>
			</tr>
		</table>
		<input type="submit" value="AtualizarAluno"></input
		<a href="bem-vindo.jsp">cancelar</a>
	</form>
</body>
</html>