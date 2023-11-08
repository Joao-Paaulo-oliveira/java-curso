package ClassesMetodos.DesafioModulo;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }
    void comer (Comida comida){
        if (comida != null){
            this.peso += comida.peso;
        }

        }
    String apresentar () {
        return "Olá meu nome é" + nome + "e tenho o peso " + peso + " Kgs.";
    }

     String  estouSatisfeito (){
        if (peso >= 100) {
            return "Estou Satisfeito";
        }
         return "Quero Mais";
     }
}
