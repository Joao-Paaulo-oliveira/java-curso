package Exerc1;

public class LivroTeste {
	
	public static void main(String[] args) {
		
		
		Livro livro = new Livro();
		
		livro.nome = "Nada pode me ferir";
		livro.autor ="David Goggins";
		livro.genero = "Crescimento Pessoal";
		livro.isbn = "6555646136"; 
		livro.qtidadePagina = 320;
		livro.anoLancamento = 2023;
		
		System.out.println(livro);

		
	}
	
	
}
