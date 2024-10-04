package Unidad02;

import java.util.Scanner;

public class mayor_num {

	public static void main(String[] args) {
		//opcion A. indicamos el numero de datos a evaluar
		// B. establecemos una instruccion de parada
		Scanner scan= new Scanner(System.in);
		System.out.println("Este programa devuelve el mayor de todos los numeros introducidos:");
		System.out.print("Introduce el  numero de datos para calcular el maximo numero:");
		int numerodedatos = scan.nextInt();
		int mayornumero= Integer.MIN_VALUE;
		for (int index = 0; index < numerodedatos; index++) {
			System.out.println ("Introduce el  dato numero " + (index + 1));
			System.out.println("Recuerda que vas a introducir" + numerodedatos);
			int numactual = scan.nextInt();
			if (mayornumero < numactual) {
				mayornumero = numactual;
			}
			System.out.println("Te falta " + (numerodedatos - index - 1) + "datos."); 
		}
		System.out.println("El mayor numero introducido es el " + mayornumero);
		String numerocadena = scan.nextLine();
		int numeroentero = Integer.parseInt(numerocadena);
	}

}
