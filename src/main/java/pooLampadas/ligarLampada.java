package pooLampadas;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ligarLampada {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        Lampada lampada = new Lampada();
        boolean sair = false;
        boolean infValida = false;
        byte opcao = 0;

        while (!sair) {
            try {
                System.out.println("\n 1 - Liga Lâmpada \n 2 - Desliga Lâmpada \n 0 - Encerrar");
                System.out.println("Acione o Interruptor: ");
                opcao = sc.nextByte();

            } catch (Exception exception) {
                sc.next();
                System.out.println("Digite apenas números!");
                continue;
            }

            if (opcao == 1) {
                System.out.println("Interruptor apertado em ON");
                lampada.ligar();
                TimeUnit.SECONDS.sleep(3);
                lampada.interruptorLampada();
                //pausa o cod em segundos
            } else if (opcao == 2) {
                System.out.println("Interruptor apertado em OFF");
                if (lampada.ligada) {
                    lampada.desligar();
                    TimeUnit.SECONDS.sleep(3);
                    lampada.interruptorLampada();
                } else {
                    System.out.println("Lampada Precisa ser ligada!");
                }
            } else if (opcao == 0) {
                sair = true;
            } else {
                System.out.println("Opção inválida!");
            }
        /*System.out.println("Interruptor apertado em ON");
        lampada.mudarEstado();
        lampada.interruptorLampada();*/

        }
    }
}
