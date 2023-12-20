package MetodoSimples;

public class MetodoSimples {
	
	String marca;
	String modelo;
	int qtdePassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	
	void autonomiaCombustivel() {

		System.out.println(	"A autonomia do combustivel é: " + capCombustivel * consumoCombustivel + " Km");
		

}
}