package JavaFX;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import org.w3c.dom.css.Rect;

/**
 * Joonista ekraanile hunnik ristkülikuid, suvalistel positsioonidel. Ühe korra kastile klikates
 * muutub ta 2x väiksemaks. Teist korda klikates kaob ta sootuks.
 */
public class PixelChaser {
    Pane window; // main game window
    Scene mainView; // the window sizer
    Stage primaryStage = new Stage(); // holder of game contents

    public PixelChaser() {
        startStage();
    }

    private void startStage() {

        int fieldLength = 500;
        int fieldHeight = 500;

        window = new Pane(); // makes the game window base
        mainView = new Scene(window, fieldLength, fieldHeight); // determines scene size
        primaryStage.setScene(mainView); // sets scene on the state
        primaryStage.show(); // displays the game contents

        for (int i = 0; i < 10; i++) {
//            Rectangle rect = new Rectangle(i*100,i*100, 100, 100);
            Rectangle rect = new Rectangle(Math.random()*300,Math.random()*300, 100, 100);
            window.getChildren().add(rect);
            boolean klikitud = false;
            rect.setId("eioleklikitud");
            rect.setOnMouseClicked(event -> {
                if (rect.getId().equals("klikitud")) {
                    rect.setScaleX(0);
                    rect.setScaleY(0);
                } else {
                    rect.setScaleX(0.5);
                    rect.setScaleY(0.5);
                }
                rect.setId("klikitud");
            });
        }

    }

}
