package lang.david.android.ihm.polytech.tboth.model.data;

import android.media.Image;

import java.net.URL;

/**
 * Created by DavidLANG on 01/05/2017.
 */

public class Magasin {
    private int idImage;
    private String nom;
    private String adresse;

    public Magasin(int idImage, String nom, String adresse) {
        this.idImage = idImage;
        this.nom = nom;
        this.adresse = adresse;
    }

    public int getIdImage() {
        return idImage;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getImage() {
        return idImage;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setImage(int idImage) {
        this.idImage = idImage;
    }
}
