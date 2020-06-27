package construtoresThis;

import java.util.Scanner;

public class carro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Veiculos van = new Veiculos("", "Ducato", 10, 20,15 );
        System.out.println("Entre com a Marca: ");
        van.marca = sc.next();

        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.capacidadeCombustivel);
        System.out.printf("%.2f ",van.consumoCombustivel);











    }
}
