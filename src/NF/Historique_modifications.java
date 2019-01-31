package NF;

import java.util.ArrayList;

/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral Olivia
 */
public class Historique_modifications {
private ArrayList<Modification> liste_modifications;

    public Historique_modifications(ArrayList<Modification> liste_modifications) {
        this.liste_modifications = liste_modifications;
    }

    
    public void ajouter_modification(Modification modification){
        this.liste_modifications.add(modification);
    }
    
    public Modification getModification(int index){
        return this.liste_modifications.get(index);
    }
    
    /**
     * @return the liste_modifications
     */
    public ArrayList<Modification> getListe_modifications() {
        return liste_modifications;
    }


}
