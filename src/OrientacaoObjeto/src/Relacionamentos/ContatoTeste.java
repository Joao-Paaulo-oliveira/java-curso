package Relacionamentos;

public class ContatoTeste {

	public static void main(String[] args) {
	
		
		Contato contato = new Contato();
		
		contato.setNome("Jhons"); 
		
		Endereco end = new Endereco();
		end.setRua("Rodeo Drive");
		end.setCep("665656565");
		end.setNumero("5262");
		end.setBairro("Hollywod");
		contato.setEndereco(end);
		 if (contato != null && contato.getEndereco() != null) {
	    System.out.println(contato.getEndereco().getBairro());
	    }
		 
		Telefone telefone = new Telefone();
		telefone.setTipo("Celular");
		telefone.setDdd("31");
		telefone.setCelular("9696969696");
		contato.setTelefone(telefone);
		if (contato != null && contato.getTelefone() != null) {
		System.out.println(contato.getTelefone().getDdd() + ""
		+ " " + contato.getTelefone().getCelular());
		}


	}

}
