package ContaBancariaExerc;

public class ContaTeste {
	
	public static void main(String[] args) {

		System.out.println("Bem Vindo a Sua Conta!");
		
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Cliente Conta Poupança");
		contaPoupanca.setNumconta("222222");
	
		
		contaPoupanca.depositar(150);
		contaPoupanca.depositar(250);
	    System.out.println(contaPoupanca);
	    contaPoupanca.setDiaRendimento(20);
	    
	    if (contaPoupanca.calculaNovoSaldo(0.3)) {
	    	System.out.println("Seu novo saldo é " + contaPoupanca.getSaldo());
	    }  else {
	    	System.out.println("Hoje não é dia de Rendimento, seu saldo é " + contaPoupanca.getSaldo());
	    };
	    
	
	}
	
	
		private static void realizarSaque(ContaBancaria conta, double valor){
			if (conta.sacar(valor)) {
				System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
			} else { 
				System.out.println("Saldo insuficiente para saque, o seu saldo é " + conta.getSaldo());
			}
			
	}
	
}
