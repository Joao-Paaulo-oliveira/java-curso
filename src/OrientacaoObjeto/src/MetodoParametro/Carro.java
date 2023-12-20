package MetodoParametro;


public class Carro {
	
	String marca;
	String modelo;
	int qtdePassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	
	
	double calcularCombustivel (double km ) {
	
		double qtdCombustivel = km / consumoCombustivel;
		
		return qtdCombustivel;

}
}