package NF;

import java.util.Objects;

/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral Olivia
 */
public class Patient {
private ID identifiant;
private String nom_d_usage;
private String nom_de_naissance;
private String prenom;
private Date date_de_naissance;
private Genre genre;
private Adresse adresse;
private DMR dmr;

/**Constructeur qui demande le nom d'usage et le nom de naissance*/
    public Patient(String nom_d_usage, String nom_de_naissance, String prenom, Date date_de_naissance, Genre genre, Adresse adresse) {
        this.nom_d_usage = nom_d_usage;
        this.nom_de_naissance = nom_de_naissance;
        this.prenom = prenom;
        this.date_de_naissance = date_de_naissance;
        this.genre = genre;
        this.adresse = adresse;
    }

    /**Constructeur qui demande seulement le nom d'usage*/
    public Patient(String nom_d_usage, String prenom, Date date_de_naissance, Genre genre, Adresse adresse) {
        this.nom_d_usage = nom_d_usage;
        this.prenom = prenom;
        this.date_de_naissance = date_de_naissance;
        this.genre = genre;
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Patient{" + "identifiant=" + identifiant + ", nom_d_usage=" + nom_d_usage + ", nom_de_naissance=" + nom_de_naissance + ", prenom=" + prenom + ", date_de_naissance=" + date_de_naissance + ", genre=" + genre + ", adresse=" + adresse + '}';
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
        final Patient other = (Patient) obj;
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
     * @return the nom_d_usage
     */
    public String getNom_d_usage() {
        return nom_d_usage;
    }

    /**
     * @param nom_d_usage the nom_d_usage to set
     */
    public void setNom_d_usage(String nom_d_usage) {
        this.nom_d_usage = nom_d_usage;
    }

    /**
     * @return the nom_de_naissance
     */
    public String getNom_de_naissance() {
        return nom_de_naissance;
    }

    /**
     * @param nom_de_naissance the nom_de_naissance to set
     */
    public void setNom_de_naissance(String nom_de_naissance) {
        this.nom_de_naissance = nom_de_naissance;
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

    /**
     * @return the date_de_naissance
     */
    public Date getDate_de_naissance() {
        return date_de_naissance;
    }

    /**
     * @param date_de_naissance the date_de_naissance to set
     */
    public void setDate_de_naissance(Date date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    /**
     * @return the genre
     */
    public Genre getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    /**
     * @return the adresse
     */
    public Adresse getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the dmr
     */
    public DMR getDmr() {
        return dmr;
    }

    /**
     * @param dmr the dmr to set
     */
    public void setDmr(DMR dmr) {
        this.dmr = dmr;
    }




}
