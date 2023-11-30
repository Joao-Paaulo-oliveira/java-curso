package OrientacaoObjeto;

public class CompraTeste {

    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.cliente = "Nana";
        compra1.itens.add(new Item("Caneta", 2, 4.60));
        compra1.itens.add(new Item("Caderno", 1, 8.50));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.obterValorCompra());

    }
}
