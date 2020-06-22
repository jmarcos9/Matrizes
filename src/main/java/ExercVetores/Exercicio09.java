package ExercVetores;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double [] vetorA = new double[3];
        double [] vetorB = new double[vetorA.length];
        double [] vetorC = new double[vetorA.length];


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
            vetorC[i] = vetorA[i] / vetorB[i];
        }
        System.out.print("VetorA = ");
        for (int i = 0; i <vetorA.length ; i++) {
            System.out.printf("%.2f ",vetorA[i]);
        }
        System.out.println();
        System.out.print("VetorB = ");
        for (int i = 0; i < vetorB.length ; i++) {
            System.out.printf("%.2f ",vetorB[i]);
        }
        System.out.println();
        System.out.print("VetorC = ");
        for (int i = 0; i < vetorC.length ; i++) {
            System.out.printf("%.2f ", vetorC[i]);
        }
    }
}
