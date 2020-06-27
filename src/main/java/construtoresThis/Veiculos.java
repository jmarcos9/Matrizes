package construtoresThis;

public class Veiculos {

    String marca;
    String modelo;
    int numerosPassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    public Veiculos(String marca, String modelo, int numerosPassageiros, double capacidadeCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numerosPassageiros = numerosPassageiros;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.consumoCombustivel = consumoCombustivel;
        System.out.println("Classe carro foi instaciada");
    }

    Veiculos(){ }

}
