package ExercVetores;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] vetorA = new int [3];
        int [] vetorB = new int [vetorA.length];

        for (int i = 0; i < vetorA.length ; i++) {
            System.out.printf("Entre com %dº número: ", i+1);
            vetorA[i] = sc.nextInt();

            vetorB[i] = vetorA[i] * i;
        }
        System.out.print("VetorA = ");
        for (int i = 0; i <vetorA.length ; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("VetorB = ");
        for (int i = 0; i < vetorB.length ; i++) {
            System.out.print(vetorB[i] + " ");
        }



    }
}
