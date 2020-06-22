package ExercVetores;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[5];

        int posicaoMaior = 0;
        int posicaoMenor = 0;
        int idade = 0, contador = 0;
        boolean infValida =  false;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        do {


            if (contador == vetorA.length){
                System.out.println("Lista cheia");
                break;
            }

            try {
                System.out.printf("Entre com %dª Idade (maior que zero): ", contador+1);
                idade = sc.nextInt();

            } catch (Exception exception) {
                System.out.println("Entre com números!");
                sc.next();
                continue;
            }

            if (idade == 0){
                System.out.println("Idade Zero Inválida! Programa Finalizado");
                break;
            }

            int idadeRepetida = -1;
            for (int i = 0; i < vetorA.length ; i++) {
                if (vetorA[i] == idade){
                    idadeRepetida = i;
                    continue;

                }
            }

            if (idadeRepetida != -1){
                System.out.println("Não é permitida Idade repetida!");
                continue;
            }

            for (int i = 0; i < vetorA.length ; i++) {
                if (vetorA[i] == 0){
                    vetorA[i] = idade;
                    contador++;
                    break;

                }
            }

        }while (true);

        for (int i = 0; i < vetorA.length ; i++) {
            if (vetorA[i] > maior){
                maior = vetorA[i];
                posicaoMaior = i;
            }

            if (vetorA[i] < menor){
                menor = vetorA[i];
                posicaoMenor = i;
            }
        }
        System.out.println("Maior idade " + maior + " posição " + (posicaoMaior+1));
        System.out.println("Menor idade " + menor + " posição " + (posicaoMenor+1));


    }
}
