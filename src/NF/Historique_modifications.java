package NF;

import java.util.ArrayList;

/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral
 * Olivia
 */
public class Historique_modifications {

    private int id_historique;
    private ArrayList<Modification> liste_modifications;

    /**
     * Constructeur qui demande un ArrayList des modification
     */
    public Historique_modifications(int id_historique, ArrayList<Modification> liste_modifications) {
        this.id_historique = id_historique;
        this.liste_modifications = liste_modifications;
    }

    /**
     * fonction qui ajoute une modification àà l'ArrayList
     */
    public void ajouter_modification(Modification modification) {
        this.liste_modifications.add(modification);
    }

    public Modification getModification(int index) {
        return this.liste_modifications.get(index);
    }

    /**
     * @return the liste_modifications
     */
    public ArrayList<Modification> getListe_modifications() {
        return liste_modifications;
    }

    /**
     * @return the id_historique
     */
    public int getId_historique() {
        return id_historique;
    }

}
