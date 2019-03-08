package NF;

/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral Olivia
 */
public class Modification {
private java.sql.Date date;
private int auteur;

    /**
     * constructeur qui demande la date de modification et l'auteur de la modification
     */
    public Modification(java.sql.Date date, int auteur) {
        this.date = date;
        this.auteur = auteur;
    }

    /**
     * @return the date
     */
    public java.sql.Date getDate() {
        return date;
    }

    /**
     * @return the auteur
     */
    public int getAuteur() {
        return auteur;
    }

    public String toString(){
        return "Dernière modification :" + date + "par le Dr " + auteur;
    }


}
