package proyecto_programacion;

import java.util.Scanner;

// Escribe un programa que dada una hora determinada (horas y minutos), cacule los segundos que faltan para llegar a la medianoche

public class Paramedianoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdice la hora actual con formato HH:MM")
		String horaString = scan.nextLine();
		int hora = Integer.parsetInt();
		int hora
		int minutos = scan.nexInt();
		int horasparamedianoche =(23 - hora)
		int minutosparamedianoche (60 - minutos)
		int segparamedianoche = horasparamedianoche * 3600 + minutosparamedianoche * 60;
		System.out.println("\n Quedan " " + segoaramedianoche + "seg para medianoche.");
		scan.close();
	}

}
