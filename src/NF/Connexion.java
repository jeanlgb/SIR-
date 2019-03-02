package NF;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;


/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral
 * Olivia
 */
public class Connexion {

    /**
     * Attributs concernant la liaison à la base de données
     */
    private int identifiant;
    private String mot_de_passe;
    private boolean id_ok;

    /**
     * Constructeur qui demande l'identifiant du personnel et le mot de passe
     */
    public Connexion(int identifiant, String mot_de_passe) {
        this.identifiant = identifiant;
        this.mot_de_passe = mot_de_passe;


    }

    /**
     * renvoi un boolean qui permet de savoir s'il y a connexion à la base de données
     */
    public boolean autorisation_de_connexion() {
        Acces_BD acces_BD = new Acces_BD();
        Connection connexion = acces_BD.connexion;
        int id = 0;
        try {
            /* Ici, mettre les requêtes vers la BDD */
            Statement statement = connexion.createStatement();
            ResultSet resultat = statement.executeQuery("SELECT id_user, mdp FROM connexion WHERE id_user=" + this.identifiant + ";");
            if (resultat.next()) {
                id = resultat.getInt("id_user");
                String mdp = resultat.getString("mdp");
                if (id != 0) { //si on a trouvé un identifiant
                    id_ok = true;
                    if (mdp.equals(this.mot_de_passe)) {
                        System.out.println("id ok, mdp, ok -> connexion autorisée");
                        return true; //si le mot de passe correspond, on renvoie true
                    } else {
                        System.out.println("id ok, mdp pas ok -> connexion refusée");
                        return false; //si le mot de passe est incorrect on renvoie false
                    }
                }
            } else { //si il n'y a plus d'éléments à parcourir, c'est que l'identifiant n'est pas dans la liste, donc on renvoie false
                System.out.println("id pas ok -> connexion refusée");
                return false;
            }

            /* fin de l'espace pour écrire les requêtes */
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("pb dans la connexion à la bd");
        return false;
    }

    public boolean isId_ok() {
        return id_ok;
    }

}
