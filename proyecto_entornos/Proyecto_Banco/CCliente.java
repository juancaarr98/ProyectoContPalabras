/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_Banco.Proyecto_Banco;

import java.util.ArrayList;

/**
 *
 * @author Juan carlos
 */
public class CCliente {
    private String nombre;
    private String aplellido;
    private String dir;
    private String nif;
    private int edad;
    private int tf;
    private ArrayList<CCuenta> alCuentas;

    public CCliente(String nombre, String aplellido, String dir, String nif, int edad, int tf) {
        this.nombre = nombre;
        this.aplellido = aplellido;
        this.dir = dir;
        this.nif = nif;
        this.edad = edad;
        this.tf = tf;
    }


    public CCliente(String nombre, String aplellido, String dir, String nif, int edad, int tf, ArrayList<CCuenta> alCuentas) {
        this.nombre = nombre;
        this.aplellido = aplellido;
        this.dir = dir;
        this.nif = nif;
        this.edad = edad;
        this.tf = tf;
        this.alCuentas = alCuentas;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAplellido() {
        return aplellido;
    }

    public void setAplellido(String aplellido) {
        this.aplellido = aplellido;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTf() {
        return tf;
    }

    public void setTf(int tf) {
        this.tf = tf;
    }

    public ArrayList<CCuenta> getAlCuentas() {
        return alCuentas;
    }

    public void setAlCuentas(ArrayList<CCuenta> alCuentas) {
        this.alCuentas = alCuentas;
    }

    @Override
    public String toString() {
        return "Para el cliente: " + "nombre=" + nombre + ", aplellido=" + aplellido + ", dir=" + dir + ", nif=" + nif + ", edad=" + edad + ", tf=" + tf + ", alCuentas=" + alCuentas + '}';
    }
    
    public double mvInsertar(CCliente c, int nro_cuent,double cantidad){
        double saldo_final=c.getAlCuentas().get(nro_cuent).getSaldo() +cantidad;
        c.getAlCuentas().get(nro_cuent).setSaldo(saldo_final); 
        return saldo_final;
    }
    public double mcSacar(CCliente c, double cantidad,int cod_tarjeta,int nro_cuent,char x){
        double lim_tarjeta_cajero = c.getAlCuentas().get(nro_cuent).getAlTarjetas().get(cod_tarjeta).getLimit_caja();
        double lim_tarjeta_online = c.getAlCuentas().get(nro_cuent).getAlTarjetas().get(cod_tarjeta).getLimit_onLine();
        double saldo_cuenta= c.getAlCuentas().get(nro_cuent).getSaldo();
        double limite_cuenta= c.getAlCuentas().get(nro_cuent).getLimite();
        double resultado=0;
        if((saldo_cuenta-cantidad)>limite_cuenta)
            System.out.println("No saldo.");            
        else{
            switch(x){
                case 'c':
                    if(cantidad<lim_tarjeta_cajero)
                       resultado=saldo_cuenta-cantidad;
                    break;
                case 'o':
                    if(cantidad<lim_tarjeta_online)
                       resultado= saldo_cuenta-cantidad;
                    break;
                
            }//switch     
        }//fin_else
        return resultado;
    }
    
    
    
}