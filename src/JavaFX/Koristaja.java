package JavaFX;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Loo JavaFXis koristaja mäng.
 * 1. Ekraan (näiteks 500x500) on paksult ringe täis. Nii, et läbi ei näe.
 * 2. Ringile hiirega vastu minnes kaob ring ära.
 * 3. Ringide all on peidus sõnum (näiteks Labeliga), mida kasutaja lõpuks näeb.
 */
public class Koristaja {
    public Koristaja() {
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
            int x = (int) circle.getCenterX();
            int y = (int) circle.getCenterY();
            pane.getChildren().addAll(circle);
            circle.setOnMouseEntered(event -> { //või setonmousemoved
                pane.getChildren().remove(circle);
                Label label = new Label();
                label.setText("Tere!");
                label.setLayoutX(x);
                label.setLayoutY(y);
                pane.getChildren().add(label);
            }
            );

        }

    }

}
