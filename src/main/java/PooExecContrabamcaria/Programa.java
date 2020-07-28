package PooExecContrabamcaria;

public class Programa {

    public static void main(String[] args) {

        System.out.println("*** teste conta Simples ***");

        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Cliente Conta Simples");
        contaSimples.setNumConta("11111");

        contaSimples.depositar(100);

        realizarSaque(contaSimples, 50);
        realizarSaque(contaSimples, 70);

        System.out.println(contaSimples);

        System.out.println("*** teste conta Poupança ***");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Cliente Conta Poupança");
        contaPoupanca.setNumConta("22222");
        contaPoupanca.setDiaRendimento(27);

        contaPoupanca.depositar(100);

        realizarSaque(contaPoupanca, 50);
        realizarSaque(contaPoupanca, 70);

        if (contaPoupanca.calcularNovoSaldo(0.05)) {
            System.out.println("Rendimento aplicado, novo saldo = " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento ");
        }

        System.out.println(contaPoupanca);

        System.out.println("*** teste conta especial ***");

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Cliente Conta Especial");
        contaEspecial.setNumConta("33333");
        contaEspecial.setLimite(50);

        contaEspecial.depositar(100);

        realizarSaque(contaEspecial, 50);
        realizarSaque(contaEspecial, 70);
        realizarSaque(contaEspecial, 80);

        System.out.println(contaEspecial);


    }

    private static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso " + "Saldo Atual: R$ " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de R$ " + conta.getSaldo());
        }
    }

}
