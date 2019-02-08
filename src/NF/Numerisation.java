package NF;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.RescaleOp;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.io.File;
import java.io.IOException;
import javax.swing.JPanel;
/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral Olivia
 */
public class Numerisation {
private Image image; //a voir commment on stocke ça, c'est provisoire
private Numerisateur numerisateur;
private Examen examen_associe;
private String annotation;
private JLabel c; //à remplacer


    public Numerisation(Image image, Numerisateur numerisateur, Examen examen_associe, String annotation) {
        this.image = image;
        this.numerisateur = numerisateur;
        this.examen_associe = examen_associe;
        this.annotation = annotation;

    }


public void retourner_horizontalement(){
    //fonction a  creer
}
public void retrouner_verticalement(){
    // fonction a creer
}

public static void augmenter_luminosite(BufferedImage image, JLabel c ){
    float[] offsets = new float[]{
            1.4f, 1.4f, 1.4f, 1.4f};
    float[] factors = new float[]{
            0.0f, 0.0f, 0.0f, 0.0f};
    RescaleOp op = new RescaleOp(factors, offsets, null);
    BufferedImage brighter = op.filter(image, null);
    c.setIcon(new ImageIcon(brighter));
    }

public static void diminuer_luminosite(BufferedImage image, JLabel c ){
    c.setIcon(new ImageIcon(image));
}

public void augmenter_contraste(BufferedImage image, JLabel c){
    float[] offsets = new float[]{
            0.0f, 0.0f, 0.0f, 0.0f};
    float[] factors = new float[]{
            1.4f, 1.4f, 1.4f, 1.4f};
    RescaleOp op = new RescaleOp(factors, offsets, null);
    BufferedImage contraste_augmente = op.filter(image, null);
    c.setIcon(new ImageIcon(contraste_augmente));
}

 public void diminuer_contraste(BufferedImage image, JLabel c){
        float[] offsets = new float[]{
                0.0f, 0.0f, 0.0f, 0.0f};
        float[] factors = new float[]{
                0.5f, 0.5f, 0.5f, 0.5f};
        RescaleOp op = new RescaleOp(factors, offsets, null);
        BufferedImage contraste_diminue = op.filter(image, null);
        c.setIcon(new ImageIcon(contraste_diminue));
    }
public void ajuster_niveaux_de_gris(){
    //fonction a creer
        BufferedImage imageTest = null;
        BufferedImage ajusterGris = new BufferedImage(imageTest.getWidth(), imageTest.getHeight(), BufferedImage.TYPE_USHORT_GRAY);
        Graphics2D g1 = ajusterGris.createGraphics();
        g1.drawImage(this.image, null, null);
        image = ajusterGris;
        c.repaint();
    }

    /**
     * @return the image
     */
    public Image getImage() {
        return this.image;
    }


    public void rotation_Image( double degree, ImageObserver o){
        ImageIcon icon = new ImageIcon(this.image);
        BufferedImage rotationImage = new BufferedImage(icon.getIconWidth(), icon.getIconWidth(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = (Graphics2D)rotationImage.getGraphics();
        g2.rotate(Math.toRadians(degree), icon.getIconWidth()/2, icon.getIconHeight()/2);
        g2.drawImage(this.image,0,0, o);
        this.image = rotationImage;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * @return the numerisateur
     */
    public Numerisateur getNumerisateur() {
        return numerisateur;
    }

    /**
     * @param numerisateur the numerisateur to set
     */
    public void setNumerisateur(Numerisateur numerisateur) {
        this.numerisateur = numerisateur;
    }

    /**
     * @return the examen_associe
     */
    public Examen getExamen_associe() {
        return examen_associe;
    }

    /**
     * @param examen_associe the examen_associe to set
     */
    public void setExamen_associe(Examen examen_associe) {
        this.examen_associe = examen_associe;
    }

    /**
     * @return the annotation
     */
    public String getAnnotation() {
        return annotation;
    }

    /**
     * @param annotation the annotation to set
     */
    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }



}
