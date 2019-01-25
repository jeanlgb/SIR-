package NF;

import java.util.Objects;

/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral
 * Olivia
 */
public class Secretaire_medicale {

    private ID identifiant;
    private String nom;
    private String prenom;

    public Secretaire_medicale(ID identifiant, String nom, String prenom) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
    }

    public void creer_DMR() {
        //fonction a creer
    }

    public void consulter_DMR(ID id_patient) {
        //fonction à créer
    }

    public void creer_medecin() {
        //fonction a creer
    }

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
    public ID getIdentifiant() {
        return identifiant;
    }

    /**
     * @param identifiant the identifiant to set
     */
    public void setIdentifiant(ID identifiant) {
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
