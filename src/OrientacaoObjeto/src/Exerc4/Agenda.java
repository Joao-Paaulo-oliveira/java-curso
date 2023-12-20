package Exerc4;

public class Agenda {
	
	private String nome;
	private Contato[] contato;
	

	public Agenda(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contato[] getContato() {
		return contato;
	}

	public void setContato(Contato[] contato) {
		this.contato = contato;
	}
	
	public String obterInfo() {
		String info = "Nome = " + nome + "\n";
		if (contato != null) {
			for (Contato c : contato) {
				info += c.obterInfo();
				
			}
		}
		
		return info;
	}
	

}
