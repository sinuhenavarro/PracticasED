package conducir;

public class Conducir {

	static boolean puedeConducir(int edad, String pais) {
		if(	(edad >= 16 && pais == "US") || 
			(edad >= 18 && pais == "ES") ){
			return true;
		}
		else{
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(puedeConducir(17,"ES"));
		System.out.println(puedeConducir(18,"ES"));
		System.out.println(puedeConducir(19,"ES"));
		System.out.println(puedeConducir(15,"US"));
		System.out.println(puedeConducir(16,"US"));
		System.out.println(puedeConducir(17,"US"));

	}
}
