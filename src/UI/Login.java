/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author porra
 */
import UI_Anglais.*;
import NF.*;
import UI.Acceuil_ManipRadio;
import UI.Acceuil_Radiologue;
import UI.Acceuil_Sec;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.Timer;

public class Login extends javax.swing.JFrame {

    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelIdentifiant;
    private javax.swing.JLabel labelIdentification;
    private javax.swing.JLabel labelMdp;
    private javax.swing.JLabel label_erreurIdentifiant;
    private javax.swing.JLabel label_erreur_mdp;
    private javax.swing.JButton login;
    private javax.swing.JLabel logo_MedTechs;
    private javax.swing.JPanel panel_identification;
    private javax.swing.JPanel panel_logo;
    private javax.swing.JTextField txtidentifiant;
    private javax.swing.JPasswordField txtmdp;
    private javax.swing.JCheckBox verifierMdp;
    private javax.swing.JButton jButtonChangerLangue;
    private ObjetCourant objet_Courant;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    Timer timer1 = new Timer(30, new ActionListener() {

        @Override
        /**
         * ActionPerformed
         */
        public void actionPerformed(ActionEvent e) {

            if (panel_logo.getHeight() != 105) {
                panel_logo.setBounds(0, 0, Login.this.getSize().width, panel_logo.getHeight() + 5);
                if (panel_logo.getHeight() == 105) {
                    timer1.stop();
                }
            };
        }
    });

    Timer timer2 = new Timer(30, new ActionListener() {
        /**
         * ActionPerformed
         */
        @Override
        public void actionPerformed(ActionEvent e) {

            if (panel_logo.getHeight() != 0) {
                panel_logo.setBounds(0, 0, Login.this.getSize().width, panel_logo.getHeight() - 5);
                if (panel_logo.getHeight() == 0) {
                    timer2.stop();
                }
            };
        }
    });

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_identification = new javax.swing.JPanel();
        labelIdentification = new javax.swing.JLabel();
        labelIdentifiant = new javax.swing.JLabel();
        labelMdp = new javax.swing.JLabel();
        txtidentifiant = new javax.swing.JTextField();
        txtmdp = new javax.swing.JPasswordField();
        verifierMdp = new javax.swing.JCheckBox();
        login = new javax.swing.JButton();
        label_erreurIdentifiant = new javax.swing.JLabel();
        label_erreur_mdp = new javax.swing.JLabel();
        panel_logo = new javax.swing.JPanel();
        logo_MedTechs = new javax.swing.JLabel();
        jButtonChangerLangue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_identification.setBackground(new java.awt.Color(163, 209, 180));

        labelIdentification.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        labelIdentification.setText("Identification");

        labelIdentifiant.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelIdentifiant.setText("Identifiant :");

        labelMdp.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelMdp.setText("Mot de Passe : ");

        txtidentifiant.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        txtmdp.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtmdp.setText("");

        verifierMdp.setBackground(new java.awt.Color(163, 209, 180));
        verifierMdp.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        verifierMdp.setText("Afficher Mot de Passe");
        verifierMdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifierMdpActionPerformed(evt);
            }
        });

        login.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        login.setForeground(new java.awt.Color(72, 91, 122));
        login.setText("Connexion");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed();
            }
        });

        /**
         * Connexion avec le bouton entrée
         */
        txtmdp.addKeyListener(new java.awt.event.KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == '\n') {
                    loginActionPerformed();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        label_erreurIdentifiant.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        label_erreurIdentifiant.setForeground(new java.awt.Color(255, 0, 0));

        label_erreur_mdp.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        label_erreur_mdp.setForeground(new java.awt.Color(255, 0, 0));

        panel_logo.setBackground(new java.awt.Color(127, 144, 160));

        logo_MedTechs.setIcon(new javax.swing.ImageIcon("medtechs_sansfond_petit.png")); // NOI18N

        javax.swing.GroupLayout panel_logoLayout = new javax.swing.GroupLayout(panel_logo);
        panel_logo.setLayout(panel_logoLayout);
        panel_logoLayout.setHorizontalGroup(
                panel_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_logoLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(logo_MedTechs, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_logoLayout.setVerticalGroup(
                panel_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_logoLayout.createSequentialGroup()
                                .addContainerGap(15, Short.MAX_VALUE)
                                .addComponent(logo_MedTechs)
                                .addContainerGap())
        );

        jButtonChangerLangue.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jButtonChangerLangue.setForeground(new java.awt.Color(72, 91, 122));
        jButtonChangerLangue.setText("Anglais");
        jButtonChangerLangue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangerLangueActionPerformed(evt);
            }
        });
        //provisoire
