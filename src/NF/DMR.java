package NF;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral Olivia
 */
public class DMR {
private ID id_patient;
private ArrayList<Examen> examens_patient;
private Historique_modifications historique_modifications;

    /**
     * Constructeur qui demande l'id patient, une arraylist des examens d'un patient, l'historique de modifications
     */
    public DMR(ID id_patient, ArrayList<Examen> examens_patient, Historique_modifications historique_modifications) {
        this.id_patient = id_patient;
        this.examens_patient = examens_patient;
        this.historique_modifications = historique_modifications;
    }

    /**
     * Fonction qui ajoute un examen à la liste d'examen d'un patient
     */
    public void ajouter_examen(Examen examen){

        getExamens_patient().add(examen);
        
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DMR other = (DMR) obj;
        if (!Objects.equals(this.id_patient, other.id_patient)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    public ID getId_patient() {
        return id_patient;
    }

    public ArrayList<Examen> getExamens_patient() {
        return examens_patient;
    }

    public Historique_modifications getHistorique_modifications() {
        return historique_modifications;
    }

}
