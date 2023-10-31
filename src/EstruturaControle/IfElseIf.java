package EstruturaControle;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a sua idade:");
        int idade = entrada.nextInt();

        if (idade < 10) {
            System.out.println("Você é uma criança.");
        } else if (idade > 10 && idade <= 18) {
            System.out.println("Você é um adolescente.");
        } else if (idade > 18 && idade <= 30) {
            System.out.println("Você é um jovem.");
        } else if (idade > 30 && idade <= 50) {
            System.out.println("Você é um adulto.");
        } else {
            System.out.println("Você é um idoso.");

        }

        System.out.println("Fim do programa.");
    }
}
