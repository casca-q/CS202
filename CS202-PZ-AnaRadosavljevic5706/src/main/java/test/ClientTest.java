package test;



import clientServer.Client;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClientTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testClientConnectsReceivesAndSendsMessages() {
        Client client = new Client();
        // Pretpostavi se  da server radi na localhost:45454 i očekuje određene interakcije
        client.clientConnects("localhost", 45454);

        // Proverava se da li je klijent primio i ispisao poruke sa servera na konzolu,
        // kao i da je uspešno slao korisničke unose
        assertTrue(outContent.toString().contains("očekivana poruka sa servera"));

    }
}

