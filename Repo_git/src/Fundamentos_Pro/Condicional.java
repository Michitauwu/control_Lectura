package Fundamentos_Pro;
import java.util.Scanner;
public class Condicional {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        System.out.println("Ingrese números enteros positivos para sumar (ingrese un negativo para terminar):");
        
        int numero = scanner.nextInt();
        while (numero >= 0) {
            suma += numero;
            numero = scanner.nextInt();
        }
        
        System.out.println("La suma total de los números positivos ingresados es: " + suma);
        scanner.close();
    }
}

