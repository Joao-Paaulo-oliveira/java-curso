package PalavraSuper;

public class Aluno extends Pessoa {
	
	private String curso;
	private double notas;
	
	public Aluno(){
		
	}
	
	public double calcularMedia() {
		return 0;
	}

	public boolean verificarAprovado() {
		return true;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double getNotas() {
		return notas;
	}

	public void setNotas(double notas) {
		this.notas = notas;
	}
		
	

	public Aluno(String nome, String telefone, String email, String cpf, String curso, double notas) {
		super(nome, telefone, email, cpf);
		this.curso = curso;
		this.notas = notas;
	}

	
	
}
