<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastrar Medias</title>
</head>
<body>
	<form action="cadastrarAction.jsp" method="post">
		<table>
			<tr>
				<th>
				<button type="button" name="prova" value=addValor("prova")>Prova</button>
				<button type="button" name="trabalho">Trabalho</button>
				<button type="button" name="+">+</button>
				<button type="button" Name="-">-</button>
				<button type="button" name="*">*</button>
				<button type="button" name="/">/</button></th>
			</tr>
			<tr>
				<td><input type="text" name="expressao"></input></td>
				<td><input type="hidden" name="cadastrar" value="cadastrarMedia"></imput></td>
			</tr>
		</table>
		<input type="submit" value="CadastrarMedia"></input
		<a href="medias.jsp">Cancelar</a>
	</form>
	<script type="text/javascript">
		function addValor(operacao){
			if(operacao === "prova"){
				document.getElementByName("expressao").value() + "prova"
			}
		}
	</script>
</body>
</html>