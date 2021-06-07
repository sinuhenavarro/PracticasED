package Cuestionario;

public class Cuestionario {

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
