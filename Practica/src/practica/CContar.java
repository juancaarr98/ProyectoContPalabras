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
public class CContar {
  int nPalabras;
    int nLetras;
    int [] letras;
    String palabra;
/**
 * Constructor
 * @param nPalabras
 * @param nLetras
 * @param letras
 * @param palabra 
 */
    public CContar(int nPalabras, int nLetras, int[] letras, String palabra) {
        this.nPalabras = nPalabras;
        this.nLetras = nLetras;
        this.letras = letras;
        this.palabra = palabra;
    }
 /**
  * Constructor
  * @param palabra 
  */
    public CContar(String palabra) {
       this.palabra=palabra;
       this.letras=new int [palabra.length()];
    }
     
   /**
    * Sirve para contar los caracteres totales que tiene ua cadena de caracteres.
    * @return el numero de caracteres que tiene una cadena.
    */
    public int contarCaracteresTotal() {
        nLetras=0;
        for(int i=0; i<palabra.length();i++) {
                if(palabra.charAt(i)!=32) {
                        nLetras++;
                }				
        }		
        return nLetras;			
    }	

    /**
     * Sirve para contar el número de palabras que hay en una cadena de caracteres.
     * @return devuelve el número de palabras que hay en una cadena de caracteres.
     */
			
    public int contarNumeroPalabras() {
            nPalabras=0;
            for(int i=0;i<palabra.length();i++) {
                    if(nPalabras==0 && nLetras!= 0) {
                            nPalabras=1;
                    }

                    if(nLetras!=0 && palabra.charAt(i)==32) {
                            nPalabras++;
                    }
            }
            return nPalabras;
    }	
    
    /**
     * Cuenta cuantas veces se repite cada caracter que tenemos en la cadena.
     * @return devuelve el arrary de numeros en el que cuanta cuantas veces se repiten los caracteres.
     */

    public  int[] contarTodosCaracteres() {
            for(int i=0; i<palabra.length();i++) {//for2
                    letras[i]=0;
                    for(int j=0;j<palabra.length();j++) {//for3
                            if(palabra.charAt(i)==(palabra.charAt(j))){
                                    letras[i]++;
                            }
                    }//for3
            }//for2
            return letras;

    }   
}
