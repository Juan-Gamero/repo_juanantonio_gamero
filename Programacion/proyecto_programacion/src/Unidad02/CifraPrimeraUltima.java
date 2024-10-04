package Unidad02;

import java.util.Scanner;

public class CifraPrimeraUltima {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Dime varios numeros: ");
		int numero = scan.nextInt();
		
		System.out.print("""
				Elige una opcion:
				1. cual es la primera cifra de un numero enterointroducido por el teclado
				2. Ultima cifra
				""");
		do {
			
		} while (opcion 1 == | case 2 );
		switch (opcion) {
			case 1: 
				//obtiene la primera cifra del numero
				int dividendo = numero;
				int primeracifra = 0;
				while (dividendo != 0) {
					//dividendo = dividendo / 10;
					primeracifra = dividendo;
					dividendo /= 10;
				}
				System.out.print("La primera cifra del numero " + numero + " es " + primeracifra);
				break;
			case 2:
				//Obtiene la ultima cifra del numero
				int ultimacifra = numero %  10;
				System.out.println("La ultima cifra del  numero " + numero + " es " + ultimacifra);
				break;
			default:
				//no se ha introducido ni 1 ni 2
				System.out.print("No has elegido una opcion valida!");
				break;
		}
	}

}
