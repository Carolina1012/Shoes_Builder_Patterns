package builder;

import classes.Shoe;
import components.*;
import enums.Material;
import enums.PadMaterial;
import enums.ShoeType;

public interface Builder {
    void setShoeType(ShoeType shoeType);

    void setMaterial(Material material);

    void setCover(Cover cover);

    void setShoeHeel(ShoeHeel shoeHeel);

    void setShoeTongue(ShoeTongue shoeTongue);

    void setPadMaterial(PadMaterial padMaterial);

    void setShoeSole(Sole sole);

    void setShoeLace(ShoeLace shoeLace);

    Shoe getShoe();
}
