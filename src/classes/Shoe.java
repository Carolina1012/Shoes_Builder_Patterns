package classes;


import components.Cover;
import components.ShoeHeel;
import components.ShoeLace;
import components.ShoeTongue;
import enums.LaceColor;
import enums.LaceType;
import components.Sole;
import enums.Material;
import enums.ShoeType;
import enums.PadMaterial;

public class Shoe {
    private ShoeType shoeType;
    private Material material;
    private Cover cover;
    private ShoeHeel shoeHeel;
    private ShoeTongue shoeTongue;
    private PadMaterial padMaterial;
    private Sole sole;


    private ShoeLace shoeLace;
    private LaceColor laceColor;
    private LaceType laceType;

    public Shoe(ShoeType shoeType, Material material, Cover cover, ShoeHeel shoeHeel, ShoeTongue shoeTongue, ShoeLace shoeLace, LaceColor laceColor, LaceType laceType, Sole sole, PadMaterial padMaterial) {
        this.shoeType = shoeType;
        this.material = material;
        this.cover = cover;
        this.shoeHeel = shoeHeel;
        this.shoeTongue = shoeTongue;
        this.shoeLace = shoeLace;
        this.laceColor = laceColor;
        this.laceType = laceType;
        this.padMaterial = padMaterial;
        this.sole = sole;
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


    public ShoeLace getShoeLace() {
        return shoeLace;
    }

    public void setShoeLace(ShoeLace shoeLace) {
        this.shoeLace = shoeLace;
    }

    public LaceColor getLaceColor() {
        return laceColor;
    }

    public void setLaceColor(LaceColor laceColor) {
        this.laceColor = laceColor;
    }

    public LaceType getLaceType() {
        return laceType;
    }

    public void setLaceType(LaceType laceType) {
        this.laceType = laceType;
    }

    public void setPadMaterial(PadMaterial padMaterial) {
        this.padMaterial = padMaterial;
    }
    public Sole getSole() { return sole; }

    public void setSole(Sole sole) { this.sole = sole; }

}
