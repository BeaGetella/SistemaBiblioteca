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
public class RegistroClienteController implements Initializable {


    @FXML
    private Button btnregistrarInicio;
    @FXML
    private Button btnInicio;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void btnregistrarInicio(ActionEvent event)throws IOException {
        App.setRoot("");
    }

    @FXML
    private void btnInicio(ActionEvent event)throws IOException {
        App.setRoot("VentanaInicio");
    }

}
