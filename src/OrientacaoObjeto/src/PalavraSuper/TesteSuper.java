package PalavraSuper;

public class TesteSuper {
	

	public static void main(String[] args) {
		
		
		
		Professor professor = new Professor("Alice", "89898989", "alice@email.com", "123123123", 
			"Ingles", "Ingles com Alice", 10000.00000);
		System.out.println(professor.getNome());
		System.out.println(professor.getNomeCurso());
		System.out.println(professor.getSalario());
		
		
		
	}

}
