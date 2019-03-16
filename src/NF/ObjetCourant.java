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
    private Connection connexion;
    
    public ObjetCourant(Medecin medecin, Connection connexion){
        this.medecin = medecin;
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
    
}
