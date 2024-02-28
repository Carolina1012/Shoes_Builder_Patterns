package components;

import enums.Material;

public class Cover {
    private boolean withCover;
    private Material material;

    public Cover(boolean withCover, Material material) {
        this.withCover = withCover;
        this.material = material;
    }

    public boolean isWithCover() {
        return withCover;
    }

    public void setWithCover(boolean withCover) {
        this.withCover = withCover;
    }

    public void withCover() {
        withCover = true;
    }

    public void withoutCover() {
        withCover = false;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
