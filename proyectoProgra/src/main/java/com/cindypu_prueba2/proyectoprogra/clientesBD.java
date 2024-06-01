/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cindypu_prueba2.proyectoprogra;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iglesiadecristo
 */
public class clientesBD {
    
    public void agregarclientes(clientes clientes) {
        String sql = "INSERT INTO clientes (nombrecliente, dpicliente, direccioncliente, telefonocliente, , correocliente, contraseniacliente) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexionBasedeDatos.getConnection();
             PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, clientes.getNombrecliente());
            st.setString(2, clientes.getDpicliente());
            st.setString(3, clientes.getDireccioncliente());
            st.setString(4, clientes.getTelefonocliente());
            st.setString(5, clientes.getCorreocliente());
            st.setString(6, clientes.getContraseniacliente());
  
            st.executeUpdate();
            System.out.println("clientes \"" + clientes.getNombrecliente()+ "\" agregado a la base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<clientes> obtenerclientes() {
        ArrayList<clientes> clientes = new ArrayList<>();
        String sql = "SELECT * FROM clientes";
        try (Connection conn = ConexionBasedeDatos.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                clientes cliente = new clientes(
                    rs.getString("nombrecliente"),
                    rs.getString("dpicliente"),
                    rs.getString("direccioncliente"),
                    rs.getString("telefonocliente"),
                    rs.getString("correocliente"),
                    rs.getString("contraseniacliente")
                );
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }

    public void mostrarclientes() {
        ArrayList<clientes> clientes = obtenerclientes();
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes en la base de datos");
        } else {
            for (clientes cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }
}
