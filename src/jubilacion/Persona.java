package jubilacion;

import java.util.Scanner;

/**
 * clase llamada Persona con un atributo llamado edad
 * 
 * @author Diego Bello
 */

public class Persona {

	private int edad = 0;

	/**
	 * <strong>constructor Método constructor para el ojeto persona con el parámetro
	 * edad
	 * 
	 * @param edad. Debe ser un parámetro de tipo entero
	 */

	/////////////////////////// constructor ///////////////////////////
	public Persona(int edad) {
		this.edad = edad;
	}

	///////////////////////////// get//////////////////////////
	/**
	 * Método Get para que nos muestre la edad
	 * 
	 * @return La edad
	 */
	public int getEdad() {
		return edad;
	}

	///////////////// set /////////////////////////////

	/**
	 * Método set para dar valor a la edad La edad es un tipo de dato entero que es
	 * pedido por consola
	 * 
	 * 
	 * @param edad the edad to set
	 * 
	 * @see Clase Scanner del API de Java
	 */
	public void setEdad(int edad) {
		System.out.println("Introduce tu edad");
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		this.edad = teclado.nextInt();
	}

	///////////////////////////// método ////////////////////////////////

	/**
	 * 
	 * Método que utiliza la edad introducida para averiguar cuánto queda para la
	 * jubilación Devuelve un mensaje por pantalla dependiendo de si quedan más o
	 * menos de diez años
	 */
	public void jubilacion() {
		int restAnos = 65 - edad;// variable local para almacenar la diferencia hasta la jubilación(65)
		if (restAnos <= 10) {
			System.out.println("¡¡ Vamos, ya queda poco !!");
		} else
			System.out.println("¡¡ A seguir trabajando gandul !!");
	}

}
