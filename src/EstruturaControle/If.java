package EstruturaControle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota: ");
        double nota = entrada.nextDouble();

        if (nota >= 9) {
            System.out.println("APROVADA!");
            System.out.println("Você é fera!");}

        if (nota >= 0  && nota <= 4) {
            System.out.println("REPROVADA!");
            System.out.println("Melhore no proximo ano!");}

        if (nota >= 5 && nota <= 8.9) {
            System.out.println("RECUPERAÇÃO!");
            System.out.println("Você tem uma nova chance!");}

        System.out.println("Fim!");

        entrada.close();
    }
}
