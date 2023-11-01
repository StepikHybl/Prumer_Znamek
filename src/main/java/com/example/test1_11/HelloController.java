package com.example.test1_11;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private ListView marks;

    @FXML
    private TextField avarage;

    @FXML
    private TextField name;

    @FXML
    private TextField subject;

    @FXML
    private Button convert;

    String names;
    String mark;
    String subjects;

    ObservableList<String> vypis = FXCollections.observableArrayList();

    @FXML
    protected void onConvertClick(){
        names = name.getText();
        subjects = subject.getText();
        mark = avarage.getText();
        vypis.add(names + "  ma z  " + subjects + "  ma prumer  " + Button_Convert.prumer(mark));
        marks.setItems(vypis);
    }
}
