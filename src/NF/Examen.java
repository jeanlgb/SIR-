package NF;

/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral Olivia
 */
public class Examen {
private Date date;
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

    /**
     * Constructeur qui demande la date de l'examen, le médecin en charge de l'examen et le type de l'examen
     */
    public Examen(Date date, Medecin medecin_en_charge, Type_examen type_examen) {
        this.date = date;
        this.medecin_en_charge = medecin_en_charge;
        this.type_examen = type_examen;
       // this.duree_prevue = type_examen.getDuree();
        // this.cout_examen= type_examen.getCout();
    }


    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
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

    public String toString(){
        return "L'examen de type " + type_examen + "d'une durée de "+ duree_prevue + "effectué le " + date + "par le Dr " + medecin_en_charge
        + "en salle " + salle +"." + "/n L'examen est terminé : " + examen_termine + "." + "/n Compte rendu : " + compte_rendu;
    }
}
