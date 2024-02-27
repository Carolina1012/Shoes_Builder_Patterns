package builder;

import classes.Shoe;
import components.Cover;
import components.ShoeHeel;
import components.ShoeTongue;
import enums.Material;
import enums.ShoeType;
import enums.PadMaterial;

public interface Builder {
    void setShoeType(ShoeType shoeType);
    void setMaterial(Material material);
    void setCover(Cover cover);
    void setShoeHeel(ShoeHeel shoeHeel);
    void setShoeTongue(ShoeTongue shoeTongue);
    void setPadMaterial(PadMaterial padMaterial);

    Shoe getShoe();
}
