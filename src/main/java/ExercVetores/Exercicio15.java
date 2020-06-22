package ExercVetores;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] vetorA = new double[10];

        int par = 0;
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
            if (vetorA[i] % 2 == 0){
                par++;
            }
        }

        double percPar = (par*100) / vetorA.length;
        double percImpar = 100 - percPar;

        System.out.printf("Percentual Impar: %.2f ", percImpar);
        System.out.println("\nPercentual Par: " + percPar + "%");


    }
}
