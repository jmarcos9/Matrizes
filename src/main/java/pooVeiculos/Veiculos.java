package pooVeiculos;

public class Veiculos {

    String marca;
    String modelo;
    int numerosPassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    //método que não retorna valor
    public void exibirAutonomia() {
        System.out.printf("Autonomia do carro é: %.2f Km", this.capacidadeCombustivel * this.consumoCombustivel);
    }

    //método que retorna valores
    public double obterAutonomia() {
        System.out.println("\nMétodo calcular autonomia foi requisitado.");
        return this.capacidadeCombustivel * this.consumoCombustivel;
    }

    //atribuindo métodos com parâmetros
    public double calcularCombustivel(double km) {
        double qtdeCombustivel = km / this.consumoCombustivel;
        return qtdeCombustivel;
    }

}
