/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.Scanner;

 public class Practica{
    static int VecesRepetidas=0;
    static int nLetras=0;
    static int nPalabras;
    static int letras[];
    static String palabra;

            public static void main(String[]arg) {
                    System.out.println("Dime cual es la palabra/frase que deseas analizar:");
                    Scanner teclado= new Scanner(System.in);
                    palabra=teclado.nextLine();
                    letras=new int [palabra.length()];


                    //Llamamos a los metodos 

                    //contar
                    contarCaracteresTotal(palabra);
                    contarNumeroPalabras(palabra);
                    contarTodosCaracteres(palabra);
                    //mostrar
                    System.out.println(textoCaracteresTotal (nLetras));
                    System.out.println(textoNumeroPalabras(nPalabras));
                    System.out.println(textoTodosCaracteres(letras));


            }

    //division del metodo contarPalabras
            public static int contarCaracteresTotal(String cadena) {
                    nLetras=0;
                    for(int i=0; i<cadena.length();i++) {
                            if(cadena.charAt(i)!=32) {
                                    nLetras++;
                            }				
                    }		
                    return nLetras;			
            }	


            public static int contarNumeroPalabras(String cadena) {
                    nPalabras=0;
                    for(int i=0;i<cadena.length();i++) {
                            if(nPalabras==0 && nLetras!= 0) {
                                    nPalabras=1;
                            }

                            if(nLetras!=0 && cadena.charAt(i)==32) {
                                    nPalabras++;
                            }
                    }
                    return nPalabras;
            }	

            public static int[] contarTodosCaracteres(String cadena) {
                    for(int i=0; i<cadena.length();i++) {//for2
                            letras[i]=0;
                            for(int j=0;j<cadena.length();j++) {//for3
                                    if(cadena.charAt(i)==(cadena.charAt(j))){
                                            letras[i]++;
                                    }
                            }//for3
                    }//for2
                    return letras;

            }	

    //division del metodo mostrarResultados

            public static String textoCaracteresTotal (int total) {
                    String resultado ="La sentencia consta de "+total+" caracteres";
                    return resultado;
            }

            public static String textoNumeroPalabras(int total) {			
                    String resultado ="La sentencia consta de "+total+" palabras";
                    return resultado;

            }

            public static String textoTodosCaracteres(int [] total) {
                    String resultado="";
                    for(int z=0;z<=nLetras;z++) {
                            resultado+= "La letra: "+palabra.charAt(z)+" se está reptiendo este numero de veces: "+letras[z]+"\n";
                            }//end for

                    return resultado;
            }


    
}
