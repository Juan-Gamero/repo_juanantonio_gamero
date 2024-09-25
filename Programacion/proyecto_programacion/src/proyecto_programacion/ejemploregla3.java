package proyecto_programacion;

public class ejemploregla3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Aqui escribiremos nuestr codigo de resolucion de reglas
					System.oout.print(""""
			  			Introduce los valores para resolver la regla de 3
			  			a ---> b
			  			c ---> x
			  			""")
						Scanner scan = new Scanner(System.in);
			  		System.oout.print("Introduce el parametro a:");
					double a = scan.nextDouble();
					System.oout.print("Introduce el parametro b:");
					double b = scan.nextDouble();
					System.oout.print("Introduce el parametro c:");
					double c = scan.nextDouble();
					// solucion x = (a*b)/a
					double x = (b*c)/a;
					System.out.println("\nLa solucion de ka regla de 3 es:");
					System.out.print (a);
					System.out.print (" ---> ");
					System.out.print(b);
	}

}
