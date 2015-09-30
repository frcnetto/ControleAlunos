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
 * Servlet implementation class ExcluirAction
 */
@WebServlet("/ExcluirAction.do")
public class ExcluirAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExcluirAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("excluir").equals("aluno")){
			Aluno aluno = new Aluno();
			aluno.setMatricula(Integer.parseInt(request.getParameter("matricula")));
			AlunoDao dao = new AlunoDao();
			if(dao.delAluno(aluno)){
				response.sendRedirect("alunos.jsp");
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
		}
	}

}
