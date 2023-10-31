package fundamentos;

import javax.swing.*;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String a = "1202";
        String b = "5200";
        System.out.println(a + b);

        double valorN1 = Double.parseDouble(a); // CONVERSÃO DE STRING PARA NUMERO
        double valorN2 = Double.parseDouble(b);

        double soma = valorN1 + valorN2;
        System.out.println(soma);

        String valorN3 = JOptionPane.showInputDialog("DIGITE O NUMERO"); // PEGAR INFORMAÇÃO DA JANELA

    }
}
