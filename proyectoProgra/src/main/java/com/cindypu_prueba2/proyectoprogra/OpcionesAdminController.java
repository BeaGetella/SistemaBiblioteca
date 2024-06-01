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
public class OpcionesAdminController implements Initializable {


    @FXML
    private Button btnregistrarClientes;
    @FXML
    private Button btnregistrarLibros;
    @FXML
    private Button btnHistorial;
    @FXML
    private Button btnModificarClientes;
    @FXML
    private Button btnModificarLibros;
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
    private void btnregistrarClientes(ActionEvent event) throws IOException {
        App.setRoot("registroLibros");
    }

    @FXML
    private void btnregistrarLibros(ActionEvent event) {
    }

    @FXML
    private void btnHistorial(ActionEvent event) {
    }

    @FXML
    private void btnModificarClientes(ActionEvent event) {
    }

    @FXML
    private void btnModificarLibros(ActionEvent event) {
    }

    @FXML
    private void btnInicio(ActionEvent event) {
    }

}
