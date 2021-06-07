package Cuestionario;
/**
 * 
 * @author sinuhe
 *
 */
public class Cuestionario {

	/**
	 * Calcula la puntuacion obtenida en una pregunta de un cuestionario segun si ha contestado 
	 * todas las opciones correctas, ha fallado en alguna o no ha acertado en nunguna
	 * 
	 * @param puntos: Puntuacion de la pregunta
	 * @param nOpciones: Numero de opciones a), b), ...
	 * @param correccion: Si es "TOTAL" obtiene la maxima puntaucion. Si es "PARCIAL" obtiene puntos/nOpciones. 
	 * En cualquier otro caso obiene 0. 
	 * @return: puntos que ha obtenido es dicha pregunta
	 */
	public static float puntuacion (int puntos, int nOpciones, String correccion) {
		switch (correccion) {
			case "TOTAL":
				return puntos;
			case "PARCIAL":
				return (float) puntos / nOpciones;
			default:
				return 0;
		}
	}
	public static void main(String[] args) {
		System.out.println( puntuacion( 3, 3, "TOTAL" ) );
		System.out.println( puntuacion( 1, 4, "PARCIAL" ) );
		System.out.println( puntuacion( 1, 4, "NULA" ) );
	}
	
}