//        jButtonChangerLangue.setVisible(false);

        javax.swing.GroupLayout panel_identificationLayout = new javax.swing.GroupLayout(panel_identification);
        panel_identification.setLayout(panel_identificationLayout);
        panel_identificationLayout.setHorizontalGroup(
                panel_identificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panel_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_identificationLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(panel_identificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelIdentifiant)
                                        .addComponent(labelMdp))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                .addGroup(panel_identificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtidentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtmdp, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(verifierMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addGroup(panel_identificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(jButtonChangerLangue, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                ).addGap(65, 65, 65))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_identificationLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel_identificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(labelIdentification)
                                        .addGroup(panel_identificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(label_erreur_mdp, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label_erreurIdentifiant, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(380, 380, 380))
        );
        panel_identificationLayout.setVerticalGroup(
                panel_identificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_identificationLayout.createSequentialGroup()
                                .addGroup(panel_identificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panel_identificationLayout.createSequentialGroup()
                                                .addComponent(panel_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)
                                                .addComponent(labelIdentification))
                                        .addGroup(panel_identificationLayout.createSequentialGroup()
                                                .addContainerGap(261, Short.MAX_VALUE)
                                                .addGroup(panel_identificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        //.addComponent(jButtonChangerLangue, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                                        .addComponent(labelIdentifiant)
                                                        .addComponent(txtidentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonChangerLangue, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_erreurIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(panel_identificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelMdp)
                                        .addComponent(verifierMdp)
                                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtmdp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_erreur_mdp, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                        )

        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(panel_identification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panel_identification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    /**
     * Check mdp
     */
    private void verifierMdpActionPerformed(java.awt.event.ActionEvent evt) {

        if (verifierMdp.isSelected()) {
            txtmdp.setEchoChar((char) 0);
        } else {
            txtmdp.setEchoChar('*');
        }
    }

    /**
     * Méthode pour changer de langue renvoyant au login
     */
    private void jButtonChangerLangueActionPerformed(java.awt.event.ActionEvent evt) {
        //UI_Anglais.Login;
        // TODO add your handling code here:
    }

    /**
     * Méthode connectant à la bd pour accéder au reste du logiciel
     */
    private void loginActionPerformed() {
        NF.Acces_BD bd = new Acces_BD();
        Connection connexion = bd.connexion;


        try {
            Connexion nouvelle_connexion = new Connexion(Integer.parseInt(txtidentifiant.getText()), String.valueOf(txtmdp.getPassword()));
            boolean connexion_autorisee = nouvelle_connexion.autorisation_de_connexion();

            if (connexion_autorisee) {
                label_erreurIdentifiant.setText("Connecté");
                label_erreurIdentifiant.setForeground(Color.BLUE);
                label_erreur_mdp.setText("Connecté");
                label_erreur_mdp.setForeground(Color.BLUE);
                timer1.start();
                /**
                 * Requete permettant d'être redirigé vers l'interface adéquate pour
                 * chaque utilisateur suivant son métier
                 */
                PreparedStatement user;
                user = connexion.prepareStatement("SELECT metier FROM utilisateur WHERE id_user = ?");
                int id = Integer.parseInt(txtidentifiant.getText());
                user.setInt(1, id);
                ResultSet type_User = user.executeQuery();
                while (type_User.next()) {
                    String metier_user = type_User.getString("metier");
                    if (metier_user.equals("MEDECIN")) {
                        PreparedStatement med;
                        med = connexion.prepareStatement("SELECT nom, prenom FROM medecin WHERE id_medecin = ?");
                        med.setInt(1, id);
                        ResultSet medQuery = med.executeQuery();
                        while (medQuery.next()) {
                            String nom = medQuery.getString("nom");
                            String prenom = medQuery.getString("prenom");
                            objet_Courant = new ObjetCourant(new Medecin(id, nom, prenom), connexion);
                        }
                        new Acceuil_Radiologue(objet_Courant).setVisible(true); //ouvre la fenetre l'accueil radiologue
                        this.dispose(); //ferme la fenetre de login
                    } else {
                        if (type_User.getString("metier").equals("MANIPULATEUR_RADIO")) {
                            PreparedStatement man;
                            man = connexion.prepareStatement("SELECT nom, prenom FROM manipulateur_radio WHERE id = ?");
                            man.setInt(1, id);
                            ResultSet medQuery = man.executeQuery();
                            while (medQuery.next()) {
                                System.out.println("A");
                                String nom = medQuery.getString("nom");
                                String prenom = medQuery.getString("prenom");
                                objet_Courant = new ObjetCourant(new Manipulateur_radio(id, nom, prenom), connexion);
                            }
                            new Acceuil_ManipRadio(objet_Courant).setVisible(true);
                            this.dispose();
                        } else {
                            if (type_User.getString("metier").equals("SECRETAIRE_MEDICALE")) {
                                PreparedStatement sec;
                                sec = connexion.prepareStatement("SELECT nom, prenom FROM secretaire_medicale WHERE id = ?");
                                sec.setInt(1, id);
                                ResultSet medQuery = sec.executeQuery();
                                while (medQuery.next()) {
                                    String nom = medQuery.getString("nom");
                                    String prenom = medQuery.getString("prenom");
                                    objet_Courant = new ObjetCourant(new Secretaire_medicale(id, nom, prenom), connexion);
                                }
                                new Acceuil_Sec(objet_Courant).setVisible(true);
                                this.dispose();
                            }
                        }
                    }
                }
            } else if (!nouvelle_connexion.isId_ok()) {
                label_erreurIdentifiant.setText("Erreur dans l'identifiant");
                label_erreurIdentifiant.setForeground(Color.RED);
            } else {
                label_erreur_mdp.setText("Erreur dans le mot de passe");
                label_erreur_mdp.setForeground(Color.RED);
            }

        } catch (Exception e) {
            e.printStackTrace();
            connexion = null;
        }
        /*catch (SQLException ex){
         Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
         }*/
        if (connexion != null) {
            System.out.println("Successfully connected to MySQL database test");
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });

    }

}
