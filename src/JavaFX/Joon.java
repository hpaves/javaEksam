package JavaFX;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt alguse ja lõpu x-y kordinaadid ning joonista talle joon.
 * Akna võime limiteerida 500x500 piksli peale.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Joon {

    public Joon() {
        startStage();
    }

    int startXValue;
    int startYValue;
    int endXValue;
    int endYValue;

    private void startStage() {
        Pane window; // main game window
        Scene mainView; // the window sizer
        Stage primaryStage = new Stage(); // holder of game contents

        int fieldLength = 500;
        int fieldHeight = 500;

        window = new Pane(); // makes the game window base
        mainView = new Scene(window, fieldLength, fieldHeight); // determines scene size
        primaryStage.setScene(mainView); // sets scene on the state
        primaryStage.show(); // displays the game contents

        Line line = new Line();
        line.setStartX(100);
        line.setStartY(100);
        line.setEndX(400);
        line.setEndY(400);

        TextField startXField = new TextField();
        startXField.setMaxWidth(50);
        startXField.setLayoutX(10);
        startXField.setLayoutY(10);
        Button startXButton = new Button("Start X");
        startXButton.setLayoutX(70);
        startXButton.setLayoutY(10);
        startXButton.setOnMouseClicked((event) -> { // when mouse clicks on "submit"
            startXValue = Integer.parseInt(startXField.getText());
            line.setStartX(startXValue);
        });

        TextField startYField = new TextField();
        startYField.setMaxWidth(50);
        startYField.setLayoutX(10);
        startYField.setLayoutY(40);
        Button startYButton = new Button("Start Y");
        startYButton.setLayoutX(70);
        startYButton.setLayoutY(40);
        startYButton.setOnMouseClicked((event) -> { // when mouse clicks on "submit"
            startYValue = Integer.parseInt(startYField.getText());
            line.setStartY(startYValue);
        });

        TextField endXField = new TextField();
        endXField.setMaxWidth(50);
        endXField.setLayoutX(10);
        endXField.setLayoutY(70);
        Button endXButton = new Button("End X");
        endXButton.setLayoutX(70);
        endXButton.setLayoutY(70);
        endXButton.setOnMouseClicked((event) -> { // when mouse clicks on "submit"
            endXValue = Integer.parseInt(endXField.getText());
            line.setEndX(endXValue);
        });

        TextField endYField = new TextField();
        endYField.setMaxWidth(50);
        endYField.setLayoutX(10);
        endYField.setLayoutY(100);
        Button endYButton = new Button("End Y");
        endYButton.setLayoutX(70);
        endYButton.setLayoutY(100);
        endYButton.setOnMouseClicked((event) -> { // when mouse clicks on "submit"
            endYValue = Integer.parseInt(endYField.getText());
            line.setStartY(endYValue);
        });

        window.getChildren().addAll(line, startXField, startXButton, startYField, startYButton, endXField, endXButton, endYField, endYButton);


    }
}
