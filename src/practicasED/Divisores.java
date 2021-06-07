package divisores;

public class Divisores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * Metodo que devuelve la suma de los divisores enteros de un numero dado.
	 * @param x: Numero del que se calculan los divisores.
	 * @return: La suma de los divisores enteros de x.
	 */
	
	public static int sumdeDiv(int x)
    {
        // 1 es un divisor propio
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(x); i++)
        {
            if (x % i == 0)
            {
                sum += i;

                // Para manejar cuadrados perfectos
                if (x / i != i)
                    sum += x / i;
            }
        }

        return sum;


}
