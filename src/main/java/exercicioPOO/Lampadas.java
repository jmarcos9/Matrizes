package exercicioPOO;

public class Lampadas {

    private String marca;
    private String modelo;
    private String tensao;
    private int potencia;
    private String cor;
    private int garantiaMeses;
    private String tipoLuz;
    private String[] tipos;
    private boolean abajur;
    private boolean ligada;

    Lampadas(){}

    public Lampadas(String marca, String modelo, String tensao, int potencia, String cor, int garantiaMeses,
                    String tipoLuz, String[] tipos, boolean abajur, boolean ligada) {
        this.marca = marca;
        this.modelo = modelo;
        this.tensao = tensao;
        this.potencia = potencia;
        this.cor = cor;
        this.garantiaMeses = garantiaMeses;
        this.tipoLuz = tipoLuz;
        this.tipos = tipos;
        this.abajur = abajur;
        this.ligada = ligada;
    }

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

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public boolean isAbajur() {
        return abajur;
    }

    public void setAbajur(boolean abajur) {
        this.abajur = abajur;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void ligar(){
        setLigada(true);
    }

    public void desligar(){
        setLigada(false);
    }

    public void mostrarEstado(){
        if (isLigada()){
            System.out.println("Lâmpada Ligada");
        } else {
            System.out.println("Lampada Desligada");
        }
    }

    public void mudarEstado(){
        if (isLigada()){
            desligar();
        } else {
            ligar();
        }
    }

}
