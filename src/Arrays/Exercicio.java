package Arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunosA = new double[3];

        notasAlunosA[0] = 5.6;
        notasAlunosA[1] = 9.8;
        notasAlunosA[2] = 7.0;

        System.out.println(Arrays.toString(notasAlunosA));

        double total = 0;
        for(int i =0; i < notasAlunosA.length; i++){
            total += notasAlunosA[i];
        }
        System.out.println(total / notasAlunosA.length);


        double matematica = 6.5;

        double[] notasAlunoB = {2.1,7.4,matematica};

        System.out.println(Arrays.toString(notasAlunoB));

        double totalB = 0;
        for(int i =0; i < notasAlunoB.length; i++){
            totalB += notasAlunoB[i];
    }
        System.out.println(totalB/notasAlunoB.length);

    }

}
