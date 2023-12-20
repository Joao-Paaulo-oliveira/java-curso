package MetodoParametro;


public class CarroTeste {
 
	public static void main(String[] args) {
		
	    	Carro carro = new Carro();
			
			carro.marca = "Fiat";
			carro.modelo = "Uno";
			carro.qtdePassageiros = 5;
			carro.capCombustivel = 48;
			carro.consumoCombustivel = 0.125;
		
		double qtdCombustivelUno = carro.calcularCombustivel(10);
		System.out.println(qtdCombustivelUno);
		
	}
}