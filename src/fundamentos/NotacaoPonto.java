package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        String s = "Bom dia Henrique";
           s = s.toUpperCase();               // Não tem notação '.' para tipos primitivos. Ex.: int, double, float, etc.
           s = s.concat("!");
             System.out.println(s);
           s = s.replace("Henrique", "João");
             System.out.println(s);

             String x = "João".toUpperCase().concat("Paulo ").replace("Paulo", "Lucas");
             System.out.println(x);

             System.out.println("Henrique"
                .toUpperCase()
                .concat(" ")
                .concat("Lucas"));
    }
}
