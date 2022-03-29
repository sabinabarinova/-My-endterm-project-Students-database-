package Decorator;

import Decorator.DessertInterface;

public class ExtraBerry extends DessertDecorator{
    public ExtraBerry(DessertInterface dessertDecorator) {
        super(dessertDecorator);
    }
    @Override
    public String description(){
        return super.description()+" with strawberries and blueberries;";
    }
    @Override
    public int price(){
        return super.price()+500;
    }
}
