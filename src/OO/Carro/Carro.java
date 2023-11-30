package OO.Carro;

public class Carro {

    String marca;
    String nome;
    int qtdadeDePassgeiro;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() {             // METODO SIMPLES SEM RETORNO
        System.out.println("A autonomia do carro é " + capCombustivel * consumoCombustivel + " por Km");
    }

    double AutonomiaCombustivel() {      // METODO COM RETORNO

        return capCombustivel * consumoCombustivel;

    }

    double calcularCombustivel(double Km) {  //METODO COM PARAMETRO
        double qtidadeCombustustivel = Km / consumoCombustivel;
        return qtidadeCombustustivel;
    }

}
