package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.SQLException;

import application.Database;
import org.junit.Test;

public class DatabaseTest {

    @Test
    public void testGetConnection() {
        try {
            // Poku[avanje konekcije
            Connection connection = Database.getConnection();

            // Provera da li je konekcija uspešno dobijena
            assertNotNull("Konekcija ne sme biti null.", connection);

            // Zatvaranje konekcije
            connection.close();

        } catch (SQLException e) {
            // Ako se desi SQLException, test ne sme da padne
            fail("Test je pao sa izuzetkom: " + e.getMessage());
        }
    }
}

