package JavaFX;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;

public class Joon2 {

    public Joon2() {
        startStage();
    }

    private void startStage() {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        Stage primaryStage = new Stage();

        Kasutajaliides kl = new Kasutajaliides(pane);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}