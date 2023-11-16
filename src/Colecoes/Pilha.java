package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque <String> livros = new ArrayDeque<>();

        livros.add("Harry Potter e a Predra Filosofal");
        livros.push("Harry Potter e a Camara Secreta");
        livros.push("Harry Potter e a Prisioeneiro de Azkaban");
        livros.push("Harry Potter e o Calice de Fogo");

        System.out.println(livros.peek());
        System.out.println(livros);

        System.out.println(livros.pop());
        System.out.println(livros);

        System.out.println(livros.poll());
        System.out.println(livros);

        System.out.println(livros.size());
        System.out.println(livros.contains("Harry Potter e a Predra Filosofal"));

        System.out.println(livros.isEmpty());  // Verifica se a lista esta vazia.
    }
}
