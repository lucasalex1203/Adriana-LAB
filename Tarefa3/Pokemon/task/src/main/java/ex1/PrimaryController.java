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

    private ObservableList<String> listaDePokemon = FXCollections.observableArrayList();

    @FXML
    private TextField nomeField;

    @FXML
    private TextField tipoField;

    @FXML
    private TextField nivelField;

    @FXML
    void handlePokemon(){
        String nomePokemon = nomeField.getText();
        String tipoPokemon = tipoField.getText();
        String nivelPokemon = nivelField.getText();

        listaDePokemon.addAll(nomePokemon, tipoPokemon, nivelPokemon);
    }

    public void showPokemons() {
        Stage stage = new Stage();
        stage.setTitle("Pokemons");
    
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10, 10, 10, 10));
    
        for (int i = 0; i < listaDePokemon.size(); i += 3) {
            String nome = listaDePokemon.get(i);
            String tipo = listaDePokemon.get(i + 1);
            String nivel = listaDePokemon.get(i + 2);
    
            Label label = new Label("Pokemon: " + nome + ", tipo: " + tipo + ", nivel: " + nivel);
            vbox.getChildren().add(label);
        }
    
        Scene scene = new Scene(vbox, 400, 100);
        stage.setScene(scene);
        stage.show();
    }
}
