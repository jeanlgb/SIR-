package NF;

import java.util.Date;

/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral Olivia
 */
public class Demande_examen {
private Type_examen type_examen;
private Date date_demande;
private Service service_demandeur;
private boolean demande_traitee;
private Date planification_edt;
private Salle planification_salle;

    /**
     * Constructeur qui demande le type d'examen, la date de l'examen et le service demandé
     */
    public Demande_examen(Type_examen type_examen, Date date_demande, Service service_demandeur) {
        this.type_examen = type_examen;
        this.date_demande = date_demande;
        this.service_demandeur = service_demandeur;
        demande_traitee=false;
        planification_edt=null;
        planification_salle=null;
    }

    public Type_examen getType_examen() {
        return type_examen;
    }

    public Date getDate_demande() {
        return date_demande;
    }

    public Service getService_demandeur() {
        return service_demandeur;
    }

    public Boolean getDemande_traitee() {
        return demande_traitee;
    }

    public Date getPlanification_edt() {
        return planification_edt;
    }

    public Salle getPlanification_salle() {
        return planification_salle;
    }

    public void setDemande_traitee(Boolean demande_traitee) {
        this.demande_traitee = demande_traitee;
    }

    public void setPlanification_edt(Date planification_edt) {
        this.planification_edt = planification_edt;
    }
               public void setPlanification_salle(Salle planification_salle) {
        this.planification_salle = planification_salle;
    }     
        
}
