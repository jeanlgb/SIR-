package NF;

/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral Olivia
 */
public class Modification {
private Date date;
private ID auteur;

    public Modification(Date date, ID auteur) {
        this.date = date;
        this.auteur = auteur;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @return the auteur
     */
    public ID getAuteur() {
        return auteur;
    }

    public String toString(){
        return "Dernière modification :" + date + "par le Dr " + auteur;
    }


}
