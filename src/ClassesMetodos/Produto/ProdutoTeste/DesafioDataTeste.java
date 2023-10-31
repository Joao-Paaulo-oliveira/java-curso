package ClassesMetodos.Produto.ProdutoTeste;

public class DesafioDataTeste {
    public static void main(String[] args) {

        DesafioData data = new DesafioData();

        data.dia = 06;
        data.mes = "Maio";
        data.ano = 1992;


        System.out.printf("%d/%s/%.0f", data.dia, data.mes,data.ano);

    }
}
