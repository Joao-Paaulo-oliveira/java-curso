package AbstratasEInterface;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao{
	
	private String raca;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	
	public void amamentar() {
	
		
	}


	public void emitirSom() {
		
	}

	@Override
	public void levarVeterinario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void darComida() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void levarPasser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void brincar() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
