package ClassesMetodos.Produto.ProdutoTeste;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data(06,"Maio", 1992);
        String dataFormatada = String.format("%d %s %d", d1.dia, d1.mes, d1.ano);
        System.out.println(dataFormatada);

        Data d2 = new Data();
        d2.dia = 01;
        d2.mes = "Janeiro";
        d2.ano = 1970;
        String dataFormatada2 = String.format("%d %s %d", d2.dia, d2.mes, d2.ano);
        System.out.println(dataFormatada2);
    }
}
