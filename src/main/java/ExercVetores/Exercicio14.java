package ExercVetores;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double [] vetorA = new double[5];

        double acumulador = 0;
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
            acumulador = acumulador + vetorA[i];

        }

        System.out.print("VetorA = ");
        for (int i = 0; i <vetorA.length ; i++) {
            System.out.print(vetorA[i] + " ");
        }
        double media = acumulador/vetorA.length;
        System.out.println();
        System.out.printf("A soma dos números é %.2f ",  acumulador);
        System.out.printf("\nA média dos números é: %.2f ",  media);

    }
}
