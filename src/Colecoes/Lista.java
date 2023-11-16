package Colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList <Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana Livia");
        lista.add(u1);
        lista.add(new Usuario("Pedro"));
        lista.add(new Usuario("Maria Laura"));
        lista.add(new Usuario("Victor"));
        lista.add(new Usuario("Davi"));
        lista.add(new Usuario("João Otavio"));

        System.out.println(lista.get(4));  //LISTA PODE ACESSAR PELO INDICE

        for (Usuario u: lista){
            System.out.println(u.nome);

        }
    }
}
