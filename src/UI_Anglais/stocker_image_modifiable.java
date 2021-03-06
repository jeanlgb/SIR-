/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Anglais;

/**
 *
 * @author porral
 */

import NF.Acces_BD;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class stocker_image_modifiable extends JFrame {

    // Variables declaration - do not modify
    private String s;
    private JScrollPane ScrollPane_description;
    private JButton button_ajouter;
    private JButton button_fichier;
    private JLabel label_ID;
    private JLabel label_description;
    private JLabel label_image;
    private JLabel label_nom;
    private JPanel panel_stocker_image;
    private JTextField txt_ID;
    private JTextArea txt_description;
    private JTextField txt_nom;
    // End of variables declaration
    /**
     * Creates new form stockerImage
     */
    public stocker_image_modifiable() {
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

        panel_stocker_image = new JPanel();
        button_ajouter = new JButton();
        button_fichier = new JButton();
        txt_nom = new JTextField();
        label_nom = new JLabel();
        label_ID = new JLabel();
        txt_ID = new JTextField();
        label_description = new JLabel();
        ScrollPane_description = new JScrollPane();
        txt_description = new JTextArea();
        label_image = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panel_stocker_image.setBackground(new java.awt.Color(163, 209, 180));

        button_ajouter.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        button_ajouter.setText("Add");
        button_ajouter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                button_ajouterActionPerformed(evt);
            }
        });

        button_fichier.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        button_fichier.setText("File");
        button_fichier.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                button_fichierActionPerformed(evt);
            }
        });

        txt_nom.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        label_nom.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        label_nom.setText("Name :");

        label_ID.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        label_ID.setText("ID :");

        txt_ID.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        label_description.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        label_description.setText("Description :");

        txt_description.setColumns(20);
        txt_description.setRows(5);
        ScrollPane_description.setViewportView(txt_description);

        GroupLayout panel_stocker_imageLayout = new GroupLayout(panel_stocker_image);
        panel_stocker_image.setLayout(panel_stocker_imageLayout);
        panel_stocker_imageLayout.setHorizontalGroup(
            panel_stocker_imageLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panel_stocker_imageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_image, GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panel_stocker_imageLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(button_ajouter, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_stocker_imageLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(ScrollPane_description, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 401, GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel_stocker_imageLayout.createSequentialGroup()
                            .addGroup(panel_stocker_imageLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(label_nom, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_ID, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
                            .addGap(27, 27, 27)
                            .addGroup(panel_stocker_imageLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(txt_ID, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel_stocker_imageLayout.createSequentialGroup()
                                    .addComponent(txt_nom, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button_fichier))))
                        .addComponent(label_description, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        panel_stocker_imageLayout.setVerticalGroup(
            panel_stocker_imageLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panel_stocker_imageLayout.createSequentialGroup()
                .addGroup(panel_stocker_imageLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(panel_stocker_imageLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(panel_stocker_imageLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_nom)))
                    .addGroup(panel_stocker_imageLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(button_fichier, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(panel_stocker_imageLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_ID))
                .addGap(45, 45, 45)
                .addComponent(label_description)
                .addGap(18, 18, 18)
                .addComponent(ScrollPane_description, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addComponent(button_ajouter, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(panel_stocker_imageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_image, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panel_stocker_image, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panel_stocker_image, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void button_ajouterActionPerformed(ActionEvent evt) {
        //Connection con = null;
        //String s = "com.mysql.cj.jdbc.Driver";
        try{
               //Class.forName(s);
            Acces_BD acces_BD = new Acces_BD();
            Connection connexion = acces_BD.connexion;
            //String s = "com.mysql.cj.jdbc.Driver";
            PreparedStatement ps = connexion.prepareStatement("insert into pacs(numero_archive,mention,description,image) values(?,?,?,?)");
            InputStream is = new FileInputStream(new File(s));
               ps.setString(1, txt_ID.getText());
               ps.setString(2, txt_nom.getText());
               ps.setString(3, txt_description.getText());
               ps.setBlob(4,is);
               ps.executeUpdate();
               JOptionPane.showMessageDialog(null, "Recorded image");
           }catch(Exception ex){
               ex.printStackTrace();
                   }
        }

    private void button_fichierActionPerformed(ActionEvent evt) {
        JFileChooser fileChooser = new JFileChooser();
         fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
         FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
         fileChooser.addChoosableFileFilter(filter);
         int result = fileChooser.showSaveDialog(null);
         if(result == JFileChooser.APPROVE_OPTION){
             File selectedFile = fileChooser.getSelectedFile();
             String path = selectedFile.getAbsolutePath();
             label_image.setIcon(ResizeImage(path));
             s = path;
              }
         else if(result == JFileChooser.CANCEL_OPTION){
             System.out.println("No image");
         }

    }

     public ImageIcon ResizeImage(String imgPath){
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(label_image.getWidth(), label_image.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(stocker_image_modifiable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stocker_image_modifiable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stocker_image_modifiable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stocker_image_modifiable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stocker_image_modifiable().setVisible(true);
            }
        });
    }
                     
}


