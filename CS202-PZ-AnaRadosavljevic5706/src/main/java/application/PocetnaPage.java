package application;

import clientServer.Client;
import clientServer.Server;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import main.Main;

import java.io.IOException;

public class PocetnaPage extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));

        stage.setTitle("MoreThanWalls");

        Text textNode1 = new Text("Pocetna strana");
        Text textNode2 = new Text("@AnaRadosavljevic5706");
        Button button1 = new Button("Pocetna strana");
        Button button2 = new Button("Nepokretnosti");

        NepokretnostiPage  nepokretnostiPage = new NepokretnostiPage();
        button2.setOnAction(event -> {
                    nepokretnostiPage.switchToSecondPage(stage);
        });
        Button button3 = new Button("O nama");
        ONamaPage oNamaPage = new ONamaPage();
        button3.setOnAction(event -> {
            // Switch to the second page (scene)
            oNamaPage.switchToThird(stage);
        });
        Button button4 = new Button("Kontakt");
        KontaktPage kontaktPage = new KontaktPage();
        button4.setOnAction(event -> {

            kontaktPage.switchToFourth(stage);

        });
        Button button5 = new Button("Zatrazi ponudu");
        Server server = new Server();
        Client client = new Client();
        Main aktivacijaServera = new Main();
        button5.setOnAction(event -> {
            aktivacijaServera.startServerStartClient();



        });



        button1.setStyle("-fx-background-color: #3E2723; -fx-text-fill: #FFAB00; -fx-border-color: #FFAB00; -fx-border-width: 2px;  -fx-border-radius: 50;-fx-background-radius: 50;-fx-background-insets: 0;");
        button2.setStyle("-fx-background-color: #3E2723; -fx-text-fill: #FFAB00; -fx-border-color: #FFAB00; -fx-border-width: 2px;  -fx-border-radius: 50;-fx-background-radius: 50;-fx-background-insets: 0;");
        button3.setStyle("-fx-background-color: #3E2723;  -fx-text-fill: #FFAB00;-fx-border-color: #FFAB00; -fx-border-width: 2px;  -fx-border-radius: 50;-fx-background-radius: 50;-fx-background-insets: 0;");
        button4.setStyle("-fx-background-color: #3E2723;  -fx-text-fill: #FFAB00;-fx-border-color: #FFAB00; -fx-border-width: 2px;  -fx-border-radius: 50;-fx-background-radius: 50;-fx-background-insets: 0;");
        button5.setStyle("-fx-background-color: #3E2723;  -fx-text-fill: #FFAB00;-fx-border-color: #FFAB00; -fx-border-width: 2px;  -fx-border-radius: 0;-fx-background-radius: 50;-fx-background-insets: 0;");

        Image pozadina = new Image("/SlikaZaPozadinu.jpg");
        BackgroundImage backgroundImage = new BackgroundImage(
                pozadina,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                BackgroundSize.DEFAULT
        );
        Background background = new Background(backgroundImage);
        Label textBox1 = new Label("Dobrodosli na More Than Walls.\nMi Vas povezujemo sa najboljim nekretninama\n" +
                "u drzavi.\nZatrazite Vasu ponudu klikom na dugme ispod."); // Create a Label
        textBox1.setStyle("-fx-border-color:#8B0000 ; -fx-padding: 10px;-fx-background-color: #3E2723;;  -fx-text-fill: #FFAB00; -fx-border-radius: 0;"); // Optional styling
        textBox1.setPrefWidth(500);
        textBox1.setPrefHeight(100);




        StackPane stackPane = new StackPane();
        stackPane.setBackground(background);
        stackPane.getChildren().addAll(textNode1,button1,button2,button3,button4,textBox1,textNode2,button5);
        Scene sceneHomePage = new Scene(stackPane, 1470, 830);
        stackPane.setAlignment(Pos.TOP_CENTER);
        StackPane.setMargin(textNode1, new javafx.geometry.Insets(10, 200, 0, 10));
        StackPane.setMargin(button1, new javafx.geometry.Insets(70, 600, 0, 10));
        StackPane.setMargin(button2, new javafx.geometry.Insets(70, 300, 0, 10));
        StackPane.setMargin(button3, new javafx.geometry.Insets(70, 0, 0, 10));
        StackPane.setMargin(button4, new javafx.geometry.Insets(70, -300, 0, 10));
        StackPane.setMargin(textBox1, new javafx.geometry.Insets(250, 100, 0, 10));
        StackPane.setMargin(textNode2, new javafx.geometry.Insets(800, 100, 0, 10));
        StackPane.setMargin(button5, new javafx.geometry.Insets(380, 100, 0, 10));


        stage.setScene(sceneHomePage);
        stage.show();



    }

    public void switchToFirst(Stage stage) {

        Text textNode1 = new Text("Pocetna strana");
        Button button1 = new Button("Pocetna strana");
        Text textNode2 = new Text("@AnaRadosavljevic5706");
        Button button2 = new Button("Nepokretnosti");
        NepokretnostiPage nepokretnostiPage = new NepokretnostiPage();
        button2.setOnAction(event -> {
            // Switch to the second page (scene)
            nepokretnostiPage.switchToSecondPage(stage);
        });
        Button button3 = new Button("O nama");
        ONamaPage oNamaPage = new ONamaPage();
        button3.setOnAction(event -> {
            // Switch to the second page (scene)
            oNamaPage.switchToThird(stage);
        });
        Button button4 = new Button("Kontakt");
        KontaktPage kontaktPage = new KontaktPage();
        button4.setOnAction(event -> {
            // Switch to the second page (scene)
            kontaktPage.switchToFourth(stage);
        });


        Button button5 = new Button("Zatrazi ponudu");
        button1.setStyle("-fx-background-color: #3E2723; -fx-text-fill: #FFAB00; -fx-border-color: #FFAB00; -fx-border-width: 2px;  -fx-border-radius: 50;-fx-background-radius: 50;-fx-background-insets: 0;");
        button2.setStyle("-fx-background-color: #3E2723; -fx-text-fill: #FFAB00; -fx-border-color: #FFAB00; -fx-border-width: 2px;  -fx-border-radius: 50;-fx-background-radius: 50;-fx-background-insets: 0;");
        button3.setStyle("-fx-background-color: #3E2723; -fx-text-fill: #FFAB00; -fx-border-color: #FFAB00; -fx-border-width: 2px;  -fx-border-radius: 50;-fx-background-radius: 50;-fx-background-insets: 0;");
        button4.setStyle("-fx-background-color: #3E2723; -fx-text-fill: #FFAB00; -fx-border-color: #FFAB00; -fx-border-width: 2px;  -fx-border-radius: 50;-fx-background-radius: 50;-fx-background-insets: 0;");
        button5.setStyle("-fx-background-color: #3E2723;  -fx-text-fill: #FFAB00;-fx-border-color: #FFAB00; -fx-border-width: 2px;  -fx-border-radius: 0;-fx-background-radius: 50;-fx-background-insets: 0;");

        Server server = new Server();
        Client client = new Client();
        Main aktivacijaServera = new Main();
        button5.setOnAction(event -> {
            aktivacijaServera.startServerStartClient();



        });
        Label textBox1 = new Label("Dobrodosli na More Than Walls.\nMi Vas povezujemo sa najboljim nekretninama\n" +
                "u drzavi.\nZatrazite Vasu ponudu klikom na dugme ispod.");
        textBox1.setStyle("-fx-border-color:#8B0000 ; -fx-padding: 10px;-fx-background-color: #3E2723;;  -fx-text-fill: #FFAB00; -fx-border-radius: 0;"); // Optional styling
        textBox1.setPrefWidth(500);
        textBox1.setPrefHeight(100);
        Image pozadina = new Image("/SlikaZaPozadinu.jpg");
        BackgroundImage backgroundImage = new BackgroundImage(
                pozadina,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                BackgroundSize.DEFAULT
        );
        Background background = new Background(backgroundImage);

        StackPane stackPane = new StackPane();
        stackPane.setBackground(background);
        stackPane.getChildren().addAll(textNode1,button1,button2,button3,button4,textBox1,textNode2,button5);
        Scene sceneHomePage = new Scene(stackPane, 1470, 830);
        stackPane.setAlignment(Pos.TOP_CENTER);
        StackPane.setMargin(textNode1, new javafx.geometry.Insets(10, 200, 0, 10));
        StackPane.setMargin(button1, new javafx.geometry.Insets(70, 600, 0, 10));
        StackPane.setMargin(button2, new javafx.geometry.Insets(70, 300, 0, 10));
        StackPane.setMargin(button3, new javafx.geometry.Insets(70, 0, 0, 10));
        StackPane.setMargin(button4, new javafx.geometry.Insets(70, -300, 0, 10));
        StackPane.setMargin(textBox1, new javafx.geometry.Insets(250, 100, 0, 10));
        StackPane.setMargin(textNode2, new javafx.geometry.Insets(800, 100, 0, 10));
        StackPane.setMargin(button5, new javafx.geometry.Insets(380, 100, 0, 10));

        stage.setScene(sceneHomePage);
    }






        }



