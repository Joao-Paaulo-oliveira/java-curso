package Felinos;

public class Lobo extends Animal {
	
	private String corPelagem;
	private boolean olfatoApurado;
	private boolean isDomestico;
	
	public Lobo() {
		super();
		}

	public Lobo(String nome, String especie, boolean garrasRetrateis, boolean visaoNoturna,
			boolean comportamentoSolitario, boolean domestico) {
		super(nome, especie, garrasRetrateis, visaoNoturna, comportamentoSolitario, domestico);
		 this.corPelagem = corPelagem;
		 this.olfatoApurado = olfatoApurado;
	}

	public String getCorPelagem() {
		return corPelagem;
	}

	public void setCorPelagem(String corPelagem) {
		this.corPelagem = corPelagem;
	}

	public boolean isOlfatoApurado() {
		return olfatoApurado;
	}

	public void setOlfatoApurado(boolean olfatoApurado) {
		this.olfatoApurado = olfatoApurado;
	}
	
	
	public boolean euSouUmAnimal() {
	    this.isDomestico = false;
	    System.out.println("Não sou um animal domestico ");
	    return this.isDomestico();
	}


	public String toString() {
		return "Lobo [corPelagem=" + corPelagem + ", olfatoApurado=" + olfatoApurado + ", isDomestico=" + isDomestico
				+ ", getCorPelagem()=" + getCorPelagem() + ", isOlfatoApurado()=" + isOlfatoApurado()
				+ ", euSouUmAnimal()=" + euSouUmAnimal() + ", getNome()=" + getNome() + ", getEspecie()=" + getEspecie()
				+ ", isGarrasRetrateis()=" + isGarrasRetrateis() + ", isVisaoNoturna()=" + isVisaoNoturna()
				+ ", isComportamentoSolitario()=" + isComportamentoSolitario() + ", isDomestico()=" + isDomestico()
				+ ", euSouUmanimal()=" + euSouUmanimal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	


	public void animalDomestico() {
		System.out.println("Não sou um animal domestico");
		
	}


	public boolean euSouUmanimal() {
	
		return false;
	}
	
	
	
}

	
	
	
	
	


