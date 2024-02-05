package test;

import agencija.Agencija;
import org.junit.Test;
import static org.junit.Assert.*;

public class AgencijaTest {

    @Test
    public void testGetInstance() {
        Agencija agencija1 = Agencija.getInstance(1, 10);
        Agencija agencija2 = Agencija.getInstance(2, 15);

        // Proveravamo da li su oba poziva vraćena istom instancom
        assertSame("Prvi poziv nije vratio instancu.", agencija1, Agencija.getInstance(1, 10));
        assertSame("Drugi poziv nije vratio instancu.", agencija2, Agencija.getInstance(2, 15));
    }

    @Test
    public void testGettersAndSetters() {
        Agencija agencija = new Agencija();

        agencija.setAgencijaId(1);
        assertEquals("AgencijaId nije postavljen kako treba.", 1, agencija.getAgencijaId());

        agencija.setNaknadaProcenat(10);
        assertEquals("NaknadaProcenat nije postavljen kako treba.", 10, agencija.getNaknadaProcenat());
    }

    @Test
    public void testToString() {
        Agencija agencija = new Agencija(1, 10);
        assertEquals("ToString metoda nije vratila očekivani rezultat.", "Agencija{agencijaId=1, naknadaProcenat=10}", agencija.toString());
    }
}
