package NF;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalleTest {

    private  Salle salle;
    @BeforeEach
    void setUp() {
        salle = new Salle(456, Type_examen.scanner,false, null);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void TestToString() {
        assertEquals("Salle{" + "numero_salle=" + 456 + ", type_examen=" + Type_examen.scanner + ", examen_numerique=" + false +'}',salle.toString());
    }


   /* @Test
    void isExamn_num() {
    }*/
}