/**
 * 
 */
package practicasED;

/**
 * @author sinuhe
 *
 */
import java.io.*;

public class Maximo {

	public static void main (String args[]) throws IOException {
	    BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
	
	    int a,b,c,max;
	
	    System.out.println("Introduce a ");
	    a =  Integer.parseInt (entrada.readLine()); 
	    System.out.println("Introduce b: ");
	    b =  Integer.parseInt (entrada.readLine());
	    System.out.println("Introduce c: ");
	    c =  Integer.parseInt (entrada.readLine());
	
	    if (a>b && a>c) {
	        max = a;
	    } else {
		if (c>b){
			max = c;
		} else {
			max = b;
	        }
	    }
	    System.out.println("---------------------------");
	    System.out.println ("El máximo es " + max);
	}
}
