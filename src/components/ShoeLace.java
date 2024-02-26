package components;

import enums.LaceColor;
import enums.LaceType;

public class ShoeLace {

    private LaceColor laceColor;
    private LaceType laceType;
    private boolean hasLaces;

    public ShoeLace(LaceColor laceColor, LaceType laceType, boolean laces) {
        this.laceColor = laceColor;
        this.laceType = laceType;
        this.hasLaces = laces;
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
    public boolean isHasLaces() {
        return hasLaces;
    }

    public void setHasLaces(boolean hasLaces) {
        this.hasLaces = hasLaces;
    }
}
