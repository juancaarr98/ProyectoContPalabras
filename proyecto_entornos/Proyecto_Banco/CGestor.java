/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_Banco.Proyecto_Banco;
import Proyecto_Banco.Proyecto_Banco.CCuenta;
import Proyecto_Banco.Proyecto_Banco.CCliente;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Juan carlos
 */
public class CGestor {
   
    public CGestor() {}
    
    public void mvCrearTarjeta(CCuenta cu,int limt_cajero,int  limt_on,int codigo){
        CTarjeta t= new CTarjeta(limt_cajero,limt_on,codigo);
        cu.getAlTarjetas().add(t);
    }
    public void mvCrearCuenta(CCliente a, double dinero,String fecha_alta){
        CCuenta c=new CCuenta(dinero,fecha_alta);
        a.getAlCuentas().add(c);
        System.out.println("Esta cuennta, todavia no tiene tarjetas");
    }
    public void mvCrearPerfil(String nom,String apell,String d,String dni,int age,int tlf){
        CCliente p=new CCliente(nom,apell,d,dni,age,tlf);
        System.out.println("Este perfil no tiene cuentas asociadas.");       
    }
    public void mvModificarDatos(CCliente a,String nom,String apell,String d,String dni,int tlf,int age){
        a.setNombre(nom);
        a.setAplellido(apell);
        a.setDir(d);
        a.setNif(dni);
        a.setTf(tlf);
        a.setEdad(age);
    }
    public void mvConsultar(CCliente a){
        a.toString(); 
    }
}
