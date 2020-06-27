package Estudante;

import java.util.Scanner;

public class estudante {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Curso estudante = new Curso();

        System.out.println("Digite nome do estudante: ");
        estudante.nome = sc.next();

        System.out.println("Digite matrícula do estudante: ");
        estudante.matricula = sc.next();

        System.out.println("Digite curso do estudante: ");
        estudante.curso = sc.next();

        for (int i = 0; i < estudante.nomeDisciplina.length; i++){
            System.out.printf("Entre com o nome da %dª disciplina: ", (i+1));
            estudante.nomeDisciplina[i] = sc.next();
        }
        for (int i = 0; i < estudante.notasDisciplinas.length ; i++) {
            System.out.println("Obtendo notas da disciplinas: " + estudante.nomeDisciplina[i]);
            for (int j = 0; j < estudante.notasDisciplinas[i].length; j++) {
                System.out.printf("Entre com a %dº nota: ",(j+1));
                estudante.notasDisciplinas[i][j] = sc.nextDouble();
            }

        }
        estudante.mostrarInfo();

        for (int i = 0; i < estudante.nomeDisciplina.length ; i++) {
            if (estudante.verificarAprovado(i)){
                System.out.println("Disciplina " + estudante.nomeDisciplina[i] + " Foi Aprovado!");
            }else {
                System.out.println("Disciplina " + estudante.nomeDisciplina[i] + " Foi Reprovado!");

            }
        }

    }
}
