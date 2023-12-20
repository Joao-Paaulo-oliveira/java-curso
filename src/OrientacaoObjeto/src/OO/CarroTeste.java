package OO;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro fusca = new Carro();
		
		fusca.marca = " Volkswagen";
	    fusca.modelo = "Fusca 2023";
		fusca.qtdePassageiros = 4;
	    fusca.capCombustivel = 55;
	    fusca.consumoCombustivel = 0.19;
	    
	    Carro van = new Carro();
	    
	    van.marca = " Fiat ";
	    van.modelo = "Ducato";
	    van.qtdePassageiros = 19;
	    van.capCombustivel = 90;
	    van.consumoCombustivel = 0.35;
		
	    System.out.println(van);
	}

}
