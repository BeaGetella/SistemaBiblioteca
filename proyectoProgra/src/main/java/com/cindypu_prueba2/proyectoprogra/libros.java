/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cindypu_prueba2.proyectoprogra;

/**
 *
 * @author iglesiadecristo
 */
public class libros {
    
    private String ISBN;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String editorial;

    public libros(String ISBN, String titulo, String autor, int anioPublicacion, String editorial) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.editorial = editorial;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "libros{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", anioPublicacion=" + anioPublicacion + ", editorial=" + editorial + '}';
    }
   

   
    
}
