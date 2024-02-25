import builder.ShoesBuilder;
import classes.Shoes;
import director.ShoesBuilderDirector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shoes shoes;
        ShoesBuilderDirector shoesBuilderDirector = new ShoesBuilderDirector();
        ShoesBuilder shoesBuilder = new ShoesBuilder();
        ShoesBuilderDirector.buildLacesShoes(shoesBuilder);
        shoes = shoesBuilder.getShoes();
        System.out.println("Shoes built: " + shoes.getShoeType());
    }
}