package Matrizes;

public class aula2MatrizesTridimensionais {

    public static void main(String[] args) {

        int [][][] numeros = new int[3][3][3];

        for (int i = 0; i < numeros.length ; i++) {
            for (int j = 0; j < numeros[i].length ; j++) {
                for (int k = 0; k < numeros[j].length ; k++) {
                    System.out.printf("\ni = %d - j = %d - k = %d ",i, j, k);
                    numeros[i][j][k] = i + j + k;
                }
            }
        }

        int soma = 0;
        int somaPares = 0;
        int somaImpares = 0;
        for (int i = 0; i < numeros.length ; i++) {
            for (int j = 0; j < numeros[i].length ; j++) {
                for (int k = 0; k < numeros[j].length ; k++) {
                    soma += numeros[i][j][k];

                    if (numeros[i][j][k] % 2 == 0){
                        somaPares+= numeros[i][j][k];
                    }
                    else {
                        somaImpares += numeros[i][j][k];
                    }

                }
            }
        }

        System.out.printf("\nA soma total: %d ", soma);
        System.out.printf("\nA soma Pares: %d ", somaPares);
        System.out.printf("\nA soma Impares: %d ", somaImpares);

    }
}
