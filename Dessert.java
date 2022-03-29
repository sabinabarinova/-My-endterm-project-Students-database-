package Bridge;

import Decorator.DessertInterface;

public abstract class Dessert implements DessertInterface {
    protected DessertTastes dessertTastes;

    public Dessert(DessertTastes dessertTastes){
        this.dessertTastes=dessertTastes;
    }
    abstract public void applyTaste();

}
