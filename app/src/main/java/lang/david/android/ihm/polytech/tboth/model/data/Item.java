package lang.david.android.ihm.polytech.tboth.model.data;

/**
 * Created by DavidLANG on 01/05/2017.
 */

public class Item {
    private ItemType type;
    private String nom;
    private String description;
    private String imageURL;

    public Item(ItemType type, String nom, String description, String imageURL) {
        this.type = type;
        this.nom = nom;
        this.description = description;
        this.imageURL = imageURL;
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

    public String getImageURL() {
        return imageURL;
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

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
