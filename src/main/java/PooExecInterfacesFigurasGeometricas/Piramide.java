package PooExecInterfacesFigurasGeometricas;

public class Piramide extends Figuras3D{

    private double altura;
    private double arestaBase;
    private double apotema;
    private int numPoliBase;

    private Figuras2D base;

    public int getNumPoliBase() {
        return numPoliBase;
    }

    public void setNumPoliBase(int numPoliBase) {
        this.numPoliBase = numPoliBase;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public Figuras2D getBase() {
        return base;
    }

    public void setBase(Figuras2D base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return (numPoliBase * ((arestaBase * apotema)/2) + base.calcularArea());
    }

    @Override
    public double calcularVolume() {
        if ( base != null){
            return ((base.calcularArea() * altura)/3);
        }
        return 0;
    }
}
