/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BD.Gestion_patient;
import NF.*;
import BD.Gestion_DMR;
import java.sql.Connection;

import java.util.ArrayList;

/**
 *
 * @author camin
 */
public class Crea_DMR extends javax.swing.JFrame {

    /**
     * Creates new form Param
     */
    public Crea_DMR() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Base = new javax.swing.JPanel();
        jPanel_DMR = new javax.swing.JPanel();
        jLabel_DateCrea = new javax.swing.JLabel();
        dateDMR = new javax.swing.JLabel();
        jLabel_HeureCrea = new javax.swing.JLabel();
        jLabel_Nom = new javax.swing.JLabel();
        jLabel_Prenom = new javax.swing.JLabel();
        jLabel_Sexe = new javax.swing.JLabel();
        jComboBox_Sexe = new javax.swing.JComboBox<>();
        jButton_SauvegarderFermer = new javax.swing.JButton();
        jTextField_Nom = new javax.swing.JTextField();
        jTextField_Prenom = new javax.swing.JTextField();
        jLabel_ExamLier = new javax.swing.JLabel();
        jComboBox_ExamLier = new javax.swing.JComboBox<>();
        jLabel_Reference = new javax.swing.JLabel();
        jLabel_IDPatient = new javax.swing.JLabel();
        idPatient = new javax.swing.JLabel();
        jTextField_Reference = new javax.swing.JTextField();
        jTextField_Nom1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        jPanel_Base.setBackground(new java.awt.Color(127, 144, 160));
        jPanel_Base.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Création DMR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        jPanel_DMR.setBackground(new java.awt.Color(163, 209, 180));

        jLabel_DateCrea.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel_DateCrea.setText("Date de création :");

        dateDMR.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
        dateDMR.setText(date.toString());

        jLabel_HeureCrea.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel_HeureCrea.setText("Date de naissance");

        jLabel_Nom.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel_Nom.setText("Nom :");

        jLabel_Prenom.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel_Prenom.setText("Prénom :");

        jLabel_Sexe.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel_Sexe.setText("Sexe :");

