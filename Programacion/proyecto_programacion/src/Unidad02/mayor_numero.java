package Unidad02;

import java.util.Scanner;

public class mayor_numero_tres{

	public static void main(String[] args) {
		//declaraion para obtener datos
		Scanner scan = new Scanner (System.in);
		//pedir al cliente tres numeros
		System.out.println("Introduce tres numeros:");
		System.out.print("Introduce el primer numero:");
		int num1 = scan.nextInt();
		System.out.print("Introduce el segundo numero:");
		int num2 = scan.nextInt();
		System.out.print("Introduce el tercer numero");
		int num3 = scan.nextInt();
		scan.close();
		int mayor;
		
		if (num1 >= num2) {
			mayor=num1;
		
		if (mayor < num3) {
			mayor=num3;
		}
		else { (mayor = num2) 
			if (mayor = num3) {
			mayor= num3;
		}
		System.out.print("El mayor es:" + mayor);
		}

		}
	}
}
		
