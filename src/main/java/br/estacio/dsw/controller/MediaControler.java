package br.estacio.dsw.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Media
 */
@WebServlet("/media.do")
public class MediaControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public MediaControler() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("erro.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			float nota1 = Float.parseFloat(request.getParameter("nota1"));
			float nota2 = Float.parseFloat(request.getParameter("nota2"));
			float media = (nota1 + nota2)/2;
			String situacao;
			
			if(media>=7)
				situacao = "Aprovado";
			else
				situacao = "Reprovado";
				
			response.sendRedirect("CalculaMediaView.jsp");;
		} catch (NumberFormatException e) {
			response.sendRedirect("erro.html");
		}
	}

}
