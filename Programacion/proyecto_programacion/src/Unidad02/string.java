package Unidad02;

import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Hola:");
		String variable = scan.nextLine();
		char caracter = 'r'; 
		System.out.println(variable + caracter);
		scan.close();
	}

}
