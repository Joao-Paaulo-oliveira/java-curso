package ClassesMetodos;

public class Equals {

    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Chris Gardner";
        u1.email = "chris.gard@edf.com";

        Usuario u2 = new Usuario();
        u2.nome = "Chris Gardner";
        u2.email = "chris.gard@edf.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
    }
}
