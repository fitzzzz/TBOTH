package lang.david.android.ihm.polytech.tboth.model.data;

import android.media.Image;

import com.google.android.gms.maps.model.LatLng;

import java.net.URL;

/**
 * Created by DavidLANG on 01/05/2017.
 */

public class Magasin {
    private int idImage;
    private String nom;
    private String adresse;
    private boolean selectionne;
    private LatLng latLng;

    public Magasin(int idImage, String nom, String adresse, LatLng latLng) {
        this.idImage = idImage;
        this.nom = nom;
        this.adresse = adresse;
        this.selectionne = false;
        this.latLng = latLng;
    }

    public LatLng getLatLng() {
        return latLng;
    }

    public boolean isSelectionne() {
        return selectionne;
    }

    public void setSelectionne(boolean selectionne) {
        this.selectionne = selectionne;
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
