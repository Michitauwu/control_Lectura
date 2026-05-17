package Fundamentos_Pro;
import java.util.Scanner;
public class S_m {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = {
            {12, 45, 78},
            {34, 89, 23},
            {67, 11, 90}
        };
        
        System.out.print("Ingrese el número entero que desea buscar en la matriz: ");
        int objetivo = scanner.nextInt();
        
        boolean encontrado = false;
        int filaEncontrada = -1;
        int columnaEncontrada = -1;
        
        // Búsqueda lineal anidada
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == objetivo) {
                    encontrado = true;
                    filaEncontrada = i;
                    columnaEncontrada = j;
                    break; 
                }
            }
            if (encontrado) break;
        }
        
        if (encontrado) {
            System.out.println("Elemento hallado con éxito.");
            System.out.println("Posición: Fila [" + filaEncontrada + "], Columna [" + columnaEncontrada + "].");
        } else {
            System.out.println("El número " + objetivo + " no se encuentra en la matriz.");
        }
        scanner.close();
    }
}
