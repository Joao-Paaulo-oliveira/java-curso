package fundamentos;

import java.util.Scanner;

public class DesafioModulo {
    public static void main(String[] args) {
     // CRIAR UM PROGRAMA QUE RECEBA DOIS NÚMEROS E UM OPERADOR E FAÇA A OPERAÇÃO

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = entrada.nextDouble();
        System.out.print("Digite o operador: ");
        String operador = entrada.next();

        double resultado = "+".equals(operador) ? num1 + num2 : 0;
        resultado = "-".equals(operador) ? num1 - num2 : resultado;
        resultado = "*".equals(operador) ? num1 * num2 : resultado;
        resultado = "/".equals(operador) ? num1 / num2 : resultado;
        resultado = "%".equals(operador) ? num1 % num2 : resultado;

        System.out.printf("%.1f %s %.1f = %.1f", num1, operador, num2, resultado);


}
}

