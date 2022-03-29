package Facade;

import Bridge.*;
import Decorator.DessertDecorator;
import Decorator.ExtraBerry;
import Decorator.ExtraCandy;
import Factory.IDelivery;
import Strategy.Payment;
import Strategy.PaymentByCash;
import Strategy.PaymentByCreditCard;
import Strategy.PaymentStrategy;

public class FacadeDessert {
    private Dessert cake;
    private Dessert cupcake;
    private DessertDecorator decoratedCake;
    private DessertDecorator decoratedCupcake;
    private IDelivery delivery;
    private PaymentStrategy paymentStrategy;
    Payment creditCard = new PaymentByCreditCard();
    Payment cash = new PaymentByCash();

    public void createOrderCake(int paymentDecision){
        if (paymentDecision == 1) {
            if(getCake()!=null){
                getCake().applyTaste();
                if(decoratedCake!=null){
                    System.out.println(getDecoratedCake().description());
                    paymentStrategy = new PaymentStrategy(creditCard);
                    paymentStrategy.paymentAmount(getDecoratedCake().price() + delivery.getPrice());
                    return;
                }
                System.out.println(getCake().description());
                paymentStrategy = new PaymentStrategy(creditCard);
                paymentStrategy.paymentAmount(getCake().price() + delivery.getPrice());
            }
        }
        else if (paymentDecision == 2) {
            if(getCake()!=null){
                getCake().applyTaste();
                if(decoratedCake!=null){
                    System.out.println(getDecoratedCake().description());
                    paymentStrategy = new PaymentStrategy(cash);
                    paymentStrategy.paymentAmount(getDecoratedCake().price() + delivery.getPrice());
                    return;
                }
                System.out.println(getCake().description());
                paymentStrategy = new PaymentStrategy(cash);
                paymentStrategy.paymentAmount(getCake().price() + delivery.getPrice());
            }
        }



    }
    public void createOrderCupcake(int paymentDecision){
        if (paymentDecision == 1) {
            if(getCupcake()!=null){
                getCupcake().applyTaste();
                if(decoratedCupcake!=null){
                    System.out.println(getDecoratedCupcake().description());
                    paymentStrategy = new PaymentStrategy(creditCard);
                    paymentStrategy.paymentAmount(getDecoratedCupcake().price() + delivery.getPrice());
                    return;
                }
                System.out.println(getCupcake().description());
                paymentStrategy = new PaymentStrategy(creditCard);
                paymentStrategy.paymentAmount(getCupcake().price() + delivery.getPrice());
            }
        }
        else if (paymentDecision == 2) {
            if(getCupcake()!=null){
                getCupcake().applyTaste();
                if(decoratedCupcake!=null){
                    System.out.println(getDecoratedCupcake().description());
                    paymentStrategy = new PaymentStrategy(cash);
                    paymentStrategy.paymentAmount(getDecoratedCupcake().price() + delivery.getPrice());
                    return;
                }
                System.out.println(getCupcake().description());
                paymentStrategy = new PaymentStrategy(cash);
                paymentStrategy.paymentAmount(getCupcake().price() + delivery.getPrice());
            }
        }


    }

    public FacadeDessert(){
        this.cake = new Cake(null);
        this.cupcake = new Cupcake(null);
    }


    public void FacadeCake(int taste, int decorator, IDelivery delivery) {
        if (taste == 1) {
            cake = new Cake(new VanillaTaste());
        } else {
            cake = new Cake(new ChocolateTaste());
        }

        if(decorator!=0){
            if(decorator==1){
                decoratedCake = new ExtraBerry(this.cake);
            } else if(decorator==2){
                decoratedCake = new ExtraCandy(this.cake);
            } else if(decorator==3){
                decoratedCake = new ExtraBerry(new ExtraCandy(this.cake));
            }
        }

        this.delivery = delivery;
    }

    public void FacadeCupcake(int taste, int decorator, IDelivery delivery) {
        if (taste == 1) {
            cupcake = new Cupcake(new VanillaTaste());
        } else {
            cupcake = new Cupcake(new ChocolateTaste());
        }

        if(decorator!=0){
            if(decorator==1){
                decoratedCupcake = new ExtraBerry(this.cupcake);
            } else if(decorator==2){
                decoratedCupcake = new ExtraCandy(this.cupcake);
            } else if(decorator==3){
                decoratedCupcake = new ExtraBerry(new ExtraCandy(this.cupcake));
            }
        }

        this.delivery = delivery;
    }


    public Dessert getCake() {
        return cake;
    }

    public Dessert getCupcake() {
        return cupcake;
    }

    public DessertDecorator getDecoratedCake() {
        return decoratedCake;
    }

    public DessertDecorator getDecoratedCupcake() {
        return decoratedCupcake;
    }

}