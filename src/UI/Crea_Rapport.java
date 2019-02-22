/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author camin
 */
public class Crea_Rapport extends javax.swing.JFrame {

    /**
     * Creates new form Acceuille_Radiologue
     */
    public Crea_Rapport() {
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

        jLabel15 = new javax.swing.JLabel();
        datelabel = new javax.swing.JLabel();
        JPanel_Base = new javax.swing.JPanel();
        Jpanel_Head = new javax.swing.JPanel();
        jLabel_Logo = new javax.swing.JLabel();
        jPanel_Corps = new javax.swing.JPanel();
        jPanel_InfoPatient = new javax.swing.JPanel();
        jLabel_ID = new javax.swing.JLabel();
        jLabel_Nom = new javax.swing.JLabel();
        jLabel_Prenom = new javax.swing.JLabel();
        jLabel_DDN = new javax.swing.JLabel();
        jLabel_Sexe = new javax.swing.JLabel();
        jLabel_Age = new javax.swing.JLabel();
        jLabel_Adresse = new javax.swing.JLabel();
        idPatient = new javax.swing.JLabel();
        nomPatient = new javax.swing.JLabel();
        prenomPatient = new javax.swing.JLabel();
        dateNaissancePatient = new javax.swing.JLabel();
        sexePatient = new javax.swing.JLabel();
        agePatient = new javax.swing.JLabel();
        adressePatient = new javax.swing.JLabel();
        jPanel_InfoActe = new javax.swing.JPanel();
        jLabel_TypeExam = new javax.swing.JLabel();
        jLabel_Nompract = new javax.swing.JLabel();
        jLabel_Prenompract = new javax.swing.JLabel();
        jLabel_IDpract = new javax.swing.JLabel();
        typeExamen = new javax.swing.JLabel();
        nomPraticien = new javax.swing.JLabel();
        prenomPraticien = new javax.swing.JLabel();
        idPraticien = new javax.swing.JLabel();
        datexam = new javax.swing.JLabel();
        jLabel_LinkWord = new javax.swing.JLabel();
        heurexam = new javax.swing.JLabel();
        jLabel_IDexam = new javax.swing.JLabel();
        idexamen = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        jLabel_Indication = new javax.swing.JLabel();
        jScrollPane_Indication = new javax.swing.JScrollPane();
        jTextPane_Indication = new javax.swing.JTextPane();
        jLabel_Technique = new javax.swing.JLabel();
        jScrollPane_Technique = new javax.swing.JScrollPane();
        jTextPane_Technique = new javax.swing.JTextPane();
        jPanel_Image = new javax.swing.JPanel();
        jComboBox_Image = new javax.swing.JComboBox<>();
        imageRadio = new javax.swing.JLabel();
        jScrollPane_CR = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jSlider2 = new javax.swing.JSlider();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Date : ");

        datelabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        datelabel.setText("Date");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rapport Acte");
        setFocusTraversalPolicyProvider(true);
        setResizable(false);

        JPanel_Base.setBackground(new java.awt.Color(204, 204, 255));
        JPanel_Base.setLayout(new java.awt.BorderLayout());

        Jpanel_Head.setBackground(new java.awt.Color(127, 144, 160));
        Jpanel_Head.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_Logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\camin\\Downloads\\logo MedTechS sans fond(1).PNG")); // NOI18N
        jLabel_Logo.setToolTipText("");

        javax.swing.GroupLayout Jpanel_HeadLayout = new javax.swing.GroupLayout(Jpanel_Head);
        Jpanel_Head.setLayout(Jpanel_HeadLayout);
        Jpanel_HeadLayout.setHorizontalGroup(
            Jpanel_HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel_HeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(624, Short.MAX_VALUE))
        );
        Jpanel_HeadLayout.setVerticalGroup(
            Jpanel_HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel_HeadLayout.createSequentialGroup()
                .addComponent(jLabel_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        JPanel_Base.add(Jpanel_Head, java.awt.BorderLayout.NORTH);
        Jpanel_Head.getAccessibleContext().setAccessibleName("Head_Panel");

        jPanel_Corps.setBackground(new java.awt.Color(163, 209, 180));

        jPanel_InfoPatient.setBackground(new java.awt.Color(127, 144, 160));
        jPanel_InfoPatient.setBorder(javax.swing.BorderFactory.createTitledBorder("Information Patient"));

        jLabel_ID.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel_ID.setText("Identifiant : ");

        jLabel_Nom.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel_Nom.setText("Nom : ");

        jLabel_Prenom.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel_Prenom.setText("Prénom : ");

        jLabel_DDN.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel_DDN.setText("Date de naissance : ");

        jLabel_Sexe.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel_Sexe.setText("Sexe : ");

        jLabel_Age.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel_Age.setText("Age : ");

        jLabel_Adresse.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel_Adresse.setText("Adresse :");

        idPatient.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        idPatient.setText("ID");

        nomPatient.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        nomPatient.setText("Nom");

        prenomPatient.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        prenomPatient.setText("Prenom");

        dateNaissancePatient.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        dateNaissancePatient.setText("Date_nais");

        sexePatient.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        sexePatient.setText("Sexe");

        agePatient.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        agePatient.setText("Age");

        adressePatient.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        adressePatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adressePatient.setText("Adresse");
        adressePatient.setToolTipText("");
        adressePatient.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel_InfoPatientLayout = new javax.swing.GroupLayout(jPanel_InfoPatient);
        jPanel_InfoPatient.setLayout(jPanel_InfoPatientLayout);
        jPanel_InfoPatientLayout.setHorizontalGroup(
            jPanel_InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_InfoPatientLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_InfoPatientLayout.createSequentialGroup()
                        .addGroup(jPanel_InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Prenom)
                            .addComponent(jLabel_Nom)
                            .addComponent(jLabel_ID))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel_InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomPatient)
                            .addComponent(prenomPatient)
                            .addComponent(idPatient)))
                    .addGroup(jPanel_InfoPatientLayout.createSequentialGroup()
                        .addGroup(jPanel_InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_DDN)
                            .addComponent(jLabel_Sexe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sexePatient)
                            .addComponent(dateNaissancePatient))))
                .addGap(25, 25, 25)
                .addGroup(jPanel_InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_InfoPatientLayout.createSequentialGroup()
                        .addComponent(jLabel_Age)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(agePatient))
                    .addGroup(jPanel_InfoPatientLayout.createSequentialGroup()
                        .addGroup(jPanel_InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Adresse)
                            .addComponent(adressePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_InfoPatientLayout.setVerticalGroup(
            jPanel_InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_InfoPatientLayout.createSequentialGroup()
                .addGroup(jPanel_InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ID)
                    .addComponent(idPatient)
                    .addComponent(jLabel_Age)
                    .addComponent(agePatient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Nom)
                    .addComponent(nomPatient)
                    .addComponent(jLabel_Adresse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adressePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_InfoPatientLayout.createSequentialGroup()
                        .addGroup(jPanel_InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Prenom)
                            .addComponent(prenomPatient))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_DDN)
                            .addComponent(dateNaissancePatient))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Sexe)
                            .addComponent(sexePatient)))))
        );

        jPanel_InfoActe.setBackground(new java.awt.Color(127, 144, 160));
        jPanel_InfoActe.setBorder(javax.swing.BorderFactory.createTitledBorder("Information Acte"));
        jPanel_InfoActe.setFocusCycleRoot(true);
        jPanel_InfoActe.setPreferredSize(new java.awt.Dimension(750, 500));

        jLabel_TypeExam.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel_TypeExam.setText("Type Examen : ");

        jLabel_Nompract.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel_Nompract.setText("Nom du Praticien : ");

        jLabel_Prenompract.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel_Prenompract.setText("Prénom du Praticien : ");

        jLabel_IDpract.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel_IDpract.setText("ID du Praticien : ");

        typeExamen.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        typeExamen.setText("Type_Exam");

        nomPraticien.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        nomPraticien.setText("Nom_pract");

        prenomPraticien.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        prenomPraticien.setText("Prenom_pract");

        idPraticien.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        idPraticien.setText("ID_pract");

        datexam.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        datexam.setText("00/00/0000");

        jLabel_LinkWord.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel_LinkWord.setText("à");

        heurexam.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        heurexam.setText("00h00");

        jLabel_IDexam.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel_IDexam.setText("ID examen : ");

        idexamen.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        idexamen.setText("ID examen");

        jLabel_Indication.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel_Indication.setText("Indication :");

        jTextPane_Indication.setEditable(false);
        jTextPane_Indication.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTextPane_Indication.setText("21 ans, surdité de perception moyenne à droite.");
        jScrollPane_Indication.setViewportView(jTextPane_Indication);

        jLabel_Technique.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel_Technique.setText("Technique");

        jTextPane_Technique.setEditable(false);
        jTextPane_Technique.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTextPane_Technique.setText("Examen réalisé selon un mode hélical sur l’ensemble des deux pyramides pétreuses en coupe infra millimétrique avec reconstructions dans le plan orbito méatal et coronal centrées sur chacune des deux oreilles.");
        jScrollPane_Technique.setViewportView(jTextPane_Technique);

        javax.swing.GroupLayout jPanel_InfoActeLayout = new javax.swing.GroupLayout(jPanel_InfoActe);
        jPanel_InfoActe.setLayout(jPanel_InfoActeLayout);
        jPanel_InfoActeLayout.setHorizontalGroup(
            jPanel_InfoActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_InfoActeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_InfoActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane_Indication)
                    .addComponent(jScrollPane_Technique, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel_InfoActeLayout.createSequentialGroup()
                        .addGroup(jPanel_InfoActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Indication)
                            .addGroup(jPanel_InfoActeLayout.createSequentialGroup()
                                .addComponent(jLabel_TypeExam)
                                .addGap(57, 57, 57)
                                .addComponent(typeExamen))
                            .addGroup(jPanel_InfoActeLayout.createSequentialGroup()
                                .addComponent(jLabel_Nompract)
                                .addGap(32, 32, 32)
                                .addComponent(nomPraticien))
                            .addGroup(jPanel_InfoActeLayout.createSequentialGroup()
                                .addGroup(jPanel_InfoActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Prenompract)
                                    .addComponent(jLabel_IDpract))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel_InfoActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idPraticien)
                                    .addComponent(prenomPraticien)))
                            .addGroup(jPanel_InfoActeLayout.createSequentialGroup()
                                .addComponent(datexam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_LinkWord)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(heurexam)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_IDexam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idexamen))
                            .addComponent(jLabel_Technique))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator)
        );
        jPanel_InfoActeLayout.setVerticalGroup(
            jPanel_InfoActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_InfoActeLayout.createSequentialGroup()
                .addGroup(jPanel_InfoActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_TypeExam)
                    .addComponent(typeExamen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_InfoActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Nompract)
                    .addComponent(nomPraticien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_InfoActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Prenompract)
                    .addComponent(prenomPraticien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_InfoActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_IDpract)
                    .addComponent(idPraticien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_InfoActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datexam)
                    .addComponent(jLabel_LinkWord)
                    .addComponent(heurexam)
                    .addComponent(jLabel_IDexam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idexamen))
                .addGap(11, 11, 11)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Indication)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane_Indication, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_Technique)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane_Technique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jPanel_Image.setBackground(new java.awt.Color(127, 144, 160));
        jPanel_Image.setBorder(javax.swing.BorderFactory.createTitledBorder("Apercu Cliché"));
        jPanel_Image.setPreferredSize(new java.awt.Dimension(350, 500));

        jComboBox_Image.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliché 1", "Item 2", "Item 3", "Item 4" }));

        //ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("/UI/images.png")).getImage().getScaledInstance(402, 490, Image.SCALE_SMOOTH));

        javax.swing.GroupLayout jPanel_ImageLayout = new javax.swing.GroupLayout(jPanel_Image);
        jPanel_Image.setLayout(jPanel_ImageLayout);
        jPanel_ImageLayout.setHorizontalGroup(
            jPanel_ImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ImageLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel_ImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_Image, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel_ImageLayout.setVerticalGroup(
            jPanel_ImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ImageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox_Image, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imageRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane_CR.setViewportView(jTextArea1);

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel20.setText("Rapport :");

        jButton5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton5.setText("Sauvegarder");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton6.setText("Sauvegarde et fermer");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jSlider1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);

        jSlider2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jSlider2.setOrientation(javax.swing.JSlider.VERTICAL);

        jButton2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton2.setText("Rot G");
        jButton2.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setText("Luminosité");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setText("Contraste");

        jButton3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton3.setText("Imprimer ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton4.setText("Rot G");
        jButton4.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel_CorpsLayout = new javax.swing.GroupLayout(jPanel_Corps);
        jPanel_Corps.setLayout(jPanel_CorpsLayout);
        jPanel_CorpsLayout.setHorizontalGroup(
            jPanel_CorpsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CorpsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel_CorpsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CorpsLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel_CorpsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel_CorpsLayout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6))
                            .addComponent(jPanel_InfoActe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                            .addComponent(jPanel_InfoPatient, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane_CR, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(jLabel20))
                .addGap(40, 40, 40)
                .addGroup(jPanel_CorpsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CorpsLayout.createSequentialGroup()
                        .addGroup(jPanel_CorpsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_CorpsLayout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jLabel2))
                            .addGroup(jPanel_CorpsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton3)
                                .addComponent(jPanel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel_CorpsLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );
        jPanel_CorpsLayout.setVerticalGroup(
            jPanel_CorpsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CorpsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel_CorpsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_CorpsLayout.createSequentialGroup()
                        .addComponent(jPanel_InfoPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_InfoActe, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_CorpsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_CorpsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane_CR)
                    .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CorpsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_CorpsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel_CorpsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addGroup(jPanel_CorpsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton6)
                        .addComponent(jButton3)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        JPanel_Base.add(jPanel_Corps, java.awt.BorderLayout.CENTER);

        getContentPane().add(JPanel_Base, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Crea_Rapport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crea_Rapport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crea_Rapport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crea_Rapport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crea_Rapport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel_Base;
    private javax.swing.JPanel Jpanel_Head;
    private javax.swing.JLabel adressePatient;
    private javax.swing.JLabel agePatient;
    private javax.swing.JLabel dateNaissancePatient;
    private javax.swing.JLabel datelabel;
    private javax.swing.JLabel datexam;
    private javax.swing.JLabel heurexam;
    private javax.swing.JLabel idPatient;
    private javax.swing.JLabel idPraticien;
    private javax.swing.JLabel idexamen;
    private javax.swing.JLabel imageRadio;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox_Image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel_Adresse;
    private javax.swing.JLabel jLabel_Age;
    private javax.swing.JLabel jLabel_DDN;
    private javax.swing.JLabel jLabel_ID;
    private javax.swing.JLabel jLabel_IDexam;
    private javax.swing.JLabel jLabel_IDpract;
    private javax.swing.JLabel jLabel_Indication;
    private javax.swing.JLabel jLabel_LinkWord;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JLabel jLabel_Nom;
    private javax.swing.JLabel jLabel_Nompract;
    private javax.swing.JLabel jLabel_Prenom;
    private javax.swing.JLabel jLabel_Prenompract;
    private javax.swing.JLabel jLabel_Sexe;
    private javax.swing.JLabel jLabel_Technique;
    private javax.swing.JLabel jLabel_TypeExam;
    private javax.swing.JPanel jPanel_Corps;
    private javax.swing.JPanel jPanel_Image;
    private javax.swing.JPanel jPanel_InfoActe;
    private javax.swing.JPanel jPanel_InfoPatient;
    private javax.swing.JScrollPane jScrollPane_CR;
    private javax.swing.JScrollPane jScrollPane_Indication;
    private javax.swing.JScrollPane jScrollPane_Technique;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane_Indication;
    private javax.swing.JTextPane jTextPane_Technique;
    private javax.swing.JLabel nomPatient;
    private javax.swing.JLabel nomPraticien;
    private javax.swing.JLabel prenomPatient;
    private javax.swing.JLabel prenomPraticien;
    private javax.swing.JLabel sexePatient;
    private javax.swing.JLabel typeExamen;
    // End of variables declaration//GEN-END:variables
}
