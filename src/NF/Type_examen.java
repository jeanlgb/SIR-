package NF;

/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral Olivia
 */

/**
 * Enumération des types d'examen
 */
public enum Type_examen {
    scanner("Scanner",1,1),
    angiographie("Angiographie",1,1),
    irm("IRM",1,30),
    radiologie_argentique("Radiologie argentique",1,1),
    radiotherapie("Radiotherapie",1,1),
    echoendoscopie("Echoendoscopie",1,1),
    mammographie("Mammographie",1,1),
    echographie("Echographie",1,1);
    
    private String libelle_examen;
    private double cout;
    private double duree;

    public String getLibelle_examen() {
        return libelle_examen;
    }



    private Type_examen(String libelle_examen, double cout, double duree) {
        this.libelle_examen = libelle_examen;
        this.cout = cout;
        this.duree = duree;
    }

    @Override
    public String toString() {
        return libelle_examen;
    }
    
    
}
