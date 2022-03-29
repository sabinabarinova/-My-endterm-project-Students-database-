package Decorator;

import Decorator.DessertInterface;

public abstract class DessertDecorator implements DessertInterface{
    public DessertInterface dessertDecorator;
    public DessertDecorator(DessertInterface dessertDecorator){
        this.dessertDecorator=dessertDecorator;
    }
    @Override
    public String description(){
        return dessertDecorator.description();
    }
    @Override
    public int price(){
        return dessertDecorator.price();
    }
}
