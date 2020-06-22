package ExercVetores;

import java.util.Scanner;

public class Exercicio13 {

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

            if (vetorA[i] % 5 == 0) {
                acumulador = acumulador + vetorA[i];
            }
        }
        System.out.print("VetorA = ");
        for (int i = 0; i <vetorA.length ; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("A soma dos númeos multiplos de 5 são: " + acumulador);

    }
}
