package NF;

/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral Olivia
 */
public class PACS {
private int numero_archive;
private String mention;
private String description;
//private Historique_modifications historique_modifications;

    public PACS(int numero_archive, String mention, String desciprtion) {
        this.numero_archive = numero_archive;
        this.mention = mention;
        this.description = desciprtion;
    }

    /**
     * constructeur qui demande un numéro d'archive, une mention, un historique de modifications
     */
/*public PACS(int numero_archive, String mention, Historique_modifications historique_modifications) {
        this.numero_archive = numero_archive;
        this.mention = mention;
       // this.historique_modifications = historique_modifications;
    }
*/


    /**
     * @return the numero_archive
     */
    public int getNumero_archive() {
        return numero_archive;
    }

    /**
     * @param numero_archive the numero_archive to set
     */
    public void setNumero_archive(int numero_archive) {
        this.numero_archive = numero_archive;
    }

    /**
     * @return the mention
     */
    public String getMention() {
        return mention;
    }

    /**
     * @param mention the mention to set
     */
    public void setMention(String mention) {
        this.mention = mention;
    }

    /**
     * @return the historique_modifications
     */
   /* public Historique_modifications getHistorique_modifications() {
        return historique_modifications;
    }
    */

    /**
     * @return the desciprtion
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param desciprtion the desciprtion to set
     */
    public void setDescription(String desciprtion) {
        this.description = desciprtion;
    }


}
