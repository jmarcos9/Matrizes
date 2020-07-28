package PooClasseAbstrata;

public abstract class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String telefoneCelular;
    private String cpf;

    public Pessoa(String nome, String endereco, String telefone,String telefoneCelular, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.telefoneCelular = telefoneCelular;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefoneCelularr(){
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular){
        this.telefoneCelular = telefoneCelular;
    }

    public String obterEtiquetaEndereco(){

        return endereco;
    }

    abstract void imprimirEtiquetaEndereco();
}




