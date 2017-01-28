package JavaFX;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

public class Kasutajaliides {
    Pane pane;
    TextField textField;
    Button submit;

    public Kasutajaliides(Pane paneSisse){
        pane = paneSisse;
        looKasutajaliides();
        joonistaJoon();
    }

    private void looKasutajaliides() {
        TextField textField = new TextField();
        Button submit = new Button("Joonista!");
        submit.setDefaultButton(true);
        submit.setTranslateX(200);
    }

    private void joonistaJoon() {
        submit.setOnAction(event -> {
            //küsi input
            String input = textField.getText();
            //lahuta numbrid
            String[] k = input.split("-");
            int[] intK = new int[4];
            for (int i = 0; i < k.length; i++) {
                intK[i] = Integer.parseInt(k[i]);
            }
            //joonista joon vastavalt numbrile
            Line line = new Line(intK[0], intK[1], intK[2], intK[3]);
            pane.getChildren().add(line);
        });

    }

}
