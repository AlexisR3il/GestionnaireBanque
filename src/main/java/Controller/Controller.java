package Controller;

import Modele.Type;

import Modele.Transaction;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller extends Application {
    @FXML
    TextField labelNom;
    @FXML
    TextField labelMontant;
    @FXML
    private Label labelSolde;
    @FXML
    private ChoiceBox listeDeroulante;
    @FXML
    private ListView<Transaction> listeView;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Controller.class.getResource("IHM.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 300);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public void clique(ActionEvent actionEvent) {

        String nom = labelNom.getText();
        String montant = labelMontant.getText();
        String choiceBox = listeDeroulante.getAccessibleText();

        Type type;
        if(choiceBox == "Crédit") {
            type = Type.c;
        }
        else {
            type = Type.d;
        }
        Transaction transaction = new Transaction(nom, type, montant);

        listeView.getItems().add(transaction);
    }

    public static void main(String[] args) {
        launch();
    }


}