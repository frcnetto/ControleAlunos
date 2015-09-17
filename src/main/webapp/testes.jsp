<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Testes</title>
	<link rel="stylesheet" href="mdl/material.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
	<form class="mdl-centered" action="media.do" method="post">
		<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
           	<input class="mdl-textfield__input" type="text" id= "nota1" name="nota1" value=""/>
           	<label class="mdl-textfield__label" for="nota1">Nota 1...</label>
        </div>
        <br>
        <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label textfield-demo">
        	<input class="mdl-textfield__input" type="text" id = "nota2" name="nota2" value=""/>
            <label class="mdl-textfield__label" for="nota2">Nota 2...</label>
        </div>
        <br>
        <input class="mdl-button mdl-js-button mdl-js-ripple-effect" type="submit" value="Enviar" id="btn-login">
	</form>
	
	<script src="mdl/material.min.js"></script>
</body>
</html>