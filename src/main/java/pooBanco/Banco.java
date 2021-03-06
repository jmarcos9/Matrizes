package pooBanco;

public class Banco {

    private String numero;
    private String agencia;
    private boolean especial;
    private double limiteEspecial;
    private double valorEspecialUsado;
    private double saldo;

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

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
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

    boolean realizarSaque(double quantiaSacar) {
        //tem saldo na conta
        if (saldo >= quantiaSacar) {
            saldo -= quantiaSacar;
            return true;

        } else {//não tem saldo
            if (especial) {
                //verificar se o limite especial tem saldo
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
    void depositar(double valorDepositado) {
        saldo += valorDepositado;
    }

    void consultarSaldo() {
        System.out.printf("\nSaldo atual da conta: R$ %.2f ", getSaldo());
    }

    boolean usoChequeEspecial() {
        return saldo > 0;
    }


}

