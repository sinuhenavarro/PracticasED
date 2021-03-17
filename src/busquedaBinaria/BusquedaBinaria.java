package busquedaBinaria;


public class BusquedaBinaria {

	/** 
	 * Busca un número entero en un array de enteros ordenados de nenor a mayor
	 * entre los hiIndex primeros elementos
	 * 
	 * @param x Array de enteros ordenados de menor a mayor.
	 * @param srch Número entero que se desea encontrar en el array x.
	 * @param hiIndex Primeros números del array x en los que se busca srch
	 * @return false si no lo encuentra y true si lo encuentra.
	 * @throws ArrayNoOrdenadoException si los primeros hiIndex números del array no están ordenados de menor a mayor
	 * @throws IndexOutOfBoundsException si hiIndex es mayor que la longitud del array
	 */
	public boolean buscar (int [] x, int srch, int hiIndex) throws ArrayNoOrdenadoException {
		int loIndex = 0; 
		int midIndex;
		
		
		if (hiIndex > x.length-1) 
			throw new IndexOutOfBoundsException("hiIndex debe ser menor que la longitud del array");
		
		for(int i=0;i<hiIndex;i++)
			if(x[i]>x[i+1]) 
				throw new ArrayNoOrdenadoException("Los primeros " + hiIndex + " elementos del array NO están ordenados");
			
		while (loIndex <= hiIndex)  { 
	         midIndex = (loIndex + hiIndex) / 2; 
	         if (srch > x [midIndex]) 
	             loIndex = midIndex + 1; 
	         else if (srch < x [midIndex]) 
	             hiIndex = midIndex - 1; 
	         else 
	             break; 
	      } 
	      if (loIndex > hiIndex) 
	          return false;
	      else 
	          return true;
		
	}
	public static void main (String []args) {
		BusquedaBinaria v = new BusquedaBinaria();
		int x[] = {1,2,44,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		try {
			if(v.buscar(x,13, 13)) {
				System.out.println("Encontrado !!");
			}
			else {
				System.out.println("No encontrado");
			}
		}catch (IndexOutOfBoundsException e) {
			System.out.println("Error: " + e.getMessage());
		}catch (ArrayNoOrdenadoException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}
}
