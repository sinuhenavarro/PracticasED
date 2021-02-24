package practicasED;
import java.util.Scanner;
/* NO ESTÁ TERMINADO. SOLO AÑADE FICHEROS. 
 * HAY QUE AÑADIR MODIFICAR ARCHIVOS Y ELIMIMNAR */

//Clase que servirá para realizar una simulación de estrategias de almacenamiento en disco
public class Hdd {
	private int[] disco; //Array que simulara el espacio en disco en número de clústeres.
	public float fraginterna; // Representa el espacio desperdiciado total que se va perdiendo al final de cada clúster
	public int espaciolibre; //Representa el número de clústeres
	public float clustersize; //Representa el tamaño en bytes del clúster
	private int nclusteres;
	
	public Hdd() {
		nclusteres = 10;
		disco = new int[nclusteres]; //Se reserva un espacio de 100 clústeres para almacenar archivos.
		for(int i=0;i<nclusteres; i++) disco[i] = 0; //Consideramos los clusters con valor 0 vacíos y con valor 1 ocupados
		fraginterna = 0;
		espaciolibre = nclusteres;
		clustersize = 1; //Valor por defecto del tamaño del clúster de 1 byte;
	}

	public boolean primerAjuste(float filesize) {
		//filesize representa el tamaño en bytes de un archivo
		//Devuelve true si lo ha podido almacenar y false si no había hueco suficientemente grande para albergar al fichero
		//Este método simulará la estrategia de primer ajuste de almacenamiento en disco que consiste en colocar el archivo en el primer hueco que encuentre disponible
		
		/* CALCULAMOS LOS CLÚSTERES NECESARIOS PARA ALBERGAR AL FICHERO 
		 * Y ACTUALIZAMOS LA FRAGMENTACIÓN EN CASO DE QUE HUBIERA */
		int clusteresnecesarios;
		float parteDecimal = filesize % 1; // Lo que sobra de dividir al número entre 1
		float parteEntera = filesize - parteDecimal; // Le quitamos la parte decimal usando una resta
		if (parteDecimal != 0) {
			clusteresnecesarios = (int) parteEntera + 1; // Si el tamaño de archivo es 1.3 bytes se necesitarán 2 cluster de 1 byte para guardarlo
			fraginterna = fraginterna + parteDecimal; //se produce un desperdicio de espacio al final del clúster
		}else 
			clusteresnecesarios = (int) parteEntera;
			
		/* BUSCAMOS HUECO Y SI HAY LO MARCAMOS COMO OCUPADO */
		if (espaciolibre > (nclusteres - clusteresnecesarios) && nclusteres > clusteresnecesarios)  { // Si no hay espacio disponible para el tamaño de archivo dado no es necesario hacer la búsqueda
			for(int i=0; i< nclusteres; i++) { // Comienza la búsqueda de hueco para el archivo
				if(disco[i] == 0) {
					boolean hueco = true;
					for(int j=0; j<clusteresnecesarios; j++) { 
						if (disco[i + j] == 1) {
							hueco = false; //El hueco no es suficientemente grande para que entre el archivo
						}
					}
					if(hueco) {
						for(int j=0; j<clusteresnecesarios; j++) { // Marca como ocupados un número de clústeres
							disco[i + j] = 1; // marcamos los clústeres necesarios como ocupados
						}
						espaciolibre = espaciolibre - clusteresnecesarios;
						i = nclusteres;
						return true;
					}
					i++;
				}
			}
		}
		return false; // No encontró hueco
		
	}
	public void imprimeDisco () {
		for(int i=0;i<nclusteres;i++) {
			System.out.print(disco[i]);
			System.out.print("|");

		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		// Método que realiza la simulación del almacenamiento de arhivos en disco.
		Hdd hdd = new Hdd();
		float filesize;
		String fragstr;
		Scanner leer = new Scanner(System.in);
		System.out.print("Introduce el tamaño del fichero en bytes 0 -1 para salir: ");
		filesize = leer.nextFloat();
		if(!hdd.primerAjuste(filesize)) {
			System.out.println("No hay espacio en disco para este archivo");
		}
		hdd.imprimeDisco();

		while(filesize > 0) {
			System.out.print("Introduce el tamaño del fichero en byte s 0 -1 para salir: ");
			filesize = leer.nextFloat();
			if(!hdd.primerAjuste(filesize)) {
				System.out.println("No hay espacio en disco para este archivo");
			}
			hdd.imprimeDisco();
		}
	}

}
