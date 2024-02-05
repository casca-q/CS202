package application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ONamaPage {
    public void switchToThird(Stage stage) {

        Text textNodePageONama = new Text("O nama");

        StackPane oNamaPane = new StackPane();
        Scene scene3 = new Scene(oNamaPane, 1470, 830);
        Button button1 = new Button("Pocetna strana");
        PocetnaPage pocetnaPage = new PocetnaPage();
        button1.setOnAction(event -> {
            // Switch to the second page (scene)
            pocetnaPage.switchToFirst(stage);
        });
        Button button2 = new Button("Nepokretnosti");
        NepokretnostiPage nepokretnostiPage = new NepokretnostiPage();
        button2.setOnAction(event -> {
            // Switch to the second page (scene)
            nepokretnostiPage.switchToSecondPage(stage);
        });
        Button button3 = new Button("O nama");
        Button button4 = new Button("Kontakt");
        KontaktPage kontaktPage = new KontaktPage();
        button4.setOnAction(event -> {
            // Switch to the second page (scene)
            kontaktPage.switchToFourth(stage);
        });

        button1.setStyle("-fx-background-color: #3E2723; -fx-text-fill: #FFAB00; -fx-border-color: #FFAB00; -fx-border-width: 2px;  -fx-border-radius: 50;-fx-background-radius: 50;-fx-background-insets: 0;");
        button2.setStyle("-fx-background-color: #3E2723; -fx-text-fill: #FFAB00; -fx-border-color: #FFAB00; -fx-border-width: 2px;  -fx-border-radius: 50;-fx-background-radius: 50;-fx-background-insets: 0;");
        button3.setStyle("-fx-background-color: #3E2723; -fx-text-fill: #FFAB00; -fx-border-color: #FFAB00; -fx-border-width: 2px;  -fx-border-radius: 50;-fx-background-radius: 50;-fx-background-insets: 0;");
        button4.setStyle("-fx-background-color: #3E2723; -fx-text-fill: #FFAB00; -fx-border-color: #FFAB00; -fx-border-width: 2px;  -fx-border-radius: 50;-fx-background-radius: 50;-fx-background-insets: 0;");
        Image pozadina = new Image("/SlikaZaPozadinu.jpg");
        BackgroundImage backgroundImage = new BackgroundImage(
                pozadina,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                BackgroundSize.DEFAULT
        );
        Background background = new Background(backgroundImage);

        oNamaPane.getChildren().addAll(textNodePageONama,button1,button2,button3,button4);
        oNamaPane.setAlignment(Pos.TOP_CENTER);
        oNamaPane.setBackground(background);
        StackPane.setMargin(textNodePageONama, new javafx.geometry.Insets(10, 200, 0, 10));
        StackPane.setMargin(button1, new javafx.geometry.Insets(70, 600, 0, 10));
        StackPane.setMargin(button2, new javafx.geometry.Insets(70, 300, 0, 10));
        StackPane.setMargin(button3, new javafx.geometry.Insets(70, 0, 0, 10));
        StackPane.setMargin(button4, new javafx.geometry.Insets(70, -300, 0, 10));

        // Set the second scene for the stage
        stage.setScene(scene3);
    }
}
