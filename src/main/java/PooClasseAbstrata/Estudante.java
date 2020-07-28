package PooClasseAbstrata;

public class Estudante extends Pessoa {

    private String curso;
    private double[] notas;


    public Estudante() {
        super();
    }

    public Estudante(String nome, String endereco, String telefone, String telefoneCelular,
                     String cpf, String curso, double[] notas) {
        super(nome, endereco, telefone, telefoneCelular, cpf);
        this.curso = curso;
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        return 0;
    }

    public boolean verificarAprovado(){
        return true;
    }

    public String obterEtiquetaEndereco(){

        String s = "Endereço do estudante: ";
        s += this.getEndereco(); // s += super.getEndereco();

        return s;

       //return endereco;
    }

    @Override
    void imprimirEtiquetaEndereco() {
        System.out.println("Imprimindo endereço do estudante: ");
        System.out.println(this.obterEtiquetaEndereco());
    }


}
