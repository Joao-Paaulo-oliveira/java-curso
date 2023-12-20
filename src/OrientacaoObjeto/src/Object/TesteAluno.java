package Object;

public class TesteAluno {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Pedro");
		aluno1.setCurso("Ciencia da Computação");
		double[] notas = {5, 8, 10} ;
		aluno1.setNotas(notas);
		System.out.println(aluno1.getCurso());
		System.out.println(aluno1);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("João");
		aluno2.setCurso("Ciencia da Computação");
		double[] notas2 = {5, 8, 10} ;
		aluno2.setNotas(notas2);
		System.out.println(aluno2.getCurso());
		System.out.println(aluno2);
		
		System.out.println(aluno1.equals(aluno2));

	}

}
