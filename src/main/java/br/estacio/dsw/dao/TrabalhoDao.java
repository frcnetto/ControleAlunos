package br.estacio.dsw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.estacio.dsw.model.Trabalho;
import br.estacio.dsw.persistence.jdbc.ConnectionFactory;

public class TrabalhoDao {
	private Connection conexao = ConnectionFactory.getConnection();
	
	public TrabalhoDao(){
		
	}
	
	public boolean cadTrabalho(Trabalho trabalho){
		String sql = "INSERT INTO trabalho(nota, trabalho) values(?, ?)";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setFloat(1, trabalho.getNota());
			prepared.setInt(2, trabalho.getProva().getId());
			prepared.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean updTrabalho(Trabalho trabalho){
		String sql = "UPDATE trabalho SET nota = ?, trabalho = ? WHERE id = ?";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setFloat(1, trabalho.getNota());
			prepared.setInt(2, trabalho.getProva().getId());
			prepared.setInt(3, trabalho.getId());
			prepared.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public ArrayList<Trabalho> cstTrabalhoId(Trabalho trabalho){
		String sql = "SELECT * FROM trabalho WHERE id = ?";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setInt(1, trabalho.getId());
			ResultSet result = prepared.executeQuery();
			if(result != null){
				ArrayList<Trabalho> trabalhos = new ArrayList<Trabalho>();
				ProvaDao provaDao = new ProvaDao();
				while(result.next()){
					Trabalho tbl = new Trabalho();
					tbl.setId(result.getInt(1));
					tbl.setNota(result.getFloat(2));
					tbl.setProva(provaDao.cstProvaId(result.getInt(3)).get(1));
					trabalhos.add(tbl);
				}
				return trabalhos;
			}
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<Trabalho> lstTrabalho(){
		String sql = "SELECT * FROM trabalho";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			ResultSet result = prepared.executeQuery();
			if(result != null){
				ArrayList<Trabalho> trabalhos = new ArrayList<Trabalho>();
				ProvaDao provaDao = new ProvaDao();
				while(result.next()){
					Trabalho tbl = new Trabalho();
					tbl.setId(result.getInt(1));
					tbl.setNota(result.getFloat(2));
					tbl.setProva(provaDao.cstProvaId(result.getInt(3)).get(1));
					trabalhos.add(tbl);
				}
				return trabalhos;
			}
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean delTrabalho(Trabalho trabalho){
		String sql = "DELETE FROM trabalho WHERE id = ?";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setFloat(1, trabalho.getId());
			prepared.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}
