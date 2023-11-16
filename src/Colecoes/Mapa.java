package Colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map <Integer, String> usuarios = new HashMap<>();

        usuarios.put(1 ,"Fer ");
        usuarios.put(2 ,"Ror ");
        usuarios.put(3 ,"Nanda ");
        usuarios.put(4 ,"Gil ");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(3));
        System.out.println(usuarios.containsValue("Gil"));

        System.out.println(usuarios.get(2));

        for(int chave: usuarios.keySet()){
            System.out.println(chave);
        }

        for(String valor: usuarios.values()){
            System.out.println(valor);
        }
        for(Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey() + " ===> ");
            System.out.print(registro.getValue());

        }
    }
}
