    package NF;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Il faut dcm4che pour faire marcher ce code
 * dcm4che contient les méthodes permettant d'utiliser les attributs et créer le DICOM
 * import org.dcm4che2.data.BasicDicomObject;
 * import org.dcm4che2.data.DicomObject;
 * import org.dcm4che3.data.*;
 * import org.dcm4che3.io.DicomOutputStream;
 */



/**
 * dcm4che3 est open source et téléchargeable sur github
 */
public class DICOM {

    /**
     * fonction qui permet d'avoir une image au format DICOM à partir d'une image JPEG
     * Il faut donc comme paramètre un JPEG en entrée, un DICOM en sortie, la date de l'examen et son type,
     * le médecin et le patient concernés.
     */

/**
    public void CreateDICOMFromJPEG (File fileEntrée, File fileSortie, Date dateExamen, Type_examen typeExamen, String medecin, String compteRendu,
                             String patient, String genre, String dateDeNaissance, int IDPatient) throws Exception{
        try {
            BufferedImage jpeg = ImageIO.read(fileEntrée);
            if (jpeg == null) {
                throw new Exception("Conversion impossible, fichier à convertir non conforme.");
            }

            //En premier on récupére les attributs
            Attributes att = new Attributes();
            att.setString(Tag.SpecificCharacterSet, VR.CS, "ISO_IR 100");
            att.setString(Tag.PhotometricInterpretation, VR.CS, "RGB");
            att.setInt(Tag.SamplesPerPixel, VR.US, 3);
            att.setInt(Tag.Rows, VR.US, jpeg.getHeight());
            att.setInt(Tag.Columns, VR.US, jpeg.getWidth());
            att.setInt(Tag.BitsAllocated, VR.US, 8);  //allocation de 8 bits par pixel
            att.setInt(Tag.BitsStored, VR.US, 8);
            att.setInt(Tag.HighBit, VR.US, 7);
            att.setInt(Tag.PixelRepresentation, VR.US, 0);
            att.setString(Tag.ImageType, VR.CS, "ORIGINAL\\PRIMARY");
            att.setString(Tag.SOPClassUID, VR.UI, "1.2.840.10008.5.1.4.1.1.7");
            att.setInt(Tag.PlanarConfiguration, VR.US, 0);

            att.setString(Tag.StudyDate, VR.DA, date);
            att.setString(Tag.SeriesDate, VR.DA, date);
            att.setString(Tag.AcquisitionDate, VR.DA, dateExamen);
            att.setString(Tag.AccessionNumber, VR.SH, "LienVersPacs");
            att.setString(Tag.Modality, VR.CS, typeExamen);
            att.setString(Tag.ConversionType, VR.CS, "WSD");
            att.setString(Tag.OperatorsName, VR.CS, medecin);
            att.setString(Tag.ResultsComments, VR.CS, compteRendu);

            att.setString(Tag.PatientName, VR.PN, patient);
            att.setString(Tag.PatientID, VR.LO, String.valueOf(IDPatient));
            att.setString(Tag.PatientBirthDate, VR.DA, dateDeNaissance);
            att.setString(Tag.PatientSex, VR.CS, genre);
            att.setString(Tag.StudyID, VR.IS, "1");
            att.setString(Tag.AcquisitionNumber, VR.IS, "1");
            att.setString(Tag.InstanceNumber, VR.IS, "1");

            //Après les attributs, des méta données sont crées
            Attributes fmi = new Attributes();
            fmi.setString(Tag.FileMetaInformationVersion, VR.OB, "1");
            fmi.setString(Tag.TransferSyntaxUID, VR.UI, "1.2.840.10008.1.2.1");
            fmi.setString(Tag.ImplementationVersionName, VR.SH, "DCM4CHE3");

            // Création du DICOM (sans image)
            DicomOutputStream dmc = new DicomOutputStream(fileSortie);
            dmc.writeDataset(fmi, att);

            //Création d'un tableau de byte pouvant stocker une image
            byte[] image = new byte[jpeg.getHeight() * jpeg.getWidth() * 3];

            //Le tableau est vide, on le remplit pour stocker l'image jpeg dedans (en rouge, bleu, vert)
            int a = 0;
            for (int j = 0; j < jpeg.getHeight(); j++) {
                for (int i = 0; i < jpeg.getWidth(); i++) {
                    byte col = (byte) (jpeg.getRGB(i, j) & 255);
                    image[a++] = col;
                    image[a++] = col;
                    image[a++] = col;
                }
            }

            //Ajout de l'image au DICOM
            dmc.writeAttribute(Tag.PixelData, VR.OW, image);
            dmc.writeHeader(Tag.SequenceDelimitationItem, null, 0);

            //Fermeture du fichier DICOM : on ajoute plus rien
            dmc.close();

        } catch (Exception e) { // si il y a une exception

            e.printStackTrace();
        }

    }*/

}