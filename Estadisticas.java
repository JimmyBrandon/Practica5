package Practica5;

import java.util.Scanner;

public class Estadisticas {

    // Método para calcular el promedio
    public static double promedio(double[] numeros) {
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma / numeros.length;
    }

    // Método para calcular la desviación estándar
    public static double desviacion(double[] numeros, double promedio) {
        double sumaDiferenciasCuadradas = 0;
        for (double numero : numeros) {
            sumaDiferenciasCuadradas += Math.pow(numero - promedio, 2);
        }
        return Math.sqrt(sumaDiferenciasCuadradas / (numeros.length - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10]; // Arreglo para almacenar los 10 números

        System.out.println("Por favor, introduce 10 números:");

        // Leer 10 números del usuario
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        // Calcular promedio
        double promedio = promedio(numeros);

        // Calcular desviación estándar
        double desviacionEstandar = desviacion(numeros, promedio);

        // Mostrar resultados
        System.out.println("\nEl promedio de los números es: " + promedio);
        System.out.println("La desviación estándar es: " + desviacionEstandar);

        scanner.close();
    }
}