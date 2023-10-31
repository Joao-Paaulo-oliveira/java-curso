package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {
        int a = 12;
        double b = a;          // CONVERSÃO IMPLICITA
        System.out.println(a);

        double c = 12.6;
        int d = (int) c;      // CONVERSÃO EXPLICITA  (CAST)
        System.out.println(c);


        double e = 15.454;
        int f = (int) e;      // CONVERSÃO EXPLICITA (CAST)
        System.out.println(e);

        // DO MAIOR PARA O MENOR (BYTE > SHORT > INT > LONG > FLOAT > DOUBLE)
    }
}
