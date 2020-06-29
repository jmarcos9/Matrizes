package exercicioPOO;

public class Banco {

    private String numero;
    private String agencia;
    private boolean especial;
    private double limiteEspacial;
    private double valorEspecialUsado = 0;
    private double saldo;

    Banco (){}

    public Banco(String numero, String agencia, boolean especial, double limiteEspacial,
                 double valorEspecialUsado, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.especial = especial;
        this.limiteEspacial = limiteEspacial;
        this.valorEspecialUsado = valorEspecialUsado;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimiteEspacial() {
        return limiteEspacial;
    }

    public void setLimiteEspacial(double limiteEspacial) {
        this.limiteEspacial = limiteEspacial;
    }

    public double getValorEspecialUsado() {
        return valorEspecialUsado;
    }

    public void setValorEspecialUsado(double valorEspecialUsado) {
        this.valorEspecialUsado = valorEspecialUsado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean realizarSaque(double quantiaSacar) {
        //tem saldo na conta
        if (saldo >= quantiaSacar) {
            saldo -= quantiaSacar;
            return true;

        } else {//não tem saldo
            if (especial) {
                //verificar se o limite especial tem saldo
                double limiteEspecial = 0;
                double limite = limiteEspecial + saldo;

                if (limite >= quantiaSacar) {
                    saldo -= quantiaSacar;
                    return true;

                } else {
                    return false;//não é especial e não tem saldo suficiente
                }

            } else {
                return false;//não é especial e não tem saldo suficiente
            }
        }
    }

    //instruções para depositar
    public void depositar(double valorDepositado) {
        saldo += valorDepositado;
    }

    public void consultarSaldo() {
        System.out.printf("\nSaldo atual da conta: R$ %.2f ", saldo);
    }

    public boolean usoChequeEspecial() {
        return saldo > 0;
    }


}
