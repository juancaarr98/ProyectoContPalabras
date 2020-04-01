/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Juan carlos
 */
public class CMostrar extends CContar{
    
    public CMostrar(int nPalabras, int nLetras, int[] letras, String palabra) {
        super(nPalabras, nLetras, letras, palabra);
    }

    public CMostrar(String palabra) {
        super(palabra);
    }
    
    
    public String textoCaracteresTotal () {
        String resultado ="La sentencia consta de "+nLetras+" caracteres";
        return resultado;
    }

    public String textoNumeroPalabras() {			
        String resultado ="La sentencia consta de "+nPalabras+" palabras";
        return resultado;

    }

    public String textoTodosCaracteres() {
        String resultado="";
        for(int z=0;z<=nLetras;z++) {
                resultado+= "La letra: "+palabra.charAt(z)+" se está reptiendo este numero de veces: "+letras[z]+"\n";
                }//end for
        return resultado;
    }
}
