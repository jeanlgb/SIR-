/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import NF.Acces_BD;
import NF.Compte_rendu;
import NF.DMR;
import NF.Examen;
import NF.Historique_modifications;
import NF.Medecin;
import NF.Type_examen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author maudl
 */
public class Gestion_DMR {

    /**
     * Permet de récupérer la liste des examens d'un DMR, en indiquant l'id du
     * dmr
     */
    public static ArrayList<Examen> recuperer_Examens(String id_recherche) {
        Acces_BD acces_BD = new Acces_BD();
        Connection connexion = acces_BD.connexion;
        PreparedStatement statement = null;
        ArrayList<Examen> liste_examens = new ArrayList<>();

        try {
            statement = connexion.prepareStatement("SELECT id_examen, date_examen, id_medecin, type_examen, duree_prevue, salle, compte_rendu, pacs, dossier_papier, examen_termine, historique_modifications, cout_examen FROM examen WHERE examen.id_dmr = ?");
            statement.setInt(1, Integer.parseInt(id_recherche));

            ResultSet resultset = statement.executeQuery();

            while (resultset.next()) {
                int id_examen = resultset.getInt("id_examen");
                java.sql.Date date = resultset.getDate("date_examen");
                //creation medecin
                int id_medecin = resultset.getInt("id_medecin");
                Medecin medecin = Gestion_medecin.rechercher_medecin(String.valueOf(id_medecin));
                //fin creation medecin
                String type_examen_string = resultset.getString("type_examen");
                Type_examen type_examen = Type_examen.valueOf(type_examen_string);
                double duree_prevue = resultset.getDouble("duree_prevue");
                int salle = resultset.getInt("salle");
                //creation compte rendu
                String cr = resultset.getString("compte_rendu");
                Compte_rendu compte_rendu = new Compte_rendu(medecin, cr);
                //fin creation compte rendu
                int pacs = resultset.getInt("pacs");
                int dossier_papier = resultset.getInt("dossier_papier");
                int examen_termine = resultset.getInt("examen_termine");
                double cout_examen = resultset.getDouble("cout_examen");

                liste_examens.add(new Examen(date, medecin, type_examen, compte_rendu));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return liste_examens;
    }

    /**
     * Permet de récupérer un DMR à partir de son identifiant
     */
    public static DMR rechercher_DMR(String id_recherche) {
        Acces_BD acces_BD = new Acces_BD();
        Connection connexion = acces_BD.connexion;
        PreparedStatement statement = null;

        try {
            statement = connexion.prepareStatement("SELECT id_patient, historique_modifications FROM dmr WHERE id_dmr = ?");
            statement.setInt(1, Integer.parseInt(id_recherche));

            ResultSet resultset = statement.executeQuery();

            while (resultset.next()) {
                int id_patient = resultset.getInt("id_patient");
                int id_historique = resultset.getInt("historique_modifications");
                Historique_modifications historique_modifications = Gestion_historique_modifications.rechercher_historique(String.valueOf(id_historique));
                ArrayList<Examen> examens = recuperer_Examens(id_recherche);

                DMR dmr = new DMR(Integer.parseInt(id_recherche), id_patient, examens, historique_modifications);
                return dmr;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * A partir d'un dmr passé en paramètre, crée ce dmr dans la BD
     */
    public static boolean creerDMR(DMR dmr) {
        Acces_BD acces_BD = new Acces_BD();
        Connection connexion = acces_BD.connexion;
        PreparedStatement statement;
        try {
            statement = connexion.prepareStatement("INSERT INTO dmr (id_dmr, id_patient, historique_modifications) VALUES (?,?,?);");
            statement.setInt(1, dmr.getId_dmr());
            statement.setInt(2, dmr.getId_patient());
            statement.setInt(3, dmr.getHistorique_modifications().getId_historique());
            int resultat = statement.executeUpdate();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("pb dans la connexion à la bd");
        return false;
    }

    /**
     * met à jour les infos du dmr passé en paramètres
     */
    public static boolean mettreAJour(DMR dmr) {
        Acces_BD acces_BD = new Acces_BD();
        Connection connexion = acces_BD.connexion;
        PreparedStatement statement;
        try {
            statement = connexion.prepareStatement("UPDATE dmr SET id_patient = ?, historique_modifications = ? WHERE id_dmr = ? ;");
            statement.setInt(1, dmr.getId_patient());
            statement.setInt(2, dmr.getHistorique_modifications().getId_historique());
            statement.setInt(3, dmr.getId_dmr());
            int resultat = statement.executeUpdate();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("pb dans la connexion à la bd");
        return false;
    }

}