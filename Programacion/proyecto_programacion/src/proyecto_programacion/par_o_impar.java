package proyecto_programacion;

import java.util.Scanner;

public class par_o_impar {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Introduce in numero entereo y veremos si es par o impar");
		int numero;
		numero = scan.nextInt();
		String paridad;
		paridad  = numero % 2 == 0 ? "par" : "impar";
		System.out.println("El numero intrudico es : " + paridad);
		scan.close();
	}

}
