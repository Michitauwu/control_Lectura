package Fundamentos_Pro;
import java.util.Scanner;
public class Evaluo_Fi {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        // Configuración del arreglo para almacenar los datos
        int cantidadAlumnos = 5;
        double[] calificaciones = new double[cantidadAlumnos];
        boolean datosCargados = false; // Bandera para controlar el flujo
        
        do {
            System.out.println("\n====================================");
            System.out.println("          MENÚ DE OPCIONES          ");
            System.out.println("====================================");
            System.out.println("1. Procesar Datos (Ingresar Calificaciones)");
            System.out.println("2. Ver Resultados (Mostrar Estadísticas)");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción válida (1-3): ");
            
            // Validación para asegurar que el usuario ingrese un número entero
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número entero.");
                scanner.next(); 
                System.out.print("Seleccione una opción válida (1-3): ");
            }
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("\n--- OPCIÓN 1: PROCESAR DATOS ---");
                    System.out.println("Ingrese las " + cantidadAlumnos + " calificaciones del grupo (rango: 0.0 - 5.0):");
                    
                    for (int i = 0; i < calificaciones.length; i++) {
                        do {
                            System.out.print("Calificación del estudiante " + (i + 1) + ": ");
                            while (!scanner.hasNextDouble()) {
                                System.out.println("Entrada inválida. Por favor use punto o coma según su sistema decimal.");
                                scanner.next();
                                System.out.print("Calificación del estudiante " + (i + 1) + ": ");
                            }
                            calificaciones[i] = scanner.nextDouble();
                            
                            if (calificaciones[i] < 0 || calificaciones[i] > 5) {
                                System.out.println("Error: La calificación debe estar estrictamente entre 0.0 y 5.0.");
                            }
                        } while (calificaciones[i] < 0 || calificaciones[i] > 5); // Repite si está fuera de rango
                    }
                    
                    datosCargados = true; // Cambia el estado indicando que ya hay información
                    System.out.println("\n¡Todos los datos fueron procesados y guardados correctamente!");
                    break;
                    
                case 2:
                    System.out.println("\n--- OPCIÓN 2: VER RESULTADOS ---");
                    // Validación de seguridad para verificar si existen datos almacenados
                    if (!datosCargados) {
                        System.out.println("Advertencia: No hay datos en el sistema. Primero debe ejecutar la Opción 1.");
                    } else {
                        double suma = 0;
                        double notaAlta = calificaciones[0];
                        double notaBaja = calificaciones[0];
                        
                        System.out.print("Calificaciones registradas: [ ");
                        for (int i = 0; i < calificaciones.length; i++) {
                            System.out.print(calificaciones[i] + " ");
                            suma += calificaciones[i];
                            
                            // Lógica para hallar el número mayor (Nota más alta)
                            if (calificaciones[i] > notaAlta) {
                                notaAlta = calificaciones[i];
                            }
                            // Lógica para hallar el número menor (Nota más baja)
                            if (calificaciones[i] < notaBaja) {
                                notaBaja = calificaciones[i];
                            }
                        }
                        System.out.println("]");
                        
                        double promedio = suma / calificaciones.length;
                        
                        // Impresión de resultados estadísticos
                        System.out.printf("Promedio final del grupo : %.2f%n", promedio);
                        System.out.println("Calificación más alta    : " + notaAlta);
                        System.out.println("Calificación más baja    : " + notaBaja);
                    }
                    break;
                    
                case 3:
                    System.out.println("\nFinalizando la sesión. ¡Hasta luego!");
                    break;
                    
                default:
                    System.out.println("Opción incorrecta. El número debe ser 1, 2 o 3. Intente de nuevo.");
            }
            
        } while (opcion != 3); // Rompe el ciclo do-while únicamente si la opción es 3
        
        System.out.println("Programa cerrado con éxito.");
        scanner.close();
    }
}
