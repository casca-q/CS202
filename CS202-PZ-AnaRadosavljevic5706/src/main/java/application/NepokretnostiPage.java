    package application;

    import clientServer.Client;
    import clientServer.Server;
    import javafx.application.Application;
    import javafx.fxml.FXMLLoader;
    import javafx.geometry.Pos;
    import javafx.scene.Scene;
    import javafx.scene.control.*;
    import javafx.scene.image.ImageView;
    import javafx.scene.layout.*;
    import javafx.scene.text.Text;
    import javafx.stage.Stage;
    import javafx.scene.image.Image;
    import main.Main;
    import javafx.scene.control.Button;
    import javafx.scene.layout.VBox;
    import javafx.scene.layout.HBox;

    import java.util.*;


    public class NepokretnostiPage extends Application {

        @Override
        public void start(Stage stage) throws Exception {


        Text textNodePageNepokretnosti = new Text("Nepokretnosti");

        StackPane nepokretnostiPane = new StackPane();
        Scene scene2 = new Scene(nepokretnostiPane, 1470, 830);
        Button button1 = new Button("Pocetna strana");
        PocetnaPage pocetna = new PocetnaPage();

            button1.setOnAction(event -> {

            pocetna.switchToFirst(stage);
        });
        Button button2 = new Button("Nepokretnosti");
        Button button3 = new Button("O nama");
        ONamaPage oNamaPage = new ONamaPage();

            button3.setOnAction(event -> {

            oNamaPage.switchToThird(stage);
        });
        Button button4 = new Button("Kontakt");
        KontaktPage kontaktPage = new KontaktPage();
            button4.setOnAction(event -> {

            kontaktPage.switchToFourth(stage);
        });

            button1.setStyle("-fx-background-color: #3E2723; -fx-text-fill: #FFAB00; -fx-border-color: #FFAB00; -fx-border-width: 2px;  -fx-border-radius: 50;-fx-background-radius: 50;-fx-background-insets: 0;");
            button2.setStyle("-fx-background-color: #3E2723; -fx-text-fill: #FFAB00; -fx-border-color: #FFAB00; -fx-border-width: 2px;  -fx-border-radius: 50;-fx-background-radius: 50;-fx-background-insets: 0;");
            button3.setStyle("-fx-background-color: #3E2723; -fx-text-fill: #FFAB00; -fx-border-color: #FFAB00; -fx-border-width: 2px;  -fx-border-radius: 50;-fx-background-radius: 50;-fx-background-insets: 0;");
            button4.setStyle("-fx-background-color: #3E2723; -fx-text-fill: #FFAB00; -fx-border-color: #FFAB00; -fx-border-width: 2px;  -fx-border-radius: 50;-fx-background-radius: 50;-fx-background-insets: 0;");
        Image pozadina = new Image("/Slika3.jpg");
        BackgroundImage backgroundImage = new BackgroundImage(
                pozadina,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                BackgroundSize.DEFAULT
        );
        Background background = new Background(backgroundImage);

            HashSet<Image> hashSet = new HashSet<>();

            Image stan1 = new Image("/stan1.jpg");
            Image stan2 = new Image("/stam2.jpg");
            Image stan3 = new Image("/stan3.jpg");
            Image stan4 = new Image("/stan4.jpg");

            hashSet.add(stan1);
            hashSet.add(stan2);
            hashSet.add(stan3);
            hashSet.add(stan4);

            ImageView imageView = new ImageView();
            imageView.setFitWidth(300);
            imageView.setFitHeight(200);

            Iterator<Image> iterator = hashSet.iterator();

            Button nextButton = new Button("Next");
            Button prevButton = new Button("Previous");

            nextButton.setOnAction(e -> {
                if (iterator.hasNext()) {
                    imageView.setImage(iterator.next());
                }
            });


            HBox hBox = new HBox(prevButton,nextButton);
            VBox vBox = new VBox(imageView,hBox);

            StackPane stackPaneForImage = new StackPane();

            StackPane.setMargin(vBox, new javafx.geometry.Insets(70, -300, 0, 10));
            stackPaneForImage.getChildren().addAll(vBox);
            stackPaneForImage.setAlignment(Pos.CENTER);

            nepokretnostiPane.getChildren().addAll(textNodePageNepokretnosti,button1,button2,button3,button4,stackPaneForImage);
            nepokretnostiPane.setBackground(background);
            nepokretnostiPane.setAlignment(Pos.TOP_CENTER);
            StackPane.setMargin(textNodePageNepokretnosti, new javafx.geometry.Insets(10, 200, 0, 10));
            StackPane.setMargin(button1, new javafx.geometry.Insets(70, 600, 0, 10));
            StackPane.setMargin(button2, new javafx.geometry.Insets(70, 300, 0, 10));
            StackPane.setMargin(button3, new javafx.geometry.Insets(70, 0, 0, 10));
            StackPane.setMargin(button4, new javafx.geometry.Insets(70, -300, 0, 10));
            StackPane.setMargin(vBox, new javafx.geometry.Insets(70, -300, 0, 10));



            stage.setScene(scene2);
    }


        public void switchToSecondPage(Stage stage) {

            Text textNodePageNepokretnosti = new Text("Nepokretnosti");

            StackPane nepokretnostiPane = new StackPane();
            Scene scene2 = new Scene(nepokretnostiPane, 1470, 830);
            Button button1 = new Button("Pocetna strana");
            PocetnaPage pocetna = new PocetnaPage();
            button1.setOnAction(event -> {

                pocetna.switchToFirst(stage);
            });
            Button button2 = new Button("Nepokretnosti");
            Button button3 = new Button("O nama");
            ONamaPage oNamaPage = new ONamaPage();

            button3.setOnAction(event -> {

                oNamaPage.switchToThird(stage);
            });
            Button button4 = new Button("Kontakt");
            KontaktPage kontaktPage = new KontaktPage();
            button4.setOnAction(event -> {

                kontaktPage.switchToFourth(stage);
            });

            button1.setStyle("-fx-background-color: #3E2723; -fx-text-fill: #FFAB00; -fx-border-color: #FFAB00; -fx-border-width: 2px;  -fx-border-radius: 50;-fx-background-radius: 50;-fx-background-insets: 0;");
            button2.setStyle("-fx-background-color: #3E2723; -fx-text-fill: #FFAB00; -fx-border-color: #FFAB00; -fx-border-width: 2px;  -fx-border-radius: 50;-fx-background-radius: 50;-fx-background-insets: 0;");
            button3.setStyle("-fx-background-color: #3E2723; -fx-text-fill: #FFAB00; -fx-border-color: #FFAB00; -fx-border-width: 2px;  -fx-border-radius: 50;-fx-background-radius: 50;-fx-background-insets: 0;");
            button4.setStyle("-fx-background-color: #3E2723; -fx-text-fill: #FFAB00; -fx-border-color: #FFAB00; -fx-border-width: 2px;  -fx-border-radius: 50;-fx-background-radius: 50;-fx-background-insets: 0;");
            Image pozadina = new Image("/pozadina2.jpg");

            Label textBox1 = new Label(" GALERIJA");
            textBox1.setStyle("-fx-border-color:#FFAB00 ;  -fx-pref-height: 30px; -fx-pref-width: 90px;-fx-font-size: 14px; -fx-padding: 10px;-fx-background-color: #3E2723;;  -fx-text-fill: #FFAB00; -fx-border-radius: 0;");
            textBox1.setPrefWidth(500);
            textBox1.setPrefHeight(100);
            Text textNode2 = new Text("@AnaRadosavljevic5706");


            BackgroundSize backgroundSize = new BackgroundSize(1280, 720, false, false, false, false);

            BackgroundImage backgroundImage = new BackgroundImage(
                    pozadina,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundPosition.CENTER,
                    backgroundSize
            );
            Background background = new Background(backgroundImage);

            HashSet<Image> hashSet = new HashSet<>();

            Image stan1 = new Image("/stan1.jpg");
            Image stan2 = new Image("/stam2.jpg");
            Image stan3 = new Image("/stan3.jpg");
            Image stan4 = new Image("/stan4.jpg");
            Image stan5 = new Image("/stan5.jpg");

            hashSet.add(stan1);
            hashSet.add(stan2);
            hashSet.add(stan3);
            hashSet.add(stan4);


            List<Image> imageList = new ArrayList<>(hashSet);

            ImageView imageView = new ImageView();
            imageView.setFitWidth(500);
            imageView.setFitHeight(400);


            Text text1 = new Text("Stan na lokaciji Beograd, prodaja");
            Text text2 = new Text("Stan na lokaciji Nis, izdavanje");
            Text text3 = new Text("Stan na lokaciji Novi Sad, prodaja");
            Text text4 = new Text("Stan na lokaciji Beograd, izdavanje");



            Iterator<Image> iterator = hashSet.iterator();


            Button nextButton = new Button("Next");
            Button prevButton = new Button("Previous");

            nextButton.setStyle("-fx-background-color: #3E2723; -fx-text-fill: #FFAB00; -fx-border-color: #FFAB00; -fx-border-width: 2px;  -fx-border-radius: 50;-fx-background-radius: 50;-fx-background-insets: 0;");
            prevButton.setStyle("-fx-background-color: #3E2723; -fx-text-fill: #FFAB00; -fx-border-color: #FFAB00; -fx-border-width: 2px;  -fx-border-radius: 50;-fx-background-radius: 50;-fx-background-insets: 0;");

            ListIterator<Image> listIterator = imageList.listIterator();

            if (listIterator.hasNext()) {
                imageView.setImage(listIterator.next());
            }


            nextButton.setOnAction(e -> {
                if (listIterator.hasNext()) {
                    imageView.setImage(listIterator.next());
                }
            });

            prevButton.setOnAction(e -> {
                if (listIterator.hasPrevious()) {
                    imageView.setImage(listIterator.previous());
                }
            });





            StackPane stackPaneForImage = new StackPane();


            stackPaneForImage.getChildren().addAll(imageView);





            nepokretnostiPane.getChildren().addAll(textNodePageNepokretnosti,button1,button2,button3,button4,stackPaneForImage,nextButton,prevButton,textBox1,textNode2);
            nepokretnostiPane.setBackground(background);
            nepokretnostiPane.setAlignment(Pos.TOP_CENTER);

            StackPane.setMargin(textNodePageNepokretnosti, new javafx.geometry.Insets(10, 200, 0, 10));
            StackPane.setMargin(button1, new javafx.geometry.Insets(70, 600, 0, 10));
            StackPane.setMargin(button2, new javafx.geometry.Insets(70, 300, 0, 10));
            StackPane.setMargin(button3, new javafx.geometry.Insets(70, 0, 0, 10));
            StackPane.setMargin(button4, new javafx.geometry.Insets(70, -300, 0, 10));
            StackPane.setMargin(stackPaneForImage, new javafx.geometry.Insets(250, 100, 350, 0));
            StackPane.setMargin(prevButton, new javafx.geometry.Insets(450, 700, 0, 10));
            StackPane.setMargin(nextButton, new javafx.geometry.Insets(450, -470, 0, 10));
            StackPane.setMargin(textBox1, new javafx.geometry.Insets(660, 130, 0, 10));
            StackPane.setMargin(textNode2, new javafx.geometry.Insets(800, 100, 0, 10));




            stage.setScene(scene2);
        }


}

