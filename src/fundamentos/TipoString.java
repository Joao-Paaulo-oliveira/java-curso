package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoas".charAt(2)); // charAt() = retorna o caractere na posição indicada
        String s = "Boa tarde ";
        System.out.println(s.concat("Pessoal!")); // concat() = concatena a string indicada
        System.out.println(s + "Pessoal!");           // + = concatena a string indicada
        System.out.println(s.startsWith("Boa"));      // startsWith() = retorna true se a string indicada começa com a string indicada
        System.out.println(s.toUpperCase().startsWith("boa")); // toUpperCase() = retorna a string indicada em maiúsculo

        var nome = "Henrique";
        var sobrenome = "Lucas";
        var idade = 33;
        var salario = 12345.987;

        String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario + "\n\n";
        System.out.println(maisUmaFrase);

        System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);  // %s = String, %d = int, %f = float
        String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario); // format() = formata a string indicada
        System.out.println(frase);



    }
}
