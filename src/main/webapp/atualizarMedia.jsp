<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>atualizar Medias</title>
</head>
<body>
	<form action="atualizarAction.jsp" method="post">
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
				<td><input type="text" name="cod" value="<%= request.getParameter("cod")%>"></input></td>
				<td><input type="text" name="expressao" value="<%= request.getParameter("expressao")%>"></input></td>
				<td><input type="hidden" name="atualizar" value="atualizarMedia"></imput></td>
			</tr>
		</table>
		<input type="submit" value="atualizarMedia"></input
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