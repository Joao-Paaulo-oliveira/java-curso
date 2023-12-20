package MetodoRetorno;


public class CarroTeste {

	public static void main(String[] args) {
		
        Carro carro = new Carro();
		
		carro.marca = "Fiat";
		carro.modelo = "Uno";
		carro.qtdePassageiros = 5;
		carro.capCombustivel = 48;
		carro.consumoCombustivel = 0.125;
		
		double autonomiaUno = carro.exibirAutonomia();
		System.out.println(autonomiaUno);
		
		
		Carro carro2 = new Carro();
		
		carro2.marca = "Fiat";
		carro2.modelo = "Palio";
		carro2.qtdePassageiros = 5;
		carro2.capCombustivel = 47;
		carro2.consumoCombustivel = 0.0813;
		
		double autonomiaPalio = carro2.exibirAutonomia();
		System.out.println(autonomiaPalio);

	}

}
