package ExercVetores;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] vetorA = new double[3];
        double[] vetorB = new double[vetorA.length];

        for (int i = 0; i < vetorA.length ; i++) {
            System.out.printf("Entre com %dº número ", (i+1));
            vetorA[i] = sc.nextInt();

            vetorB[i] = sqrt(vetorA[i]);
        }
        System.out.print("VetorA = ");
        for (int i = 0; i <vetorA.length ; i++) {
            System.out.printf("%.2f ",vetorA[i]);
        }
        System.out.println();

        System.out.print("VetorB = ");
        for (int i = 0; i < vetorB.length ; i++) {
            System.out.printf("%.2f ", vetorB[i]);
        }

    }
}
