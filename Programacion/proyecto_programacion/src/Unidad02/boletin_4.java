package Unidad02;

import java.util.Scanner;

public class boletin_4 {

	public static void main(String[] args) {
		//declaramos escaner
		Scanner scan = new Scanner(System.in);
		System.out.println("Siendo una ecuancion de segundo grado dame: ");
		System.out.print("Valor de a:");
		double a = scan.nextDouble();
		System.out.print("Siendo una  ecuancion  de segundo grado: ");
		System.out.print("Valor de b:");
		double b = scan.nextDouble();
		System.out.print("Siendo una  ecuancion  de segundo grado: ");
		System.out.print("Valor de c:");
		double c = scan.nextDouble();
		//transformamos en algoritmica
		//double xpos = (-b + Math.sqrt (Math.pow (b, 2) - 4 * a * c)/2 * a);
		//double xneg = (-b - Math.sqrt (Math.pow (b, 2) - 4 * a * c)/2 * a);
		scan.close();
		
		//operaciones
		if (a == 0) {
			System.out.print("No puede ser 0");
		
		} else if (Math.pow (b, 2) <= 4 * a * c) {
		System.out.println("El valor b debe de ser mas alto: ");
		
		} else {
			double xpos = (-b + Math.sqrt (Math.pow (b, 2) - 4 * a * c)/2 * a);
			double xneg = (-b - Math.sqrt (Math.pow (b, 2) - 4 * a * c)/2 * a);
			System.out.print("Aqui tienes tu solucion es: " + xpos + xneg);
			}
	}

}
