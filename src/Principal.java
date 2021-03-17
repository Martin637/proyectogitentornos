import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		//int opcion;
		do {
			System.out.println("Bienvenido al menú.\n--------------------------------\n1. MostrarNumeros.\n2. ConvertirLibrasAKilogramos.\n3. ConvertirDolaresAEuros.\n0. Salir.\n--------------------------------\nElige la opción que desees(0-3):");
			opcion = sc.nextInt();
			if (opcion < 0 || opcion > 3) {
				System.out.println("La opción introducida no es válida, vuelva a elegir.");
				System.out.flush();
			}
			if (opcion == 0) {
				System.out.println("¡Hasta pronto, vuelva cuando quiera!");
			}
			switch (opcion) {
			case 1:
				EjerciciosProgramacion.mostrarNumeros();
				System.out.println();
				break;
				
			case 2:
				System.out.print("Introduce la cantidad de libras a convertir a kilogramos: ");
				double cantidadLibras = sc.nextDouble();
				double valorEnKilogramos = EjerciciosProgramacion.convertirLibrasAKilogramos(cantidadLibras);
				System.out.println(cantidadLibras + "£ son " + valorEnKilogramos + "kg.\n");
				break;
				
			case 3:
				System.out.print("Introduce el valor de dólares a convertir a euros: ");
				double cantidadDolares = sc.nextDouble();
				double valorEnEuros = EjerciciosProgramacion.convertirDolaresAEuros(cantidadDolares);
				System.out.println (cantidadDolares + "$ son " + valorEnEuros + "€.\n");
				break;
			}
			
		}while(opcion!=0);
		sc.close();
	}

}

