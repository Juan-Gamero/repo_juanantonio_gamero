package proyecto_programacion;
/**
 * 
 * 
 */
import java.util.Scanner;

public class hola_mundo_pro {

	public static void main(String[] args) {
		System.out.println("Di tu nombre:");
		Scanner scan = new Scanner (System.in);
		String nombre = scan.nextLine();
		System.out.print("Hola" + nombre + "!");
		scan.close();
		
	}

}
