package OrientacaoObjeto;

import java.util.ArrayList;

public class Compra {
    String cliente;
    ArrayList<Item> itens = new ArrayList<>();

    double obterValorCompra (){
        double total = 0;
        for (Item item: itens) {
            total += item.quantidade * item.valor;
        }
        return total;
    }

}
