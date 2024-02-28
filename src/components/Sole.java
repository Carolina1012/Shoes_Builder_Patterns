package components;

import enums.SoleMaterial;

public class Sole {
    private SoleMaterial soleMaterial;
    private boolean waterproof;
    private boolean breathable;
    private boolean flexible;
    private boolean durable;

    public Sole(SoleMaterial soleMaterial, boolean waterproof, boolean breathable, boolean flexible, boolean durable) {
        this.soleMaterial = soleMaterial;
        this.waterproof = waterproof;
        this.breathable = breathable;
        this.flexible = flexible;
        this.durable = durable;
    }

    public SoleMaterial getSoleMaterial() {
        return soleMaterial;
    }

    public void setSoleMaterial(SoleMaterial soleMaterial) {
        this.soleMaterial = soleMaterial;
    }

    public boolean isWaterproof() {
        return waterproof;
    }

    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }

    public boolean isBreathable() {
        return breathable;
    }

    public void setBreathable(boolean breathable) {
        this.breathable = breathable;
    }

    public boolean isFlexible() {
        return flexible;
    }

    public void setFlexible(boolean flexible) {
        this.flexible = flexible;
    }

    public boolean isDurable() {
        return durable;
    }

    public void setDurable(boolean durable) {
        this.durable = durable;
    }
}
