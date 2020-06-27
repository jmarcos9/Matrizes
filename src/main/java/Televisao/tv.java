package Televisao;

import java.util.Scanner;

public class tv {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte opcao;
        boolean exit = false;

        Televisao tv = new Televisao();

        while (!exit) {

            System.out.println("Opções: \n1 - Ligar TV \n2 - Desligar TV \n0 - Sair");

            try {
                System.out.println("Digite Opção: ");
                opcao = sc.nextByte();
            } catch (Exception exception) {
                sc.next();
                System.out.println("Digite apenas números!");
                continue;
            }

            if (opcao == 1) {
                tv.ligarTelevisao();
                tv.botaoPower();
            } else if (opcao == 2) {
                if (tv.power) {
                    tv.desligarTelevisao();
                    tv.botaoPower();
                } else {
                    System.out.println("Televisão tem que está ligada!");
                }

            } else if (opcao == 0) {
                exit = true;
            } else {
                System.out.println("Opção Inválida!");
            }

        }
    }
}
