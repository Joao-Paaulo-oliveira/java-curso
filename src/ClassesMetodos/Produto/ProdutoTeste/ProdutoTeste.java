package ClassesMetodos.Produto.ProdutoTeste;


public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Computador";
        p1.preco = 2000.00;
        p1.desconto = 0.30;

        Produto p2 = new Produto();
        p2.nome = "Xbox";
        p2.preco = 1500.00;
        p2.desconto = 0.20;

        Produto p3 = new Produto();
        p3.nome = "Playstation";
        p3.preco = 2500.00;
        p3.desconto = 0.10;



        System.out.println();

        System.out.println(p1.nome);
        System.out.println(p2.nome);
        System.out.println(p3.nome);

        double precoFinal1 = p1.precoComDesconto(0);                   // CALCULANDO O PREÇO FINAL COM DESCONTO
        double precoFinal2 = p2.precoComDesconto(0);
        double precoFinal3 = p3.precoComDesconto(0);
        double mediaCarrinho = (precoFinal1 + precoFinal2 + precoFinal3) / 3;
        String mediaCarrinhoFormatada = String.format("%.2f", mediaCarrinho);   // FORMATANDO A MEDIA COM 2 CASAS DECIMAIS
        System.out.println("Média do carrinho: R$" + mediaCarrinhoFormatada);

    }
}
