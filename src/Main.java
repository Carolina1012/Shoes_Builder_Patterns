import builder.ShoeBuilder;
import classes.Shoe;
import director.ShoeBuilderDirector;

public class Main {
    public static void main(String[] args) {
        Shoe shoe;
        ShoeBuilderDirector shoeBuilderDirector = new ShoeBuilderDirector();
        ShoeBuilder shoeBuilder = new ShoeBuilder();
        ShoeBuilderDirector.buildLacesShoe(shoeBuilder);
        shoe = shoeBuilder.getShoe();
        System.out.println("Shoe built: " + shoe.getShoeType());
    }
}