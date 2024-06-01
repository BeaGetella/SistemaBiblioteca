/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cindypu_prueba2.proyectoprogra;



/**
 *
 * @author iglesiadecristo
 */
public class clientes {
    
    private String nombrecliente;
    private String dpicliente;
    private String direccioncliente;
    private String telefonocliente;
    private String correocliente;
    private String contraseniacliente;

    public clientes(String nombrecliente, String dpicliente, String direccioncliente, String telefonocliente, String correocliente, String contraseniacliente) {
        this.nombrecliente = nombrecliente;
        this.dpicliente = dpicliente;
        this.direccioncliente = direccioncliente;
        this.telefonocliente = telefonocliente;
        this.correocliente = correocliente;
        this.contraseniacliente = contraseniacliente;
    }
    
    public clientes(){
        
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getDpicliente() {
        return dpicliente;
    }

    public void setDpicliente(String dpicliente) {
        this.dpicliente = dpicliente;
    }

    public String getDireccioncliente() {
        return direccioncliente;
    }

    public void setDireccioncliente(String direccioncliente) {
        this.direccioncliente = direccioncliente;
    }

    public String getTelefonocliente() {
        return telefonocliente;
    }

    public void setTelefonocliente(String telefonocliente) {
        this.telefonocliente = telefonocliente;
    }

    public String getCorreocliente() {
        return correocliente;
    }

    public void setCorreocliente(String correocliente) {
        this.correocliente = correocliente;
    }

    public String getContraseniacliente() {
        return contraseniacliente;
    }

    public void setContraseniacliente(String contraseniacliente) {
        this.contraseniacliente = contraseniacliente;
    }

    @Override
    public String toString() {
        return "clientes{" + "nombrecliente=" + nombrecliente + ", dpicliente=" + dpicliente + ", direccioncliente=" + direccioncliente + ", telefonocliente=" + telefonocliente + ", correocliente=" + correocliente + ", contraseniacliente=" + contraseniacliente + '}';
    }

    //metodo para crear un nuevo cliente
    public static void create (clientes clientes){
        
    }

    
        
        
        
    }
    
    
    
    

