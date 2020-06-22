package Matrizes;

import java.util.Random;

public class exercicio02 {

    public static void main(String[] args) {

        int [][] numerosAleatorios = new int[10][10];

        Random numeroRandom = new Random();

        for (int i = 0; i < numerosAleatorios.length ; i++) {
            System.out.print("Linha " + i + " = " );
            for (int j = 0; j < numerosAleatorios[i].length ; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(10);
                System.out.print(numerosAleatorios[i][j] + " - ");
            }
            System.out.println();
        }

        int maiorLinha5 = Integer.MIN_VALUE;
        int menorLinha5 = Integer.MAX_VALUE;
        int posicaoMaior = 0;
        int posicaoMenor = 0;
        int linha5 = 5;
        for (int i = 0; i < numerosAleatorios[linha5].length; i++) {
            if (numerosAleatorios[linha5][i] > maiorLinha5){
                maiorLinha5 = numerosAleatorios[linha5][i];
                posicaoMaior = i;
            }
            if (numerosAleatorios[linha5][i] < menorLinha5){
                menorLinha5 = numerosAleatorios[linha5][i];
                posicaoMenor = i;
            }
        }

        System.out.printf("\nMaior valor da Linha 5 é %d na posição %d ", maiorLinha5, posicaoMaior);
        System.out.printf("\nMenor valor da Linha 5 é %d na posição %d ", menorLinha5, posicaoMenor);

        int maiorColuna7 = Integer.MIN_VALUE;
        int menorColuna7 = Integer.MAX_VALUE;
        int coluna7 = 7;
        int posicaoMaiorColuna7 = 0;
        int posicaoMenorColunar7 = 0;

        for (int i = 0; i < numerosAleatorios.length ; i++) {
            if (numerosAleatorios[i][coluna7] > maiorColuna7){
                maiorColuna7 = numerosAleatorios[i][coluna7];
                posicaoMaiorColuna7 = i;
            }

            if (numerosAleatorios[i][coluna7] < menorColuna7){
                menorColuna7 = numerosAleatorios[i][coluna7];
                posicaoMenorColunar7 = i;
            }
        }

        System.out.printf("\nMaior valor na Coluna 7 é %d na posição %d ", maiorColuna7, posicaoMaiorColuna7);
        System.out.printf("\nMenor valor na Coluna 7 é %d na posição %d ", menorColuna7, posicaoMenorColunar7);






    }
}
