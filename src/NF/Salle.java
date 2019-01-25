package NF;

import java.util.ArrayList;

/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral Olivia
 */
public class Salle {
private int numero_salle;
private ArrayList<Type_examen> type_examens;
private boolean examen_numerique;
private EDT edt_salle;

    public Salle(int numero_salle, ArrayList<Type_examen> type_examens, boolean examen_numerique, EDT edt_salle) {
        this.numero_salle = numero_salle;
        this.type_examens = type_examens;
        this.examen_numerique = examen_numerique;
        this.edt_salle = edt_salle;
    }

    @Override
    public String toString() {
        return "Salle{" + "numero_salle=" + getNumero_salle() + ", type_examens=" + getType_examens() + ", examen_numerique=" + isExamen_numerique() + '}';
    }

    /**
     * @return the numero_salle
     */
    public int getNumero_salle() {
        return numero_salle;
    }

    /**
     * @param numero_salle the numero_salle to set
     */
    public void setNumero_salle(int numero_salle) {
        this.numero_salle = numero_salle;
    }

    /**
     * @return the type_examens
     */
    public ArrayList<Type_examen> getType_examens() {
        return type_examens;
    }

    /**
     * @param type_examens the type_examens to set
     */
    public void setType_examens(ArrayList<Type_examen> type_examens) {
        this.type_examens = type_examens;
    }

    /**
     * @return the examen_numerique
     */
    public boolean isExamen_numerique() {
        return examen_numerique;
    }

    /**
     * @param examen_numerique the examen_numerique to set
     */
    public void setExamen_numerique(boolean examen_numerique) {
        this.examen_numerique = examen_numerique;
    }

    /**
     * @return the edt_salle
     */
    public EDT getEdt_salle() {
        return edt_salle;
    }

    /**
     * @param edt_salle the edt_salle to set
     */
    public void setEdt_salle(EDT edt_salle) {
        this.edt_salle = edt_salle;
    }


}
