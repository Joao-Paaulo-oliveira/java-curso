package ClassesMetodos.DesafioModulo;

public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida("arroz", 0.180);
        Comida c2 = new Comida ("feijão", 0.300);
        Comida c3 = new Comida("carne", 0.200);

        Pessoa p1 = new Pessoa(" Kikão ", 99.00);
        p1.comer(c3);
        p1.comer(c2);
        p1.comer(c3);
        p1.comer(c2);



        System.out.println(p1.apresentar() + "\n" + p1.estouSatisfeito());


    }
}
