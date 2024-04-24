package ex1;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimaryController {

    private ObservableList<String> listaDeCarro = FXCollections.observableArrayList();

    @FXML
    private TextField modeloField;

    @FXML
    private TextField marcaField;

    @FXML
    private TextField carroField;

    @FXML
    void handleCarro(){
        String carroCarro = carroField.getText();
        String marcaCarro = marcaField.getText();
        String modeloCarro = modeloField.getText();

        listaDeCarro.addAll(carroCarro, marcaCarro, modeloCarro);
    }

    public void showCarros() {
        Stage stage = new Stage();
        stage.setTitle("Carros");
    
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10, 10, 10, 10));
    
        for (int i = 0; i < listaDeCarro.size(); i += 3) {
            String carro = listaDeCarro.get(i);
            String marca = listaDeCarro.get(i + 1);
            String modelo = listaDeCarro.get(i + 2);
    
            Label label = new Label("Carro: " + carro + ", marca: " + marca + ", modelo: " + modelo);
            vbox.getChildren().add(label);
        }
    
        Scene scene = new Scene(vbox, 400, 100);
        stage.setScene(scene);
        stage.show();
    }
}
