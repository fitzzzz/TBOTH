package lang.david.android.ihm.polytech.tboth.model.data;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by DavidLANG on 01/05/2017.
 */

public class Item {
    private ItemType type;
    private String nom;
    private String description;
    private int idImage;
    private double prix;
    private boolean selectionne;

    public Item(ItemType type, String nom, String description, int idImage, double price) {
        this.type = type;
        this.nom = nom;
        this.description = description;
        this.idImage = idImage;
        this.prix = price;
        this.selectionne = false;
    }

    public double getPrix() {
        return prix;
    }

    public boolean isSelectionne() {
        return selectionne;
    }

    public void setSelectionne(boolean selectionne) {
        this.selectionne = selectionne;
    }

    public ItemType getType() {
        return type;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public int getIdImage() {
        return idImage;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }
}
