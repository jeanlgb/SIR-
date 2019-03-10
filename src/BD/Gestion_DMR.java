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
     * Permet de récupérer la liste des examens d'un DMR, en indiquant le
     */
    public static ArrayList<Examen> recuperer_Examens(String id_recherche) {
        Acces_BD acces_BD = new Acces_BD();
        Connection connexion = acces_BD.connexion;
        PreparedStatement statement = null;
        ArrayList<Examen> liste_examens = new ArrayList<>();

        try {
            statement = connexion.prepareStatement("SELECT id_examen, date_examen, medecin.id_medecin, medecin.nom, medecin.prenom, type_examen, duree_prevue, salle, compte_rendu, pacs, dossier_papier, examen_termine, historique_modifications, cout_examen, examen.id_dmr FROM examen JOIN dmr ON (examen.id_dmr=dmr.id_dmr) JOIN medecin ON (examen.id_medecin = medecin.id_medecin) WHERE examen.id_dmr = ?");
            statement.setInt(1, Integer.parseInt(id_recherche));

            ResultSet resultset = statement.executeQuery();

            while (resultset.next()) {
                int id_examen = resultset.getInt("id_examen");
                java.sql.Date date = resultset.getDate("date_examen");
                //creation medecin
                int id_medecin = resultset.getInt("medecin.id_medecin");
                String nom_medecin = resultset.getString("medecin.nom");
                String prenom_medecin = resultset.getString("medecin.prenom");
                Medecin medecin_en_charge = new Medecin(id_medecin, nom_medecin, prenom_medecin);
                //fin creation medecin
                String type_examen_string = resultset.getString("type_examen");
                Type_examen type_examen = Type_examen.valueOf(type_examen_string);
                double duree_prevue = resultset.getDouble("duree_prevue");
                int salle = resultset.getInt("salle");
                //creation compte rendu
                String cr = resultset.getString("compte_rendu");
                Compte_rendu compte_rendu = new Compte_rendu(medecin_en_charge, cr);
                //fin creation compte rendu
                int pacs = resultset.getInt("pacs");
                int dossier_papier = resultset.getInt("dossier_papier");
                int examen_termine = resultset.getInt("examen_termine");
                double cout_examen = resultset.getDouble("cout_examen");

                liste_examens.add(new Examen(date, medecin_en_charge, type_examen, compte_rendu));

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
                Historique_modifications historique_modifications = Gestion_Historique_modifications.rechercher_historique(String.valueOf(id_historique));
                ArrayList<Examen> examens = recuperer_Examens(id_recherche);

                DMR dmr = new DMR(Integer.parseInt(id_recherche), id_patient, examens, historique_modifications);
                return dmr;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
