/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juan carlos
 */
public class CContarTest {
 
    @Test
    public void testContarCaracteresTotal() {
      String cadena="hola";
      CContar c1= new CContar(cadena);
      int [] a= new int [4];
      a[0]=1;
      a[1]=1;
      a[2]=1;
      a[3]=1;
      
      
      assertTrue(c1.contarCaracteresTotal()==4);
      assertFalse(c1.contarCaracteresTotal()!=4);
      
      assertTrue(c1.contarNumeroPalabras()==1);
      assertFalse(c1.contarNumeroPalabras()!=1);
      
      assertTrue(c1.contarTodosCaracteres()==a);
      assertFalse(c1.contarTodosCaracteres()!=a);
      
    }

    
}
