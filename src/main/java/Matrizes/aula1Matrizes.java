package Matrizes;

public class aula1Matrizes {

    public static void main(String[] args) {

        double [][] notasAlunos = new double[4][4];

        notasAlunos [0][0] = 8;
        notasAlunos [0][1] = 7;
        notasAlunos [0][2] = 9.5;
        notasAlunos [0][3] = 6;

        notasAlunos [1][0] = 5;
        notasAlunos [1][1] = 8;
        notasAlunos [1][2] = 8.5;
        notasAlunos [1][3] = 10;

        notasAlunos [2][0] = 6;
        notasAlunos [2][1] = 7.5;
        notasAlunos [2][2] = 9;
        notasAlunos [2][3] = 6.75;

        notasAlunos [3][0] = 7;
        notasAlunos [3][1] = 8;
        notasAlunos [3][2] = 9;
        notasAlunos [3][3] = 10;


        for (int i = 0; i < notasAlunos.length ; i++) {
            for (int j = 0; j < notasAlunos[i].length ; j++) {
                System.out.printf("%.2f ",notasAlunos[i][j]);
            }
            System.out.println();
        }
        //Alterando a 2ª nota do 2º aluno de 8 para 10
        notasAlunos[1][1] = 10;

        System.out.println();


        for (int i = 0; i < notasAlunos.length ; i++) {
            for (int j = 0; j < notasAlunos[i].length ; j++) {
                System.out.printf("%.2f ", notasAlunos[i][j]);
            }
            System.out.println();
        }

        System.out.println("Calculando méia de cada aluno");

        double soma;
        for (int i = 0; i < notasAlunos.length ; i++) {
            soma = 0;
            for (int j = 0; j < notasAlunos[i].length ; j++) {
                soma += notasAlunos[i][j];
            }
            System.out.printf("\nA soma da nota do aluno: %d é %.2f e a sua média foi = %.2f ", i+1, soma,  (soma/notasAlunos.length));
        }











    }
}
