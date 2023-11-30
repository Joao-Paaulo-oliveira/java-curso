package OrientacaoObjeto;

import java.util.ArrayList;
import java.util.List;

public class Aluno {


  final String nome;
  final  List <Curso> curso = new ArrayList<>();

     Aluno(String nome) {
        this.nome = nome;}
     void adicionarCurso(Curso curso){
        this.curso.add(curso);
        curso.alunos.add(this);
    }

    @Override
    public String toString() {
        return "O meu nome é " + nome;

    }
}
