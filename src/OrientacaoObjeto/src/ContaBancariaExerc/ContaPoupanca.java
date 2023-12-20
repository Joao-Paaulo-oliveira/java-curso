package ContaBancariaExerc;

import java.util.Calendar;

public class ContaPoupanca   extends ContaBancaria {
	
	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}


	public String toString() {
		String s = "Conta Poupança";
		s += " Dia Rendimento:" + diaRendimento;
		s +=  super.toString();
			return s;				
}
	
	public boolean calculaNovoSaldo(double taxaRendimento) {
		Calendar hoje = Calendar.getInstance();
		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
		    this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
		    return true;
		}
		
		return false;
	}
}