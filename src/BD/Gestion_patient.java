package BD;

import NF.*;

import NF.Patient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Gestion_patient {

    /**
     * permet de rechercher un patient dans la BD à partir de son id.
     */

    public static Patient rechercher_patient(String id_recherche) {
        Acces_BD acces_BD = new Acces_BD();
        Connection connexion = acces_BD.connexion;
        PreparedStatement statement = null;

        try {
            statement = connexion.prepareStatement("SELECT id_patient, nom_d_usage, nom_de_naissance, prenom_patient, date_de_naissance, genre, id_adresse, id_dmr FROM patient WHERE id_patient = ? OR nom_d_usage = ?");
            statement.setInt(1, Integer.parseInt(id_recherche));
            statement.setString(2, id_recherche);
            ResultSet resultset = statement.executeQuery();
            while (resultset.next()) {
                String nom_d_usage = resultset.getString("nom_d_usage");
                String nom_de_naissance = resultset.getString("nom_de_naissance");
                String prenom_patient = resultset.getString("prenom_patient");
                java.sql.Date date_de_naissance = resultset.getDate("date_de_naissance");
                Genre genre = Genre.valueOf(resultset.getString("genre"));
                int id_adresse = resultset.getInt("id_adresse");
                Adresse adresse = Gestion_adresse.rechercher_adresse(String.valueOf(id_adresse));
                String id_dmr = resultset.getString("id_dmr");
                
                Patient patient = new Patient(Integer.parseInt(id_recherche), nom_d_usage, prenom_patient, date_de_naissance, genre, adresse);
                return patient;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
        /**
     * permet de rechercher un patient dans la BD à partir de son id.
     */

    public static Patient rechercher_par_nom_patient(String nom_recherche) {
        Acces_BD acces_BD = new Acces_BD();
        Connection connexion = acces_BD.connexion;
        PreparedStatement statement = null;

        try {
            statement = connexion.prepareStatement("SELECT id_patient, nom_d_usage, nom_de_naissance, prenom_patient, date_de_naissance, genre, id_adresse, id_dmr FROM patient WHERE nom_d_usage = ?");
            statement.setString(1, nom_recherche);
            ResultSet resultset = statement.executeQuery();
            while (resultset.next()) {
                int id = resultset.getInt("id_patient");
                String nom_de_naissance = resultset.getString("nom_de_naissance");
                String prenom_patient = resultset.getString("prenom_patient");
                java.sql.Date date_de_naissance = resultset.getDate("date_de_naissance");
                Genre genre = Genre.valueOf(resultset.getString("genre"));
                int id_adresse = resultset.getInt("id_adresse");
                Adresse adresse = Gestion_adresse.rechercher_adresse(String.valueOf(id_adresse));
                String id_dmr = resultset.getString("id_dmr");
                
                Patient patient = new Patient(id, nom_recherche, prenom_patient, date_de_naissance, genre, adresse);
                return patient;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * A partir d'un patient passé en paramètres, met à jour le patient dans la
     * BD (se base sur l'id du patient pour le retrouver dans la BD)
     */
    public static boolean mettreAJour(Patient patient) {
        Acces_BD acces_BD = new Acces_BD();
        Connection connexion = acces_BD.connexion;
        PreparedStatement statement;
        try {
            statement = connexion.prepareStatement("UPDATE patient SET nom_d_usage = ?, nom_de_naissance = ?, prenom_patient = ?, date_de_naissance = ?, genre = ?, id_adresse = ?,  id_dmr =? WHERE patient.id_patient = ? ;");
            statement.setString(1, patient.getNom_d_usage());
            statement.setString(2, patient.getNom_de_naissance());
            statement.setString(3, patient.getPrenom());
            statement.setDate(4, patient.getDate_de_naissance());
            statement.setString(5, patient.getGenre().toString());
            statement.setInt(6, patient.getAdresse().getId_adresse());
            statement.setInt(7, patient.getDmr().getId_dmr());
            statement.setInt(8, patient.getIdentifiant());

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
    public static boolean creerPatient(Patient patient) {
        Acces_BD acces_BD = new Acces_BD();
        Connection connexion = acces_BD.connexion;
        PreparedStatement statement;
        try {
            statement = connexion.prepareStatement("INSERT INTO patient (id_patient, nom_d_usage, nom_de_naissance, prenom_patient, date_de_naissance, genre, id_adresse, id_dmr) VALUES (?,?,?,?,?,?,?,?);");
            statement.setInt(1, patient.getIdentifiant());
            statement.setString(2, patient.getNom_d_usage());
            statement.setString(3, patient.getNom_de_naissance());
            statement.setString(4, patient.getPrenom());
            statement.setDate(5, patient.getDate_de_naissance());
            statement.setString(6, patient.getGenre().toString());
            statement.setInt(7, patient.getAdresse().getId_adresse());
            statement.setInt(8, patient.getDmr().getId_dmr());

            int resultat = statement.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("pb dans la connexion à la bd");
        return false;
    }

    public static String rechercheIdDMR(int id_patient) {
        Acces_BD acces_BD = new Acces_BD();
        Connection connexion = acces_BD.connexion;
        PreparedStatement statement = null;
        String id_dmr = "";

        try {
            statement = connexion.prepareStatement("SELECT id_dmr FROM patient WHERE id_patient = ?");
            statement.setInt(1, id_patient);
            ResultSet resultset = statement.executeQuery();
            while (resultset.next()) {
                id_dmr = resultset.getString("id_dmr");
            }
            return id_dmr;
        } catch (Exception e) {
            e.printStackTrace();
        }
                System.out.println("pb dans la connexion à la bd");
        return null;
    }

}
