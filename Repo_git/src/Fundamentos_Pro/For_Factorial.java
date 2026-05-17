package Fundamentos_Pro;
import java.util.Scanner;
public class For_Factorial {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero no negativo: ");
        int numero = scanner.nextInt();
        
        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
        scanner.close();
    }
}

