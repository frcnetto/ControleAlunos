<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastrar Alunos</title>
</head>
<body>
	<form action="cadastrarAction.jsp" method="post">
		<table>
			<tr>
				<td>Nome</td>
			</tr>
			<tr>
				<td><input type="text" name="nome"></input></td>
				<td><input type="hidden" name="cadastrar" value="cadastrarAluno"></imput></td>
			</tr>
		</table>
		<input type="submit" value="CadastrarAluno"></input
		<a href="bem-vindo.jsp">Cancelar</a>
	</form>
</body>
</html>