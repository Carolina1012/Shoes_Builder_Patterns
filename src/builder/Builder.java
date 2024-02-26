package builder;

import classes.Shoe;
import components.Cover;
import components.ShoeHeel;
import components.ShoeLace;
import components.ShoeTongue;
import enums.Material;
import enums.ShoeType;

public interface Builder {
    void setShoeType(ShoeType shoeType);
    void setMaterial(Material material);
    void setCover(Cover cover);
    void setShoeHeel(ShoeHeel shoeHeel);
    void setShoeTongue(ShoeTongue shoeTongue);

    void setShoeLace(ShoeLace shoeLace);

    Shoe getShoe();
}
