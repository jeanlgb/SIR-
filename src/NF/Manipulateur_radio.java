package NF;

import java.util.Objects;

/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral Olivia
 */
public class Manipulateur_radio {
private ID identifiant;
private String nom;
private String prenom;

    public Manipulateur_radio(ID identifiant, String nom, String prenom) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
    }

    public void creer_DMR(){
        //fonction a creer
    }
    
    public void consulter_DMR(ID id_patient){
        //fonction à créer
    }
    
    public void creer_examen(){
        //fonction a creer
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

    @Override
    public String toString() {
        return "Manipulateur_radio{" + "identifiant=" + identifiant + ", nom=" + nom + ", prenom=" + prenom + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Manipulateur_radio other = (Manipulateur_radio) obj;
        if (!Objects.equals(this.identifiant, other.identifiant)) {
            return false;
        }
        return true;
    }


}
