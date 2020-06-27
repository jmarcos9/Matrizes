package EmcapsulamentoGetSet;

public class Veiculos {

    private String marca;
    private String modelo;
    private int numerosPassageiros;
    private double capacidadeCombustivel;
    private double consumoCombustivel;

    //construtor instanciados
    public Veiculos(int numerosPassageiros, double capacidadeCombustivel, double consumoCombustivel) {
        this.numerosPassageiros = numerosPassageiros;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.consumoCombustivel = consumoCombustivel;
        System.out.println("Classe instanciada");


    }
    //constutor vazio
    Veiculos(){ }


    //usando gerate get set automaticamente
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumerosPassageiros() {
        return numerosPassageiros;
    }

    public void setNumerosPassageiros(int numerosPassageiros) {
        this.numerosPassageiros = numerosPassageiros;
    }

    public double getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(double capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }


    //feito na mão
    /*public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumerosPassageiros() {
        return this.numerosPassageiros;
    }

    public void setNumerosPassageiros(int numerosPassageiros) {
        this.numerosPassageiros = numerosPassageiros;
    }

    public double getCapacidadeCombustivel() {
        return this.capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(double capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public double getConsumoCombustivel() {
        return this.consumoCombustivel;
    }

    public void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }*/


}
