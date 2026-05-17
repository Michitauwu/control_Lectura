package Fundamentos_Pro;

public class Diago_Prin {
	public static void main(String[] args) {
        int[][] matriz = {
            {5, 2, 9},
            {4, 8, 1},
            {3, 7, 6}
        };
        
        System.out.println("Matriz completa:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.print("\nElementos de la diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
    }
}
