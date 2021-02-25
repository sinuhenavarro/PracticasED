/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresj;

/**
 *
 * @author Lorenzo
 */
public class CVector {
    private int[] vector;
    private int nElementos;
    
    /**
     * Constructor de la clase
     */
    public CVector(){
        vector= new int[100];
        nElementos=0;     
    }
    
    /**
     * Inserta un elemento en el vector en caso de no haber llegado al límite. En otro caso se genera una excepción
     * @param elemento
     * @throws VectorLlenoException
     */
    public void insertar(int elemento) throws VectorLlenoException{
        if (nElementos<100){
            vector[nElementos]=elemento;
            nElementos++;
        } else {
            throw new VectorLlenoException();
        }
    }
    
    /**
     * Devuelve true si el vector está lleno y false en otro caso
     * @return
     */
    public boolean vector_lleno(){
        return (nElementos>=100);
    }
    
    /**
     * Ordena el vector en orden ascendente
     */
    public void ordenar_vector(){
        int i,j,temp;
        
        for (i=0; i<nElementos-1; i++){
            for (j=i+1;j<nElementos; j++){
                if (vector[i]>vector[j]){
                    temp=vector[j];
                    vector[j]=vector[i];
                    vector[i]=temp;
                }
            }
        }
    }
    
    /**
     * Imprime por pantalla los elementos del vector
     */
    public void mostrar_vector(){
        int i;
        
        for (i=0; i<nElementos; i++){
            System.out.print(vector[i]+" ");
        }
        System.out.print("\n");
    }
    
    /**
     * Devuelve el elemento situado en la posición que se pasa como parámetro si es una posición válida. 
     * En otro caso se genera la excepción ArrayIndexOutOfBoundsException
     * @param pos
     * @return
     * @throws ArrayIndexOutOfBoundsException
     */
    public int posicion(int pos) throws ArrayIndexOutOfBoundsException {
        if (pos>=0 && pos<nElementos){
            return vector[pos];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    
    @Override
    public String toString(){
        String resultado="{";
        for (int i=0; i<nElementos; i++){
            resultado+=(i>0)?","+vector[i]:vector[i];
        }
        resultado += "}";
        return resultado;
    }
    
    /**
     * Devuelve la posición del elemento que se recibe como parámetro empezando 
     * buscar desde posInicial. 
     * 
     * @param n elemento a buscar
     * @param posInicial posición desde la que se desea iniciar la búsqueda
     * @return posición en la que se encuentra el elemento o -1 si no se encuentra
     * @throws IllegalArgumentException si la posición inicial que recibe el negativa 
     *                                  o mayor que el número de elementos incluidos en el vector
     */
    public int encuentraPosicion(int n, int posInicial) throws IllegalArgumentException{
        int pos;
        boolean encontrado=false;
        if (posInicial<0){
            throw new IllegalArgumentException("La posicion inicial no puede ser negativa");
        } else if (posInicial>=nElementos){
            if (nElementos==0){
                return -1;
            } else {
                throw new IllegalArgumentException("La posicion inicial es mayor que el número de elementos del vector");
            }
        } else {
            pos=posInicial;
            do {
                if (vector[pos]==n){
                    encontrado=true;
                } else {
                    pos++;
                }
            } while (!encontrado && pos<nElementos);
        }
        
        return (encontrado)?pos:-1;
    }
}
