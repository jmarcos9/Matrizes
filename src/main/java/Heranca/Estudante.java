package Heranca;

public class Estudante extends Pessoa{
    //atributos
    private String curso;
    private double[] notas;

    public Estudante(String curso, double[] notas) {
        this.curso = curso;
        this.notas = notas;
    }

    public Estudante() {
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    //metodos
    public double calcularMedia(){
        return 0;
    }

    //metodos
    public boolean verificarAprovado(){
        return true;
    }
}
