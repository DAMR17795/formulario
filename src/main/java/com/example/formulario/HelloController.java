package com.example.formulario;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;

public class HelloController {

    @FXML
    private TextField txtEdad;
    @FXML
    private DatePicker date;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellidos;
    @FXML
    private TextField txtCorreo;
    @FXML
    private Button btnGuardar;
    @FXML
    private Button btnCancelar;

    @FXML
    protected void onHelloButtonClick() {


    }

    @FXML
    public void verificacionNombre(Event event) {
        String nombre = txtNombre.getText();
        if (nombre.length() < 7 && nombre.length()>0) {
            txtNombre.setStyle("-fx-background-color: #f54242");
        } else if (nombre.length() > 7 || nombre.length()==0){
            txtNombre.setStyle("-fx-background-color: #ffffff");
        }
    }
}