package OO;

public class MotoTeste {
	
	public static void main(String[] args) {
		
		
		Moto XT660 = new Moto("Yamaha", "XT660", 2, 10, 1/23);
		Moto lander = new Moto("Yamaha", "Lander", 2, 10, 0.23);
		
		System.out.println(XT660.getMarca());
		System.out.println(XT660.getModelo());
		
		System.out.println(lander.getModelo());
		System.out.println(lander.getMarca());
		
		
		
		
	

}
}