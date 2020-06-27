package pooLampadas;

import pooLampadas.Lampada;

public class exercicio01lampadaSony {

    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.marca = "Sony";
        lampada.modelo = "S60";
        lampada.tensao = "Bivolt";
        lampada.potencia = 8;
        lampada.cor = "Branca";
        lampada.garantiaMeses = 24;
        lampada.tipoLuz = "Branca";
        lampada.abajur = false;

        lampada.tipos = new String[5];
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "lampiões";

        System.out.println(lampada.tipos);
    }
}
