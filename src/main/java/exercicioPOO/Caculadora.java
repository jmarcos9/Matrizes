package exercicioPOO;

public class Caculadora {

    public static int soma(int num1, int num2){
        return num1 + num2;
    }

    public static int subtrair( int nun1, int num2){
        return nun1 - num2;
    }

    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }

    public static double divisao(double num1, double num2){
        return num1 / num2;
    }
    //
    /*public static int potencia(int num1, int num2){
        return (int) Math.pow(num1, num2);
    }*/

    public static int potencia(int num1, int num2){
        int total = 1;
        for (int i = 1; i <= num2 ; i++) {
            total*=num1;
        }
        return total;

    }

}
