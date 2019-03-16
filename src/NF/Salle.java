package NF;

import java.util.ArrayList;

/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral Olivia
 */
public class Salle {
private int numero_salle;
private Type_examen type_examen;
private boolean examen_numerique;
private EDT edt_salle;

    /**
     * constructeur qui demande un numéro de salle, un ArrayList des type d'examen, un boolean d'examen numérique et l'emploi du temps d'un salle d'examen
     */


    public Salle(int numero_salle, Type_examen type_examen, boolean examen_numerique, EDT edt_salle) {
        this.numero_salle = numero_salle;
        this.type_examen = type_examen;
        this.examen_numerique = examen_numerique;
        this.edt_salle = edt_salle;
    }

    @Override
    public String toString() {
        return "Salle{" + "numero_salle=" + getNumero_salle() + ", type_examen=" + getType_examen() + ", examen_numerique=" + isExamen_numerique() + '}';
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
     * @return the type_examen
     */
    public Type_examen getType_examen() {
        return type_examen;
    }

    /**
     * @param type_examen the type_examen to set
     */
    public void setType_examen(Type_examen type_examen) {
        this.type_examen = type_examen;
    }

    /**
     * @return the examen_numerique
     */
    public boolean isExamen_numerique() {
        return examen_numerique;
    }
    
    public String isExamn_num(){
        if (examen_numerique) return "Examen numerique";
        else return "Examen papier";
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
