package com.kensoftph.choicebox.understandingchoicebox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.util.StringConverter;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ChoiceBox<String> choiceBox;

    @FXML
    private Label selection;
    private String[] data = {null,"Java","Python","C++","C#"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceBox.getItems().addAll(data);
        choiceBox.setOnAction(this::getData);

        choiceBox.getSelectionModel().clearSelection();

        choiceBox.setConverter(new StringConverter<String>() {
            @Override
            public String toString(String s) {
                return (s == null) ? "Nothing Selected" : s;
            }

            @Override
            public String fromString(String s) {
                return null;
            }
        });

    }

    private void getData(ActionEvent event){
        String selected = choiceBox.getValue();
        selection.setText(selected);
    }
}