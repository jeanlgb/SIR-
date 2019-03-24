package NF;

import java.util.Objects;

/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral Olivia
 */
public class Medecin {
private int identifiant;
private String nom;
private String prenom;


    /**
     * constructeur qui demande l'identifiant du médecin, le nom et le prénom
     */
    public Medecin(int identifiant, String nom, String prenom) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
    }
    /**
     * @return identifiant
     */
    public int getIdentifiant() {
        return identifiant;
    }

    /**
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param identifiant to set
     */
    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }
    /**
     * @param nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @param prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Méthode renvoie les attributs sous forme de toString
     */
    @Override
    public String toString() {
        return "Docteur " + nom + " " + prenom;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Medecin other = (Medecin) obj;
        if (!Objects.equals(this.identifiant, other.identifiant)) {
            return false;
        }
        return true;
    }





}
