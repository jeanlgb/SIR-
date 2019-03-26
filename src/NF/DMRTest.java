package NF;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DMRTest {

    private DMR dmr;
    @BeforeEach
    void setUp() {
        dmr = new DMR(5,1, null, null);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void ajouter_examen() {
    assertEquals(true,dmr.equals(dmr));
    }

    @Test
    public void testToString() {
        assertEquals("DMR{" + "id_dmr=" + 5 +", id_patient=" + 1 + ", examens_patient=" + null + ", historique_modifications=" + null +'}' ,
        dmr.toString());


    }
}