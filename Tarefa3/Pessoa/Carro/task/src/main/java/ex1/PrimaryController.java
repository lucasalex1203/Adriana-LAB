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

    private ObservableList<String> listaDePessoa = FXCollections.observableArrayList();

    @FXML
    private TextField PesoField;

    @FXML
    private TextField AlturaField;

    @FXML
    private TextField PessoaField;

    @FXML
    void handlePessoa(){
        String PessoaPessoa = PessoaField.getText();
        String AlturaPessoa = AlturaField.getText();
        String PesoPessoa = PesoField.getText();

        listaDePessoa.addAll(PessoaPessoa, AlturaPessoa, PesoPessoa);
    }

    public void showPessoas() {
        Stage stage = new Stage();
        stage.setTitle("Pessoas");
    
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10, 10, 10, 10));
    
        for (int i = 0; i < listaDePessoa.size(); i += 3) {
            String Pessoa = listaDePessoa.get(i);
            String Altura = listaDePessoa.get(i + 1);
            String Peso = listaDePessoa.get(i + 2);
    
            Label label = new Label("Pessoa: " + Pessoa + ", Altura: " + Altura + ", Peso: " + Peso);
            vbox.getChildren().add(label);
        }
    
        Scene scene = new Scene(vbox, 400, 100);
        stage.setScene(scene);
        stage.show();
    }
}
