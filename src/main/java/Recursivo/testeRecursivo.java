package Recursivo;

public class testeRecursivo {

    public static void main(String[] args) {

        int fatorialNaoRecursivo = MinhaCalc.fatorialNapRecursivo(5);
        System.out.println(fatorialNaoRecursivo);

        int fatorialRecursivo = MinhaCalc.fatorialRecursivo(5);
        System.out.println(fatorialRecursivo);
    }

}
