/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NF;

/**
 *
 * @author maudl
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connexion test_connexion = new Connexion(123, "123");
        test_connexion.autorisation_de_connexion();
    }
    
}
