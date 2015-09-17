package br.estacio.dsw.model;

import java.util.ArrayList;

public class Prova {
	private int  				id;
	private	float 				nota;
	private int   				peso;
	private ArrayList<Trabalho> trabalhos;
	private float				notaFinal;
	private Aluno 				aluno;
	
	public Prova() {
		nota = 0;
		peso = 1;
		trabalhos = new ArrayList<Trabalho>();
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
	public ArrayList<Trabalho> getTrabalhos() {
		return trabalhos;
	}
	public void adcTrabalho(Trabalho trabalho) {
		this.trabalhos.add(trabalho);
	}
	public void rmvTrabalho(Trabalho trabalho) {
		this.trabalhos.remove(trabalho);
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
