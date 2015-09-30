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
 * Servlet implementation class atualizarAction
 */
@WebServlet("/AtualizarAction.do")
public class AtualizarAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AtualizarAction() {
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
		if(request.getParameter("atualizar").equals("atualizarAluno")){
			Aluno novo = new Aluno();
			novo.setMatricula(Integer.parseInt(request.getParameter("matricula")));
			novo.setNome(request.getParameter("nome"));
			novo.setNota1(Float.parseFloat(request.getParameter("nota1")));
			novo.setNota2(Float.parseFloat(request.getParameter("nota2")));
			novo.setNota3(Float.parseFloat(request.getParameter("nota3")));
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
		}
	}

}
