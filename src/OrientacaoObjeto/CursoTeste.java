package OrientacaoObjeto;

public class CursoTeste {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Pedro");
        Aluno aluno2 = new Aluno("Victor");
        Aluno aluno3 = new Aluno("João Otavio");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("React Native");
        Curso curso3 = new Curso("Golang");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno3);
        curso2.adicionarAluno(aluno1);

        curso3.adicionarAluno(aluno3);
        curso3.adicionarAluno(aluno2);

        for (Aluno aluno: curso1.alunos){
            System.out.println("Estou matriculado no curso de " + curso1 + " " +
                    "e meu nome é " + aluno.nome);

        }

        for (Aluno aluno: curso2.alunos){
            System.out.println("Estou matriculado no curso de " + curso2 + " " +
                    "e meu nome é " + aluno.nome);
        }

        for (Aluno aluno: curso3.alunos){
            System.out.println("Estou matriculado no curso de " + curso3 + " " +
                    "e meu nome é " + aluno.nome);
        }

        System.out.println(aluno1.curso.get(0).alunos);
    }
}
