package Matrizes;

import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] numeros = new int[3][3];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.printf("Entre com o valor da posição [%d , %d]: ", i, j);
                numeros[i][j] = scan.nextInt();
            }
        }

        int qtdePares = 0;
        int qtdeImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
                if (numeros[i][j] % 2 == 0) {
                    qtdePares++;
                } else {
                    qtdeImpares++;
                }
                /*if (numeros[i][j] % 2 == 1){
                    qtdeimpares++;
                }*/
            }
            System.out.println();
        }
        System.out.printf("\nTotal números pares %d ", qtdePares);
        System.out.printf("Total números impares %d ", qtdeImpares);

    }
}
