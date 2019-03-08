package NF;

import java.sql.Date;

/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral
 * Olivia
 */
public class Patient_urgences extends Patient {

    /**
     * Constructeur qui demande le nom d'usage et le nom de naissance
     */
    public Patient_urgences(int id, String nom_d_usage, String nom_de_naissance, String prenom, java.sql.Date date_de_naissance, Genre genre, Adresse adresse) {
        super(id, nom_d_usage, nom_de_naissance, prenom, date_de_naissance, genre, adresse);
    }

    /**
     * Constructeur qui demande seulement le nom d'usage
     */
    public Patient_urgences(int id, String nom_d_usage, String prenom, Date date_de_naissance, Genre genre, Adresse adresse) {
        super(id, nom_d_usage, prenom, date_de_naissance, genre, adresse);
    }

    public String toString(){
        return super.toString();
    }
}
