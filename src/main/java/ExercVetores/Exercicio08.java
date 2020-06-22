package ExercVetores;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] vetorA = new int[3];
        int [] vetorB = new int[vetorA.length];
        int [] vetorC = new int[vetorA.length];


        for (int i = 0; i < vetorA.length; i++){
            try{
                System.out.printf("Entre com %dº número vetorA: ", i+1);
                vetorA[i] = sc.nextInt();
            }catch (Exception exception){
                System.out.println("Entre com números!");
                sc.next();
                i--;
                continue;
            }
        }

        for (int i = 0; i < vetorB.length; i++) {
            try {
                System.out.printf("Entre com %dº número vetorB: ", i+1);
                vetorB[i] = sc.nextInt();
            }catch (Exception exception){
                System.out.println("Entre com números!");
                sc.next();
                i--;
                continue;
            }
            vetorC[i] = vetorA[i] * vetorB[i];
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
        System.out.println();
        System.out.print("VetorC = ");
        for (int i = 0; i < vetorC.length ; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}
