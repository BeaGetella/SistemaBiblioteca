/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.cindypu_prueba2.proyectoprogra;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
/**
 * FXML Controller class
 *
 * @author iglesiadecristo
 */
public class RegistroAdmonController implements Initializable {
    
    


    @FXML
    private Button btnIngresar;
    @FXML
    private TextField txtcorreo;
    @FXML
    private Button btnInicio;
    @FXML
    private PasswordField txtcontrasenia;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void btnIngresar(ActionEvent event)throws IOException {
        App.setRoot("OpcionesAdmon");
    }

    @FXML
    private void txtcorreo(ActionEvent event) {
        String correo = txtcorreo.getText();
               
    }

    @FXML
    private void btnInicio(ActionEvent event) throws IOException {
        App.setRoot("VentanaInicio");
    }

    @FXML
    private void txtcontrasenia(ActionEvent event) throws IOException {
        
    }
    
    //administrador admon1 = new administrador(admin1);
    
    private void guardaradministrador(administrador admin1) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("usuario.obj"))) {
            out.writeObject(admin1);
            System.out.println("Administrador guardado: " + admin1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
