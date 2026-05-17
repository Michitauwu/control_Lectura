package Fundamentos_Pro;
import java.util.Scanner;
public class E_Condicional {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la calificación del estudiante (0.0 - 5.0): ");
        double nota = scanner.nextDouble();
        
        if (nota < 0 || nota > 5) {
            System.out.println("Nota no válida.");
        } else if (nota >= 4.5) {
            System.out.println("Desempeño: Excelente");
        } else if (nota >= 4.0) {
            System.out.println("Desempeño: Sobresaliente");
        } else if (nota >= 3.0) {
            System.out.println("Desempeño: Aceptable");
        } else {
            System.out.println("Desempeño: Insuficiente");
        }
        scanner.close();
    }
}

