package builder;

import classes.Shoe;
import components.Cover;
import components.ShoeHeel;
import components.ShoeTongue;
import enums.Material;
import enums.ShoeType;
import enums.PadMaterial;

public class ShoeBuilder implements Builder  {

        private ShoeType shoeType;
        private Material material;
        private Cover cover;
        private ShoeHeel shoeHeel;
        private ShoeTongue shoeTongue;
        private PadMaterial padMaterial;




        public void setShoeType(ShoeType shoeType) { this.shoeType = shoeType; }

        public void setMaterial(Material material) {this.material = material;}

        @Override
        public void setCover(Cover cover) {
            this.cover = cover;
        }

        @Override
        public void setShoeHeel(ShoeHeel shoeHeel) {
            this.shoeHeel = shoeHeel;
        }

        @Override
        public void setShoeTongue(ShoeTongue shoeTongue) {
            this.shoeTongue = shoeTongue;
        }

        @Override
        public void setPadMaterial(PadMaterial padMaterial) {
            this.padMaterial = padMaterial;
        }

        @Override
        public Shoe getShoe() {
            return new Shoe(this.shoeType, this.material, this.cover, this.shoeHeel, this.shoeTongue);
        }





}

