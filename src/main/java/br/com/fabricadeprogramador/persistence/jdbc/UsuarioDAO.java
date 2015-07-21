package br.com.fabricadeprogramador.persistence.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fabricadeprogramador.persistence.entity.Usuario;

public class UsuarioDAO {
	private Connection conexao = ConnectionFactory.getConnection();
	
	public void cadastrar(Usuario usr) {
		String sql = "INSERT INTO usuario(nome, login, senha) values(?, ?, ?)";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setString(1, usr.getNome());
			prepared.setString(2, usr.getLogin());
			prepared.setString(3, usr.getSenha());
			prepared.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void alterar(Usuario usr) {
		String sql = "UPDATE usuario set nome = ?, login = ?, senha = ? where id = ?";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setString(1, usr.getNome());
			prepared.setString(2, usr.getLogin());
			prepared.setString(3, usr.getSenha());
			prepared.setInt(4, usr.getId());
			prepared.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void excluir(Usuario usr) {
		String sql = "DELETE FROM usuario where id = ?";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setInt(1, usr.getId());
			prepared.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
