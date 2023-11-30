package OO.Lampada;

public class Lampada {

    String nome;
    String marca;
    double volts;
    double peso;
    boolean ligada;

    public Lampada() {
    }

    public Lampada(String nome, String marca, double volts, double peso, boolean ligada) {
        this.nome = nome;
        this.marca = marca;
        this.volts = volts;
        this.peso = peso;
        this.ligada = ligada;
    }

    void ligar(){
        ligada = true;
    }
    void desligar(){
        ligada = false;
    }

    void mostrarEstado (){
        if (ligada){
            System.out.println("Lampada está ligada");
        } else {
            System.out.println("Lampada está desligada");
        }
    }
    void mudarEstado(){
        if (ligada){
            desligar();
        } else {
            ligar();
        }
    }
}

