package ClassesMetodos.Produto;


import ClassesMetodos.Produto.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        //CONSTUTOR
        Produto p1 = new Produto("Computador", 2000.00);


        Produto p2 = new Produto();  //CONSTRUTOR PADRÃO
        p2.nome = "Xbox";
        p2.preco = 1500.00;

        Produto.DESCONTO = 0.50;

        Produto p3 = new Produto();
        p3.nome = "Playstation";
        p3.preco = 2500.00;




        System.out.println();

        System.out.println(p1.nome + " " + p1.precoComDesconto());
        System.out.println(p2.nome + " " + p2.precoComDesconto());
        System.out.println(p3.nome + " " + p3.precoComDesconto());

        double precoFinal1 = p1.precoComDesconto();                   // CALCULANDO O PREÇO FINAL COM DESCONTO
        double precoFinal2 = p2.precoComDesconto();
        double precoFinal3 = p3.precoComDesconto();
        double mediaCarrinho = (precoFinal1 + precoFinal2 + precoFinal3) / 3;
        String mediaCarrinhoFormatada = String.format("%.2f", mediaCarrinho);   // FORMATANDO A MEDIA COM 2 CASAS DECIMAIS
        System.out.println("Média do carrinho: R$" + mediaCarrinhoFormatada);

    }
}
