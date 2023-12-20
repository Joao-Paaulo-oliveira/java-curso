package Exerc3;


public class LampadaTeste {
	
	public static void main(String[] args) {
		
		Lampada lamp = new Lampada(null, null, false, false, null, 0, false);
		
		lamp.mudarEstado();
		lamp.mostrarEstado();
		lamp.mudarEstado();
		lamp.mudarEstado();
		lamp.desligar();
		lamp.mostrarEstado();
		
	
	}

}
