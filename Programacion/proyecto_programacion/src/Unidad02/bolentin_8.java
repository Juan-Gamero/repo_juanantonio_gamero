package Unidad02;

import java.util.Scanner;

public class bolentin_8 {

	public static void main(String[] args) {
		//declaraos el scaner
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame tres numeros: ");
		System.out.println("Dame a: ");
		Double a = nextDouble();
		System.out.println("Dame b: ");
		int b = nextInt();
		System.out.println("Dame c: ");
		int c = nextInt();
		int mayor;
		//comenzamos operaciones
		if (a < b) {
			mayor = a;
		} else if (mayor > c) {
			mayor = c;
		} else {
			mayor = b;
		}
	}
}