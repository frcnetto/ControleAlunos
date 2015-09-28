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
		String sql = "INSERT INTO aluno(nome, nota, media) values(?, ?, ?)";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setString(1, aluno.getNome());
			prepared.setFloat(2, aluno.getNota());
			prepared.setInt(3, aluno.getMedia().getId());
			prepared.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean updAluno(Aluno aluno){
		String sql = "UPDATE aluno SET nome = ?, media = ?, nota = ? WHERE matricula = ?";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setString(1, aluno.getNome());
			prepared.setInt(2, aluno.getMedia().getId());
			prepared.setFloat(3, aluno.getNota());
			prepared.setLong(4, aluno.getMatricula());
			prepared.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Aluno cstAlunoMatricula(int matricula){
		String sql = "SELECT * FROM aluno WHERE matricula = ?";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			prepared.setLong(1, matricula);
			ResultSet result = prepared.executeQuery();
			if (result.next()) {
				Aluno aln = new Aluno();
				aln.setMatricula(result.getInt(1));
				aln.setNome(result.getString(2));
				aln.setNota(result.getInt(1));
				return aln;
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
				aln.setNota(result.getInt(1));
				alunos.add(aln);
				return alunos;
			}
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<Aluno> lstAluno(){
		String sql = "SELECT * FROM aluno";
		try (PreparedStatement prepared = conexao.prepareStatement(sql)){
			ResultSet result = prepared.executeQuery();
			if (result != null) {
				ArrayList<Aluno> alunos = new ArrayList<Aluno>();
				while (result.next()) {
					Aluno aln = new Aluno();
					aln.setMatricula(result.getInt(1));
					aln.setNome(result.getString(2));
					aln.setNota(result.getInt(3));
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
	
	public boolean delAluno(Aluno aluno){
		String sql = "DELETE FROM aluno WHERE matricula = ?";
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
