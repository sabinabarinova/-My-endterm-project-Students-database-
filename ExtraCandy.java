package Decorator;

import Decorator.DessertInterface;

public class ExtraCandy extends DessertDecorator{
    public ExtraCandy(DessertInterface dessertDecorator) {
        super(dessertDecorator);
    }

    @Override
    public String description(){
        return dessertDecorator.description()+" with candies and mini chocolates;";
    }
    @Override
    public int price(){
        return dessertDecorator.price()+1000;
    }
}
