package Colecoes;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        HashSet<String> listaUm = new HashSet();  // LISTA HOMOGENEA DE STRING
        listaUm.add("Ana");
        listaUm.add("Maria Laura");
        listaUm.add("Pedro");
        listaUm.add("Davi");
        listaUm.add("Victor");
        listaUm.add("João");

        for (String aprovados : listaUm) {
            System.out.println(aprovados);
        }

        System.out.println("-------------------------------");

        SortedSet<String> listaDois = new TreeSet<>();  // LISTA HOMOGENEA ORDENADA

        listaDois.add("Ana");
        listaDois.add("Maria Laura");
        listaDois.add("Pedro");
        listaDois.add("Davi");
        listaDois.add("Victor");
        listaDois.add("João");


        for (String aprovados : listaDois) {
            System.out.println(aprovados);

        }

        TreeSet <Integer> nums = new TreeSet <>(); // LISTA ORDENADA HOMOGENEA DE INTEIROS
        nums.add(2);
        nums.add(6);
        nums.add(7);
        nums.add(23);

        for (int numeros : nums) {
            System.out.println(numeros);
    }

}}