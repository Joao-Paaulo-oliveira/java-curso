package Exerc1;

public class ContatoTeste {

	public static void main(String[] args) {

		Contato contato = new Contato();
		
		contato.nome = "Mateus";
		contato.endereço = "Av Paulista";
		contato.email = "mateus@mateus.com";
		
		contato.telefone = new String[3];
		contato.telefone[0] = "99999996";
		contato.telefone[1] = "99999997";
		
		System.out.println(contato.nome);
		System.out.println(contato.endereço);
		System.out.println(contato.telefone[1]);
		System.out.println(contato.telefone[0]);
		

	}

}
