package br.estacio.dsw.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.estacio.dsw.dao.UsuarioDAO;
import br.estacio.dsw.model.Usuario;

@SuppressWarnings("serial")
@WebServlet("/usucontroller.do")
public class UsuarioController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doGet");
		
//		super.doGet(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Usuario usr = new Usuario();
		usr.setLogin(req.getParameter("login"));
		usr.setSenha(req.getParameter("senha"));
		
		UsuarioDAO usrDAO = new UsuarioDAO();
		
		if(usrDAO.validar(usr))
			resp.sendRedirect("home.html");
		else
			resp.getWriter().print("Login invalido!");
//		super.doPost(req, resp);
	}
}
