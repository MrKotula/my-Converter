package com.itproger.converterhomework;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class Controller {

    @FXML
    private ChoiceBox<String> choiceBox = new ChoiceBox<String>();

    private ObservableList<String> value = FXCollections.observableArrayList("Tons", "Kilogram", "Gram");

    @FXML
    private Label screenGrams;

    @FXML
    private Label screenKilograms;

    @FXML
    private Label screenTons;

    @FXML
    private Label title;

    @FXML
    private Label valieInTons;

    @FXML
    private Label valueInGram;

    @FXML
    private Label valueInKilogram;

    @FXML
    private TextField textField;

    @FXML
    void initialize() {

        choiceBox.setItems(value);
        choiceBox.setValue("Tons");
        screenTons.setOnKeyReleased(keyEvent -> {
                    addNum(keyEvent);
                });

            }
        @FXML
        void addNum (KeyEvent event) {
            float a = Float.parseFloat(textField.getText());
            float res = a * 1000;
            float res2 = a * 1000000;
            float res3 = a / 1000;
            float res4 = a / 1000000;

            if (choiceBox.getValue().equals("Tons")) {
                    screenTons.setText(String.valueOf(a));
                    screenKilograms.setText(String.valueOf(res));
                    screenGrams.setText(String.valueOf(res2));
                }if(choiceBox.getValue().equals("Kilogram")){
                        screenKilograms.setText(String.valueOf(a));
                        screenTons.setText(String.valueOf(res3));
                        screenGrams.setText(String.valueOf(res));
                    }if(choiceBox.getValue().equals("Gram")){
                            screenGrams.setText(String.valueOf(a));
                            screenKilograms.setText(String.valueOf(res3));
                            screenTons.setText(String.valueOf(res4));
            }
        }
}
