package MetodoRetorno;

public class Carro {
	
	String marca;
	String modelo;
	int qtdePassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	double exibirAutonomia() {
		
		System.out.println("A autonimia do carro é: ");
		
		return capCombustivel * consumoCombustivel;
	}

}
