package director;

import builder.Builder;
import components.Cover;
import components.ShoeHeel;
import components.ShoeTongue;
import enums.Material;
import enums.ShoeType;

public class ShoeBuilderDirector {
    public static void buildLacesShoe(Builder builder) {
        builder.setShoeType(ShoeType.LACES_SHOE);
        builder.setMaterial(Material.MESH);
        builder.setCover(new Cover(true, Material.SYNTHETIC_MATERIAL));
        builder.setShoeHeel(new ShoeHeel(Material.MESH, 6, false));
        builder.setShoeTongue(new ShoeTongue(true,false,Material.MESH));
    }

    public void buildHeelsShoe (Builder builder) {
        builder.setShoeType(ShoeType.HEELS_SHOE);
        builder.setMaterial(Material.LEATHER);
        builder.setCover(new Cover(false, Material.NONE));
        builder.setShoeHeel(new ShoeHeel(Material.LEATHER, 10, true));
        builder.setShoeTongue(new ShoeTongue(false, false,Material.NONE));
    }

    public void buildErgonomicPadShoe (Builder builder) {
        builder.setShoeType(ShoeType.ERGONOMIC_SHOE);
        builder.setMaterial(Material.SYNTHETIC_MATERIAL);
        builder.setCover(new Cover(true, Material.SYNTHETIC_MATERIAL));
        builder.setShoeHeel(new ShoeHeel(Material.SYNTHETIC_MATERIAL, 5, false));
        builder.setShoeTongue(new ShoeTongue(true, false,Material.SYNTHETIC_MATERIAL));
    }

    public void buildVelcroShoe (Builder builder) {
        builder.setShoeType(ShoeType.VELCRO_SHOE);
        builder.setMaterial(Material.COATED_FABRIC);
        builder.setCover(new Cover(true, Material.SYNTHETIC_MATERIAL));
        builder.setShoeHeel(new ShoeHeel(Material.COATED_FABRIC, 6, false));
        builder.setShoeTongue(new ShoeTongue(true, false,Material.COATED_FABRIC));
    }
}
