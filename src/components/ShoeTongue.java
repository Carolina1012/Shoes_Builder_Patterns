package components;

import enums.Material;

public class ShoeTongue {
    private boolean haveTongue;
    private boolean isRemovable;
    private Material material;

    public ShoeTongue(boolean haveTongue, boolean isRemovable, Material material) {
        this.haveTongue = haveTongue;
        this.isRemovable = isRemovable;
        this.material = material;
    }

    public boolean isHaveTongue() {
        return haveTongue;
    }

    public void setHaveTongue(boolean haveTongue) {
        this.haveTongue = haveTongue;
    }

    public void haveTongue() {
        isRemovable = true;
    }

    public void haveNotTongue() {
        isRemovable = false;
    }

    public boolean isRemovable() {
        return isRemovable;
    }

    public void setRemovable(boolean removable) {
        isRemovable = removable;
    }

    public void removable() {
        isRemovable = true;
    }

    public void notRemovable() {
        isRemovable = false;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

}
