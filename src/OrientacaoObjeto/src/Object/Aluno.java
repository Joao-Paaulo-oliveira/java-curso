package Object;

import java.util.Arrays;

public class Aluno {
	
	private String nome;
	private String curso;
	private double[] notas;
	
	
	public Aluno() {}
	
	
	public Aluno(String nome, double[] notas) {
	
		this.nome = nome;
		this.notas = notas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	@Override
	public String toString() {
		return "nome=" + nome + ", curso=" + curso + ", notas=" + Arrays.toString(notas)  ;
	}



	
	
}
