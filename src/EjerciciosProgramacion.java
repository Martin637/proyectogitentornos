/**
 * Clase Ejercicios de programaci�n que contienen distintos m�todos.
 * @author Mart�n Garc�a Castillo
 * @version Alpha 1.0
 * @since 2021
 */
public class EjerciciosProgramacion {

	static final double UNA_LIBRA_A_KILOGRAMO = 0.453592;
	static final double UN_DOLAR_A_EURO = 0.85;

	/**
	 * M�todo void que mostrar� los n�meros del 1 al 10 mediante un bucle fori.
	 */
	public static void mostrarNumeros(){
		//m�todo que muestra los n�meros del 1 al 10 con un bucle for
		System.out.println("Muestra los n�meros del 1 al 10:");
		
		for (int i = 1; i<=10; i++){
			System.out.printf("%5d", i);
		}
		System.out.println();
	}

	/**
	 * M�todo que convierte las libres a kilogramos.
	 * @param cantidadLibras double a convertir.
	 * @return valor en kilogramos de la cantidad de libras seleccionadas.
	 */
	public static double convertirLibrasAKilogramos (double cantidadLibras) {
		
		double valorEnKilogramos = cantidadLibras * UNA_LIBRA_A_KILOGRAMO;
		return valorEnKilogramos;
	}

	/**
	 * M�todo que convierte los d�lares a euros.
	 * @param cantidadDolares double a convertir.
	 * @return valor en euros de la cantidad de dolares seleccionada.
	 */
	public static double  convertirDolaresAEuros (double cantidadDolares) {
		
		double valorEnEuros = cantidadDolares * UN_DOLAR_A_EURO;
		return valorEnEuros;
	}
	public static void prueba2(){
		System.out.println("Hola");
	}
}