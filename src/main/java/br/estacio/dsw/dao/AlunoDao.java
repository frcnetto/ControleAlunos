package br.estacio.dsw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.estacio.dsw.model.Aluno;
import br.estacio.dsw.persistence.jdbc.ConnectionFactory;

public class AlunoDao {
	private Connection conexao = ConnectionFactory.getConnection();
	
	public AlunoDao(){
		
	}
	
	public boolean cadAluno(Aluno aluno){
		String sql = "INSERT INTO aluno(matricula, nome, media, calcMedia) values(?, ?, ?, ?)";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setLong(1, aluno.getMatricula());
			prepared.setString(2, aluno.getNome());
			prepared.setFloat(3, aluno.getMedia());
			prepared.setString(4, aluno.getCalcMedia().toString());
			prepared.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean updAluno(Aluno aluno){
		String sql = "UPDATE aluno SET matricula = ?, nome = ?, media = ?, calcMedia = ? WHERE matricula = ?";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setLong(1, aluno.getMatricula());
			prepared.setString(2, aluno.getNome());
			prepared.setFloat(3, aluno.getMedia());
			prepared.setString(4, aluno.getCalcMedia().toString());
			prepared.setLong(5, aluno.getMatricula());
			prepared.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public ArrayList<Aluno> cstAlunoMatricula(int matricula){
		String sql = "SELECT * FROM aluno WHERE matricula = ?";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setLong(1, matricula);
			ResultSet result = prepared.executeQuery();
			if (result != null) {
				ArrayList<Aluno> alunos = new ArrayList<Aluno>();
				while (result.next()) {
					Aluno aln = new Aluno();
					aln.setMatricula(result.getInt(1));
					aln.setNome(result.getString(2));
					aln.setMedia(result.getInt(1));
					alunos.add(aln);
				}
				return alunos;
			}
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<Aluno> cstAlunoNome(Aluno aluno){
		String sql = "SELECT * FROM aluno WHERE nome = ?";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setString(1, aluno.getNome());
			ResultSet result = prepared.executeQuery();
			ArrayList<Aluno> alunos = new ArrayList<Aluno>();
			while(result.next()){
				Aluno aln = new Aluno();
				aln.setMatricula(result.getInt(1));
				aln.setNome(result.getString(2));
				aln.setMedia(result.getInt(1));
				alunos.add(aln);
				return alunos;
			}
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<Aluno> lstAluno(Aluno aluno){
		String sql = "SELECT * FROM aluno";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			ResultSet result = prepared.executeQuery();
			if (result != null) {
				ArrayList<Aluno> alunos = new ArrayList<Aluno>();
				while (result.next()) {
					Aluno aln = new Aluno();
					aln.setMatricula(result.getInt(1));
					aln.setNome(result.getString(2));
					aln.setMedia(result.getInt(1));
					alunos.add(aln);
					return alunos;
				}
			}
			return null;
		} catch (SQLException e) {
				e.printStackTrace();
				return null;
		}
	}
	
	public boolean delAluno(Aluno aluno){
		String sql = "DELETE FROM aluno WHERE id = ?";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setLong(1, aluno.getMatricula());
			prepared.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}
