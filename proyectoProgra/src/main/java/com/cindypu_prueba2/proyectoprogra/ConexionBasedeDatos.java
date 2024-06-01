/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cindypu_prueba2.proyectoprogra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author iglesiadecristo
 */

public class ConexionBasedeDatos {
    private String url = "jdbc:postgresql://viaduct.proxy.rlwy.net:52515/railway";
    private Properties properties = new Properties();
    private static Connection conn = null;
    
    private ConexionBasedeDatos () {
        properties.setProperty("user", "postgres");
        properties.setProperty("password", "LRJLoPmyHUQUJxSQVxsuTpMKbHtakCON");
        
        try {
            //establece la conexion a la base de datos
            conn = DriverManager.getConnection(url, properties);
            System.out.println("conexion exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBasedeDatos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se pudo hacer la conexion");
        }
    }
    //evalua si la variable con es nula, si es retorna la variable con, si no es  
    public static Connection getConnection() {
        if (conn == null) {
               ConexionBasedeDatos c = new ConexionBasedeDatos();
               return c.conn;
        }
        else {
            return conn ;
        }
    }
}
    