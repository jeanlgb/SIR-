/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import NF.*;

import java.sql.*;
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
//        Adresse adresse = new Adresse(10, "1", "rue des Anémones", "Quartier des fleurs", "44000", "La Prairie", "France");
//        Patient patient = new Patient(10, "Mahé", "Mahé", "Yann", new java.sql.Date(100, 03, 06), Genre.H, adresse);
//        Medecin medecin = new Medecin(8, "Guillonet", "Patrick");
//        Modification m1 = new Modification(new java.sql.Date(100, 03, 01), 1);
//        Modification m2 = new Modification(new java.sql.Date(100, 03, 02), 2);
//        Modification m3 = new Modification(new java.sql.Date(100, 03, 03), 2);
//        Modification m4 = new Modification(new java.sql.Date(100, 03, 04), 1);
//        Modification m5 = new Modification(new java.sql.Date(100, 03, 05), 2);
//        Modification m6 = new Modification(new java.sql.Date(100, 03, 06), 2);
//        Historique_modifications histo1 = new Historique_modifications(1, new ArrayList<Modification>());
//        histo1.ajouter_modification(m1);
//        histo1.ajouter_modification(m2);
//        histo1.ajouter_modification(m3);
//        Historique_modifications histo2 = new Historique_modifications(2, new ArrayList<Modification>());
//        histo2.ajouter_modification(m4);
//        histo2.ajouter_modification(m5);
//        Historique_modifications histo3 = new Historique_modifications(3, new ArrayList<Modification>());
//        histo3.ajouter_modification(m6);
//        Salle salle = new Salle(1, new ArrayList<Type_examen>(), true, new EDT());
//        Compte_rendu cr = new Compte_rendu(medecin, "texte du cr");
//        PACS pacs = new PACS(1, "mention", histo2);
//        DMR dmr = new DMR(10, 10, new ArrayList<Examen>(), histo1);
//        Examen exam1 = new Examen(12, dmr, new java.sql.Date(100, 3, 1), medecin, Type_examen.angiographie, 2.5, salle, cr, pacs, true, true, histo3, 2.5);
//        dmr.ajouter_examen(exam1);
//        patient.setDmr(dmr);
//
//        Acces_BD acces_BD = new Acces_BD();
//        Connection connexion = acces_BD.connexion;
//        PreparedStatement statement;

//        try {
//            System.out.println(Gestion_patient.creerPatient(patient));
//            System.out.println(Gestion_patient.rechercher_patient(String.valueOf(patient.getIdentifiant())));
//            patient.setNom_d_usage("Mahéééé");
//            Gestion_patient.mettreAJour(patient);
//            System.out.println(Gestion_patient.rechercher_patient(String.valueOf(patient.getIdentifiant())));
//            Gestion_medecin.creerMedecin(medecin);
//            System.out.println(Gestion_medecin.rechercher_medecin(String.valueOf(medecin.getIdentifiant())));
//            medecin.setPrenom("Pat");
//            Gestion_medecin.mettreAJour(medecin);
//            System.out.println(Gestion_medecin.rechercher_medecin(String.valueOf(medecin.getIdentifiant())));
//            Gestion_DMR.creerDMR(dmr);
//            System.out.println(Gestion_DMR.rechercher_DMR(String.valueOf(dmr.getId_dmr())));
//            dmr = new DMR(10, 10, new ArrayList<Examen>(), histo3);
//            System.out.println(Gestion_DMR.mettreAJour(dmr));
//            System.out.println(Gestion_DMR.rechercher_DMR(String.valueOf(dmr.getId_dmr())));
//            Gestion_examen.creerExamen(exam1);
//           System.out.println(Gestion_examen.rechercher_Examen(String.valueOf(exam1.getId_examen())));
//            Gestion_adresse.creerAdresse(adresse);
//            System.out.println(Gestion_adresse.rechercher_adresse(String.valueOf(adresse.getId_adresse())));
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        //créer DMR
/**
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
        }*/


//        Acces_BD acces_BD = new Acces_BD();
//        Connection connexion = acces_BD.connexion;
//        PreparedStatement statement = null;
//        ArrayList<Examen> liste_examens = new ArrayList<>();
//        String  nom = "FRECON";
//
//        try {
//            statement = connexion.prepareStatement("SELECT id_dmr FROM patient WHERE patient.nom_d_usage = ?");
//            statement.setString(1, nom);
//
//            ResultSet resultset = statement.executeQuery();
//
//            while (resultset.next()) {
//                int id_dmr = resultset.getInt("id_dmr");
//                System.out.println(id_dmr);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//
//        System.out.println(Gestion_patient.rechercheIdDMR(patient.getIdentifiant()));
  //      Patient patient_recherche = Gestion_patient.rechercher_patient("1");
  //     DMR dmr = Gestion_DMR.rechercher_DMR(Gestion_patient.rechercheIdDMR(patient_recherche.getIdentifiant()));
  //     System.out.println(dmr);
        
  //      System.out.println(Gestion_examen.recuperer_image("1", connexion));
        
    }

}