        jComboBox_Sexe.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jComboBox_Sexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homme", "Femme" }));
        jComboBox_Sexe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_SexeActionPerformed(evt);
            }
        });

        jButton_SauvegarderFermer.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jButton_SauvegarderFermer.setText("Sauvegarder et créer");
        jButton_SauvegarderFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SauvegarderFermerActionPerformed(evt);
            }
        });

        jLabel_ExamLier.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel_ExamLier.setText("Examen éxistant à lier :");

        jComboBox_ExamLier.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jComboBox_ExamLier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Non", "Oui (Numérique)", "Oui (Papier)" }));
        jComboBox_ExamLier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ExamLierActionPerformed(evt);
            }
        });

        jLabel_Reference.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel_Reference.setText("Référence examen :");
        jLabel_Reference.setVisible(false);

        jLabel_IDPatient.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel_IDPatient.setText("ID Patient :");

        idPatient.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        idPatient.setText("ID_Patient");

        jTextField_Reference.setVisible(false);

        javax.swing.GroupLayout jPanel_DMRLayout = new javax.swing.GroupLayout(jPanel_DMR);
        jPanel_DMR.setLayout(jPanel_DMRLayout);
        jPanel_DMRLayout.setHorizontalGroup(
            jPanel_DMRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DMRLayout.createSequentialGroup()
                .addGroup(jPanel_DMRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_DMRLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel_DMRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_DateCrea)
                            .addGroup(jPanel_DMRLayout.createSequentialGroup()
                                .addGroup(jPanel_DMRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_HeureCrea)
                                    .addComponent(jLabel_Nom)
                                    .addComponent(jLabel_Prenom)
                                    .addComponent(jLabel_Sexe)
                                    .addComponent(jLabel_IDPatient))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel_DMRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_Nom1)
                                    .addComponent(idPatient)
                                    .addComponent(jComboBox_Sexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateDMR)
                                    .addComponent(jTextField_Nom)
                                    .addComponent(jTextField_Prenom))))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel_DMRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_ExamLier)
                            .addComponent(jLabel_Reference))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_DMRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_DMRLayout.createSequentialGroup()
                                .addComponent(jComboBox_ExamLier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextField_Reference, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_DMRLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_SauvegarderFermer, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel_DMRLayout.setVerticalGroup(
            jPanel_DMRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_DMRLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel_DMRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_DateCrea)
                    .addComponent(dateDMR)
                    .addComponent(jLabel_ExamLier)
                    .addComponent(jComboBox_ExamLier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel_DMRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_DMRLayout.createSequentialGroup()
                        .addGroup(jPanel_DMRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel_DMRLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel_DMRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_HeureCrea)
                                    .addComponent(jLabel_Reference)))
                            .addGroup(jPanel_DMRLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_Reference)))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel_Nom))
                    .addGroup(jPanel_DMRLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jTextField_Nom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel_DMRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Prenom)
                    .addComponent(jTextField_Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel_DMRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_Sexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Sexe))
                .addGap(17, 17, 17)
                .addGroup(jPanel_DMRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_IDPatient)
                    .addComponent(idPatient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton_SauvegarderFermer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel_BaseLayout = new javax.swing.GroupLayout(jPanel_Base);
        jPanel_Base.setLayout(jPanel_BaseLayout);
        jPanel_BaseLayout.setHorizontalGroup(
            jPanel_BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BaseLayout.createSequentialGroup()
                .addComponent(jPanel_DMR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_BaseLayout.setVerticalGroup(
            jPanel_BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BaseLayout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(jPanel_DMR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_SexeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_SexeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_SexeActionPerformed

    private void jButton_SauvegarderFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SauvegarderFermerActionPerformed
        NF.Acces_BD bd = new Acces_BD();
        Connection connexion = bd.connexion;
        Gestion_DMR d = new Gestion_DMR();
        Gestion_patient p = new Gestion_patient();
        int idDMR = d.générerIdDMR(connexion);
        ArrayList<Examen> liste = new ArrayList<Examen>();
        Historique_modifications modifications = new Historique_modifications(0, null);
        DMR dmr = new DMR(idDMR, 0, liste, modifications);

        d.creerDMR(dmr, connexion);
    }//GEN-LAST:event_jButton_SauvegarderFermerActionPerformed

    private void jComboBox_ExamLierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ExamLierActionPerformed
        // TODO add your handling code here:
        if (jComboBox_ExamLier.getSelectedItem().equals("Oui (Numérique)") | jComboBox_ExamLier.getSelectedItem().equals("Oui (Papier)")) {
            jTextField_Reference.setVisible(true);
            jLabel_Reference.setVisible(true);

            jPanel_DMR.repaint();
            jPanel_DMR.revalidate();

        } else if (jComboBox_ExamLier.getModel().getSelectedItem().equals("Non")) {
            jTextField_Reference.setVisible(false);
            jLabel_Reference.setVisible(false);

            jPanel_DMR.repaint();
            jPanel_DMR.revalidate();

        }
    }//GEN-LAST:event_jComboBox_ExamLierActionPerformed

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
            java.util.logging.Logger.getLogger(Crea_DMR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crea_DMR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crea_DMR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crea_DMR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crea_DMR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateDMR;
    private javax.swing.JLabel idPatient;
    private javax.swing.JButton jButton_SauvegarderFermer;
    private javax.swing.JComboBox<String> jComboBox_ExamLier;
    private javax.swing.JComboBox<String> jComboBox_Sexe;
    private javax.swing.JLabel jLabel_DateCrea;
    private javax.swing.JLabel jLabel_ExamLier;
    private javax.swing.JLabel jLabel_HeureCrea;
    private javax.swing.JLabel jLabel_IDPatient;
    private javax.swing.JLabel jLabel_Nom;
    private javax.swing.JLabel jLabel_Prenom;
    private javax.swing.JLabel jLabel_Reference;
    private javax.swing.JLabel jLabel_Sexe;
    private javax.swing.JPanel jPanel_Base;
    private javax.swing.JPanel jPanel_DMR;
    private javax.swing.JTextField jTextField_Nom;
    private javax.swing.JTextField jTextField_Nom1;
    private javax.swing.JTextField jTextField_Prenom;
    private javax.swing.JTextField jTextField_Reference;
    // End of variables declaration//GEN-END:variables
}
