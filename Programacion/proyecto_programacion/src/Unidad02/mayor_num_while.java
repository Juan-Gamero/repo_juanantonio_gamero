package Unidad02;

import java.util.Scanner;

public class mayor_num_while {

	public static void main(String[] args) {
		//opcion A. indicamos el numero de datos a evaluar
		// B. establecemos una instruccion de parada
		Scanner scan= new Scanner(System.in);
		System.out.println("Este programa devuelve el mayor de todos los numeros introducidos:");
		System.out.print("Introduce \"STOP\" cuando quieras para de introducir numeros:");
		int mayornumero= Integer.MIN_VALUE;
		String dato = "0";
		boolean salir = false;
		 do {
			 System.out.println("Introduce un entero");
			 dato = scan.nextLine();
			 if ("STOP".equalsIgnoreCase(dato)) {
				 salir = true;
			} else {
				int datoEntero = Integer.parseInt(dato);
				//mayorNumero = datoEntero > mayornumero ? datoEntero : mayorNumero;
			}
		 }while (!salir);
		 scan.close();
		 System.out.println("El mayor numero introducido es " + mayornumero);
	}
}
