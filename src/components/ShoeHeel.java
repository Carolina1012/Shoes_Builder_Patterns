package components;

import enums.Material;

public class ShoeHeel {
    private Material material;
    private double height;

    private boolean withStrip;

    public ShoeHeel(Material material, double height, boolean withStrip) {
        this.material = material;
        this.height = height;
        this.withStrip = withStrip;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isWithStrip() {
        return withStrip;
    }

    public void setWithStrip(boolean withStrip) {
        this.withStrip = withStrip;
    }

    public void withStrip() {
        withStrip = true;
    }

    public void withoutStrip() {
        withStrip = false;
    }
}
