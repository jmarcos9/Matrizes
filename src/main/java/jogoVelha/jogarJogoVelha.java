package jogoVelha;

import java.util.Scanner;

public class jogarJogoVelha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        JogoVelha jogovelha = new JogoVelha();

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;

        char sinal = 0;
        int linha = 0, coluna = 0;

        while (!ganhou) {

            if (jogovelha.vezJogador1()) {
                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3): ");
                sinal = 'X';
            } else {
                System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3): ");
                sinal = 'O';
            }

            linha = valor(" linha ", sc);
            coluna = valor(" Coluna ", sc);
            jogovelha.validarJogada(linha, coluna, sinal);
            jogovelha.imprimirtabuleiro();

            if (jogovelha.verificaGanhador('X')) {
                ganhou = true;
                System.out.println("Parabéns, Jogador 1 ganhou!");
            } else if (jogovelha.verificaGanhador('O')) {
                ganhou = true;
                System.out.println("Parabéns, Jogador 2 ganhou!");
            } else if (jogovelha.jogada > 9) {
                ganhou = true;
                System.out.println("Ninguém ganhou essa partida.");
            }
        }
    }

    static int valor(String tipoValor, Scanner sc) {
        int valor = 0;
        boolean valorValido = false;
        while (!valorValido) {
            System.out.println("Entre com a" + tipoValor + "(1, 2 ou 3): ");
            valor = sc.nextInt();
            if (valor >= 1 && valor <= 3) {
                valorValido = true;
            } else {
                System.out.println("Entrada inválida, tente novamente");
            }
        }
        valor--;
        return valor;
    }
}
