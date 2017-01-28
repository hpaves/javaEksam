package JavaFX;

import com.sun.org.apache.regexp.internal.REDebugCompiler;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Tee JavaFXiga detektiivi mäng, kus kasutaja saab nähtamatuid ringe otsida.
 * 1. Ekraanil (näiteks 500x500) on suvalistes kohtades 3 ringi, mida näha ei ole.
 * 2. Hiirega ringile vastu minnes tuleb ring nähtavale.
 */
public class Detektiiv {
    Pane window; // main game window
    Scene mainView; // the window sizer
    Stage primaryStage = new Stage(); // holder of game contents

    public Detektiiv() {
        startStage();
    }

    private void startStage() {

        int fieldLength = 500;
        int fieldHeight = 500;

        window = new Pane(); // makes the game window base
        mainView = new Scene(window, fieldLength, fieldHeight); // determines scene size
        primaryStage.setScene(mainView); // sets scene on the state
        primaryStage.show(); // displays the game contents

        for (int i = 0; i < 3; i++) {
            addCircle();
        }

    }

    public void addCircle() {
        Circle circle = new Circle();
        circle.setRadius(50);
        circle.setCenterX((int) (Math.random()*500));
        circle.setCenterY((int) (Math.random()*500));
        circle.setFill(Color.WHITE);
        window.getChildren().add(circle);
        circle.setOnMouseEntered(event ->  circle.setFill(Color.RED));

    }
}
