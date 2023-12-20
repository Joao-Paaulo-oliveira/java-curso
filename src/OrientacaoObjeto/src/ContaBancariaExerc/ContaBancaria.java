package ContaBancariaExerc;

public class ContaBancaria {
	
	private String NomeCliente;
	private String Numconta;
	private double saldo;

	
	
	
	public String getNomeCliente() {
		return NomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		NomeCliente = nomeCliente;
	}
	public String getNumconta() {
		return Numconta;
	}
	public void setNumconta(String numconta) {
		Numconta = numconta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public String toString() {
		String s = "Conta Bancaria";
		s += " Nome Cliente: " + NomeCliente;
		s += " Numero da Conta: " + Numconta;
		s += " Saldo: " + saldo;
		
		return s;
	}

	
	public void depositar (double valor) {
		saldo += valor;
    }
	
	public boolean sacar (double valor) {
		if ((saldo-valor) >=0) {
			saldo -= valor;
			return true;
		}
		return false;
	
	}
	
	
}