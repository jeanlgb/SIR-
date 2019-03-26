/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import NF.ObjetCourant;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author porra
 */
public class InterfaceParametreRadiologue extends javax.swing.JFrame {
    private Connection connexion;
    private ObjetCourant objet_Courant;

    /**
     * Creates new form interfaceParametre
     */
    public InterfaceParametreRadiologue(ObjetCourant objet_Courant) {
        this.objet_Courant = objet_Courant;
        connexion = objet_Courant.getConnexion();
        this.connexion = connexion;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonLangue = new javax.swing.JButton();
        jButtonMdp = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelParametre = new javax.swing.JLabel();
        jButtonFermer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(163, 209, 180));

        jButtonLangue.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jButtonLangue.setForeground(new java.awt.Color(72, 91, 122));
        jButtonLangue.setText("Voulez-vous changer de langue?");
        jButtonLangue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLangueActionPerformed(evt);
            }
        });

        jButtonMdp.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jButtonMdp.setForeground(new java.awt.Color(72, 91, 122));
        jButtonMdp.setText("Voulez-vous changer de Mot de passe?");
        jButtonMdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMdpActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(127, 144, 160));

        jLabelParametre.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabelParametre.setText("Parametres");

        jButtonFermer.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jButtonFermer.setForeground(new java.awt.Color(72, 91, 122));
        jButtonFermer.setText("Retour");
        jButtonFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFermerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabelParametre, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonFermer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButtonFermer)
                .addGap(18, 18, 18)
                .addComponent(jLabelParametre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLangue, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jButtonLangue, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jButtonMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void jButtonLangueActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:

        int decoLangue = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment changer de langue ?", "Attention",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (decoLangue == JOptionPane.OK_OPTION) {
            Login seConnecter = new Login();
            this.setVisible(false);
            seConnecter.setVisible(true);
            //this.dispose();
        }
    }                                             

    private void jButtonFermerActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        Acceuil_Radiologue retourRadiologue = new Acceuil_Radiologue(objet_Courant);
        retourRadiologue.setVisible(true);
        retourRadiologue.setResizable(false);
        this.setVisible(false);
    }                                             

    private void jButtonMdpActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:

        int interfaceMdp = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment changer votre mot de passe ?", "Attention",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (interfaceMdp == JOptionPane.OK_OPTION) {
            ChangerMdp_Radiologue changementMDP = new ChangerMdp_Radiologue(objet_Courant);
            this.setVisible(false);
            changementMDP.setVisible(true);

            //this.dispose();
        }
    }                                          

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceParametreRadiologue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceParametreRadiologue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceParametreRadiologue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceParametreRadiologue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new InterfaceParametreRadiologue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonFermer;
    private javax.swing.JButton jButtonLangue;
    private javax.swing.JButton jButtonMdp;
    private javax.swing.JLabel jLabelParametre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration                   
}
