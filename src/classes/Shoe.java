package classes;


import components.Cover;
import components.ShoeHeel;
import components.ShoeTongue;
import enums.Material;
import enums.ShoeType;

public class Shoe {
    private ShoeType shoeType;
    private Material material;
    private Cover cover;
    private ShoeHeel shoeHeel;
    private ShoeTongue shoeTongue;

    public Shoe(ShoeType shoeType, Material material, Cover cover, ShoeHeel shoeHeel, ShoeTongue shoeTongue) {
        this.shoeType = shoeType;
        this.material = material;
        this.cover = cover;
        this.shoeHeel = shoeHeel;
        this.shoeTongue = shoeTongue;
    }

    public ShoeType getShoeType() {
        return shoeType;
    }

    public void setShoeType(ShoeType shoeType) {
        this.shoeType = shoeType;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    public ShoeHeel getShoeHeel() {
        return shoeHeel;
    }

    public void setShoeHeel(ShoeHeel shoeHeel) {
        this.shoeHeel = shoeHeel;
    }

    public ShoeTongue getShoeTongue() {
        return shoeTongue;
    }

    public void setShoeTongue(ShoeTongue shoeTongue) {
        this.shoeTongue = shoeTongue;
    }
}
