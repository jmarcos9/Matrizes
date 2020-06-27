package Televisao;

public class Televisao {

    boolean power;

    void ligarTelevisao(){
        power = true;
    }

    void desligarTelevisao(){
        power = false;
    }

    void botaoPower(){
        if (power){
            System.out.println("Televisão Ligada");
        } else {
            System.out.println("Televisão Desligada");
        }
    }

}
