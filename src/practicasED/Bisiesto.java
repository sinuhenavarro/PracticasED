package practicasED;

public class Bisiesto {

	public boolean esBisiesto (int anio) {
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

}
