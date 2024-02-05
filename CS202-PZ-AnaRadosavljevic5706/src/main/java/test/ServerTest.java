package test;

import static org.testng.AssertJUnit.assertEquals;

import clientServer.Server;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.StringReader;

public class ServerTest {



    @Test
    public void testServerLogic() {
        Server server = new Server();


        String simulatedCategoryInput = "prodaja";

        String simulatedLocationInput = "novi sad";

        String simulatedBudgetInput = "100000";

        String serverResponse = simulateServerCommunication(server, simulatedCategoryInput, simulatedLocationInput, simulatedBudgetInput);

        assertEquals("Hvala Vam na odabiru. Odaberite tip nepokretnosti: stan, poslovna prostorija, zemljište ili garaža? IDjevi stanova na lokaciji su: (305, 306)Hvala!", serverResponse);
    }

    private String simulateServerCommunication(Server server, String category, String location, String budget) {

        StringBuilder simulatedInput = new StringBuilder();
        simulatedInput.append(category).append("\n");
        simulatedInput.append(location).append("\n");
        simulatedInput.append(budget).append("\n");

        BufferedReader simulatedReader = new BufferedReader(new StringReader(simulatedInput.toString()));

        ByteArrayOutputStream simulatedOutput = new ByteArrayOutputStream();
        DataOutputStream simulatedDataOutput = new DataOutputStream(simulatedOutput);

        server.startServer(simulatedReader, simulatedDataOutput);

        return simulatedOutput.toString();
    }
}
