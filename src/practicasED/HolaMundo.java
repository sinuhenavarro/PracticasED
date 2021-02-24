/**
 * 
 */
package practicasED;

/**
 * @author sinuhe
 *
 */


public class HolaMundo {

	/**
	 * 
	 */
	private String mensaje;
	public HolaMundo() {
		// TODO Auto-generated constructor stub
		mensaje = new String("Hola chavalxs");
	}
	public void MostrarMensaje() {
		System.out.print(mensaje);
	}
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HolaMundo h = new HolaMundo();
	h.MostrarMensaje();
		
	}

}
