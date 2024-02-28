package director;

import builder.Builder;
import components.*;
import enums.*;

public class ShoeBuilderDirector {
    public static void buildLacesShoe(Builder builder) {
        builder.setShoeType(ShoeType.LACES_SHOE);
        builder.setMaterial(Material.MESH);
        builder.setCover(new Cover(true, Material.SYNTHETIC_MATERIAL));
        builder.setShoeHeel(new ShoeHeel(Material.MESH, 6, false));
        builder.setShoeTongue(new ShoeTongue(true, false, Material.MESH));
        builder.setShoeLace(new ShoeLace(LaceColor.WHITE, LaceType.SPORT, true));
        builder.setPadMaterial(PadMaterial.GEL_PAD);
        builder.setShoeSole(new Sole(SoleMaterial.LEATHER, true, true, false, false));
    }

    public static void buildHeelsShoe(Builder builder) {
        builder.setShoeType(ShoeType.HEELS_SHOE);
        builder.setMaterial(Material.LEATHER);
        builder.setCover(new Cover(false, Material.NONE));
        builder.setShoeHeel(new ShoeHeel(Material.LEATHER, 10, true));
        builder.setShoeTongue(new ShoeTongue(false, false, Material.NONE));
        builder.setShoeLace(new ShoeLace(LaceColor.NONE, LaceType.NONE, false));
        builder.setPadMaterial(PadMaterial.SILICONE_PAD);
        builder.setShoeSole(new Sole(SoleMaterial.NEOPRENE, true, true, true, true));
    }

    public static void buildErgonomicPadShoe(Builder builder) {
        builder.setShoeType(ShoeType.ERGONOMIC_SHOE);
        builder.setMaterial(Material.SYNTHETIC_MATERIAL);
        builder.setCover(new Cover(true, Material.SYNTHETIC_MATERIAL));
        builder.setShoeHeel(new ShoeHeel(Material.SYNTHETIC_MATERIAL, 5, false));
        builder.setShoeTongue(new ShoeTongue(true, false, Material.SYNTHETIC_MATERIAL));
        builder.setShoeLace(new ShoeLace(LaceColor.BLACK, LaceType.COTTON_FLAT, true));
        builder.setPadMaterial(PadMaterial.GEL_PAD);
        builder.setShoeSole(new Sole(SoleMaterial.ETHYLENE_VINYL_ACETATE, true, true, true, true));

    }

    public static void buildVelcroShoe(Builder builder) {
        builder.setShoeType(ShoeType.VELCRO_SHOE);
        builder.setMaterial(Material.COATED_FABRIC);
        builder.setCover(new Cover(true, Material.SYNTHETIC_MATERIAL));
        builder.setShoeHeel(new ShoeHeel(Material.COATED_FABRIC, 6, false));
        builder.setShoeTongue(new ShoeTongue(true, false, Material.COATED_FABRIC));
        builder.setShoeLace(new ShoeLace(LaceColor.NONE, LaceType.NONE, false));
        builder.setPadMaterial(PadMaterial.SILICONE_PAD);
        builder.setShoeSole(new Sole(SoleMaterial.POLYURETHANE, true, true, true, true));
    }
}
