package NF;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedecinTest {

    private Medecin medecin;
    @BeforeEach
    void setUp() {
        medecin = new Medecin(22, "Rancillon", "Francis");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void TestToString() {
        assertEquals("Docteur " + "Rancillon" + " " + "Francis",medecin.toString());
    }

    @Test
    void equals() {
        assertEquals(true, medecin.equals(medecin));
    }
}