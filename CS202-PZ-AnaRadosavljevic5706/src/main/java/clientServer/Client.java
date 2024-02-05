package clientServer;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public void clientConnects(String address, int port) {
        try (Socket clientSocket = new Socket("localhost", 45454);
             Scanner scanner = new Scanner(System.in);
             DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
             BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            String answer = inFromServer.readLine();
            System.out.println(answer);

            String userInput;

            for (int i = 0; i < 3; i++) {
                userInput = scanner.nextLine();
                outToServer.writeBytes(userInput + "\n");

                answer = inFromServer.readLine();
                System.out.println(answer);
            }

            while (!(answer = inFromServer.readLine()).equals("Hvala Vam!")) {
                System.out.println(answer);
                userInput = scanner.nextLine();
                outToServer.writeBytes(userInput + "\n");
            }

            // Close the socket after the server has completed its response
            clientSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
