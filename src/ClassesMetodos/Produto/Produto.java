package ClassesMetodos.Produto;

public class Produto {
    String nome;
    Double preco;
  static double DESCONTO = 0.25;

    Produto (){}
     Produto (String nomeInicial, Double precoinicial) {
        nome = nomeInicial;
        preco = precoinicial;


     }
    double precoComDesconto () {
        return preco * (1 - DESCONTO);
    }


}
