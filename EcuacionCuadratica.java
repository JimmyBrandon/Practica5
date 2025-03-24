package Practica5;

import java.util.Scanner;

public class EcuacionCuadratica {
	    private double a, b, c;

	    public EcuacionCuadratica(double a, double b, double c) {
	        this.a = a;
	        this.b = b;
	        this.c = c;
	    }

	    public double getDiscriminante() {
	        return b * b - 4 * a * c;
	    }

	    public double getRaiz1() {
	        if (getDiscriminante() >= 0) {
	            return (-b + Math.sqrt(getDiscriminante())) / (2 * a);
	        }
	        return Double.NaN; // No válida si no hay raíces reales
	    }

	    public double getRaiz2() {
	        if (getDiscriminante() >= 0) {
	            return (-b - Math.sqrt(getDiscriminante())) / (2 * a);
	        }
	        return Double.NaN; // No válida si no hay raíces reales
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Introduce el valor de a: ");
	        double a = scanner.nextDouble();
	        System.out.println("Introduce el valor de b: ");
	        double b = scanner.nextDouble();
	        System.out.println("Introduce el valor de c: ");
	        double c = scanner.nextDouble();

	        EcuacionCuadratica ecuacion = new EcuacionCuadratica(a, b, c);

	        double discriminante = ecuacion.getDiscriminante();
	        if (discriminante > 0) {
	            System.out.println("La ecuación tiene dos raíces reales:");
	            System.out.println("Raíz 1: " + ecuacion.getRaiz1());
	            System.out.println("Raíz 2: " + ecuacion.getRaiz2());
	        } else if (discriminante == 0) {
	            System.out.println("La ecuación tiene una única raíz real:");
	            System.out.println("Raíz: " + ecuacion.getRaiz1());
	        } else {
	            System.out.println("La ecuación no tiene raíces reales.");
	        }

	        scanner.close();
	    }
}
	
