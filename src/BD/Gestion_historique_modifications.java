/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import NF.Acces_BD;
import NF.Historique_modifications;
import NF.Modification;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author maudl
 */
public class Gestion_historique_modifications {

    /**
     * renvoie en arraylist les modifications associées à un même historique de
     * modifications, selon l'id de l'historique passé en paramètres.
     */
    public static ArrayList<Modification> recuperer_modifications(String id_recherche, Connection connexion) {
        PreparedStatement statement = null;
        ArrayList<Modification> modifications = new ArrayList<>();

        try {
            statement = connexion.prepareStatement("SELECT id_modification, date, auteur FROM modification WHERE id_historique = ?");
            statement.setInt(1, Integer.parseInt(id_recherche));

            ResultSet resultset = statement.executeQuery();
            while (resultset.next()) {
                java.sql.Date date = resultset.getDate("date");
                int auteur = resultset.getInt("auteur");
                modifications.add(new Modification(date, auteur));

            }
            return modifications;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    /**
     * Renvoie l'historique de modifications associé à l'identifiant
     * d'historique passé en paramètre
     */
    public static Historique_modifications rechercher_historique(String id_recherche, Connection connexion) {
        ArrayList<Modification> liste_modifications = recuperer_modifications(id_recherche, connexion);
        Historique_modifications historique_modifications = new Historique_modifications(Integer.parseInt(id_recherche), liste_modifications);
        return historique_modifications;
    }
}
