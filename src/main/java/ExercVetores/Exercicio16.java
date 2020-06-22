package ExercVetores;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];

        int somaMaior = 0;
        int somaMenor = 0;
        int contador = 0;
        for (int i = 0; i < vetorA.length ; i++) {
            try {
                System.out.printf("Entre com %dº número do vetorA: ", i + 1);
                vetorA[i] = sc.nextInt();
            } catch (Exception exception) {
                System.out.println("Entre com números!");
                sc.next();
                i--;
                continue;
            }
            if (vetorA[i] < 15 ){
                somaMenor = somaMenor + vetorA[i];
                contador++;
            }

            if(vetorA[i] == 15){
                contador++;
            }

            if (vetorA[i] > 15 ){
                somaMaior = somaMaior + vetorA[i];
            }

        }
        int qtdeMaior = vetorA.length-contador;
        double media = somaMaior / qtdeMaior;

        System.out.println("A soma dos números menores que 15 é : " + somaMenor);
        System.out.println("Número 15 se repete " + contador + " vezes");
        System.out.println("A soma dos números maior que 15 é: " + somaMaior);
        System.out.printf("A média da soma dos números maiores que 15 é: %.2f ", media );

    }
}
