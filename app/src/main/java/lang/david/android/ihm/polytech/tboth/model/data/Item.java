package lang.david.android.ihm.polytech.tboth.model.data;

/**
 * Created by DavidLANG on 01/05/2017.
 */

public class Item {
    private ItemType type;
    private String nom;
    private String description;
    private int idImage;

    public Item(ItemType type, String nom, String description, int idImage) {
        this.type = type;
        this.nom = nom;
        this.description = description;
        this.idImage = idImage;
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
