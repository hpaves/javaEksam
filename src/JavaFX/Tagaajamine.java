package JavaFX;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista 500x500 ekraanile ring. Kui hiir ringile vastu läheb, leiab ring omale
 * uue koha. Ei pea animeerima ega midagi fäänsit. Lihtsalt ilmub uues kohas ja kõik.
 * Ehk hiirega saab ringi taga ajada. Kordan - ring leiab uue koha juba hiire puudutusest,
 * mitte klikist. Aga alustada võid muidugi klikist.
 */
public class Tagaajamine {
    public Tagaajamine() {
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

        Circle circle = new Circle(250, 250, 50);

        circle.setOnMouseEntered(event -> { //või setonmousemoved
                circle.setCenterX(Math.random() * 500);
                circle.setCenterY(Math.random() * 500);
            }
        );

        pane.getChildren().addAll(circle);


    }
}
