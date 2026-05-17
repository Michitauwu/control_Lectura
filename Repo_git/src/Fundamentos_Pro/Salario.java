package Fundamentos_Pro;
import java.util.Scanner;
public class Salario {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in == null ? System.in : System.in);
        System.out.print("Ingrese las horas trabajadas esta semana: ");
        int horas = scanner.nextInt();
        System.out.print("Ingrese la tarifa por hora: ");
        double tarifa = scanner.nextDouble();
        
        double salarioTotal;
        if (horas <= 40) {
            salarioTotal = horas * tarifa;
        } else {
            int horasExtras = horas - 40;
            salarioTotal = (40 * tarifa) + (horasExtras * tarifa * 2);
        }
        
        System.out.printf("El salario total semanal es: $%.2f%n", salarioTotal);
        scanner.close();
    }
}

