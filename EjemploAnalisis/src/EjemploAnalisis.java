// Nombre del archivo: EjemploAnalisis.java

// Importamos las librerías necesarias
import java.util.ArrayList;
import java.util.List;

public class EjemploAnalisis {
    public static void main(String[] args) {
        // Creamos una lista de enteros
        List<Integer> numeros = new ArrayList<>();

        // Llenamos la lista con números del 1 al 1,000,000
        for (int i = 1; i <= 1000000; i++) {
            numeros.add(i);
        }

        // Calculamos la suma de todos los números en la lista
        long suma = calcularSuma(numeros);
        System.out.println("La suma es: " + suma);

        // Buscamos un número en la lista
        boolean encontrado = buscarNumero(numeros, -999);
        System.out.println("Número encontrado: " + encontrado);
    }

    // Método para calcular la suma de una lista de enteros
    public static long calcularSuma(List<Integer> numeros) {
        long suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    // Método para buscar un número en una lista de enteros
    public static boolean buscarNumero(List<Integer> numeros, int objetivo) {
        for (int numero : numeros) {
            if (numero == objetivo) {
                return true;
            }
        }
        return false;
    }
}
