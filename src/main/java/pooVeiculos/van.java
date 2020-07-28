package pooVeiculos;

public class van {

    public static void main(String[] args) {

        Veiculos van = new Veiculos();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numerosPassageiros = 12;
        van.capacidadeCombustivel = 100;
        van.consumoCombustivel = 4.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);
        //usando método void
        //van.exibirAutonomia();
        //System.out.println();
        //usando método com retorno
        //double autonomia = van.calculaAutonomia();
        //System.out.printf("Autonomia do carro é: %.2f Km", autonomia);
        System.out.printf("Autonomia do carro é: %.2f Km", van.obterAutonomia());
        //Passando o parâmetro ou argumento para o método
        double qtdeCombustivel10 = van.calcularCombustivel(10);
        double qtdeCombustivel15 = van.calcularCombustivel(15);
        System.out.printf("\nConsumo para 10Kh: %.2f litros de combustível.", qtdeCombustivel10);
        System.out.printf("\nConsumo para 15Kh: %.2f litros de combustível.", qtdeCombustivel15);


        


    }
}
