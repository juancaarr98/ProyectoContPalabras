/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.Scanner;

 public class Practica{
     static String palabra;
    public static void main(String[]arg) {
        System.out.println("Dime cual es la palabra/frase que deseas analizar:");
        Scanner teclado= new Scanner(System.in);
        palabra=teclado.nextLine();
        CMostrar x=new CMostrar(palabra);
        
        x.contarCaracteresTotal();
        x.contarNumeroPalabras();
        x.contarTodosCaracteres();
        //mostrar
        System.out.println(x.textoCaracteresTotal());
        System.out.println(x.textoNumeroPalabras());
        System.out.println(x.textoTodosCaracteres());
     }
}
