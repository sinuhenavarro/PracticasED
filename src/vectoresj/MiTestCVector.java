package vectoresj;


import java.util.Random;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;



public class MiTestCVector {
	public CVector instance;
	
    @BeforeEach
    public void setUpClass() {
    	System.out.println("Creado Objeto CVector");
    	instance = new CVector(); 
    }

    /**
     * Test of insertar method, of class CVector.
     */
    @Test
    public void encuentraPosicion0() {
        System.out.println("encuentraPosicion - Caso 0");
        Random r = new Random();       
        try {
        	for (int i=0; i<50; i++){
                instance.insertar(r.nextInt());
            }
            instance.insertar(13);     
            assertEquals(50,instance.encuentraPosicion(13,0));
        } catch (Exception e){
            System.out.println("ERROR:" + e.getMessage());
        }
    }    

}
