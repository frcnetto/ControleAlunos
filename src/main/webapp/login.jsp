<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login</title>
    <link rel="stylesheet" href="mdl/material.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
	<div class="mdl-layout mdl-js-layout">
	    <div class="div-login mdl-card mdl-shadow--2dp demo-card-square" id="div-login">
	        <div class="mdl-card__title mdl-card--expand">
	            <h2 class="mdl-card__title-text">Acesso ao sistema</h2>
	        </div>
	    	<form class="mdl-card__supporting-text" action="usucontroller.do" method="post" >
	        	<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
	            	<input class="mdl-textfield__input" type="text" id= "user" name="login" value=""/>
	              	<label class="mdl-textfield__label" for="user">Usuário...</label>
		        </div>
		        <br>
		        <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label textfield-demo">
		        	<input class="mdl-textfield__input" type="password" id = "pass" name="senha" value=""/>
		            <label class="mdl-textfield__label" for="pass">Senha...</label>
		        </div>
		        <br>
		        <input class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--accent material-icons" type="submit" value="arrow_forward" id="btn-login">
	    	</form>	
		</div>
	</div>

	<script src="mdl/material.min.js"></script>
</body>
</html>