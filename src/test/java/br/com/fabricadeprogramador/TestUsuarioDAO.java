package br.com.fabricadeprogramador;

import javax.swing.JOptionPane;

import br.estacio.dsw.persistence.entity.Usuario;
import br.estacio.dsw.persistence.jdbc.UsuarioDAO;

@SuppressWarnings("unused")
public class TestUsuarioDAO {

	public static void main(String[] args) {
		Usuario usr = new Usuario();
		
		usr.setLogin("frcnetto");
		usr.setSenha("123456");
		
		altenticar(usr);
	}
	
	private static void altenticar(Usuario usr) {
		UsuarioDAO usrDAO = new UsuarioDAO();
		System.out.println(usrDAO.validar(usr));
	}

	private static void buscaTodos() {
		UsuarioDAO usrDAO = new UsuarioDAO();
		System.out.println(usrDAO.buscarTodos().size());
	}

	private static void buscar(Usuario usr) {
		UsuarioDAO usrDAO = new UsuarioDAO();
		
		JOptionPane.showMessageDialog(null, usrDAO.buscar(usr.getId()).getNome());
	}

	public static void cadastrar(Usuario usr){
		UsuarioDAO usrDAO = new UsuarioDAO();		
		usrDAO.cadastrar(usr);		
		System.out.println("Cadastrado com sucesso!");
	}

	public static void alterar(Usuario usr){
		UsuarioDAO usrDAO = new UsuarioDAO();		
		usrDAO.alterar(usr);		
		System.out.println("Alterado com sucesso!");
	}
	
	public static void excluir(Usuario usr){
		UsuarioDAO usrDAO = new UsuarioDAO();		
		usrDAO.excluir(usr);		
		System.out.println("Excluido com sucesso!");
	}
	
	public static void salvar(Usuario usr){
		UsuarioDAO usrDAO = new UsuarioDAO();		
		usrDAO.salvar(usr);		
		System.out.println("Salvo com sucesso!");
	}
}
