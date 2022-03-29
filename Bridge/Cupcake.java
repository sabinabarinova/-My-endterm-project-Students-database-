package Bridge;

import Decorator.DessertInterface;

public class Cupcake extends Dessert implements DessertInterface {
    public Cupcake(DessertTastes dessertTastes){
        super(dessertTastes);
    }
    @Override
    public void applyTaste() {
        System.out.print("You ordered cupcakes: ");
        dessertTastes.applyTaste();
    }

    @Override
    public String description() {
        return "classic set with 8 cupcakes; ";
    }

    @Override
    public int price() {
        return 5000;
    }
}
