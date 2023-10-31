package fundamentos;



public class Wrappers {
    public static void main(String[] args) {
        Byte b = 10;
        Short s = 100;
        Integer i = 1000;

        System.out.println(b.byteValue()); // VALOR DO BYTE
        System.out.println(s.toString().toUpperCase()); // TRANSFORMA EM 'S' EM STRING
        System.out.println(i.intValue()); // VALOR DE INTERGER

        Float f = 10000F;
        System.out.println(f);
        Double d = 10000.000;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#';
        System.out.println(c + "++");



    }
}
