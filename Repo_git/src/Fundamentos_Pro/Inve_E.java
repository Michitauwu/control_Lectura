package Fundamentos_Pro;

public class Inve_E {
	public static void main(String[] args) {
        int[] arreglo = {10, 20, 30, 40, 50};
        
        System.out.print("Arreglo original: ");
        imprimirArreglo(arreglo);
        
        // Algoritmo de inversión usando una variable temporal
        for (int i = 0; i < arreglo.length / 2; i++) {
            int temporal = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - 1 - i];
            arreglo[arreglo.length - 1 - i] = temporal;
        }
        
        System.out.print("Arreglo invertido: ");
        imprimirArreglo(arreglo);
    }
    
    public static void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
