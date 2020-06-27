package pooLampadas;
/*
    Escreva uma classe para representar	uma	 lâmpada.
    Desenvolva	 métodos para ligar, desligar a	 lampada.
 */

public class Lampada {

    String marca;
    String modelo;
    String tensao;
    int potencia;
    String cor;
    int garantiaMeses;
    String tipoLuz;
    String[] tipos;
    boolean abajur;
    boolean ligada;

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void interruptorLampada() {
        if (ligada) {
            System.out.println("Lâmpada foi Ligada");
        } else {
            System.out.println("Lâmpada foi Desligada");
        }
    }

    void mudarEstado() {
        if (ligada) {
            desligar();
        } else {
            ligar();
        }
    }


}
