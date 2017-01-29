package JavaFX;


import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista 500x500 ekraanile hunnikuga punaseid ringe.
 * Kui hiir ringile vastu läheb, muutub ring roheliseks.
 * Kordan - ring muudab värvi juba hiire puudutusest, mitte klikist.
 */
public class FooridUnenaos {
    public FooridUnenaos() {
        startStage();
    }

    int x;
    int y;

    private void startStage() {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        Stage primaryStage = new Stage();

        primaryStage.setScene(scene);
        primaryStage.show();

        for (int i = 0; i < 20; i++) {
            Circle circle = new Circle(Math.random() * 500, Math.random() * 500, 50);
            circle.setFill(Color.RED);
            pane.getChildren().addAll(circle);
            circle.setOnMouseEntered(event -> { //või setonmousemoved
                circle.setFill(Color.GREEN);
            }
            );

        }

    }


}
