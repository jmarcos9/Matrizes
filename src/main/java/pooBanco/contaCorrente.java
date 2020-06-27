package pooBanco;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class contaCorrente {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner (System.in);

        Banco contaCorrente = new Banco();

        contaCorrente.numero = "123456";
        contaCorrente.agencia = "1234";
        contaCorrente.especial = true;
        contaCorrente.limiteEspecial = 500;
        contaCorrente.valorEspecialUsado = 0;
        contaCorrente.saldo = -10;

        double deposito = 0;
        double sacar = 0;
        int opcao;
        boolean sair = false;

        while (!sair){

            System.out.print("\nDigite a opção \n1 - Depositar  | 2 - Sacar: \n3 - Consultar: | 0 - Sair");
            System.out.println("\nOpção: ");
            opcao = sc.nextInt();
            TimeUnit.SECONDS.sleep(0);

            if (opcao == 1){
                System.out.println("Entre com valor do deposito: R$ ");
                deposito = sc.nextDouble();
                contaCorrente.depositar(deposito);
                //contaCorrente.consultarSaldo();

            }

            if (opcao == 2){
                System.out.println("Entre com o valor para sacar: R$ ");
                sacar = sc.nextDouble();
                boolean saqueEfetuado = contaCorrente.realizarSaque(sacar);

                if (saqueEfetuado){
                    System.out.print("Saque efetuado com sucesso!");
                   // contaCorrente.consultarSaldo();
                }else {
                    System.out.println("Não foi possível realizar saque. Saldo Insuficiente!");
                }

            }


            /*saqueEfetuado = contaCorrente.realizarSaque(450);

            if (saqueEfetuado){
                System.out.print("\nSaque efetuado com sucesso!");
                contaCorrente.consultarSaldo();
            }else {
                System.out.println("Não foi possível realizar saque. Saldo Insuficiente!");
            }*/
                //efetuar deposito
            /*System.out.print("\nDeposito de 1000 reais");
            contaCorrente.depositar(1000);
            contaCorrente.consultarSaldo();
            */


            if(opcao == 3){
                contaCorrente.consultarSaldo();
                if (contaCorrente.usoChequeEspecial()){
                    System.out.println("Não está usando o Cheque Especial!");
                } else {
                    System.out.println("Está usando o Cheque Especial!");
                }

            }

            if(opcao == 0){
                sair = true;
            } else {
                System.out.println("Opção Inválida! Digite novamente.");
            }

        }





    }
}
