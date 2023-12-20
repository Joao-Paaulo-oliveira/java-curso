package Felinos;

public class TesteAnimal {
	
	public static void main(String[] args) {
		
	
		Lobo lobo = new Lobo();
		lobo.setNome("Guara");
		lobo.setComportamentoSolitario(false);
		lobo.setDomestico(false);
		lobo.setCorPelagem("Marrom");
		lobo.setEspecie("Guará");
		lobo.setGarrasRetrateis(true);
		
		
		 System.out.println(lobo);
	    
	    lobo.animalDomestico();
		
	
	}

}