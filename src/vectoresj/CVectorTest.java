/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresj;

import java.util.Random;
import org.junit.
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lprieto
 */
public class CVectorTest {
    
    public CVectorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }

    /**
     * Test of insertar method, of class CVector.
     */
    @Test
    public void testInsertar1() {
        System.out.println("Insertar - Caso1");
        CVector v = new CVector();
        try {
            v.insertar(83);
            assertEquals(83,v.posicion(0));
        } catch (Exception e){
            fail("Ha saldo excepción");
        }
    }

    @Test
    public void testInsertar2() {
        Random r = new Random();
        CVector v = new CVector();
        try {
            for (int i=0; i<99; i++){
                v.insertar(r.nextInt());
            }
            v.insertar(186);
            assertEquals(186,v.posicion(99));
        } catch (Exception e){
            fail("Ha saltado una excepción");
        }
    }
    
    @Test(expected = VectorLlenoException.class)
    public void testInsertar3() throws VectorLlenoException{
        Random r = new Random();
        CVector v = new CVector();
        try {
            for (int i=0; i<100; i++){
                v.insertar(r.nextInt());
            }
        } catch (Exception e){
            fail("Ha saltado una excepción");
        }
        
        v.insertar(523);
       
        
    }
    
    @Test
    public void testVectorLleno1() {
        System.out.println("vector_lleno - Caso1");
        CVector v = new CVector();
        assertFalse(v.vector_lleno());
    }

    @Test
    public void testVectorLleno2() {
        Random r = new Random();
        CVector v = new CVector();
        try {
            for (int i=0; i<99; i++){
                v.insertar(r.nextInt());
            }
            assertFalse(v.vector_lleno());
        } catch (Exception e){
            fail("Ha saltado una excepción");
        }
    }
    
    @Test
    public void testVectorLleno3() throws VectorLlenoException{
        Random r = new Random();
        CVector v = new CVector();
        try {
            for (int i=0; i<100; i++){
                v.insertar(r.nextInt());
            }
        } catch (Exception e){
            fail("Ha saltado una excepción");
        }
        
        assertTrue(v.vector_lleno());
       
        
    }

    /**
     * Test of ordenar_vector method, of class CVector.
     */
    @Test
    public void testOrdenar_vector1() {
        System.out.println("ordenar_vector 1");
        CVector instance = new CVector();
        instance.ordenar_vector();
        assertEquals("{}",instance.toString());
    }

/**
     * Test of ordenar_vector method, of class CVector.
     */
    @Test
    public void testOrdenar_vector2() {
        System.out.println("ordenar_vector 2");
        CVector instance = new CVector();
        try {
            for (int i=0; i<6; i++){
                instance.insertar(5);
            }
            instance.ordenar_vector();

            assertEquals("{5,5,5,5,5,5}",instance.toString());
        } catch (Exception e){
            fail("Ha saltado una excepción");
        }
    }
/**
     * Test of ordenar_vector method, of class CVector.
     */
    @Test
    public void testOrdenar_vector3() {
        System.out.println("ordenar_vector 3");
        int[] v={4,3,12,28,1,4,17,69,82,33,521,8};
        int[] r={1,3,4,4,8,12,17,28,33,69,82,521};
        CVector instance = new CVector();
        try {
            for (int i=0; i<v.length; i++){
                instance.insertar(v[i]);
            }
            instance.ordenar_vector();
            for (int i=0; i<r.length; i++){
                assertEquals(r[i],instance.posicion(i));
            }
        } catch (Exception e){
            fail("Ha saltado una excepción.");
        }
    }
/**
     * Test of ordenar_vector method, of class CVector.
     */
    @Test
    public void testOrdenar_vector4() {
        System.out.println("ordenar_vector 4");
        CVector instance = new CVector();
        Random r = new Random();
        try {
            for (int i=0; i<100; i++){
                instance.insertar(r.nextInt());
            }
        } catch (Exception e){
            fail("Ha saltado una excepción");
        }        
               
        instance.ordenar_vector();
        for (int i=1; i<100; i++){
           assertTrue(instance.posicion(i-1)<=instance.posicion(i)); 
        }
        
    }
    

    /**
     * Test of posicion method, of class CVector.
     */
    @Test
    public void testPosicion1() {
        System.out.println("posicion 1");
        CVector instance = new CVector();
        try {
           instance.insertar(72); 
           assertEquals(72,instance.posicion(0));
        } catch (Exception e){
            fail("Ha saltado una excepción");
        }
        
    }

    /**
     * Test of posicion method, of class CVector.
     */
    @Test
    public void testPosicion2() {
        System.out.println("posicion 2");
        CVector instance = new CVector();
        Random r = new Random();
        int ultimo=0;
        try {
            for (int i=0; i<100; i++){
                ultimo=r.nextInt();
                instance.insertar(ultimo);
            }
            assertEquals(ultimo,instance.posicion(99));
        } catch (Exception e){
            fail("Ha saltado una excepción");
        }        
 
    }

    /**
     * Test of posicion method, of class CVector.
     */
    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testPosicion3() {
        System.out.println("posicion 3");
        CVector instance = new CVector();
        Random r = new Random();
        try {
            for (int i=0; i<100; i++){
                instance.insertar(r.nextInt());
            }
        } catch (Exception e){
            fail("Ha saltado una excepción");
        }   
        instance.posicion(-1);
    }

    /**
     * Test of posicion method, of class CVector.
     */
    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testPosicion4() {
        System.out.println("posicion 4");
        CVector instance = new CVector();
        Random r = new Random();
        try {
            for (int i=0; i<40; i++){
                instance.insertar(r.nextInt());
            }
        } catch (Exception e){
            fail("Ha saltado una excepción");
        }   
        instance.posicion(40);
    }

    /**
     * Test of posicion method, of class CVector.
     */
    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testPosicion5() {
        System.out.println("posicion 5");
        CVector instance = new CVector();
        instance.posicion(0);
    }

    @Test
    public void testencuentraPosicion1() {
        System.out.println("testencuentraPosicion1");
        CVector instance = new CVector();
        Random r = new Random();
        try {
            for (int i=0; i<100; i++){
                if (i!=30 && i!=70){
                    instance.insertar(r.nextInt(20));
                } else {
                    instance.insertar(25);
                }
            }
            assertEquals(30,instance.encuentraPosicion(25,0));
            assertEquals(70,instance.encuentraPosicion(25,31));
        } catch (Exception e){
            fail("Ha saltado una excepción");
        }   
        
    } 

    @Test(expected=IllegalArgumentException.class)
    public void testencuentraPosicion2() {
        System.out.println("testencuentraPosicion2");
        CVector instance = new CVector();   
        try {
            instance.insertar(3);
        } catch (Exception e){
            fail("Ha saltado una excepción");
        } 
        int pos=instance.encuentraPosicion(3, -1);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testencuentraPosicion3() {
        System.out.println("testencuentraPosicion3");
        CVector instance = new CVector();   
        try {
            instance.insertar(3);
        } catch (Exception e){
            fail("Ha saltado una excepción");
        } 
        int pos=instance.encuentraPosicion(3, 2);
    }

    @Test
    public void testencuentraPosicion4() {
        System.out.println("testencuentraPosicion4");
        CVector instance = new CVector();   
        
        assertEquals(-1,instance.encuentraPosicion(3, 0));
    }
    
}
