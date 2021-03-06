package NF;

import java.util.Objects;

/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral Olivia
 */
public class Manipulateur_radio {
private int identifiant;
private String nom;
private String prenom;

    /**
     * Constructeur qui demande l'identifiant du Manipulateur radio, le nom et le prénom
     */
    public Manipulateur_radio(int identifiant, String nom, String prenom) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
    }

    /**
     * fonction qui permet la création du DMR
     */
    public void creer_DMR(){
        //fonction a creer
    }

    /**
     * fonction qui permet la consultation du DMR
     */
    public void consulter_DMR(int id_patient){
        //fonction à créer
    }

    /**
     * fonction qui crée un examen
     */
    public void creer_examen(){
        //fonction a creer
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
