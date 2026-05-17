package Fundamentos_Pro;

public class Suma_M {
	public static void main(String[] args) {
        int[][] matrizA = {{1, 2}, {3, 4}};
        int[][] matrizB = {{5, 6}, {7, 8}};
        int[][] matrizResultado = new int[2][2];
        
        // Operación matricial
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizResultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        
        System.out.println("Resultado de la suma de Matriz A + Matriz B:");
        for (int[] fila : matrizResultado) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }
}
