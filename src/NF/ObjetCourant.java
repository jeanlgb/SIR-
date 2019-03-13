/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NF;

/**
 *
 * @author Jean-Loup
 */
public class ObjetCourant {
    private Medecin medecin;
    
    public ObjetCourant(Medecin medecin){
        this.medecin = medecin;
    }
    public Medecin getMedecinCourant(){
        return medecin;
    }
    
    public void setMedecinCourant(Medecin medecin){
        this.medecin = medecin;
    }
    
}
