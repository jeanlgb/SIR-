package NF;

import java.util.Date;

/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral
 * Olivia
 */
public class Examen {

    private int id_examen;
    private DMR dmr;
    private java.sql.Date date;
    private Medecin medecin_en_charge;
    private Type_examen type_examen;
    private double duree_prevue;
    private Salle salle;
    private Compte_rendu compte_rendu;
    private PACS lien_pacs;
    private boolean dossier_papier;
    private boolean examen_termine;
    private Historique_modifications historique_modifications;
    private double cout_examen;
    private String medecin;
    private String CR;
    private String type;
    private int idSalle;

    /**
     * Constructeur qui demande la date de l'examen, le médecin en charge de
     * l'examen et le type de l'examen
     */
    public Examen(int id_examen,java.sql.Date date, Medecin medecin_en_charge, Type_examen type_examen, int idSalle, double duree_prevue, Compte_rendu compte_rendu, int papier, int termine, double cout_examen) {
        this.id_examen = id_examen;
        this.date = date;
        this.medecin_en_charge = medecin_en_charge;
        this.type_examen = type_examen;
        this.duree_prevue = duree_prevue;
        this.compte_rendu = compte_rendu;
        this.cout_examen = cout_examen;
        this.idSalle = idSalle;
        if(papier == 1){
            this.dossier_papier = true;
        }else{
            this.dossier_papier = false;
        }
        if(termine == 1){this.examen_termine = true;
    }else{
            this.examen_termine = false;
        }
    }

    public Examen(int id_examen, DMR dmr, java.sql.Date date, Medecin medecin_en_charge, Type_examen type_examen, double duree_prevue, Salle salle, Compte_rendu compte_rendu, PACS lien_pacs, boolean dossier_papier, boolean examen_termine, Historique_modifications historique_modifications, double cout_examen) {
        this.id_examen = id_examen;
        this.dmr = dmr;
        this.date = date;
        this.medecin_en_charge = medecin_en_charge;
        this.type_examen = type_examen;
        this.duree_prevue = duree_prevue;
        this.salle = salle;
        this.compte_rendu = compte_rendu;
        this.lien_pacs = lien_pacs;
        this.dossier_papier = dossier_papier;
        this.examen_termine = examen_termine;
        this.historique_modifications = historique_modifications;
        this.cout_examen = cout_examen;
    }

    
    
    /**
     * @return the date
     */
    public java.sql.Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(java.sql.Date date) {
        this.date = date;
    }

    /**
     * @return the medecin_en_charge
     */
    public Medecin getMedecin_en_charge() {
        return medecin_en_charge;
    }

    /**
     * @param medecin_en_charge the medecin_en_charge to set
     */
    public void setMedecin_en_charge(Medecin medecin_en_charge) {
        this.medecin_en_charge = medecin_en_charge;
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
     * @return the duree_prevue
     */
    public double getDuree_prevue() {
        return duree_prevue;
    }

    /**
     * @param duree_prevue the duree_prevue to set
     */
    public void setDuree_prevue(double duree_prevue) {
        this.duree_prevue = duree_prevue;
    }

    /**
     * @return the salle
     */
    public Salle getSalle() {
        return salle;
    }

    /**
     * @param salle the salle to set
     */
    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    /**
     * @return the compte_rendu
     */
    public Compte_rendu getCompte_rendu() {
        return compte_rendu;
    }

    /**
     * @param compte_rendu the compte_rendu to set
     */
    public void setCompte_rendu(Compte_rendu compte_rendu) {
        this.compte_rendu = compte_rendu;
    }

    /**
     * @return the lien_pacs
     */
    public PACS getLien_pacs() {
        return lien_pacs;
    }

    /**
     * @param lien_pacs the lien_pacs to set
     */
    public void setLien_pacs(PACS lien_pacs) {
        this.lien_pacs = lien_pacs;
    }

    /**
     * @return the dossier_papier
     */
    public boolean isDossier_papier() {
        return dossier_papier;
    }

    /**
     * @param dossier_papier the dossier_papier to set
     */
    public void setDossier_papier(boolean dossier_papier) {
        this.dossier_papier = dossier_papier;
    }

    /**
     * @return the examen_termine
     */
    public boolean isExamen_termine() {
        return examen_termine;
    }
    
    public String Examen_termine() {
        if(examen_termine == false){
            return "L'examen n'est pas terminé.";
        }else{
            return "L'examen est terminé";
        }
        
    }

    /**
     * @param examen_termine the examen_termine to set
     */
    public void setExamen_termine(boolean examen_termine) {
        this.examen_termine = examen_termine;
    }

    /**
     * @return the historique_modifications
     */
    public Historique_modifications getHistorique_modifications() {
        return historique_modifications;
    }

    /**
     * @return the cout_examen
     */
    public double getCout_examen() {
        return cout_examen;
    }

    public String toString() {
        return "L'examen de type " + type_examen + " d'une durée de " + duree_prevue + " effectué le " + date + " par le " + medecin_en_charge + "."
                + " en salle " + idSalle + "." + "\n" + Examen_termine() + "\n" + "Compte rendu : " + "\n" + compte_rendu + "\n";
    }

    /**
     * @return the id_examen
     */
    public int getId_examen() {
        return id_examen;
    }

    /**
     * @param id_examen the id_examen to set
     */
    public void setId_examen(int id_examen) {
        this.id_examen = id_examen;
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

    /**
     * @return the idSalle
     */
    public int getIdSalle() {
        return idSalle;
    }

    /**
     * @param idSalle the idSalle to set
     */
    public void setIdSalle(int idSalle) {
        this.idSalle = idSalle;
    }
}
