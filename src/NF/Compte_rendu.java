package NF;

/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral Olivia
 */
public class Compte_rendu {
private Medecin auteur;
private String texte_CR;

    public Compte_rendu(Medecin auteur, String texte_CR) {
        this.auteur = auteur;
        this.texte_CR = texte_CR;
    }

    /**
     * @return the auteur
     */
    public Medecin getAuteur() {
        return auteur;
    }

    /**
     * @param auteur the auteur to set
     */
    public void setAuteur(Medecin auteur) {
        this.auteur = auteur;
    }

    /**
     * @return the texte_CR
     */
    public String getTexte_CR() {
        return texte_CR;
    }

    /**
     * @param texte_CR the texte_CR to set
     */
    public void setTexte_CR(String texte_CR) {
        this.texte_CR = texte_CR;
    }

    public String toString(){
        return (texte_CR + "\n" + "Ecrit par : " + this.auteur);
    }


}
