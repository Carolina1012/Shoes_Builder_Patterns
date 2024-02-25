package builder;

import classes.Shoes;
import components.Cover;
import components.ShoeHeel;
import components.ShoeTongue;
import enums.Material;
import enums.ShoeType;

public interface Builder {
    void setShoeType(ShoeType shoeType);
    void setMaterial(Material material);
    void setCover(Cover cover);
    void setShoeHeel(ShoeHeel shoeHeel);
    void setShoeTongue(ShoeTongue shoeTongue);

    Shoes getShoes();
}
