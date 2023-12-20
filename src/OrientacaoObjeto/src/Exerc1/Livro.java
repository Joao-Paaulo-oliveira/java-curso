package Exerc1;

public class Livro {
	
	String nome;
	String genero;
	String autor;
	String isbn;
	int anoLancamento;
	int qtidadePagina;
	@Override
	public String toString() {
		return "nome=" + nome + ""
				+ ", genero=" + genero + ""
						+ ", autor=" + autor + ""
								+ ", isbn=" + isbn + ""
										+ ", anoLancamento="+ anoLancamento + ""
						                  + ", qtidadePagina=" + qtidadePagina + "]";
	}
	
	
	

}
