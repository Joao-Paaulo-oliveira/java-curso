package Felinos;

public class Gato extends Animal {
	
	private boolean possuiRabo;
	private boolean isDomestico;

	

	public Gato() {
	}

	public Gato(boolean possuiRabo) {
		super();
		this.possuiRabo = possuiRabo;
	}
	public Gato(String nome, String especie, boolean garrasRetrateis, boolean visaoNoturna,
			boolean comportamentoSolitario, boolean domestico) {
		super(nome, especie, garrasRetrateis, visaoNoturna, comportamentoSolitario, domestico);
	}

	public boolean isPossuiRabo() {
		return possuiRabo;
	}

	public void setPossuiRabo(boolean possuiRabo) {
		this.possuiRabo = possuiRabo;
	}
	
	public boolean euSouUmAnimal() {
		this.isDomestico = true;
	    System.out.println("Eu sou um animal domestico ");
	    return this.isDomestico();
	}

	
	

	
	public void animalDomestico() {
		System.out.println("Sou domestico");
		
	}

	public boolean euSouUmanimal() {
		
		return true;
	}


	
	
}


