package EstruturaControle;

public class DoWhile {
    public static void main(String[] args) {

        java.util.Scanner entrada = new java.util.Scanner(System.in);

        String valor = "";

        do {       // FAÇA
                System.out.println("Você diz: ");
                valor = entrada.nextLine();
            } while (!valor.equalsIgnoreCase("Tchau")); // ENQUANTO O VALOR NÃO FOR IGUAL A "TCHAU" O PROGRAMA CONTINUA
    }
}
