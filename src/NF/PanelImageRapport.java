/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NF;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.RescaleOp;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jean-Loup
 */
public class PanelImageRapport extends JPanel {

    private BufferedImage imgRapport;
    private static BufferedImage original;
    int luminosité;
    int contraste;

    public PanelImageRapport(BufferedImage imgRapport) {
        this.imgRapport = imgRapport;
        this.original = imgRapport;
        /**
         * try { imgRapport = ImageIO.read(new File("/Image/Radio1.jpg")); }
         * catch (IOException ex) {
         * Logger.getLogger(PanelImageRapport.class.getName()).log(Level.SEVERE,
         * null, ex);
        }
         */
    }

    public void setImage(BufferedImage imageRapport) {
        this.imgRapport = imageRapport;
        repaint();
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        super.paintComponent(g);
        g2.drawImage(this.imgRapport, 0, 0, this.getWidth(), this.getHeight(), null);
    }

    public void inverser_niveaux_de_gris() {
        BufferedImage ajusterGris = new BufferedImage(imgRapport.getWidth(), imgRapport.getHeight(), BufferedImage.TYPE_USHORT_GRAY);
        Graphics2D g1 = ajusterGris.createGraphics();
        g1.drawImage(this.imgRapport, null, null);
        imgRapport = ajusterGris;
        repaint();
    }

    public void setLuminosité(int newLuminosité) {
        luminosité = newLuminosité;

    }
     public void setContraste(int newContraste) {
        contraste = newContraste;

    }

    public void augmenter_luminosite() {
        float offsets = 0f;
        float factors = 0.5f + ((float) luminosité / 100.0f);
        RescaleOp op = new RescaleOp(factors, offsets, null);
        BufferedImage brighter = op.filter(original, null);
        Graphics2D g1 = brighter.createGraphics();
        imgRapport = brighter;
        g1.drawImage(this.imgRapport, null, null);
        repaint();
    }
     public void augmenter_contraste(){
        float offsets = 0.5f + (50*(float) contraste / 100.0f);
        float factors = 1.0f;
        RescaleOp op = new RescaleOp(factors, offsets, null);
        BufferedImage contraste_augmente = op.filter(original, null);
        Graphics2D g1 = contraste_augmente.createGraphics();
        imgRapport = contraste_augmente;
        g1.drawImage(this.imgRapport, null, null);
        repaint();
    }

    public void rotation_ImageD() {
        BufferedImage rotation = new BufferedImage(original.getWidth(), original.getHeight(), original.getType());
        AffineTransform affineRotation = AffineTransform.getRotateInstance(Math.toRadians(90), original.getWidth() / 2, original.getHeight() / 2);
        AffineTransformOp op = new AffineTransformOp(affineRotation, AffineTransformOp.TYPE_BILINEAR);
        op.filter(imgRapport, rotation);
        imgRapport= rotation;
        repaint();
    }

    public void rotation_ImageG() {
        BufferedImage rotation = new BufferedImage(original.getWidth(), original.getHeight(), original.getType());
        AffineTransform affineRotation = AffineTransform.getRotateInstance(Math.toRadians(-90), original.getWidth() / 2, original.getHeight() / 2);
        AffineTransformOp op = new AffineTransformOp(affineRotation, AffineTransformOp.TYPE_BILINEAR);
        op.filter(imgRapport, rotation);
        imgRapport= rotation;

        repaint();
    }

    public void dezoom() { // Dézoomer une image
        BufferedImage imageDezoomee = new BufferedImage((int) (original.getWidth() * 0.5), (int) (original.getHeight() * 0.5), original.getType());
        AffineTransform dezoome = AffineTransform.getScaleInstance(0.5, 0.5);
        int interpolation = AffineTransformOp.TYPE_BICUBIC;
        AffineTransformOp redimensionner = new AffineTransformOp(dezoome, interpolation);
        redimensionner.filter(original, imageDezoomee);
        original = imageDezoomee;
        repaint();
    }

    public void zoom() { // Zoomer une image
        BufferedImage imageZoomee = new BufferedImage((int) (original.getWidth() * 1.5), (int) (original.getHeight() * 1.5), original.getType());
        AffineTransform zoome = AffineTransform.getScaleInstance(1.5, 1.5);
        int interpolation = AffineTransformOp.TYPE_BICUBIC;
        AffineTransformOp redimensionner = new AffineTransformOp(zoome, interpolation);
        redimensionner.filter(original, imageZoomee);
        original = imageZoomee;
        repaint();
    }

    /**public void actualiserImage(){

            int i = slider.getValue();
            BufferedImage img = listeimage.get(i).getImage();
            imagePanel.setImg(img);
            imagePanel.repaint();

        revalidate();


    }*/

}
