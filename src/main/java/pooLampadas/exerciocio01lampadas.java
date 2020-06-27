package pooLampadas;

import pooLampadas.Lampada;

public class exerciocio01lampadas {

    public static void main(String[] args) {

        Lampada lampada = new Lampada();
        lampada.marca = "Philips";
        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.potencia = 7;
        lampada.cor = "Amarela";
        lampada.garantiaMeses = 36;
        lampada.tipoLuz = "Amarela";
        lampada.abajur = true;

        lampada.tipos = new String[5];
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "lampiões";




        System.out.printf("marca da lâmpada é: %s ", lampada.marca);







    }
}
