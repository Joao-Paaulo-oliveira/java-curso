package EstruturaControle;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Informe um número: ");
        int numeroInt = Integer.parseInt(numero);

        if (numeroInt % 2 == 0) {
            System.out.println("O número " + numeroInt + " é par.");
        } else {
            System.out.println("O número " + numeroInt + " é ímpar.");
        }
    }
}