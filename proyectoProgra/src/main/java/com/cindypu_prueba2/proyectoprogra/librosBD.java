/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cindypu_prueba2.proyectoprogra;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author iglesiadecristo
 */
public class librosBD {
    public void agregarLibro(libros libros) {
        String sql = "INSERT INTO Libros (isbn, titulo, autor, anioPublicacion, editorial) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = ConexionBasedeDatos.getConnection();
             PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, libros.getISBN());
            st.setString(2, libros.getTitulo());
            st.setString(3, libros.getAutor());
            st.setInt(4, libros.getAnioPublicacion());
            st.setString(5, libros.getEditorial());
  
            st.executeUpdate();
            System.out.println("libro \"" + libros.getTitulo() + "\" agregado a la base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<libros> obtenerLibros() {
        ArrayList<libros> libros = new ArrayList<>();
        String sql = "SELECT * FROM libros";
        try (Connection conn = ConexionBasedeDatos.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                libros libro = new libros(
                    rs.getString("isbn"),
                    rs.getString("titulo"),
                    rs.getString("autor"),
                    rs.getInt("anioPublicacion"),
                    rs.getString("editorial")
                );
                libros.add(libro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return libros;
    }

    public void mostrarLibros() {
        ArrayList<libros> libros = obtenerLibros();
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la base de datos");
        } else {
            for (libros libro : libros) {
                System.out.println(libro);
            }
        }
    }
}
    

