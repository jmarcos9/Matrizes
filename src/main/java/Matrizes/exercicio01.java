package Matrizes;

import java.util.Random;

public class exercicio01 {

    public static void main(String[] args) {

        int [][] numrosAleatorios = new int[4][4];

        Random numeroRandom = new Random();

        for (int i = 0; i < numrosAleatorios.length; i++) {
            for (int j = 0; j < numrosAleatorios[i].length ; j++) {
                numrosAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }

        int maior = Integer.MIN_VALUE;
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < numrosAleatorios.length; i++) {
            for (int j = 0; j < numrosAleatorios[i].length ; j++) {
                if (numrosAleatorios[i][j] > maior){
                    maior = numrosAleatorios[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        for (int i = 0; i < numrosAleatorios.length ; i++) {
            for (int j = 0; j < numrosAleatorios[i].length ; j++) {

                System.out.println(i + " " + numrosAleatorios[i][j]);
            }
            System.out.println();

        }
        System.out.printf("\nMaior valor %d: na linha %d e coluna %d ", maior, linha, coluna);




    }
}
