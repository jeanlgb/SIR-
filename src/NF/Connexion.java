package NF;

/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral Olivia
 */
public class Connexion {
private ID identifiant;
private String mot_de_passe;

    public Connexion(ID identifiant, String mot_de_passe) {
        this.identifiant = identifiant;
        this.mot_de_passe = mot_de_passe;
    }
    
    public void autorisation_de_connexion(){
        //code à ajouter
        
        /*
         Requete BD pour test si l'ID utilisé existe (récup dans le champ d'interface dans lequel il est rentré)
         dans la base et second temps 
         récupération du mdp associé et comparaison + récup du 'type' de page à charger en fonction du login
         Manip radio, Phy, etc.
        */
        
    }

}
