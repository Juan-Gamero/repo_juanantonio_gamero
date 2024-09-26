package Unidad02;

import java.util.Scanner;

/**
 * Introducioendo un año de nacimiento, el programa dira si el:
 * bebe:  0-2 años
 * niñ@: 3-11 años
 * adolescente: 12-18 años
 * adulto: 19-65 años
 * anciano: +65
 * mostrara error  si la edad es menor a 0 años
 */
public class Programavital {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Dime tu año de nacimiento:");
		int anio = scan.nextInt();
		scan.close();
		int edad = 2024-anio;
		if (edad < 0) {
			System.out.println("No puede ser");
		} else if (edad <= 2){
			System.out.println("Eres un bebe");
		} else if (edad  <= 11){
			System.out.println("Eres un niñ@");
		} else if (edad  <= 18){
			System.out.println("Eres adolescente");
		} else if (edad  <= 65){
			System.out.println("Eres adulto");
		} else {
			System.out.println("Eres anciano");	
			}
	}

}
