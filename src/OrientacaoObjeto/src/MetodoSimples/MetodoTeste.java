package MetodoSimples;

public class MetodoTeste {

	public static void main(String[] args) {
		
		MetodoSimples carro = new MetodoSimples();
		
		carro.marca = "Fiat";
		carro.modelo = "Uno";
		carro.qtdePassageiros = 5;
		carro.capCombustivel = 48;
		carro.consumoCombustivel = 0.125;
		
		
		System.out.println("O carro é " + carro.modelo);
		carro.autonomiaCombustivel();
		
		
				
				

	}

}
