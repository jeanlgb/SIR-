package NF;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExamenTest {

    private Examen examen;
    @BeforeEach
    void setUp() {
        examen = new Examen(45,new java.sql.Date(21/04/1997), null, Type_examen.scanner,22,
                45.2,null
                , 4, 6, 3.5);
    }

    @AfterEach
    void tearDown() {
    }



    @Test
    public void testToString() {
        assertEquals ("L'examen de type " + Type_examen.scanner + " d'une durée de " + 45.2 + " effectué le "
                + new java.sql.Date(21/04/1997) + " par le " + null + "."
                + " en salle " + 22 + "." + "\n" + "L'examen n'est pas terminé." + "\n" + "Compte rendu : " + "\n" + null + "\n",
                examen.toString());
    }

}