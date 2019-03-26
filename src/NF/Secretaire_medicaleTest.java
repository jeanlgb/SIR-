package NF;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Secretaire_medicaleTest {

    private  Secretaire_medicale secretaire_medicale;
    @BeforeEach
    void setUp() {
        secretaire_medicale = new Secretaire_medicale(4554, "Banana", "Alexia");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void TestToString() {
        assertEquals("Secretaire_medicale{" + "identifiant=" + 4554 + ", nom=" + "Banana" + ", prenom=" + "Alexia" + '}',secretaire_medicale.toString());
    }

    @Test
    void equals() {
        assertEquals(true,
                secretaire_medicale.equals(secretaire_medicale));
    }
}