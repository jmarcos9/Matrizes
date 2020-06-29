package exercicioPOO;

import pooLampadas.Lampada;

import java.util.concurrent.TimeUnit;

public class ligarLampada {

    public static void main(String[] args) throws InterruptedException{

        Lampadas lampada = new Lampadas();

        lampada.ligar();
        lampada.mostrarEstado();
        System.out.println("Alguém esta indo desligar");
        TimeUnit.SECONDS.sleep(5);
        lampada.mudarEstado();
        lampada.mostrarEstado();


    }


}
