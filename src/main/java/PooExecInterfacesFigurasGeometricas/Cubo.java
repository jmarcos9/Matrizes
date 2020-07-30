package PooExecInterfacesFigurasGeometricas;

public class Cubo extends Figuras3D{

    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 6 * (lado * lado);
        //return (Math.pow(lado, 6)); acho que vai dá errado
    }

    @Override
    public double calcularVolume() {
        //return lado * lado * lado;
        return Math.pow(lado, 3);
    }
}
