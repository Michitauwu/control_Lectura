package Fundamentos_Pro;
import java.util.Scanner;
public class A_Uni {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] datos = new int[5];
        int suma = 0;
        
        System.out.println("Ingrese 5 números enteros:");
        for (int i = 0; i < datos.length; i++) {
            System.out.print("Elemento [" + i + "]: ");
            datos[i] = scanner.nextInt();
            suma += datos[i];
        }
        
        int mayor = datos[0];
        int menor = datos[0];
        for (int i = 1; i < datos.length; i++) {
            if (datos[i] > mayor) mayor = datos[i];
            if (datos[i] < menor) menor = datos[i];
        }
        
        double promedio = (double) suma / datos.length;
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        System.out.println("El promedio es: " + promedio);
        scanner.close();
    }
}

