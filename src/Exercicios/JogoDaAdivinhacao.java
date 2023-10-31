package Exercicios;
import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();              // CRIA UM OBJETO RANDOM

        int numeroAleatorio = random.nextInt(101); // GERA UM NUMERO ALEATORIO ENTRE 0 E 100
        int tentativasRestantes = 8;

        System.out.println("Bem-vindo ao Jogo da Adivinhação! Tente adivinhar um número entre 0 e 100.");

        while (tentativasRestantes > 0) {
            System.out.println("Tentativas restantes: " + tentativasRestantes);
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();

            if (palpite < 0 || palpite > 100) {
                System.out.println("Por favor, insira um número entre 0 e 100.");
                continue;
                    }

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número.");
                break;
            } else if (palpite < numeroAleatorio) {
                System.out.println("O número é maior.");
            } else {
                System.out.println("O número é menor.");
            }

            tentativasRestantes--;
        }

        if (tentativasRestantes == 0) {
                    System.out.println("Suas tentativas acabaram. O número correto era: " + numeroAleatorio);
        }

                scanner.close();
            }
        }


