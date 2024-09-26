package Unidad02;

import java.util.Scanner;

public class menu_mentira {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print(" MENU.  elige una opcion:");
		System.out.print("  1. Comprimir  archivo:");
		System.out.print(" 2. Eliminar archivo:");
		System.out.print(" 3. Copiar arichivo:");
		System.out.print(" 4. Cerrar programa:");
		int opcion = scan.nextInt();
		scan.close();
				if (opcion  == 1) {
					System.out.println("Comprimiendo archivo...");
				} else if (opcion == 2){
					System.out.println("Eliminando archivo...");
				} else if (opcion == 3){
					System.out.println("Copiar archivo...");
				} else if (opcion == 4){
					System.out.println("Cerrando programa");
				} else {
					System.out.println("Hasta la proxima");	
				}
	}

}
