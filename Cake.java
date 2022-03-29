package Bridge;

import Decorator.DessertInterface;

public class Cake extends Dessert implements DessertInterface {
    public Cake(DessertTastes dessertTastes){
        super(dessertTastes);
    }
    @Override
    public void applyTaste() {
        System.out.print("You ordered cake: ");
        dessertTastes.applyTaste();
    }

    @Override
    public String description() {
        return "classic one flavored cake; ";
    }

    @Override
    public int price() {
        return 4000;
    }
}
