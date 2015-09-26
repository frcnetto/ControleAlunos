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
		String sql = "INSERT INTO prova(nota, peso, notaFinal, aluno) values(?, ?, ?)";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setFloat(1, prova.getNota());
			prepared.setInt(2, prova.getPeso());
			
			if(!prova.getTrabalhos().isEmpty()){
				TrabalhoDao trabalhoDao = new TrabalhoDao();
				for(Trabalho trabalho : prova.getTrabalhos()){
					trabalhoDao.cadTrabalho(trabalho);
				}
			}
			
			prepared.setFloat(3, prova.getNotaFinal());
			prepared.setInt(4, prova.getAluno().getMatricula());
			prepared.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean updProva(Prova prova){
		String sql = "UPDATE prova SET nota = ?, peso = ?, aluno = ? WHERE id = ?";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setFloat(1, prova.getNota());
			prepared.setInt(2, prova.getPeso());
			prepared.setLong(3, prova.getAluno().getMatricula());
			prepared.setInt(4, prova.getId());
			prepared.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public ArrayList<Prova> cstProvaId(int id){
		String sql = "SELECT * FROM prova WHERE id = ?";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setInt(1, id);
			ResultSet result = prepared.executeQuery();
			if(result != null){
				ArrayList<Prova> provas = new ArrayList<Prova>();
				AlunoDao alunoDao = new AlunoDao();
				while(result.next()){
					Prova prv = new Prova();
					prv.setId(result.getInt(1));
					prv.setNota(result.getFloat(2));
					prv.setPeso(result.getInt(3));
					prv.setAluno(alunoDao.cstAlunoMatricula(result.getInt(4)).get(1));
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
					prv.setAluno(alunoDao.cstAlunoMatricula(result.getInt(4)).get(1));
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
