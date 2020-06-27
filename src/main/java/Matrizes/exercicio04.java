package Matrizes;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] compromissos = new String[31][24];

        byte opcao;
        boolean sair = false;


        while (!sair) {

            System.out.println("----------------MENU-----------------");
            System.out.println("Digite 1 para adicionar compromisso: ");
            System.out.println("Digite 2 para consultar compromisso: ");
            System.out.println("Digite 0 para sair: ");
            System.out.println("-------------------------------------");


            System.out.println("Entre com a opção: ");
            opcao = scan.nextByte();

            if (opcao == 1){

                boolean diaValido = false;
                int dia = 0;
                while (!diaValido){
                    System.out.println("Entre com o dia do mês: ");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31){
                        diaValido = true;
                    }
                    else {
                        System.out.println("Dia Inválido! Digite novamente.");
                    }
                }

                boolean horaValida = false;
                int hora = 0;
                while (!horaValida){
                    System.out.println("Entre com hora do compromisso: ");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 23){
                        horaValida = true;
                    }
                    else {
                        System.out.println("Hora Inválida! Digite novamente.");
                    }
                }

                dia--;
                System.out.println("Informe o Compromisso: ");
                compromissos[dia][hora] = scan.next();

            }
            else if (opcao == 2){

                boolean diaValido = false;
                int dia = 0;
                while (!diaValido){
                    System.out.println("Entre com o dia do mês: ");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31){
                        diaValido = true;
                    }
                    else {
                        System.out.println("Dia Inválido! Digite novamente.");
                    }
                }

                boolean horaValida = false;
                int hora = 0;
                while (!horaValida){
                    System.out.println("Entre com hora do compromisso: ");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 23){
                        horaValida = true;
                    }
                    else {
                        System.out.println("Hora Inválida! Digite novamente.");
                    }
                }

                dia--;
                System.out.println("O compromisso Agendado é: ");
                System.out.println(compromissos[dia][hora]);
            }
            else if (opcao == 0){
                sair = true;
            }
            else {
                System.out.println("Opção Inválida! Digite Novamente.");
            }

        }
        scan.close();
    }
}
