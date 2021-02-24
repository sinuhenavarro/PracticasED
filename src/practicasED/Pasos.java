package practicasED;

public class Pasos {

	public static void main(String[] args) {
		Pasos p = new Pasos();
		try {
			switch (p.esfuerzo(2500)){
			case 1:  
				System.out.println("¡Lleva una vida sedentaria!");
				break;
			case 2:  
				System.out.println("¡Buen comienzo!");
				break;
			case 3:  
				System.out.println("¡Se acerca al objetivo!");
				break;
			case 4:  
				System.out.println("¡No está mal!");
				break;
			case 5:  
				System.out.println("¡Así se hace!");
				break;
			}
		}catch(Error e) {
			System.out.println(e.getMessage());
		}
		
	}
	/**
 *  Devuelve una serie de valores que determinan rangos de esfuerzo 
 *  que serán traducidos a mensajes de feedback positivo opr el usuario de la clase.
 * @param n: Número de pasos 
 * @return: Una puntuación del esfuerzo según rangos del número de pasos
 * @exception IllegalArgumentException si el número de pasos no es válido
 */
	public int esfuerzo(int n){
		int salida=1;
		
		if(n<0) {
			throw new IllegalArgumentException("No se pueden caminar pasos negativos");
		}else if (n<1000) 
			salida = 1;
		else if(n>=1000 && n<2000) 
			salida = 2;
		else if(n>=2000 && n<4000) 
			salida = 3;
		else if(n>=4000 && n<6000) 
			salida = 4;
		else if(n>=6000 && n<999999999)
			salida = 5;
		else if(n>=999999999)
			throw new IllegalArgumentException("No me lo creo. Seguramente haya ocurrido un error");
		
		return salida;
	}

}
