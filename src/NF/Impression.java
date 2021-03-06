package NF;

import java.util.Vector;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.RenderingHints;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JTextArea;

/**
 *
 * @author Caminade Tom, Gaillard-Blancard Jean-Loup, Leclerc-Tracy Maud, Porral Olivia
 */

public class Impression implements Printable {

    private JTextArea panel;
    private Vector nombrePages;
    private String documentTitle;
    private boolean showPrintZone;
    private boolean fitIntoPage;
    private boolean wrapComponent;
    private PageFormat pageFormat;
    private PrinterJob printJob;

    public static final int PORTRAIT = 1;
    public static final int LANDSCAPE = 0;

    /**
     * Constructeur qui demande un panel JTextArea
     */
    public Impression(JTextArea panel) {

        documentTitle = "";
        this.panel = panel;
        initPrintablePanel();
    }

    /**
     * fonction qui initialise le panel
     */
    public void initPrintablePanel() {

        showPrintZone = false;
        fitIntoPage = false;
        wrapComponent = false;
        printJob = PrinterJob.getPrinterJob();
        pageFormat = printJob.defaultPage();
        pageFormat.setOrientation(1);
    }


    public void setOrientation(int orientation) { pageFormat.setOrientation(orientation); }

    public void setPrintZoneVisible(boolean status) { showPrintZone = status; }

    public void setWrapComponent(boolean status) { wrapComponent = status; }

    public void setFitIntoPage(boolean status) { fitIntoPage = status; }

// Retourne les données nécessaires à la création de la page : marge, largeur
    public int getPageWidth() { return (int) pageFormat.getImageableWidth(); }


    public double getMarginTop() { return pageFormat.getImageableY(); }


    public double getMarginLeft() { return pageFormat.getImageableX(); }

// Donne une valeur au titre, marge
    public void setLRMargins(int margin) {
        Paper paper = pageFormat.getPaper();
        paper.setImageableArea(paper.getImageableX() - (double) (margin / 2), paper.getImageableY(), paper.getImageableWidth() + (double) (margin / 2), paper.getImageableHeight());
        pageFormat.setPaper(paper);
    }


    public void setTBMargins(int margin) {
        Paper paper = pageFormat.getPaper();
        paper.setImageableArea(paper.getImageableX(), paper.getImageableY() - (double) (margin / 2), paper.getImageableWidth(), paper.getImageableHeight() + (double) (margin / 2));
        pageFormat.setPaper(paper);
    }


    public void setDocumentTitle(String title) {
        documentTitle = title;
    }

    /**
     * fonction qui identifie la taille du panel, les actions précédentes et crée la page pour l'impression (marge, hauteur...)
     */
    public int print(Graphics g, PageFormat pf, int pageIndex)

            throws PrinterException {
        Dimension tailleDoc = panel.getSize();
        double hauteurDoc = tailleDoc.getHeight();
        double hauteurPage = pf.getImageableHeight();
        double largeurDoc = tailleDoc.getWidth();
        double largeurPage = pf.getImageableWidth();
        int totalNombrePages = (int) Math.ceil(hauteurDoc / hauteurPage);
        if (wrapComponent) {
            totalNombrePages = nombrePages.size();
        } else if (fitIntoPage) {
            totalNombrePages = 1;
        }
        double scaleX = largeurPage / largeurDoc;
        double scaleY = hauteurPage / hauteurDoc;
        if (pageIndex >= totalNombrePages) {
            return 1;
        }
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2d.translate(pf.getImageableX(), pf.getImageableY());
        if (fitIntoPage) {
            double ratio = Math.min(scaleX, scaleY);
            g2d.scale(ratio, ratio);
        } else if (wrapComponent) {
            if (pageIndex > 0) {
                g2d.translate(0.0D, -((Double) nombrePages.get(pageIndex - 1)).doubleValue());
            }
        } else {
            g2d.translate(0.0D, (double) (-pageIndex) * hauteurPage);
        }
        panel.paint(g2d);
        if (wrapComponent) {
            double hauteurBlanc = ((Double) nombrePages.get(pageIndex)).doubleValue();
            g2d.setColor(Color.WHITE);
            g2d.fillRect(0, (int) hauteurBlanc, (int) largeurPage, (int) hauteurBlanc + (int) hauteurPage);
        }
        if (wrapComponent) {
            if (pageIndex > 0) {
                g2d.translate(0.0D, ((Double) nombrePages.get(pageIndex - 1)).doubleValue());
            }
        } else {
            g2d.translate(0.0D, (double) pageIndex * hauteurPage);
        }
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("TimesRoman", 2, 10)); // Initialise la police
        g2d.drawString(documentTitle + " - [" + (pageIndex + 1) + "/" + totalNombrePages + "]", 0, (int) pf.getImageableHeight() - 20);
        return 0;
    }

    /**
     * Fonction qui imprime
     */
    public void print() {

        printJob.setPrintable(this, pageFormat);
        try {
            if (printJob.printDialog()) {
                if (wrapComponent) {
                    calculatePages();
                }
                Paper paper = pageFormat.getPaper();
                Paper save = pageFormat.getPaper();
                paper.setImageableArea(paper.getImageableX(), paper.getImageableY(), paper.getWidth() - paper.getImageableX(), paper.getHeight() - paper.getImageableY());
                pageFormat.setPaper(paper);
                printJob.setPrintable((Printable) this, pageFormat);
                printJob.print();
                pageFormat.setPaper(save);
            }
        } catch (PrinterException pe) { //En cas d'erreur lors de la tentative d'impression
            System.out.println("Apparition d'une erreur lors de l'impression du document" + "\n" + toString() + "ne sera pas imprimé");
        }
    }

    /**
     * fonction qui calcule le nombre de page à imprimer par rapport à la taille du panel initial
     */
    private void calculatePages() {

        nombrePages = new Vector();
        double hauteurPage = pageFormat.getImageableHeight();
        double hauteurTotal = 0.0D;
        double hauteurCumul = 0.0D;
        for (int i = 0; i < panel.getComponentCount(); i++) {
            int gridBagInsets = 0;
            if (panel.getLayout() instanceof GridBagLayout) {
                gridBagInsets = ((GridBagLayout) panel.getLayout()).getConstraints(panel.getComponent(i)).insets.bottom + ((GridBagLayout) panel.getLayout()).getConstraints(panel.getComponent(i)).insets.top;
            }
            double hauteurComponent = panel.getComponent(i).getSize().getHeight() + (double) gridBagInsets;
            if (hauteurComponent > hauteurPage) {
                wrapComponent = false;
                return;
            }
            hauteurTotal += hauteurComponent;
            if (hauteurTotal > hauteurPage) {
                hauteurTotal -= hauteurComponent;
                hauteurCumul += hauteurTotal;
                nombrePages.add(new Double(hauteurCumul));
                hauteurTotal = hauteurComponent;
            }
        }

        hauteurCumul += hauteurTotal;
        nombrePages.add(new Double(hauteurCumul));
    }
}