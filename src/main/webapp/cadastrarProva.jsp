<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastrar Provas</title>
</head>
<body>
	<form action="cadastrarAction.jsp" method="post">
		<table>
			<tr>
				<th>Matricula do Aluno</th>
				<th>Nota</th>
				<th>Peso</th>
				<th>Nota Final</th>
			</tr>
			<tr>
				<td><input type="text" name="aluno"></input></td>
				<td><input type="text" name="nota"></input></td>
				<td><input type="text" name="peso"></input></td>
				<td><input type="text" name="notaFinal"></input></td>
				<td><input type="hidden" name="cadastrar" value="cadastrarProva"></imput></td>
			</tr>
		</table>
		<input type="submit" value="CadastrarProva"></input
		<a href="provas.jsp">Cancelar</a>
	</form>
</body>
</html>