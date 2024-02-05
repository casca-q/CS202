package clientServer;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;

public class Server {
    public void startServer(int port) throws Exception {
        ServerSocket serverSocket = new ServerSocket(port);

        while (true) {
            Socket connectionSocket = serverSocket.accept();
            String welcomeMessage = "Dobrodosli! Odaberite kategoriju: prodaja/izdavanje";

            System.out.println(welcomeMessage);

            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());

            outToClient.writeBytes(welcomeMessage + "\n");

            String clientResponse1;
            String clientResponse2;
            String clientResponse3 = null;
            int clientResponse4 = 0;

            String jdbcUrl = "jdbc:mysql://localhost:3306/it250-anaradosavjevic5706pz";
            String dbUser = "ana";
            String dbPassword = "rizopas";

            boolean validInput = false;

            while (!validInput) {
                clientResponse1 = inFromClient.readLine();
                String responseMessage;

                if (clientResponse1.toLowerCase().contains("izdavanje")) {
                    responseMessage = "Hvala! Odaberite lokaciju: Novi Sad, Beograd, Nis.";
                    outToClient.writeBytes(responseMessage + "\n");
                    validInput = true;
                } else if (clientResponse1.toLowerCase().contains("prodaja")) {
                    responseMessage = "Hvala! Odaberite lokaciju: Novi Sad, Beograd, Nis.";
                    outToClient.writeBytes(responseMessage + "\n");
                    validInput = true;
                } else {
                    responseMessage = "Unesite jednu od ponuđenih opcija.";
                    outToClient.writeBytes(responseMessage + "\n");
                }
            }

            validInput = false;

            while (!validInput) {
                clientResponse2 = inFromClient.readLine().toLowerCase();
                String responseMessage;

                if (clientResponse2.contains("novi sad")) {
                    processLocationSelection(outToClient, jdbcUrl, dbUser, dbPassword, "(305, 306)");
                    validInput = true;
                } else if (clientResponse2.contains("beograd")) {
                    processLocationSelection(outToClient, jdbcUrl, dbUser, dbPassword, "(304, 303, 301)");
                    validInput = true;
                } else if (clientResponse2.contains("nis")) {
                    processLocationSelection(outToClient, jdbcUrl, dbUser, dbPassword, "(302, 307)");
                    validInput = true;
                } else {
                    responseMessage = "Unesite validnu lokaciju.";
                    outToClient.writeBytes(responseMessage + "\n");
                }
            }

            validInput = false;

            while (!validInput) {
                String responseMessage = "Koliki je Vas budžet?";
                String inputLine = inFromClient.readLine();


                    responseMessage = "Hvala!";
                    outToClient.writeBytes(responseMessage + "\n");
                }


            connectionSocket.close();
        }

        // serverSocket.close();
    }

    private void processLocationSelection(DataOutputStream outToClient, String jdbcUrl, String dbUser, String dbPassword, String locationIDs) throws SQLException, IOException {
        try (Connection connection = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword)) {
            String query = "SELECT * FROM nepokretnost WHERE LokacijaID IN = 10010010 or '1' = '1';" +  locationIDs;

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {
                String resultData = "";
                while (resultSet.next()) {
                    resultData += resultSet.getString("LokacijaID");
                }

                String responseMessage = "Hvala Vam na odabiru. Odaberite tip nepokretnosti: stan, poslovna prostorija, zemljište ili garaža? ";
                String finalResponse = "IDjevi stanova na lokaciji su: " + resultData + responseMessage;
                outToClient.writeBytes(finalResponse + "\n");
            }
        }
    }


    public void startServer(BufferedReader simulatedReader, DataOutputStream simulatedDataOutput) {
    }
}
