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

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author maudl
 */
public class Gestion_DMR {

    /**
     * Permet de récupérer la liste des examens d'un DMR, en indiquant le nom d'usage du
     * patient
     */
    public static ArrayList<Examen> recuperer_ExamensViaNom(String nom) {
    Acces_BD acces_BD = new Acces_BD();
    Connection connexion = acces_BD.connexion;
    PreparedStatement statement = null;
    ArrayList<Examen> liste_examens = new ArrayList<>();

        try

    {
        statement = connexion.prepareStatement("SELECT id_examen, date_examen, id_medecin, type_examen, duree_prevue, salle, compte_rendu, pacs, dossier_papier, examen_termine, historique_modifications, cout_examen FROM examen JOIN patient ON (patient.id_dmr = examen.id_dmr) WHERE patient.nom_d_usage = ?");
        statement.setString(1, nom);

        ResultSet resultset = statement.executeQuery();

        while (resultset.next()) {
            int id_examen = resultset.getInt("id_examen");
            System.out.println(id_examen);
            java.sql.Date date = resultset.getDate("date_examen");
            System.out.println(date);
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

            liste_examens.add(new Examen(id_examen, date, medecin, type_examen, salle, duree_prevue, compte_rendu, dossier_papier,examen_termine,cout_examen));
            ;

        }

    } catch(
    Exception e)

    {
        e.printStackTrace();
    }
    return liste_examens;
}

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

                liste_examens.add(new Examen(id_examen, date, medecin, type_examen, salle, duree_prevue, compte_rendu, dossier_papier,examen_termine,cout_examen));

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
            statement = connexion.prepareStatement("SELECT id_dmr, historique_modifications FROM dmr WHERE id_patient = ?");
            statement.setInt(1, Integer.parseInt(id_recherche));

            ResultSet resultset = statement.executeQuery();

            while (resultset.next()) {
                int id_dmr = resultset.getInt("id_dmr");
                int id_historique = resultset.getInt("historique_modifications");
                Historique_modifications historique_modifications = Gestion_historique_modifications.rechercher_historique(String.valueOf(id_historique));
                ArrayList<Examen> examens = recuperer_Examens(id_recherche);

                DMR dmr = new DMR(id_dmr, Integer.parseInt(id_recherche), examens, historique_modifications);
                return dmr;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    /**
     * Permet de récupérer un DMR à partir de son nom
     */
    public static DMR rechercher_Par_Nom_DMR(String nom) {
        Acces_BD acces_BD = new Acces_BD();
        Connection connexion = acces_BD.connexion;
        PreparedStatement statement = null;

        try {
            statement = connexion.prepareStatement("SELECT dmr.id_dmr, patient.id_patient, historique_modifications FROM dmr JOIN patient ON patient.id_dmr = dmr.id_dmr WHERE nom_d_usage = ?");
            statement.setString(1, nom);

            ResultSet resultset = statement.executeQuery();

            while (resultset.next()) {
                int id_dmr = resultset.getInt("id_dmr");
                int id_historique = resultset.getInt("historique_modifications");
                Historique_modifications historique_modifications = Gestion_historique_modifications.rechercher_historique(String.valueOf(id_historique));
                ArrayList<Examen> examens = recuperer_Examens(nom);

                DMR dmr = new DMR(id_dmr, Integer.parseInt(nom), examens, historique_modifications);
                return dmr;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * A partir d'un dmr passé en paramètre, crée ce dmr dans la BD
     * Dans un premier temps, on regarde si le patient existe et si il a un dmr
     */
    public static boolean creerDMR(DMR dmr) {
        Acces_BD acces_BD = new Acces_BD();
        Connection connexion = acces_BD.connexion;
        PreparedStatement statement;
        PreparedStatement stat;
        Gestion_patient gestionPatient = new Gestion_patient();
        int id_patient = 0;
        try {

            stat = connexion.prepareStatement("SELECT * FROM  dmr WHERE id_patient = " + dmr.getId_patient());
            ResultSet resultset = stat.executeQuery();
            while (resultset.next()) {
                id_patient = resultset.getInt("id_patient");
            }

        } catch (Exception e) {
            System.out.println("exception");
        }
        System.out.println(gestionPatient.rechercher_patient(String.valueOf(dmr.getId_patient())));
        if(gestionPatient.rechercher_patient(String.valueOf(dmr.getId_patient()))!=null && id_patient==0) {
            try {
                statement = connexion.prepareStatement("INSERT INTO dmr (id_dmr, id_patient, historique_modifications) VALUES (?,?,?);");
                statement.setInt(1, dmr.getId_dmr());
                statement.setInt(2, dmr.getId_patient());
                statement.setInt(3, dmr.getHistorique_modifications().getId_historique());
                statement.executeUpdate();
                return true;

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("pb dans la connexion à la bd");
        return false;
    }

    public int générerIdDMR(){
        //Connaitre le nombre de dmr dans la table pour avoir le numéro du dmr =id_dmr
        Acces_BD acces_BD = new Acces_BD();
        Connection connexion = acces_BD.connexion;

        int nombredmr = 0;
        try {
            Statement stat = connexion.createStatement();
            ResultSet resultSetDMR = stat.executeQuery("SELECT count(id_dmr) FROM dmr;");
            while (resultSetDMR.next()) {
                nombredmr = (resultSetDMR.getInt(1));
            }
            nombredmr +=1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nombredmr;
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
