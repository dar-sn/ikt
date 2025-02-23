package com.example.ikt1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField pathField;
    @FXML
    private Button exit;

    @FXML
    private void initialize() {
        exit.setOnMouseClicked(event -> {
            exit.getScene().getWindow().hide();
        });

    }

    @FXML
    protected void onHelloButtonClick() {
        String linuxPath = pathField.getText();
        if (checkPath(linuxPath))
            welcomeText.setText("Путь верен.");
        else
            welcomeText.setText("Неверный путь! Повторите попытку.");
    }
    private boolean checkPath (String path){
        return path.matches("^\\/([а-яА-Я\\w.-]+\\/)*[а-яА-Я\\w.-]+$");
    }
}