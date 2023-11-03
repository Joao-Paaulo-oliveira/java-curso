package ClassesMetodos.Produto.ProdutoTeste;

public class Produto {
    String nome;
    Double preco;
    double desconto;

    Produto (){}
     Produto (String nomeInicial, Double precoinicial,
              double descontoInicial) {
        nome = nomeInicial;
        preco = precoinicial;
        desconto = descontoInicial;

     }
    double precoComDesconto ( double descontoDoGerente) {
        return preco * (1 - desconto);
    }


}
