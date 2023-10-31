package ClassesMetodos.Produto.ProdutoTeste;

public class Produto {
    String nome;
    Double preco;
    double desconto;

    double precoComDesconto ( double descontoDoGerente) {
        return preco * (1 - desconto);
    }


}
