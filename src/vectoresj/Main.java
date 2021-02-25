/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresj;

/**
 *
 * @author Lorenzo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CVector v= new CVector();
        int i;
        try {
            for (i=1; i<75; i++){
                v.insertar((int)(Math.random()*100));
            }
        } catch (VectorLlenoException e){
            System.out.println("El vector está lleno");
        }
        v.mostrar_vector();
        v.ordenar_vector();
        System.out.println("El vector ordenado es:");
        v.mostrar_vector();
        
        
    }
}
