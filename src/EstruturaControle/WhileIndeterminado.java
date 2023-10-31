package EstruturaControle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String valor = "";

        while (!valor.equalsIgnoreCase("Tchau")) { // ENQUANTO O VALOR NÃO FOR IGUAL A "TCHAU" O PROGRAMA CONTINUA
            System.out.println("Você diz: ");
            valor = entrada.nextLine();
        }
    }
}
