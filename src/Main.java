import builder.ShoeBuilder;
import classes.Shoe;
import director.ShoeBuilderDirector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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