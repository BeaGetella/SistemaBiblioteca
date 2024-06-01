/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cindypu_prueba2.proyectoprogra;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import static java.lang.reflect.Array.get;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.Paths.get;
import java.util.logging.Level;

/**
 *
 * @author iglesiadecristo
 */
public class serializacionAdmon {
    
public static void main(String[] args) {


    

    serializacionAdmon obj = new serializacionAdmon();
            obj.escribir();
            obj.leer();

      
    }
    
    public void escribir(){
        
        administrador admon1 = new administrador ("correo" , "contrasenia");
        administrador admon2 = new administrador ("correo" , "contrasenia"); 
        /*administrador admon3 = new administrador ("Transformers" , "", "acción", "Allan de Costa", "Alemania"); 
        administrador admon4 = new administrador ("Rapidos y Furiosos" , "", "accion", "Benjamin Alvarez", "Francia");*/ 
        
      Path path = Paths.get("Listado_administradores.obj");
      
        try {
            OutputStream outputStream = Files.newOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream (outputStream);
            
            objectOutputStream.writeObject(admon1);
            objectOutputStream.writeObject(admon2);
            /*objectOutputStream.writeObject(cliente3);
            objectOutputStream.writeObject(cliente4);*/
            
            objectOutputStream.close();

            
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(serializacionAdmon.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void leer(){
        
        //se hace lo contrario a a escribir para leerlo cambiando output por input
        Path path = Paths.get("Listado_administradores.obj");
        
        try {
            InputStream inputStream = Files.newInputStream(path);
            ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
            //para leer se le coloca el inputStream dentro del object para manejar objetos 
            
            while (true){
                administrador admon1 = (administrador) objectInputStream.readObject();
                System.out.print(admon1);
                //en el error de object read se importa un class cathc
            }
           
            //se importa el ioa exception para no tener error en el primer cathc
        } catch (EOFException ex){
            System.out.println("Se alcanzó el final del archivo");
        }
        catch (IOException ex) {
            //se importa el try-catch desde el error en el foquito rojo 
            java.util.logging.Logger.getLogger(serializacionAdmon.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(serializacionAdmon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
