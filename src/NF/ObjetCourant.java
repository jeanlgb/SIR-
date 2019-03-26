/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NF;

import java.sql.Connection;

/**
 *
 * @author Jean-Loup
 */
public class ObjetCourant {
    private Medecin medecin;
    private Secretaire_medicale secretaire_medicale;
    private Manipulateur_radio manipulateur_radio;
    private Connection connexion;

    public ObjetCourant(Medecin medecin, Connection connexion){
        this.medecin = medecin;
        this.connexion = connexion;

    }

    public ObjetCourant(Secretaire_medicale secretaire_medicale, Connection connexion){
        this.setSecretaire_medicale(secretaire_medicale);
        this.connexion = connexion;

    }

    public ObjetCourant(Manipulateur_radio manipulateur_radio, Connection connexion){
        this.setManipulateur_radio(manipulateur_radio);
        this.connexion = connexion;

    }

    /**
     * @return the medecin
     */
    public Medecin getMedecinCourant(){
        return medecin;
    }

    /**
     *  @param medecin the connexion to set
     */
    public void setMedecinCourant(Medecin medecin){
        this.medecin = medecin;
    }

    /**
     * @return the connexion
     */
    public Connection getConnexion() {
        return connexion;
    }

    /**
     * @param connexion the connexion to set
     */
    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }

    public Secretaire_medicale getSecretaire_medicale() {
        return secretaire_medicale;
    }

    public void setSecretaire_medicale(Secretaire_medicale secretaire_medicale) {
        this.secretaire_medicale = secretaire_medicale;
    }

    public Manipulateur_radio getManipulateur_radio() {
        return manipulateur_radio;
    }

    public void setManipulateur_radio(Manipulateur_radio manipulateur_radio) {
        this.manipulateur_radio = manipulateur_radio;
    }
}
