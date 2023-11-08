package ClassesMetodos;

public class Data {

    int dia;
    String mes;
    int ano;

    Data (){
        this(1,"Janeiro",1970);                                      // O THIS PODE SER USADO DENTRO DE UM CONSTRUTOR
    }
    Data (int dia, String mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }
}
