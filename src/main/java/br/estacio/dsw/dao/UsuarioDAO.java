package br.estacio.dsw.dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.estacio.dsw.model.Usuario;
import br.estacio.dsw.persistence.jdbc.ConnectionFactory;

public class UsuarioDAO {
	private Connection conexao = ConnectionFactory.getConnection();
	
	public void cadastrar(Usuario usr) {
		String sql = "INSERT INTO usuario(nome, username, senha) values(?, ?, ?)";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setString(1, usr.getNome());
			prepared.setString(2, usr.getLogin());
			prepared.setString(3, usr.getSenha());
			prepared.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void alterar(Usuario usr) {
		String sql = "UPDATE usuario set nome = ?, username = ?, senha = ? where id = ?";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setString(1, usr.getNome());
			prepared.setString(2, usr.getLogin());
			prepared.setString(3, usr.getSenha());
			prepared.setInt(4, usr.getId());
			prepared.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void excluir(Usuario usr) {
		String sql = "DELETE FROM usuario where id = ?";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setInt(1, usr.getId());
			prepared.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void salvar(Usuario usr){
		if(usr.getId() != null){
			alterar(usr);
		} else{
			cadastrar(usr);
		}
	}

	public Usuario buscar(Integer id){
		Usuario retorno = null;
		
		String sql = "SELECT * FROM usuario WHERE id = ?";
		try (PreparedStatement prepared = conexao.prepareStatement(sql);){
			prepared.setInt(1, id);
			ResultSet resultado = prepared.executeQuery();
			
			if(resultado.next()){
				retorno = new Usuario();
				
				retorno.setId(resultado.getInt("id"));
				retorno.setNome(resultado.getString("nome"));
				retorno.setLogin(resultado.getString("username"));
				retorno.setSenha(resultado.getString("senha"));
				
				return retorno;
			} else{
				System.out.println("Usuario inexistente ou não encontrado!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		return retorno;
	}

	public List<Usuario> buscarTodos(){
		java.util.List<Usuario> retorno = new ArrayList<Usuario>();
		
		String sql = "SELECT * FROM usuario";
		try (PreparedStatement prepared = conexao.prepareStatement(sql);){
			ResultSet resultado = prepared.executeQuery();
			
			while(resultado.next()){
				Usuario usuario = new Usuario();
				
				usuario.setId(resultado.getInt("id"));
				usuario.setNome(resultado.getString("nome"));
				usuario.setLogin(resultado.getString("username"));
				usuario.setSenha(resultado.getString("senha"));
				
				retorno.add(usuario);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		return retorno;
	}
	
	public boolean validar(Usuario usr){
		String sql = "SELECT * FROM usuario WHERE username = ? and senha = ?";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setString(1, usr.getLogin());
			prepared.setString(2, usr.getSenha());
			ResultSet resultado = prepared.executeQuery();
			return resultado.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
