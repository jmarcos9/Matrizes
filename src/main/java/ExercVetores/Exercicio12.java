package ExercVetores;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] vetorA = new int[5];

        int acumulador = 0;
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

            acumulador = acumulador+vetorA[i];

        }
        System.out.print("VetorA = ");
        for (int i = 0; i <vetorA.length ; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("A soma de todos os númeos é: " + acumulador);

    }

}
