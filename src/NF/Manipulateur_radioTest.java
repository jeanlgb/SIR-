package NF;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Manipulateur_radioTest {

    private Manipulateur_radio manipulateur_radio;

    @BeforeEach
    void setUp() {
        manipulateur_radio = new Manipulateur_radio(12, "Porral", "Diego");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void TestToString() {
        assertEquals("Manipulateur_radio{" + "identifiant=" + 12 + ", nom=" + "Porral" + ", prenom=" + "Diego" + '}',manipulateur_radio.toString());
    }

    @Test
    void equals() {
        assertEquals(true, manipulateur_radio.equals(manipulateur_radio));
    }
}