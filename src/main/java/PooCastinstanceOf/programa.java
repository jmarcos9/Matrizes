package PooCastinstanceOf;

public class programa {

    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        Pessoa pessoaEstudante = estudante; //Upcasting

        Pessoa estudante2 = (Pessoa) new Estudante(); //Upcasting



    }



}
