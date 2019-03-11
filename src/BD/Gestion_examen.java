/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import NF.Acces_BD;
import NF.Compte_rendu;
import NF.Examen;
import NF.Medecin;
import NF.Type_examen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author leclemau
 */
public class Gestion_examen {

    /**
     * permet de rechercher un examen (renvoie un type Examen) à partir de l'identifiant de l'examen
     */
    public static Examen rechercher_Examen(String id_recherche) {
        Acces_BD acces_BD = new Acces_BD();
        Connection connexion = acces_BD.connexion;
        PreparedStatement statement = null;
        Examen examen_trouve = null;

        try {
            statement = connexion.prepareStatement("SELECT id_examen, date_examen, id_medecin, type_examen, duree_prevue, salle, compte_rendu, pacs, dossier_papier, examen_termine, dmr.historique_modifications, cout_examen, examen.id_dmr FROM examen JOIN dmr ON (examen.id_dmr=dmr.id_dmr) WHERE examen.id_examen = ?");
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

                examen_trouve = new Examen(id_examen, date, medecin, type_examen, duree_prevue, compte_rendu, dossier_papier,examen_termine,cout_examen);


            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return examen_trouve;
    }

    /**
     * crée l'examen passé en paramètres dans la base de données
     */
    public static boolean creerExamen(Examen examen) {
        Acces_BD acces_BD = new Acces_BD();
        Connection connexion = acces_BD.connexion;
        PreparedStatement statement;
        try {
            statement = connexion.prepareStatement("INSERT INTO examen (id_examen, date_examen, id_medecin, type_examen, duree_prevue, salle, compte_rendu, pacs, dossier_papier, examen_termine, historique_modifications, cout_examen, id_dmr) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);");
            statement.setInt(1, examen.getId_examen());
            statement.setDate(2, examen.getDate());
            statement.setInt(3, examen.getMedecin_en_charge().getIdentifiant());
            statement.setString(4, examen.getType_examen().name());
            statement.setDouble(5, examen.getDuree_prevue());
            statement.setInt(6, examen.getSalle().getNumero_salle());
            statement.setString(7, examen.getCompte_rendu().getTexte_CR());
            statement.setInt(8, examen.getLien_pacs().getNumero_archive());
            statement.setBoolean(9, examen.isDossier_papier());
            statement.setBoolean(10, examen.isExamen_termine());
            statement.setInt(11, examen.getHistorique_modifications().getId_historique());
            statement.setDouble(12, examen.getCout_examen());
            statement.setInt(13, examen.getDmr().getId_dmr());

            int resultat = statement.executeUpdate();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("pb dans la connexion à la bd");
        return false;
    }
}
