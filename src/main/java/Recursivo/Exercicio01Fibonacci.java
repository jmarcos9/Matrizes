package Recursivo;

public class Exercicio01Fibonacci {

    public static int fibonacci (int num){

        if (num < 2){
            return 1;
        }

        return fibonacci(num-1) + fibonacci(num-2);
    }

    public static int somatorio(int nun){

        if (nun == 1){
            return 1;
        }

        return nun + somatorio(nun -1);


    }


}
