package pooVeiculos;

public class automoveis {

    public static void main(String[] args) {

        Veiculos van = new Veiculos();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numerosPassageiros = 12;
        van.capacidadeCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);
        van.exibirAutonomia();


        /*Veiculo fusca = new Veiculo();

        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 5;
        fusca.capCombustivel = 40;
        fusca.capCombustivel = 8;*/


    }



}
