package fundamentos;

import java.util.Scanner;

public class TipoConsole {
    public static void main(String[] args) {
        System.out.print("Bom");   // SEM QUEBRA DE LINHA
        System.out.print(" dia!\n");
        System.out.println("Bom"); // COM QUEBRA DE LINHA
        System.out.println("dia!");

        System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6); // PRINTF = PRINT FORMATED
        System.out.printf("Salário: %.2f%n", 1234.5678);
        System.out.printf("Nome: %s%n","João");

        Scanner entrada = new Scanner(System.in);  // CRIANDO UM OBJETO DO TIPO SCANNER
        System.out.println("Digite seu nome: ");  // PEDINDO PARA O USUÁRIO DIGITAR ALGO
        String nome = entrada.nextLine();        // RECEBENDO O QUE O USUÁRIO DIGITOU
        System.out.printf("Digite seu sobrenome:");
        String sobrenome = entrada.nextLine();
        System.out.printf("Digite sua idade:");
        int idade = entrada.nextInt();          // RECEBENDO UM INTEIRO
        System.out.printf("Digite sua altura:");
        double altura = entrada.nextDouble();   // RECEBENDO UM DOUBLE









    }
}
