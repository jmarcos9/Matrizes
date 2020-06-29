package exercicioPOO;

import java.util.Scanner;

public class testFatorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TesteCalcFatorial testeCalcFatorial = new TesteCalcFatorial();

        int num;

        do {
            printTexto("Entre com um número: ");
            num = sc.nextInt();

            if (num < 0){
                printTexto("Número Inválido! Digite novamente");
            }

        }while (num<0);

        System.out.println(testeCalcFatorial.fatorial(num));

    }

    static void printTexto(String text){
        System.out.println(text);
    }

    static void printNum(int num){
        System.out.println(num);
    }





}
