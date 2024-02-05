    package main;
    import application.PocetnaPage;
    import clientServer.Client;
    import clientServer.Server;
    import javafx.application.Application;
    import javafx.stage.Stage;


    public class Main extends Application  {


        public void startServerStartClient() {


            Thread serverThread = new Thread(() -> {
                Server server = new Server();
                try {
                    server.startServer(45454);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });

            Thread clientThread = new Thread(() -> {
                Client client = new Client();
                try {

                    client.clientConnects("localhost", 45454);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });

            serverThread.start();
            clientThread.start();


        }

        public static void main(String[] args) throws Exception {

            launch(PocetnaPage.class, args);



        }


        @Override
        public void start(Stage stage) throws Exception {

        }
    }







