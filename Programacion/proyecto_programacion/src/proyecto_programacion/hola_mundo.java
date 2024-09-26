package proyecto_programacion;

import java.util.Scanner;

public class hola_mundo {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Di tu nombre:");
		String nombre = scan.nextLine();
		//cuando el usuario no pone nombre se forma una cadena vacia, es decir, ""
		nombre = "".equals(nombre) ? "amigo" : nombre;
		System.out.print("Hola " + nombre + "!");
		scan.close();
	}

}
