package validarFormulario;


public class Formulario {
	private String user;
	private String pass;
	
	/**
	 * Constructor de la clase. Asigna los valores u y p pasados como parámetros a las variables de 
	 * la clase user y pass pero solo si ambos son válidos según los métodos userValido() y passValido(),
	 * es decir, si u NO contiene la letra ñ y si p contiene entre 10 y 15 caracteres.
	 * @param u: Contiene un nombre de usuario que ha de verificarse y asignarse a la variable user del objeto.
	 * @param p: Contiene un password que ha de verificarse y asignarse a la variable pass del objeto.
	 * @throws Exception: Se lanza si alguna de las verificaciones NO resulta válida.
	 */
	public Formulario(String u, String p) throws Exception {
		if(userValido(u) && passValido(p)) {
			user = u;
			pass = p;
			System.out.println("Creado correctamente");
		}else
			throw new Exception("los parámetros no cumplen con los requisitos");
	}
	
	/**
	 * Método cuyo objetivo es verificar si el parámetro u NO contiene la letra ñ 
	 * @param u: contiene una cadena de caracteres con un nombre de usuario
	 * @return: false si contiene la ñ (usuario no válido) y true si NO contiene la ñ (usuario válido)
	 */
	public boolean userValido(String u) {
        boolean valido = true;
        int i=0;

        while(i<u.length() && valido == true) {
        	if(u.charAt(i) == 'ñ') {
        		valido = false;
        	}
        	i++;
        }
		return valido;
	}
	/**
	 * Comprueba si la cadena de caracteres p que contiene un password tiene una longitud
	 * entre 10 y 15 caracteres para validar un password
	 * @param p: String que contiene el password que ha de ser validado
	 * @return: TRUE si p tiene entre 10 y 15 caracteres. FALSE si tiene menos de 10 o más de 15.
	 */
	public boolean passValido(String p) {
		boolean valido = true;
		
        //Comprobando la validez de p
        if(p.length() < 10 || p.length() >15) {
        	valido = false;
        }
        
        return valido;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Formulario f = new Formulario("sinuhe", "mi_password");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
