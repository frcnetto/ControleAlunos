package br.estacio.dsw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.estacio.dsw.model.Prova;
import br.estacio.dsw.model.Trabalho;
import br.estacio.dsw.persistence.jdbc.ConnectionFactory;

public class ProvaDao {
	private Connection conexao = ConnectionFactory.getConnection();
	
	public ProvaDao(){
		
	}
	
	public boolean cadProva(Prova prova){
		String sql = "INSERT INTO prova(nota, peso, notaFinal) values(?, ?, ?)";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setFloat(1, prova.getNota());
			prepared.setInt(2, prova.getPeso());			
			prepared.setFloat(3, prova.getNotaFinal());
			prepared.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean updProva(Prova prova){
		String sql = "UPDATE prova SET nota = ?, peso = ?, notafinal = ? WHERE id = ?";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setFloat(1, prova.getNota());
			prepared.setInt(2, prova.getPeso());
			prepared.setFloat(3, prova.getNotaFinal());
			prepared.setInt(4, prova.getId());
			prepared.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Prova cstProvaId(int id){
		String sql = "SELECT * FROM prova WHERE id = ?";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setInt(1, id);
			ResultSet result = prepared.executeQuery();
			if(result != null){
				return (Prova) result.getObject(1);
			}
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<Prova> lstProva(){
		String sql = "SELECT * FROM prova";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			ResultSet result = prepared.executeQuery();
			if(result != null){
				ArrayList<Prova> provas = new ArrayList<Prova>();
				AlunoDao alunoDao = new AlunoDao();
				while(result.next()){
					Prova prv = new Prova();
					prv.setId(result.getInt(1));
					prv.setNota(result.getFloat(2));
					prv.setPeso(result.getInt(3));
					prv.setNotaFinal(result.getFloat(4));
					provas.add(prv);
				}
				return provas;
			}
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean delProva(Prova prova){
		String sql = "DELETE FROM prova WHERE id = ?";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setInt(1, prova.getId());
			prepared.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}
