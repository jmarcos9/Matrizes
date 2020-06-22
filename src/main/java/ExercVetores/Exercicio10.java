package ExercVetores;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double [] vetorA = new double[3];
        double [] vetorB = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            try {
                System.out.printf("Entre com %dº número: ", i+1);
                vetorA[i] = sc.nextInt();
            }catch (Exception exception){
                System.out.println("Digite apenas números!");
                sc.next();
                i--;
                continue;
            }
            vetorB[i] = vetorA[i] % 2;
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
    }
}
