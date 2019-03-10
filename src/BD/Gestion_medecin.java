/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import NF.Acces_BD;
import NF.Medecin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author maudl
 */
public class Gestion_medecin {

    /**
     * recherche et renvoie le médecin correspondant à l'identifiant passé en paramètres
     */
    public static Medecin rechercher_medecin(String id_recherche) {
        Acces_BD acces_BD = new Acces_BD();
        Connection connexion = acces_BD.connexion;
        PreparedStatement statement = null;

        try {
            statement = connexion.prepareStatement("SELECT id_medecin, nom, prenom FROM medecin WHERE id_medecin = ?");
            statement.setInt(1, Integer.parseInt(id_recherche));
            ResultSet resultset = statement.executeQuery();
            while (resultset.next()) {
                String nom = resultset.getString("nom");
                String prenom = resultset.getString("prenom");

                Medecin medecin = new Medecin(Integer.parseInt(id_recherche), nom, prenom);
                return medecin;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * met à jour dans la bd les infos du médecin passé en paramètres
     */
    public static boolean mettreAJour(Medecin medecin) {
        Acces_BD acces_BD = new Acces_BD();
        Connection connexion = acces_BD.connexion;
        PreparedStatement statement;
        try {
            statement = connexion.prepareStatement("UPDATE medecin SET nom = ?, prenom = ?;");
            statement.setString(1, medecin.getNom());
            statement.setString(2, medecin.getPrenom());

            int resultat = statement.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("pb dans la connexion à la bd");
        return false;
    }

    /**
     * A partir d'un patient passé en paramètres, crée un patient dans la base
     * de données.
     */
    public static boolean creerMedecin(Medecin medecin) {
        Acces_BD acces_BD = new Acces_BD();
        Connection connexion = acces_BD.connexion;
        PreparedStatement statement;
        try {
            statement = connexion.prepareStatement("INSERT INTO medecin (id_medecin, nom, prenom) VALUES (?,?,?);");
            statement.setInt(1, medecin.getIdentifiant());
            statement.setString(2, medecin.getNom());
            statement.setString(3, medecin.getPrenom());
            
            int resultat = statement.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("pb dans la connexion à la bd");
        return false;
    }
}
