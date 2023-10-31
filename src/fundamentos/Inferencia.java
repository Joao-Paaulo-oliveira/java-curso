package fundamentos;

public class Inferencia {
    public static void main(String[] args) {

        double a = 4.5;
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);

        var c = "Texto";         // Inferencia de tipo 'var' tem que ser inicializda na mesma linha
        System.out.println(c);

        c = "Outro texto";       // 'var' não aceita mudança de tipo String para int
        c = "feijao";
        System.out.println(c);

        var d = 4;
       // d = 2.1;               // 'var' não aceita mudança de tipo 'int' para double
                                 // mas aceita double para 'int'

    }
}
