package jubilacion;

/**
 * 
 * clase principal con el método main donde se crea un objeto Persona
 * 
 * @author Diego Bello
 * 
 */
public class Principal {

	/**
	 * @param args En este caso no es utilizado.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona usuario = new Persona(0);

		usuario.setEdad(0);// llamada para pedir la edad

		usuario.jubilacion();// llamada para el cálculo

	}

}