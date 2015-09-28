package br.estacio.dsw.model;

public class Prova {
	private int  				id;
	private	float 				nota;
	private int   				peso;
	private float				notaFinal;
	private Aluno 				aluno;
	
	public Prova() {
		nota = 0;
		peso = 0;
		notaFinal = 0;
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
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public float getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(float notaFinal) {
		this.notaFinal = notaFinal;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
}
