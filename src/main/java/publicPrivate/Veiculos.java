package publicPrivate;

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

    public void exibirAutonomia(){
        System.out.printf("Autonomia do carro é: %.2f Km", capacidadeCombustivel * consumoCombustivel);
    }
    //método que retorna valores
    public double obterAutonomia(){
        System.out.println("\nMétodo calcular autonomia foi requisitado.");
        return capacidadeCombustivel*consumoCombustivel;
    }

    //atribuindo métodos com parâmetros
    public double calcularCombustivel (double km){
        double qtdeCombustivel = km / consumoCombustivel;
        return qtdeCombustivel;
    }



}
