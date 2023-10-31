package fundamentos;

public class ConversaoNumeroString {
    public static void main(String[] args) {
        Integer a = 1000;
        System.out.println(a.toString().length());

        int b = 1224542;
        System.out.println(Integer.toString(b).length());
    }
}
