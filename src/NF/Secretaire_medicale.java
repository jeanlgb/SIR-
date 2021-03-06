package NF;

import java.util.Objects;

/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral
 * Olivia
 */
public class Secretaire_medicale {

    private int identifiant;
    private String nom;
    private String prenom;

    /**
     * constructeur qui demande un identifiant médical, un nom et un prénom
     */
    public Secretaire_medicale(int identifiant, String nom, String prenom) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
    }

    /**
     * fonction qui permet la création du DMR
     */
    public void creer_DMR() {
        //fonction a creer
    }

    /**
     * fonction qui permet la consultation du DMR
     */
    public void consulter_DMR(int id_patient) {
        //fonction à créer
    }

    /**
     * fonction qui permet la création d'un médecin
     */
    public void creer_medecin() {
        //fonction a creer
    }

    /**
     * fonction qui permet la création d'un patient
     */
    public void creer_patient() {
        //fonction a creer
    }

    @Override
    public String toString() {
        return "Secretaire_medicale{" + "identifiant=" + getIdentifiant() + ", nom=" + getNom() + ", prenom=" + getPrenom() + '}';
    }



    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Secretaire_medicale other = (Secretaire_medicale) obj;
        if (!Objects.equals(this.identifiant, other.identifiant)) {
            return false;
        }
        return true;
    }

    /**
     * @return the identifiant
     */
    public int getIdentifiant() {
        return identifiant;
    }

    /**
     * @param identifiant the identifiant to set
     */
    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    
    
}
