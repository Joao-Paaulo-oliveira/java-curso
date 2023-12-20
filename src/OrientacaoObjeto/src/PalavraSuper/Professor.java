package PalavraSuper;

public class Professor extends Pessoa {
	
	private String departamento;
	private String nomeCurso;
	private double salario;
	
	
	Professor(){
		}
	

	public Professor(String nome, String telefone, String email, String cpf, String departamento, String nomeCurso,
			double salario) {
		super(nome, telefone, email, cpf);
		this.departamento = departamento;
		this.nomeCurso = nomeCurso;
		this.salario = salario;
	}



	public String getDepartamento() {
		return departamento;
	}




	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}




	public String getNomeCurso() {
		return nomeCurso;
	}




	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}




	public double getSalario() {
		return salario;
	}




	public void setSalario(double salario) {
		this.salario = salario;
	}




	public double calcularSalario() {
		return salario;
		}

}
