package foreach;

import java.util.Random;

public class forEach {

    public static void main(String[] args) {

        int[] notas = new int[10];

        Random numerosAleatorios = new Random();

        for (int i = 0; i < notas.length ; i++) {
            notas[i] = numerosAleatorios.nextInt(10);
        }

        /*for (int i = 0; i < notas.length ; i++) {
            System.out.println(notas[i]);
        }*/

        System.out.println("Usando Foreach");
        for (int nota: notas) {
            System.out.println(nota);
        }

        System.out.println("Exemplos de Arrays Multidimencionais");

        double [][] notasAlunos = new double[4][4];

        notasAlunos [0][0] = 8;
        notasAlunos [0][1] = 7;
        notasAlunos [0][2] = 9.5;
        notasAlunos [0][3] = 6;

        notasAlunos [1][0] = 5;
        notasAlunos [1][1] = 8;
        notasAlunos [1][2] = 8.5;
        notasAlunos [1][3] = 10;

        notasAlunos [2][0] = 6;
        notasAlunos [2][1] = 7.5;
        notasAlunos [2][2] = 9;
        notasAlunos [2][3] = 6.75;

        notasAlunos [3][0] = 7;
        notasAlunos [3][1] = 8;
        notasAlunos [3][2] = 9;
        notasAlunos [3][3] = 10;

        for (double [] notaAluno: notasAlunos) {
            for (double nota: notaAluno) {
                System.out.print(nota + " ");
            }
            System.out.println();

        }




    }
}
