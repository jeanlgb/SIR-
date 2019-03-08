/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import NF.*;

import java.sql.*;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author leclemau
 */
public class testbd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//       Patient p = new Patient(12, "essaibd2", "essaibd2", "essaibd2", new java.sql.Date(100, 03, 06), Genre.H, new Adresse("1", "rue", "lieu_dit", "code_postal", "commune", "pays"));
//        System.out.println(p);
////        java.sql.Date dd= new java.sql.Date(6032018);
////        java.sql.Date dd = new java.sql.Date(118, 02, 06);
////        System.out.println(dd);
//        DMR dmrbd =new DMR(p.getIdentifiant(), new ArrayList<Examen>(), new Historique_modifications(new ArrayList<Modification>()));
//        dmrbd.setId_dmr(13);
//        p.setDmr(dmrbd);
//        Rechercher_Patient rp = new Rechercher_Patient(p);
//        rp.creerPatient();


        //Connexion bd
        Acces_BD acces_BD = new Acces_BD();
        Connection connexion = acces_BD.connexion;
        PreparedStatement statement;

        //créer examen
        /**Examen examen = new Examen()
        try {

            statement = connexion.prepareStatement("INSERT INTO examen (id_dmr, date_examen, id_medecin, type_examen, salle, pacs, dossier_papier,  examen_termine, historique_modification, cout_examen) VALUES (?,?,?,?,?,?,?,?,?);");
            statement.setInt(1, examen.get);
            statement.setString(2, patient.getNom_d_usage());
            statement.setString(3, patient.getNom_de_naissance());
            statement.setString(4, patient.getPrenom());
            statement.setDate(5, patient.getDate_de_naissance());
            statement.setString(6, patient.getGenre().toString());
            statement.setInt(7, patient.getAdresse().getId_adresse());
            statement.setInt(8, patient.getDmr().getId_dmr());

            int resultat = statement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("pb dans la connexion à la bd");*/

        //Connaitre le nombre de patient dans la table pour avoir le numéro du patient =id_patient

        int nombrepatient = 0;
        try {
            Statement stat = connexion.createStatement();
            ResultSet resultSetPatient = stat.executeQuery("SELECT count(id_patient) FROM patient;");
            while (resultSetPatient.next()) {
                nombrepatient = (resultSetPatient.getInt(1));
            }
            nombrepatient +=1;
            System.out.println( nombrepatient);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Connaitre le nombre de dmr dans la table pour avoir le numéro du dmr =id_dmr

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



        //créer DMR

        try {
            ArrayList<Examen> examens = new ArrayList<>();
            DMR dmr = new DMR(nombredmr, examens);
            statement = connexion.prepareStatement("INSERT INTO dmr (id_dmr, id_patient) VALUES (?,?) ;");
            statement.setInt(1, dmr.getId_dmr());
            statement.setInt(2, dmr.getId_patient());
            //statement.setString(3, dmr.getHistorique_modifications().toString());

            int resultat = statement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }



    }

}