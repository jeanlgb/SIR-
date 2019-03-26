package NF;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModificationTest {

    private Modification modification;
    @BeforeEach
    void setUp() {
        modification = new Modification(new java.sql.Date(21/04/2019),  85);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void TestToString() {
        assertEquals("Dernière modification :" + new java.sql.Date(21/04/2019) + "par le Dr " + 85, modification.toString());
    }
}