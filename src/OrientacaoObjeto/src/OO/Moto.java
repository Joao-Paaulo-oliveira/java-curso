package OO;

public class Moto {
	
	private String marca;
	private	String modelo;
	private int qtdePassageiros;
	private	double capCombustivel;
	private	double consumoCombustivel;
	
    Moto(){
    	
    }
    


	public Moto(String marca, String modelo, int qtdePassageiros, double capCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.qtdePassageiros = qtdePassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
		
		
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getQtdePassageiros() {
		return qtdePassageiros;
	}


	public void setQtdePassageiros(int qtdePassageiros) {
		this.qtdePassageiros = qtdePassageiros;
	}


	public double getCapCombustivel() {
		return capCombustivel;
	}


	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}


	public double getConsumoCombustivel() {
		return consumoCombustivel;
	}


	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}
	
	
}
