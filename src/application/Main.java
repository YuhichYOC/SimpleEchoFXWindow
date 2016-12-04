package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            primaryStage.setTitle("test");
            AnchorPane root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    @FXML
    private TextField EchoInput;
    @FXML
    private Button Submit;
    @FXML
    private Label EchoOutput;

    @FXML
    public void handleSubmit(ActionEvent event) {
        String out = EchoInput.getText();
        EchoOutput.setText(out);
    }
}
