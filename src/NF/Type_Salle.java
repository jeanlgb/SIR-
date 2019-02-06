/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NF;

/**
 *
 * @author camin
 */
public enum Type_Salle {
    SALLE_1("Scanner",true ),
    SALLE_2("Scanner",true),
    SALLE_3("Angiographe",true),
    SALLE_4("IRM",true),
    SALLE_5("Radio Argentique",false),
    SALLE_6("Radio Argentique",false),
    SALLE_7("Radio Argentique",false),
    SALLE_8("Radiothérapie",true);
    
    private String Equipement_Salle;
    private boolean Salle_num;
    
    private Type_Salle(String Equipement_Salle, boolean Salle_num){
        this.Equipement_Salle=Equipement_Salle;
        this.Salle_num=Salle_num;                      
    }
     public String toString() {
        return "Type_Salle" + "est une salle de" + Equipement_Salle + ", et son équipement est numérique" + Salle_num;
    }
    
    
    
    
}
