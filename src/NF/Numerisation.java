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


    /**
     * constructeur qui demande une image, le numérisateur, l'examen associé et une annotation
     */
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


    /**
     * @return the image
     */
    public Image getImage() {
        return this.image;
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
