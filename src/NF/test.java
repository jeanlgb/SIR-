/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NF;

import java.text.SimpleDateFormat;

/**
 *
 * @author maudl
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new SimpleDateFormat("dd/MM/yyyy:HH-mm").format(System.currentTimeMillis());
        java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
        java.sql.Timestamp d = new java.sql.Timestamp(System.currentTimeMillis());
        System.out.println(date);
        System.out.println(d);
       // System.out.println(dateS);
    }
    
}
