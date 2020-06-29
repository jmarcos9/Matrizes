package varieveisMetodosStatics;


public class calculadora {

    static int resultSoma;
    public static void main(String[] args) {


        resultSoma = MinhaCalculadora.soma(1,2);
        //MinhaCalculadora calculadora = new MinhaCalculadora();

        //calculadora.soma(1,2);

        //classe utilitária. não é muito usavel -  não é orientada a objeto

        //MinhaCalculadora.soma(1,2);
        System.out.println(resultSoma);

    }

    static int somaDoisValores(int num1, int num2){
        return MinhaCalculadora.soma(num1, num2);
    }



}
