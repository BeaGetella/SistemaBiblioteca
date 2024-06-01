/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.cindypu_prueba2.proyectoprogra;

import com.cindypu_prueba2.proyectoprogra.App;
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
public class OpcionesClientesController implements Initializable {


    @FXML
    private Button btnprestarLibros;
    @FXML
    private Button btnBuscarLibros;
    @FXML
    private Button btnDevolverlibros;
    @FXML
    private Button btnvermultas;
    @FXML
    private Button btnConsultarhistorial;
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
    private void btnprestarLibros(ActionEvent event) throws IOException {
        App.setRoot("prestarLibro");
    }

    @FXML
    private void btnBuscarLibros(ActionEvent event) {
    }

    @FXML
    private void btnDevolverlibros(ActionEvent event) {
    }

    @FXML
    private void btnvermultas(ActionEvent event) {
    }

    @FXML
    private void btnConsultarhistorial(ActionEvent event) {
    }

    @FXML
    private void btnInicio(ActionEvent event) throws IOException {
        App.setRoot("ventanaInicio");
    }

}
