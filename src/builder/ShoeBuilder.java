package builder;

import classes.Shoe;
import components.*;
import enums.*;

public class ShoeBuilder implements Builder {

    private ShoeType shoeType;
    private Material material;
    private Cover cover;
    private ShoeHeel shoeHeel;
    private ShoeTongue shoeTongue;

    private ShoeLace shoeLace;
    private LaceColor laceColor;
    private LaceType laceType;

    private PadMaterial padMaterial;

    private Sole sole;


    public void setShoeType(ShoeType shoeType) {
        this.shoeType = shoeType;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public void setCover(Cover cover) {
        this.cover = cover;
    }

    @Override
    public void setShoeHeel(ShoeHeel shoeHeel) {
        this.shoeHeel = shoeHeel;
    }

    @Override
    public void setShoeTongue(ShoeTongue shoeTongue) {
        this.shoeTongue = shoeTongue;
    }

    @Override

    public void setShoeLace(ShoeLace shoeLace) {
        this.shoeLace = shoeLace;
    }


//        @Override
//        public Shoe getShoe() {
//                return new Shoe(this.shoeType, this.material, this.cover, this.shoeHeel, this.shoeTongue, this.shoeLace, this.laceColor, this.laceType);
//        }

    public void setPadMaterial(PadMaterial padMaterial) {
        this.padMaterial = padMaterial;
    }

    //        @Override
//        public Shoe getShoe() {
//                        return new Shoe(this.shoeType, this.material, this.cover, this.shoeHeel, this.shoeTongue);
//        }
    public void setShoeSole(Sole sole) {
        this.sole = sole;
    }

    @Override
    public Shoe getShoe() {
        return new Shoe(this.shoeType, this.material, this.cover, this.shoeHeel, this.shoeTongue, this.shoeLace, this.laceColor, this.laceType, this.sole, this.padMaterial);
    }
}

