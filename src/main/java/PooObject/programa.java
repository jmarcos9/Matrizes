package PooObject;

import PooFinal.Constantes;
import PooFinal.Pessoa;
import PooFinal.Professor;

public class programa {

    public static void main(String[] args) {

        Estudante estudante = new Estudante();

        estudante.setCurso("Ciência da Computação");
        double [] notas ={10,9,8,7};
        estudante.setNotas(notas);

        System.out.println(estudante);

    }

}
