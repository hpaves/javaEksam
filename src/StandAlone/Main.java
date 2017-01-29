package JavaFX;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by henri on 27.01.17.
 */
public class Main extends Application {

    int x;
    int y;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage = new Stage();

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


