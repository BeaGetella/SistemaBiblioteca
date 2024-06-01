/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.cindypu_prueba2.proyectoprogra;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
/**
 * FXML Controller class
 *
 * @author iglesiadecristo
 */
public class VentanaInicioController implements Initializable {


    @FXML
    private Button btnadmin;
    @FXML
    private Button btnusuario;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void btnadmin(ActionEvent event) throws IOException {
        App.setRoot("RegistroAdmon");
    }

    @FXML
    private void btnusuario(ActionEvent event) throws IOException {
        App.setRoot("IngresoClientes");
    }

}
