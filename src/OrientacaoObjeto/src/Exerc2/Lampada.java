package Exerc2;

public class Lampada {
	
	String nome;
	String modelo;
	boolean bluetooth;
	boolean bateria;
	String cor; 
	double peso;
	boolean ligada;
	
	void ligar() {
           ligada = true;
	}	
	void desligar() {
		ligada = false;
	
	}
	
	void mostrarEstado() {
		if (ligada) {
			System.out.println("A lampada está ligada!");
		}else System.out.println("A lampada está desligada!");
			
	}

	void mudarEstado() {
		if (ligada) {
			desligar();
		}else ligar();
	}
}