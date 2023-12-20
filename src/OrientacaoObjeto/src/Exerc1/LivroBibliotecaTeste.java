package Exerc1;

import java.util.Date;

public class LivroBibliotecaTeste {

	public static void main(String[] args) {
	
		LivroBlibioteca livro = new LivroBlibioteca();
		
		livro.nome = "Nada pode me ferir";
		livro.autor ="David Goggins";
		livro.genero = "Crescimento Pessoal";
		livro.isbn = "6555646136"; 
		livro.qtidadePagina = 320;
		livro.anoLancamento = 2023;
	    livro.emprestado = true;
	    livro.dataEntrega = new Date();
	    livro.emprestaA = "João";
	    
		
}
}