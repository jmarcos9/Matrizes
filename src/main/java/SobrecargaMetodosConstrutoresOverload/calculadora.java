package SobrecargaMetodosConstrutoresOverload;

public class calculadora {

    public static void main(String[] args) {

        MinhaCalculadora calculadora = new MinhaCalculadora();

        //calculadora.soma(1,2);
        calculadora.soma(2.0, 3.5);

        System.out.println(calculadora.soma(1, 2));


    }

}
