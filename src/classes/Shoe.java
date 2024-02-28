package classes;


import components.*;
import enums.*;

public class Shoe {
    private ShoeType shoeType;
    private Material material;
    private Cover cover;
    private ShoeHeel shoeHeel;
    private ShoeTongue shoeTongue;
    private PadMaterial padMaterial;
    private Sole sole;


    private ShoeLace shoeLace;
    private LaceColor laceColor;
    private LaceType laceType;

    public Shoe(ShoeType shoeType, Material material, Cover cover, ShoeHeel shoeHeel, ShoeTongue shoeTongue, ShoeLace shoeLace, LaceColor laceColor, LaceType laceType, Sole sole, PadMaterial padMaterial) {
        this.shoeType = shoeType;
        this.material = material;
        this.cover = cover;
        this.shoeHeel = shoeHeel;
        this.shoeTongue = shoeTongue;
        this.shoeLace = shoeLace;
        this.laceColor = laceColor;
        this.laceType = laceType;
        this.padMaterial = padMaterial;
        this.sole = sole;
    }

    public ShoeType getShoeType() {
        return shoeType;
    }

    public void setShoeType(ShoeType shoeType) {
        this.shoeType = shoeType;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    public ShoeHeel getShoeHeel() {
        return shoeHeel;
    }

    public void setShoeHeel(ShoeHeel shoeHeel) {
        this.shoeHeel = shoeHeel;
    }

    public ShoeTongue getShoeTongue() {
        return shoeTongue;
    }

    public void setShoeTongue(ShoeTongue shoeTongue) {
        this.shoeTongue = shoeTongue;
    }


    public ShoeLace getShoeLace() {
        return shoeLace;
    }

    public void setShoeLace(ShoeLace shoeLace) {
        this.shoeLace = shoeLace;
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

    public void setPadMaterial(PadMaterial padMaterial) {
        this.padMaterial = padMaterial;
    }

    public Sole getSole() {
        return sole;
    }

    public void setSole(Sole sole) {
        this.sole = sole;
    }

    public void descriptiveTicket() {
        System.out.println("\u001B[35mDescriptive Ticket\u001B[0m");
        System.out.println("\u001B[34mShoe Type: " + "[" + shoeType + "]");
        System.out.println("\u001B[34mMaterial: " + "[" + material + "]");
        System.out.println("\u001B[34mCover:");
        System.out.println("\u001B[33mWith Cover: " + "[" + cover.isWithCover() + "]");
        System.out.println("\u001B[33mCover Material: " + "[" + cover.getMaterial() + "]");
        System.out.println("\u001B[34mHeel:");
        System.out.println("\u001B[33mHeel Material: " + "[" + shoeHeel.getMaterial() + "]");
        System.out.println("\u001B[33mHeel Height: " + "[" + shoeHeel.getHeight() + " cm" + "]");
        System.out.println("\u001B[33mWith Strip: " + "[" + shoeHeel.isWithStrip() + "]");
        System.out.println("\u001B[34mTongue:");
        System.out.println("\u001B[33mHave tongue: " + "[" + shoeTongue.isHaveTongue() + "]");
        System.out.println("\u001B[33mIt is Removable: " + "[" + shoeTongue.isRemovable() + "]");
        System.out.println("\u001B[33mTongue Material: " + "[" + shoeTongue.getMaterial() + "]");
        System.out.println("\u001B[34mLace:");
        System.out.println("\u001B[33mLace Color: " + "[" + shoeLace.getLaceColor() + "]");
        System.out.println("\u001B[33mLace Type: " + "[" + shoeLace.getLaceType() + "]");
        System.out.println("\u001B[33mWith Laces: " + "[" + shoeLace.isHasLaces() + "]");
        System.out.println("\u001B[34mPad Material: " + "[" + padMaterial.name() + "]");
        System.out.println("\u001B[34mSole:");
        System.out.println("\u001B[33mSole Material: " + "[" + sole.getSoleMaterial() + "]");
        System.out.println("\u001B[33mWater Proof: " + "[" + sole.isWaterproof() + "]");
        System.out.println("\u001B[33mBreatheble: " + "[" + sole.isBreathable() + "]");
        System.out.println("\u001B[33mFlexible: " + "[" + sole.isFlexible() + "]");
        System.out.println("\u001B[33mDurable: " + "[" + sole.isDurable() + "]");


    }

}
