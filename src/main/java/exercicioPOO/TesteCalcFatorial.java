package exercicioPOO;

import java.util.Scanner;

public class TesteCalcFatorial {

    public static void main(String[] args) {

        imprimir(Caculadora.soma(1, 2));
        imprimir(Caculadora.subtrair(2, 1));
        imprimir(Caculadora.multiplicar(2, 2));
        imprimir((int) Caculadora.divisao(5, 2));
        imprimir((int) Caculadora.potencia(2, 3));
    }

    static void imprimir(int num) {
        System.out.println(num);

    }
    //5! = 5 * 4 * 3 * 2 * 1 = 120
    //0! = 1
    public int fatorial(int num){

        if (num == 0){
            return 1;
        }
        int total = 1;
        for (int i = num; i>1 ;i--) {
            total*=i;
        }
        return total;
    }
}
