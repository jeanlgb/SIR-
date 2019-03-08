package NF;

/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral Olivia
 */
public class Adresse {

    private int id_adresse;
    private String numéro;
    private String rue;
    private String lieu_dit;
    private String code_postal;
    private String commune;
    private String pays;

    /**
     * Constructeur de la classe Adresse
     */
    public Adresse(String numéro, String rue, String lieu_dit, String code_postal, String commune, String pays) {
        this.numéro = numéro;
        this.rue = rue;
        this.lieu_dit = lieu_dit;
        this.code_postal = code_postal;
        this.commune = commune;
        this.pays = pays;
    }

    @Override
    public String toString() {
        return (this.getNuméro() + " " + this.getRue() + " " + this.getCode_postal() + " " + this.getLieu_dit() + " " + this.getCommune() + " "
                + this.getDepartement() + " " + this.getPays());
    }

    public String getDepartement() {
        return ("" + this.code_postal.charAt(0) + this.code_postal.charAt(1));
    }

    public String getRue() {
        return rue;
    }

    public String getCode_postal() {
        return code_postal;
    }

    public String getLieu_dit() {
        return lieu_dit;
    }

    public String getCommune() {
        return commune;
    }

    public String getPays() {
        return pays;
    }

    public String getNuméro() {
        return numéro;
    }

    public int getId_adresse() { return id_adresse; }

}
