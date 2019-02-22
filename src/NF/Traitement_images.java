package NF;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.RescaleOp;

public class Traitement_images {

    private Image image; //a voir commment on stocke ça, c'est provisoire
    private JLabel c; //à remplacer

    /**
     * constructeur qui demande une image
     */
    public Traitement_images(Image image) {
        this.image = image;
    }


    //constructeur temporaire sans images pour créa rapport contraste et toutes les autres fonctionnalités
    public Traitement_images() {
    }

    /**
     * fonction qui permet l'inversion des gris
     */
    public void inverser_niveaux_de_gris(){
        //fonction a creer
        BufferedImage imageTest = null;
        BufferedImage ajusterGris = new BufferedImage(imageTest.getWidth(), imageTest.getHeight(), BufferedImage.TYPE_USHORT_GRAY);
        Graphics2D g1 = ajusterGris.createGraphics();
        g1.drawImage(this.image, null, null);
        image = ajusterGris;
        c.repaint();
    }

    /**
     * fonction qui permet l'augmentation de luminosité
     * factors multiplie la matrice de base (multiplie les pixels 1 à 1), offsets ajoute aux pixels
     */
    public static void augmenter_luminosite(BufferedImage image, JLabel c ){
        float[] offsets = new float[]{
                0f, 0f, 0f, 0f};
        float[] factors = new float[]{
                0.0f, 0.0f, 0.0f, 0.0f};
        //float factors = 1.0f + ((float) luminosité/100.0f) seule valeur pour remplacer au dessus si pb

        //luminosité = slider.get(value) retourne la valeur en int
        //

        //slider : quand on le construit on lui donne un min (0), un max (100), valeur de départ (50)
        //changelistener
        RescaleOp op = new RescaleOp(factors, offsets, null);
        BufferedImage brighter = op.filter(image, null);
        c.setIcon(new ImageIcon(brighter));
    }

    /**
     * fonction qui permet la diminution de luminosité
     */
    public static void diminuer_luminosite(BufferedImage image, JLabel c ){
        c.setIcon(new ImageIcon(image));
    }

    /**
     * fonction qui permet l'augmentation contraste
     */
    public void augmenter_contraste(BufferedImage image, JLabel c){
        float[] offsets = new float[]{
                0.0f, 0.0f, 0.0f, 0.0f};
        float[] factors = new float[]{
                1.4f, 1.4f, 1.4f, 1.4f};
        RescaleOp op = new RescaleOp(factors, offsets, null);
        BufferedImage contraste_augmente = op.filter(image, null);
        c.setIcon(new ImageIcon(contraste_augmente));
    }

    /**
     * fonction qui permet la diminution de luminosité
     */
    public void diminuer_contraste(BufferedImage image, JLabel c){
        float[] offsets = new float[]{
                0.0f, 0.0f, 0.0f, 0.0f};
        float[] factors = new float[]{
                0.5f, 0.5f, 0.5f, 0.5f};
        RescaleOp op = new RescaleOp(factors, offsets, null);
        BufferedImage contraste_diminue = op.filter(image, null);
        c.setIcon(new ImageIcon(contraste_diminue));
    }

    /**
     * fonction qui permet la rotation de l'image à droite
     */
    public void rotation_ImageD( double degree, ImageObserver o){
        ImageIcon icon = new ImageIcon(this.image);
        BufferedImage rotationImage = new BufferedImage(icon.getIconWidth(), icon.getIconWidth(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = (Graphics2D)rotationImage.getGraphics();
        g2.rotate(Math.toRadians(90), icon.getIconWidth()/2, icon.getIconHeight()/2);
        g2.drawImage(this.image,0,0, o);
        this.image = rotationImage;
    }

    /**
     * fonction qui permet la rotation de l'image à gauche
     */
    public void rotation_ImageG( double degree, ImageObserver o){
        ImageIcon icon = new ImageIcon(this.image);
        BufferedImage rotationImage = new BufferedImage(icon.getIconWidth(), icon.getIconWidth(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = (Graphics2D)rotationImage.getGraphics();
        //changement de rotation -90 degrées
        g2.rotate(Math.toRadians(-90), icon.getIconWidth()/2, icon.getIconHeight()/2);
        g2.drawImage(this.image,0,0, o);
        this.image = rotationImage;
    }

}
