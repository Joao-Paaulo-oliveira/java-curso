package Colecoes;

import java.util.HashSet;

public class Conjunto {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet<>();

        conjunto.add(1.2);
        conjunto.add("Testando");          // ADICIONANDO ELEMENTOS
        conjunto.add(true);
        conjunto.add(1);

        System.out.println("O tamanho do conjunto é " + conjunto.size());       // TAMANHO DOS ELEMENTOS

        conjunto.add(false);
        conjunto.add(85.7);
        conjunto.add('x');

        System.out.println("O tamanho do conjunto é " + conjunto.size());

        System.out.println(conjunto.remove(false));  // REMOVE ELEMENTOS
        System.out.println(conjunto);
        System.out.println(conjunto.contains('x'));   // VERIFICA SE CONTÉM O ELEMENTO

        HashSet nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);
       // conjunto.addAll(nums);   // JUNTA AS COLEÇOES
        System.out.println(conjunto.size());
        conjunto.retainAll(nums);
        System.out.println(conjunto.size());
        conjunto.clear();  // LIMPA AS COLEÇOES
        System.out.println(conjunto);


    }


}
