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
    /**
     * Imprime por pantalla el numero de letras que tiene la sentencia.
     * @return devuelve la sentncia: "La sentencia consta de "+nLetras+" caracteres".
     */
    
    public String textoCaracteresTotal () {
        String resultado ="La sentencia consta de "+nLetras+" caracteres";
        return resultado;
    }
    /**
     * Imprime por pantalla el numero de palabras que tiene la sentencia.
     * @return "La sentencia consta de "+nPalabras+" palabras"
     */
    public String textoNumeroPalabras() {			
        String resultado ="La sentencia consta de "+nPalabras+" palabras";
        return resultado;

    }
    /**
     * Sirve para mostrar cuantas veces se repite cada caracter.
     * @return "La letra: "+palabra.charAt(z)+" se está reptiendo este numero de veces: "+letras[z]+"\n"
     */
    public String textoTodosCaracteres() {
        String resultado="";
        for(int z=0;z<=nLetras;z++) {
                resultado+= "La letra: "+palabra.charAt(z)+" se está reptiendo este numero de veces: "+letras[z]+"\n";
                }//end for
        return resultado;
    }
}
