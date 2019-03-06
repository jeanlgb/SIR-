package BD;

import NF.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class Rechercher_Patient {
    private NF.Patient patient;
    public Rechercher_Patient(String ID, String nom){
        Acces_BD acces_BD = new Acces_BD();
        Connection connexion = acces_BD.connexion;
        PreparedStatement statement = null;

        try{
            statement = connexion.prepareStatement("SELECT id_patient, nom_d_usage, nom_de_naissance, prenom_patient, date_de_naissance, genre, id_dmr, rue, numero, lieu_dit, code_postal, commune, pays FROM patient JOIN adresse WHERE patient.id_patient = ? OR nom_d_usage = ?");
            statement.setInt(1, Integer.parseInt(ID));
            statement.setString(2, nom);
            ResultSet resultset = statement.executeQuery();
            while(resultset.next()){
                int id = resultset.getInt("id_patient");
                String nom_d_usage  = resultset.getString("nom_d_usage");
                String nom_de_naissance = resultset.getString("nom_de_naissance");
                String prenom_patient = resultset.getString("prenom_patient");
                Date date_de_naissance = resultset.getDate("date_de_naissance");
                String id_dmr = resultset.getString("id_dmr");
                String genre = resultset.getString("genre");
                String rue = resultset.getString("rue");
                String numero = resultset.getString("numero");
                String lieu_dit = resultset.getString("lieu_dit");
                String code_postal = resultset.getString("code_postal");
                String commune = resultset.getString("commune");
                String pays = resultset.getString("pays");
                Adresse adresse = new Adresse(numero, rue, lieu_dit, code_postal, commune, pays);
                if(genre.equals("H")){
                    setPatient(new Patient(id, nom_d_usage, prenom_patient, date_de_naissance, Genre.H, adresse));
                }else{
                    if(genre.equals("Autre")){
                            setPatient(new Patient(id, nom_d_usage, prenom_patient, date_de_naissance, Genre.Autre, adresse));
                        }else{
                            if(genre.equals("F")){
                                    setPatient(new Patient(id, nom_d_usage, nom_de_naissance, prenom_patient, date_de_naissance, Genre.F, adresse));
                                }
                            }
                    }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
