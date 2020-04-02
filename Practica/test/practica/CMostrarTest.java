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


public class CMostrarTest {
    
    @Test
    public void testTextoCaracteresTotal() {
      String cadena = "hola";
      CMostrar m1 = new CMostrar(cadena);
      
      assertEquals("La sentencia consta de 4 caracteres",m1.contarCaracteresTotal());
      assertEquals("La sentencia consta de 1 palabras", m1.textoNumeroPalabras());
      assertEquals("La letra: h se está reptiendo este numero de veces: 1 \n"+"La letra: o se está reptiendo este numero de veces: 1 \n"+"La letra: l se está reptiendo este numero de veces: 1 \n"+"La letra: a se está reptiendo este numero de veces: 1 \n", m1.textoTodosCaracteres());
    }

    
}
