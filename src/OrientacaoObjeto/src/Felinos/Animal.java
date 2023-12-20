package Felinos;

public abstract class Animal{
	
	    private String nome;
	    private String especie;
	    private boolean garrasRetrateis;
	    private boolean visaoNoturna;
	    private boolean comportamentoSolitario;
	    private boolean domestico;
		
	    public Animal() {
			super();
			}

		public Animal(String nome, String especie, boolean garrasRetrateis, boolean visaoNoturna,
				boolean comportamentoSolitario, boolean domestico) {
			super();
			this.nome = nome;
			this.especie = especie;
			this.garrasRetrateis = garrasRetrateis;
			this.visaoNoturna = visaoNoturna;
			this.comportamentoSolitario = comportamentoSolitario;
			this.domestico = domestico;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEspecie() {
			return especie;
		}

		public void setEspecie(String especie) {
			this.especie = especie;
		}

		public boolean isGarrasRetrateis() {
			return garrasRetrateis;
		}

		public void setGarrasRetrateis(boolean garrasRetrateis) {
			this.garrasRetrateis = garrasRetrateis;
		}

		public boolean isVisaoNoturna() {
			return visaoNoturna;
		}

		public void setVisaoNoturna(boolean visaoNoturna) {
			this.visaoNoturna = visaoNoturna;
		}

		public boolean isComportamentoSolitario() {
			return comportamentoSolitario;
		}

		public void setComportamentoSolitario(boolean comportamentoSolitario) {
			this.comportamentoSolitario = comportamentoSolitario;
		}

		public boolean isDomestico() {
			return domestico;
		}

		public void setDomestico(boolean domestico) {
			this.domestico = domestico;
		}
	    
	    public abstract boolean euSouUmanimal();
	    public abstract void animalDomestico();

}