/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.cindypu_prueba2.proyectoprogra;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.text.Text;
/**
 * FXML Controller class
 *
 * @author iglesiadecristo
 */
public class PrestarLibroController implements Initializable {


    @FXML
    private Text txtBuscarNombre;
    @FXML
    private Button BotonBuscarLibro;
    @FXML
    private Text txtisbn;
    @FXML
    private Button btnBuscarisbn;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void BotonBuscarLibro(ActionEvent event) {
    }

    @FXML
    private void btnBuscarisbn(ActionEvent event) {
    }

}
