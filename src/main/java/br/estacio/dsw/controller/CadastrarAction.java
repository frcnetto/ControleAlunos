package br.estacio.dsw.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.estacio.dsw.dao.AlunoDao;
import br.estacio.dsw.dao.MediaDao;
import br.estacio.dsw.dao.ProvaDao;
import br.estacio.dsw.dao.TrabalhoDao;
import br.estacio.dsw.model.Aluno;
import br.estacio.dsw.model.Media;
import br.estacio.dsw.model.Prova;
import br.estacio.dsw.model.Trabalho;

/**
 * Servlet implementation class cadastrarAction
 */
@WebServlet("/CadastrarAction.do")
public class CadastrarAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("erro.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("cadastrar").equals("cadastrarAluno")){
			Aluno novo = new Aluno();
			novo.setNome(request.getParameter("nome"));
			novo.setNota1(Float.parseFloat(request.getParameter("nota1")));
			novo.setNota2(Float.parseFloat(request.getParameter("nota2")));
			novo.setNota3(Float.parseFloat(request.getParameter("nota3")));
			AlunoDao dao = new AlunoDao();
			if(dao.cadAluno(novo)){
				response.sendRedirect("alunos.jsp");
			} else{
				response.sendRedirect("erro.html");
			}
		}
			if(request.getParameter("cadastrar").equals("cadastrarTrabalho")){
				Trabalho novo = new Trabalho();
				novo.setNota(Float.parseFloat(request.getParameter("nota")));
				novo.setNotaMaxima(Float.parseFloat(request.getParameter("notaMaxima")));
				TrabalhoDao dao = new TrabalhoDao();
				if(dao.cadTrabalho(novo)){
					response.sendRedirect("trabalhos.jsp");
				} else{
					response.sendRedirect("erro.html");
				}
			} 
			if(request.getParameter("cadastrar").equals("cadastrarProva")){
				Prova novo = new Prova();
				novo.setAluno(new AlunoDao().cstAlunoMatricula(Integer.parseInt(request.getParameter("aluno"))));
				novo.setNota(Float.parseFloat(request.getParameter("nota")));
				novo.setPeso(Integer.parseInt(request.getParameter("peso")));
				novo.setNotaFinal(Float.parseFloat(request.getParameter("notaFinal")));
				ProvaDao dao = new ProvaDao();
				if(dao.cadProva(novo)){
					response.sendRedirect("provas.jsp");
				} else{
					response.sendRedirect("erro.html");
				}
			} if(request.getParameter("cadastrar").equals("cadastrarMedia")){
				Media novo = new Media();
				novo.setExpressao(request.getParameter("expressao"));
				MediaDao dao = new MediaDao();
				if(dao.cadMedia(novo)){
					response.sendRedirect("medias.jsp");
				} else{
					response.sendRedirect("erro.html");
				}
			}
	}

}
