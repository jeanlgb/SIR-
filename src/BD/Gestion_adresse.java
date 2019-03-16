/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import NF.Acces_BD;
import NF.Adresse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author maudl
 */
public class Gestion_adresse {

    /**
    *crée dans la base de données l'adresse passée en paramètres
    */
    public static boolean creerAdresse(Adresse adresse,Connection connexion) {
        PreparedStatement statement;
        try {
            statement = connexion.prepareStatement("INSERT INTO adresse (id_adresse, numero, rue, lieu_dit, code_postal, commune, pays) VALUES (?,?,?,?,?,?,?);");
            statement.setInt(1, adresse.getId_adresse());
            statement.setString(2, adresse.getNuméro());
            statement.setString(3, adresse.getRue());
            statement.setString(4, adresse.getLieu_dit());
            statement.setString(5, adresse.getCode_postal());
            statement.setString(6, adresse.getCommune());
            statement.setString(7, adresse.getPays());

            int resultat = statement.executeUpdate();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("pb dans la connexion à la bd");
        return false;
    }
    
    
/***
 * recherche et renvoie une adresse à partir de l'identifiant d'adresse passé en paramètres
 */
    public static Adresse rechercher_adresse(String id_recherche, Connection connexion) {
        PreparedStatement statement = null;

        try {
            statement = connexion.prepareStatement("SELECT numero, rue, lieu_dit, code_postal, commune, pays FROM adresse WHERE id_adresse = ?");
            statement.setInt(1, Integer.parseInt(id_recherche));

            ResultSet resultset = statement.executeQuery();

            while (resultset.next()) {
                String numero = resultset.getString("numero");
                String rue = resultset.getString("rue");
                String lieu_dit = resultset.getString("lieu_dit");
                String code_postal = resultset.getString("code_postal");
                String commune = resultset.getString("commune");
                String pays = resultset.getString("pays");

                Adresse adresse = new Adresse(Integer.parseInt(id_recherche), numero, rue, lieu_dit, code_postal, commune, pays);
                return adresse;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
