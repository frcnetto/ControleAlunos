package br.estacio.dsw.model;

public class Trabalho {
	private int	  id;
	private float nota;
	private float notaMaxima;
	private Aluno   aluno;
	
	public Trabalho(){
		nota = 0;
		notaMaxima = 0;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public float getNota() {
		return nota;
	}
	
	public void setNota(float nota) {
		this.nota = nota;
	}

	public float getNotaMaxima() {
		return notaMaxima;
	}

	public void setNotaMaxima(float notaMaxima) {
		this.notaMaxima = notaMaxima;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
}