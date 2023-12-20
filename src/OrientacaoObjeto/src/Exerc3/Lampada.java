package Exerc3;

public class Lampada {
	
	private String nome;
	private	String modelo;
	private	boolean bluetooth;
	private	boolean bateria;
	private	String cor; 
	private	double peso;
	private	boolean ligada;
	
	public Lampada(String nome, String modelo, boolean bluetooth, boolean bateria, String cor, double peso,
			boolean ligada) {
		
		this.nome = nome;
		this.modelo = modelo;
		this.bluetooth = bluetooth;
		this.bateria = bateria;
		this.cor = cor;
		this.peso = peso;
		this.ligada = ligada;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}

	public boolean isBateria() {
		return bateria;
	}

	public void setBateria(boolean bateria) {
		this.bateria = bateria;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
  public void ligar() {
        setLigada (true);
	}	
  public	void desligar() {
 		setLigada (false);
	
	}
	
  public	void mostrarEstado() {
		if (isLigada()) {
			System.out.println("A lampada está ligada!");
		}else System.out.println("A lampada está desligada!");
			
	}

 public void mudarEstado() {
		if (isLigada()) {
			desligar();
		}else ligar();
	}
	

}
