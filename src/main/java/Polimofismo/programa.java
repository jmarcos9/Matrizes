package Polimofismo;

public class programa {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Pessoa estudante = new Estudante();
        Pessoa professor = new Professor();

        pessoa.setEndereco("Rua 1, num 1");
        estudante.setEndereco("Rua 2, num 2");
        professor.setEndereco("Rua 3, num 3");

        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(estudante.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());
    }

}
