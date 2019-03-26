package NF;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatientTest {

    private Patient patient;
    @BeforeEach
    void setUp() {


        patient = new Patient(1, "PEROL", "Thomas", new java.sql.Date(2015-03-31), Genre.H, new Adresse(1, "34", "rue Mallifaud", "", "34500", "PARIS", "FRANCE"));

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testToString() {
        assertEquals("Patient{" + "identifiant=" + 1 + ", nom_d_usage=" + "PEROL" + ", nom_de_naissance=" + "PEROL" + ", prenom=" + "Thomas" + ", date_de_naissance=" + new java.sql.Date(2015-03-31) + ", genre=" + Genre.H + ", adresse=" + new Adresse(1, "34", "rue Mallifaud", "", "34500", "PARIS",  "FRANCE") + '}', patient.toString());
    }

    @Test
    void equals() {
        assertEquals(true, patient.equals(patient));
    }

}