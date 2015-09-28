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
	<% if(request.getParameter("atualizar").equals("atualizarAluno")){
			Aluno novo = new Aluno();
			novo.setMatricula(Integer.parseInt(request.getParameter("matricula")));
			novo.setNome(request.getParameter("nome"));
			AlunoDao dao = new AlunoDao();
			if(dao.updAluno(novo)){
				response.sendRedirect("alunos.jsp");
			} else{
				response.sendRedirect("erro.html");
			}
		} 
		
		if(request.getParameter("atualizar").equals("atualizarTrabalho")){
			Trabalho novo = new Trabalho();
			novo.setId(Integer.parseInt(request.getParameter("cod")));
			novo.setNota(Float.parseFloat(request.getParameter("nota")));
			novo.setNotaMaxima(Float.parseFloat(request.getParameter("notaMaxima")));
			TrabalhoDao dao = new TrabalhoDao();
			if(dao.updTrabalho(novo)){
				response.sendRedirect("trabalhos.jsp");
			} else{
				response.sendRedirect("erro.html");
			}
		}
		
		if(request.getParameter("atualizar").equals("atualizarProva")){
			Prova novo = new Prova();
			novo.setId(Integer.parseInt(request.getParameter("cod")));
			novo.setNota(Float.parseFloat(request.getParameter("nota")));
			novo.setPeso(Integer.parseInt(request.getParameter("peso")));
			novo.setNotaFinal(Float.parseFloat(request.getParameter("notaFinal")));
			ProvaDao dao = new ProvaDao();
			if(dao.updProva(novo)){
				response.sendRedirect("provas.jsp");
			} else{
				response.sendRedirect("erro.html");
			}
		} if(request.getParameter("atualizar").equals("atualizarMedia")){
			Media novo = new Media();
			novo.setId(Integer.parseInt(request.getParameter("cod")));
			novo.setExpressao(request.getParameter("expressao"));
			MediaDao dao = new MediaDao();
			if(dao.updMedia(novo)){
				response.sendRedirect("medias.jsp");
			} else{
				response.sendRedirect("erro.html");
			}
		}%>
</body>
</html>