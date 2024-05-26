package com.example.demozoveelkeerin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class ZoveelkeerinController {

    @FXML
    private TextField fieldX;

    @FXML
    private TextField fieldY;

    @FXML
    private TextField fieldResultaat;

    @FXML
    private ChoiceBox choiceBox ;

    // Dit moeten we dan ook eens gaan uitvoeren ergens -> in Controller, in initialize()
    private void initChoice() {
        //TODO refactor met String pairs, want we willen hier nu ook een listener opzetten
        choiceBox.getItems().addAll("Equipment","Furniture","Investment");
    }

    @FXML
    public void initialize() {
        initChoice();
        fieldResultaat.setText("Hier komt het resultaat");
    }

    public void berekenXinY(ActionEvent e) {

        int x = Integer.parseInt(fieldX.getText());
        int y = Integer.parseInt(fieldY.getText());

        int resultaat = y / x;

        fieldResultaat.setText( String.valueOf(resultaat) );
        // fieldResultaat.setText((String) choiceBox.getValue());
    }

}
