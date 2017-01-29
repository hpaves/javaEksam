package JavaFX;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt x, y kordinaadid ja raadius ning joonista talle ring.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Ring {
    public Ring() {
        startStage();
    }

    private void startStage() {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        Stage primaryStage = new Stage();

        primaryStage.setScene(scene);
        primaryStage.show();

        Circle circle = new Circle(50, 50, 50);

        pane.getChildren().addAll(circle);


    }
}