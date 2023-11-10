package Arrays;

import java.util.Scanner;
 // PROGRAMA COLETA A QUANTIDADE DE ALUNOS E QUANTIDADE DE NOTAS, CALCULA E RETORNA A MÉDIA.
public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantidade de alunos: ");
        int qtdadeAlunos = entrada.nextInt();

        System.out.println("Quantas notas por aluno?");
        int qtadadeNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[qtdadeAlunos][qtadadeNotas];

          double total = 0;

        for (int i=0; i < notasDaTurma.length; i++) {
            for (int j=0; j < notasDaTurma[i].length; j++) {

                System.out.printf("Informe a nota %d do aluno %d: ", i + 1, j + 1);

                notasDaTurma[i][j] = entrada.nextDouble();
                total += notasDaTurma[i][j];
            }
        }
        double media = total / (qtdadeAlunos * qtadadeNotas);
        System.out.println("A média da turma é: " + media);

        entrada.close();
    }
}
