package Exerc2;

public class LampadaTeste {

	public static void main(String[] args) {
		
		
		Lampada lamp = new Lampada();
		lamp.modelo = "Postivo"; 
		lamp.nome = "Lampada Inteligente";
		
	
		
		lamp.ligada = true;
		lamp.mostrarEstado();
		lamp.mudarEstado();
		lamp.mostrarEstado();
		lamp.mudarEstado();
		lamp.mudarEstado();
	}

}
