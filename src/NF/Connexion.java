package NF;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.Class;

/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral
 * Olivia
 */
public class Connexion {

    private int identifiant;
    private String mot_de_passe;
    private boolean id_ok;

    public Connexion(int identifiant, String mot_de_passe) {
        this.identifiant = identifiant;
        this.mot_de_passe = mot_de_passe;
    }

    public boolean autorisation_de_connexion() {
        String s = "com.mysql.cj.jdbc.Driver"; // "com.mysql.cj.jdbc.Driver"
        String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
        String utilisateur = "MedTechS";
        String motDePasse = "MedTechS";
        Connection connexion = null;
        int id=0;
        try {
            Class.forName(s);
            connexion = DriverManager.getConnection(url, utilisateur, motDePasse);
            /* Ici, mettre les requêtes vers la BDD */
            Statement statement = connexion.createStatement();
            //a améliorer avec un prepared statement??
            ResultSet resultat = statement.executeQuery("SELECT id, mdp FROM connexion WHERE id=" + this.identifiant + ";");
            if(resultat.next()){
            id = resultat.getInt("id");
            String mdp = resultat.getString("mdp");
            if (id!= 0) { //si on a trouvé un identifiant
                                    id_ok=true;
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

            /* ... */
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
