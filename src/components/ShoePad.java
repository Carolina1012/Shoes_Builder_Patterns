package components;

import enums.PadMaterial;
public class ShoePad {
    private PadMaterial padMaterial;
    private boolean AntiSlip;
    private boolean Universal;
    private boolean Washable;
    private boolean AnatomicShape;
    private boolean MemoryFoam;

    public  ShoePad(PadMaterial padMaterial, boolean AntiSlip, boolean Universal, boolean Washable, boolean AnatomicShape, boolean MemoryFoam) {
        this.padMaterial = padMaterial;
        this.AntiSlip = AntiSlip;
        this.Universal = Universal;
        this.Washable = Washable;
        this.AnatomicShape = AnatomicShape;
        this.MemoryFoam = MemoryFoam;
    }


    public PadMaterial getPadMaterial() {
        return padMaterial;
    }

    public void setPadMaterial(PadMaterial padMaterial) {
        this.padMaterial = padMaterial;
    }

    public boolean isAntiSlip() {
        return AntiSlip;
    }

    public void setAntiSlip(boolean antiSlip) {
        AntiSlip = antiSlip;
    }

    public boolean isUniversal() {
        return Universal;
    }

    public void setUniversal(boolean universal) {
        Universal = universal;
    }

    public boolean isWashable() {
        return Washable;
    }

    public void setWashable(boolean washable) {
        Washable = washable;
    }

    public boolean isAnatomicShape() {
        return AnatomicShape;
    }

    public void setAnatomicShape(boolean anatomicShape) {
        AnatomicShape = anatomicShape;
    }

    public boolean isMemoryFoam() {
        return MemoryFoam;
    }

    public void setMemoryFoam(boolean memoryFoam) {
        MemoryFoam = memoryFoam;
    }
}
