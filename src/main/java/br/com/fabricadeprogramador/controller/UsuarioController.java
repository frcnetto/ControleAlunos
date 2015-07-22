package br.com.fabricadeprogramador.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fabricadeprogramador.persistence.entity.Usuario;
import br.com.fabricadeprogramador.persistence.jdbc.UsuarioDAO;

@WebServlet("/usucontroller.do")
public class UsuarioController extends HttpServlet{
	public UsuarioController() {
		System.out.println("Construtor");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("Init");
		super.init();
	}
	@Override
	public void destroy() {
		System.out.println("Destroy");
		super.destroy();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doGet");
		
		Usuario usr = new Usuario();
		usr.setNome(req.getParameter("nome"));
		usr.setLogin(req.getParameter("login"));
		usr.setSenha(req.getParameter("senha"));
		
		UsuarioDAO usrDAO = new UsuarioDAO();
		
		resp.getWriter().print(usrDAO.validar(usr));
//		super.doGet(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
