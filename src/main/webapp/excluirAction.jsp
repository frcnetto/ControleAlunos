<%@page import="br.estacio.dsw.dao.AlunoDao"%>
<%@page import="br.estacio.dsw.model.Aluno"%>
<%@page import="br.estacio.dsw.dao.TrabalhoDao"%>
<%@page import="br.estacio.dsw.model.Trabalho"%>
<%@page import="br.estacio.dsw.dao.ProvaDao"%>
<%@page import="br.estacio.dsw.model.Prova"%>
<%@page import="br.estacio.dsw.dao.MediaDao"%>
<%@page import="br.estacio.dsw.model.Media"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% if(request.getParameter("excluir").equals("aluno")){
		Aluno aluno = new Aluno();
		aluno.setMatricula(Integer.parseInt(request.getParameter("matricula")));
		AlunoDao dao = new AlunoDao();
		if(dao.delAluno(aluno)){
			response.sendRedirect("bem-vindo.jsp");
		} else{
			response.sendRedirect("erro.html");
		}
	} if(request.getParameter("excluir").equals("trabalho")){
		Trabalho trabalho = new Trabalho();
		trabalho.setId(Integer.parseInt(request.getParameter("cod")));
		TrabalhoDao dao = new TrabalhoDao();
		if(dao.delTrabalho(trabalho)){
			response.sendRedirect("trabalhos.jsp");
		} else{
			response.sendRedirect("erro.html");
		}
	} if(request.getParameter("excluir").equals("prova")){
		Prova prova = new Prova();
		prova.setId(Integer.parseInt(request.getParameter("cod")));
		ProvaDao dao = new ProvaDao();
		if(dao.delProva(prova)){
			response.sendRedirect("provas.jsp");
		} else{
			response.sendRedirect("erro.html");
		}
	} if(request.getParameter("excluir").equals("media")){
		Media media = new Media();
		media.setId(Integer.parseInt(request.getParameter("cod")));
		MediaDao dao = new MediaDao();
		if(dao.delMedia(media)){
			response.sendRedirect("medias.jsp");
		} else{
			response.sendRedirect("erro.html");
		}
	}%>
</body>
</html>