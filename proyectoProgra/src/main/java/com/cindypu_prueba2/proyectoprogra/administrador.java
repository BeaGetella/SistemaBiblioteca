/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cindypu_prueba2.proyectoprogra;

import java.io.Serializable;

/**
 *
 * @author iglesiadecristo
 */
public class administrador implements Serializable {
    
    private String correoadmon;
    private String contraseniaadmon;

    public administrador(String correoadmon, String contraseniaadmon) {
        this.correoadmon = correoadmon;
        this.contraseniaadmon = contraseniaadmon;
    }

    public String getCorreoadmon() {
        return correoadmon;
    }

    public void setCorreoadmon(String correoadmon) {
        this.correoadmon = correoadmon;
    }

    public String getContraseniaadmon() {
        return contraseniaadmon;
    }

    public void setContraseniaadmon(String contraseniaadmon) {
        this.contraseniaadmon = contraseniaadmon;
    }

    @Override
    public String toString() {
        return "administrador{" + "correoadmon=" + correoadmon + ", contraseniaadmon=" + contraseniaadmon + '}';
    }

    

    
}
