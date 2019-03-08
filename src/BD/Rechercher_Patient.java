package BD;

import NF.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;

public class Rechercher_Patient {

    private NF.Patient patient;

    Rechercher_Patient(Patient p) {
        this.patient = p;
    }

    public Rechercher_Patient(String ID, String nom) {
        Acces_BD acces_BD = new Acces_BD();
        Connection connexion = acces_BD.connexion;
        PreparedStatement statement = null;

        try {
            statement = connexion.prepareStatement("SELECT id_patient, nom_d_usage, nom_de_naissance, prenom_patient, date_de_naissance, genre, id_dmr, rue, numero, lieu_dit, code_postal, commune, pays FROM patient JOIN adresse WHERE patient.id_patient = ? OR nom_d_usage = ?");
            statement.setInt(1, Integer.parseInt(ID));
            statement.setString(2, nom);
            ResultSet resultset = statement.executeQuery();
            while (resultset.next()) {
                int id = resultset.getInt("id_patient");
                String nom_d_usage = resultset.getString("nom_d_usage");
                String nom_de_naissance = resultset.getString("nom_de_naissance");
                String prenom_patient = resultset.getString("prenom_patient");
                java.sql.Date date_de_naissance = resultset.getDate("date_de_naissance");
                String id_dmr = resultset.getString("id_dmr");
                String genre = resultset.getString("genre");
                String rue = resultset.getString("rue");
                String numero = resultset.getString("numero");
                String lieu_dit = resultset.getString("lieu_dit");
                String code_postal = resultset.getString("code_postal");
                String commune = resultset.getString("commune");
                String pays = resultset.getString("pays");
                Adresse adresse = new Adresse(numero, rue, lieu_dit, code_postal, commune, pays);
                if (genre.equals("H")) {
                    setPatient(new Patient(id, nom_d_usage, prenom_patient, date_de_naissance, Genre.H, adresse));
                } else {
                    if (genre.equals("Autre")) {
                        setPatient(new Patient(id, nom_d_usage, prenom_patient, date_de_naissance, Genre.Autre, adresse));
                    } else {
                        if (genre.equals("F")) {
                            setPatient(new Patient(id, nom_d_usage, nom_de_naissance, prenom_patient, date_de_naissance, Genre.F, adresse));
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public boolean mettreAJour() {
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

    //INSERT INTO `patient` (`id_patient`, `nom_d_usage`, `nom_de_naissance`, `prenom_patient`, `date_de_naissance`, `genre`, `id_adresse`, `id_dmr`) VALUES ('14', 'ert', 'erg', 'erg', '2019-03-21', 'H', '752', '752');
    public boolean creerPatient() {
        Acces_BD acces_BD = new Acces_BD();
        Connection connexion = acces_BD.connexion;
        PreparedStatement statement;
        try {
            statement = connexion.prepareStatement("INSERT INTO patient (id_patient, nom_d_usage, nom_de_naissance, prenom_patient, date_de_naissance, genre, id_adresse,  id_dmr) VALUES (?,?,?,?,?,?,?,?);");
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

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
