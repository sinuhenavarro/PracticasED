package busquedaBinaria;

public class ArrayNoOrdenadoException extends Exception{
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String str1;
	   /* Constructor of custom exception class
	    * here I am copying the message that we are passing while
	    * throwing the exception to a string and then displaying 
	    * that string along with the message.
	    */
	    public ArrayNoOrdenadoException(String s)
	    {
	        // Call constructor of parent Exception
	        super(s);
	    }
}
