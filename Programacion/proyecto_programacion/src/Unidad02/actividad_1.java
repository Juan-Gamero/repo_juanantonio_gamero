package Unidad02;

import java.util.Scanner;

public class actividad_1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdice el simbolo quequie resrepetir (+ * $ €)");
		String caracteres = scan.nextLine();
		
		System.out.println("Cuantas veces quieres repetirlo");
		int repeticion = scan.nextInt();
		
		System.out.println("Elige la direccion en la que escribir (vertical o horizontal)");
		scan.nextLine();
		String direccion = scan.nextLine();

		System.out.println("caracteres:  " + caracteres + " - repeticion" + repeticion + " - direccion " + direccion);
		
		int indice = 0;
		boolean error = false;
		while (indice < repeticion && !error) {
			if ("vertical".equals(direccion)) {
			} else if ("horizontal".equals(direccion)) {
				System.out.println(caracteres);
			} else {
				System.err.println("La direccion debe ser \"horizontal\" o  \"vertical\"");
				error = true;
			}
			indice++;
		}
	}
}