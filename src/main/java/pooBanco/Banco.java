package pooBanco;

public class Banco {

    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    double saldo;


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
        System.out.printf("\nSaldo atual da conta: R$ %.2f ", saldo);
    }

    boolean usoChequeEspecial() {
        return saldo > 0;
    }


}

