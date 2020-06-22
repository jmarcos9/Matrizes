package Matrizes;

import java.util.Scanner;

public class aula3MatrizesIrregulares {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean infValida = false;

        System.out.println("Entre com o número de pessoas que serão entrevistadas: ");
        int numEntrevistados = scan.nextInt();

        String[][] nomesFilhos = new String[numEntrevistados][];

        for (int i=0; i<nomesFilhos.length; i++){

            System.out.printf("Entre com a quantidade de filhos do %dº entrevistado: ", (i+1));
            int qtdFilhos = scan.nextInt();

            nomesFilhos[i] = new String[qtdFilhos];

            for (int j=0; j<nomesFilhos[i].length; j++){

                System.out.printf("Digite o nome do %dº filho: ", (j+1));

                nomesFilhos[i][j] = scan.next();
            }
        }

        for (int i=0; i<nomesFilhos.length; i++){
            System.out.printf("\n%dº Entrevistado tem %d filhos:", (i+1),nomesFilhos[i].length);
            System.out.println();
            for (int j=0; j<nomesFilhos[i].length; j++){
                System.out.println(nomesFilhos[i][j]);
            }
        }
    }

}