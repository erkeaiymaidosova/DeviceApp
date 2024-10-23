package com.example.deviceapp;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private ToggleGroup device;
    @FXML
    private Button add;

    @FXML
    private RadioButton laptop;

    @FXML
    private TextField name;

    @FXML
    private TextField price;

    @FXML
    private RadioButton smartphone;

    @FXML
    private RadioButton tablet;

    @FXML
    private TextField weight;
    @FXML
    private ListView<Device> listView;

    ObservableList<Device> devices = FXCollections.observableArrayList();

    @FXML
    public void initialize(){
        listView.setItems(devices);
    }

    @FXML
    void onAdd(ActionEvent event) {
        if(smartphone.isSelected()) {
            Smartphone smart = new Smartphone();
            smart.setName(name.getText());
            smart.setType(DeviceType.SMARTPHONE);
            smart.setPrice( Double.parseDouble(price.getText()) );
            smart.setWeight( Double.parseDouble( weight.getText()) );

            devices.add(smart);
        }
        if(tablet.isSelected()){
            Tablet tab= new Tablet();
            tab.setName(name.getText());
            tab.setType(DeviceType.TABLET);
            tab.setPrice( Double.parseDouble(price.getText()) );
            tab.setWeight( Double.parseDouble( weight.getText()) );

            devices.add(tab);
        }
        if(laptop.isSelected()){
            Laptop lap= new Laptop();
            lap.setName(name.getText());
            lap.setType(DeviceType.LAPTOP);
            lap.setPrice( Double.parseDouble(price.getText()) );
            lap.setWeight( Double.parseDouble( weight.getText()) );

            devices.add(lap);
        }
    }
    @FXML
    private Label label;
    @FXML
    protected void onListClicked(){
        int id = listView.getSelectionModel().getSelectedIndex();
        label.setText(devices.get(id).toString());

    }

    @FXML
    private void onRemoveClick(){
        int id = listView.getSelectionModel().getSelectedIndex();
        label.setText( devices.get(id).getName() + " is removed." );
        devices.remove(id);
    }
}