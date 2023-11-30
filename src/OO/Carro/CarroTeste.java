package OO.Carro;



public class CarroTeste {
    public static void main(String[] args) {
        Carro uno = new Carro();
        uno.marca = "Fiat";
        uno.nome = "Uno";
        uno.qtdadeDePassgeiro = 5;
        uno.capCombustivel = 48;
        uno.consumoCombustivel = 0.3;

        uno.exibirAutonomia();

        double exibir = uno.AutonomiaCombustivel();

        System.out.printf( "%.2f",exibir);
        System.out.println();

        double qtidadeCombustivel5 = (int) uno.calcularCombustivel(5);
        double qtidadeCombustivel10 = (int) uno.calcularCombustivel(10);
        System.out.println("A quatidade é " + qtidadeCombustivel5);
        System.out.println("A quatidade é " + qtidadeCombustivel10);

    }
}
