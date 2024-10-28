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
    @FXML
    private Label choice1;
    @FXML
    private Label choice2;
    @FXML
    private TextField choice11;
    @FXML
    private TextField choice22;

    ObservableList<Device> devices = FXCollections.observableArrayList();

    @FXML
    public void initialize(){
        listView.setItems(devices);

        device.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            updateDeviceFieldsVisibility();
        });


        updateDeviceFieldsVisibility();

    }
    @FXML
    private void updateDeviceFieldsVisibility() {
        choice1.setVisible(false);
        choice2.setVisible(false);
        choice11.setVisible(false);
        choice22.setVisible(false);

        if (laptop.isSelected()) {
            choice1.setText("RAM Size (GB):");
            choice2.setText("Processor Type:");
            choice1.setVisible(true);
            choice2.setVisible(true);
            choice11.setVisible(true);
            choice22.setVisible(true);
        } else if (smartphone.isSelected()) {
            choice1.setText("Screen size:");
            choice2.setText("Resolution:");
            choice1.setVisible(true);
            choice11.setVisible(true);
            choice2.setVisible(true);
            choice22.setVisible(true);
        } else if (tablet.isSelected()) {
            choice1.setText("Battery life:");
            choice2.setText("Has Stylus:");
            choice1.setVisible(true);
            choice11.setVisible(true);
            choice2.setVisible(true);
            choice22.setVisible(true);
        }
    }

    @FXML
    void onAdd(ActionEvent event) {
        if(smartphone.isSelected()) {
            Smartphone smart = new Smartphone();
            smart.setName(name.getText());
            smart.setType(DeviceType.SMARTPHONE);
            smart.setPrice( Double.parseDouble(price.getText()) );
            smart.setWeight( Double.parseDouble( weight.getText()) );
            smart.setScreenSize(Integer.parseInt(choice11.getText()));
            smart.setResolution(Integer.parseInt(choice22.getText()));
            devices.add(smart);
        }
        if(tablet.isSelected()){
            Tablet tab= new Tablet();
            tab.setName(name.getText());
            tab.setType(DeviceType.TABLET);
            tab.setPrice( Double.parseDouble(price.getText()) );
            tab.setWeight( Double.parseDouble( weight.getText()) );
            tab.setBatteryLife(Double.parseDouble(choice11.getText()));
            tab.setHasStylus(Boolean.parseBoolean(choice22.getText()));
            devices.add(tab);
        }
        if(laptop.isSelected()){
            Laptop lap= new Laptop();
            lap.setName(name.getText());
            lap.setType(DeviceType.LAPTOP);
            lap.setPrice( Double.parseDouble(price.getText()) );
            lap.setWeight( Double.parseDouble( weight.getText()) );
            lap.setRamSize(Integer.parseInt(choice11.getText()));
            lap.setProcessorType(String.valueOf(choice22.getText()));
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