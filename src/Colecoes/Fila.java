package Colecoes;


import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue <String> fila = new LinkedList <> ();

        fila.add("Beca");        // Retorna null.
        fila.offer("Jason");  // Retorna exeção.
        fila.add("Fia");
        fila.offer("Pri");

        // add e offer adicionam elementos na fila.
        // A diferença entre comportamnetos é quando a fila está cheia.

        System.out.println(fila.peek());    // Retorna null.
        System.out.println(fila.element()); // Retorna exeção.
        System.out.println(fila.peek());
        System.out.println(fila.element());

        // fila.size();
        // fila.isEmpty();
        // fila.clear();

        System.out.println(fila.poll());     // Retorna null.
        System.out.println(fila.poll());
        System.out.println(fila);
        System.out.println(fila.remove());  // Rertorna exeção.
        System.out.println(fila.remove());
        System.out.println(fila);
    }
}
