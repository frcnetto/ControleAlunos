package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistence.entity.Usuario;
import br.com.fabricadeprogramador.persistence.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		excluir();
	}
	
	public static void cadastrar(){
		Usuario usr = new Usuario();
		
		usr.setNome("Teste");
		usr.setLogin("Teste");
		usr.setSenha("123456");
		
		UsuarioDAO usrDAO = new UsuarioDAO();
		
		usrDAO.cadastrar(usr);
		
		System.out.println("Cadastrado com sucesso!");
	}

	public static void alterar(){
		Usuario usr = new Usuario();
		
		usr.setId(3);
		usr.setNome("Teste alteracao");
		usr.setLogin("Teste");
		usr.setSenha("123456");
		
		UsuarioDAO usrDAO = new UsuarioDAO();
		
		usrDAO.alterar(usr);
		
		System.out.println("Alterado com sucesso!");
	}
	
	public static void excluir(){
		Usuario usr = new Usuario();
		
		usr.setId(3);
		
		UsuarioDAO usrDAO = new UsuarioDAO();
		
		usrDAO.excluir(usr);
		
		System.out.println("Excluido com sucesso!");
	}
}
