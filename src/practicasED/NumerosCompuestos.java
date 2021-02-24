/**
 * 
 */
package practicasED;

/**
 * @author sinuhe
 *
 */
import java.util.Scanner;

public class NumerosCompuestos {

    static boolean esCompuesto(int n)
    {
        // Casos especiales
        if (n == 1)
            return false;
        else if (n == 3) //Añadiendo else restringimos aún más el acceso a esta sección
        	return false;
        // Esto se verifica para que podamos omitir
        // los cinco números intermedios en el bucle siguiente
        // Añadiendo else restringimos aún más el acceso a la siguiente sección
        else if (n % 2 == 0 || n % 3 == 0) return true; 
        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0) {
            	System.out.println("Dentro de 9 y 10");
            	System.out.println("n = " + n);
            	System.out.println("i = " + i);
                return true;
            }
        return false;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int i = 0;
		do {
			//System.out.print("Introduce un número: ");
			//n = sc.nextInt();
			if(esCompuesto(i)) System.out.println(i+" es Compuesto");
			else System.out.println(i+" es Primo");
			i++;
		}while(i<150);

	}
}
