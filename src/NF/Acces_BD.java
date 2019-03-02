package NF;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral Olivia
 */
public class Acces_BD {
        public String s ; // "com.mysql.cj.jdbc.Driver" dans tous les cas
        public String url ; //"jdbc:mysql://localhost:3306/test?serverTimezone=UTC" si en local, "jdbc:mysql://www.db4free.net:3306/medtechsdb?serverTimezone=UTC" en ligne
        public String utilisateur ; //identifiant de celui qui a l'accès à la base de données
        public String motDePasse ; //mot de passe
        public Connection connexion;

    /**
     * Constructeur qui demande un URL, un Driver, un utilisateur, un mot de passe
     */
    public Acces_BD() {
        s = "com.mysql.cj.jdbc.Driver"; 
        url = "jdbc:mysql://www.db4free.net:3306/medtechsdb?serverTimezone=UTC";
        utilisateur = "medtechsdb";
        motDePasse = "medtechsdb";
        try {
            Class.forName(s);
            connexion = DriverManager.getConnection(url, utilisateur, motDePasse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        

}
