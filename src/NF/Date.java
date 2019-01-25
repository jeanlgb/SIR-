package NF;

/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral
 * Olivia
 */
public class Date implements Comparable {

    private int annee;
    private int mois;
    private int jour;
    private int heure;
    private int minute;

    public Date(int annee, int mois, int jour, int heure, int minute) {
        this.annee = annee;
        this.mois = mois;
        this.jour = jour;
        this.heure = heure;
        this.minute = minute;
    }


    public String toString() {
        return annee+ "/" + mois + "/" + jour + "/" + heure + "/" + minute;
    }

    public boolean equals(Object o) {
        if (o instanceof Date) {
            Date d = (Date) o;
            return (annee == d.annee) && (mois == d.mois) && (jour == d.jour) && (heure==d.heure) && (minute==d.minute);
        } else {
            return false;
        }
    }

    // precondition : 'o' est une instance de 'Date' :
    public int compareTo(Object o) {
        Date d = (Date) o;
        if (annee != d.annee) {
            return annee - d.annee;
        }
        // ici on a forcement annee == d.annee :
        if (mois != d.mois) {
            return mois - d.mois;
        }
        // ici on a forcement annee == d.annee et mois == d.mois :
        if(jour != jour){
            return jour - d.jour;
        }
        //annee == d.annee   mois == d.mois   jour==d.jour
        if(heure != heure){
            return heure - d.heure;
        }
        //annee == d.annee   mois == d.mois   jour==d.jour   heure==d.heure
        return minute - d.minute;
    }
}
