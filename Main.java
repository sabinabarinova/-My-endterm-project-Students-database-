import Facade.FacadeDessert;
import Factory.DeliveryFactory;
import Factory.IDelivery;
import Observer.Bakery;
import Observer.Customer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bakery bakery = new Bakery();

        Customer customer1 = new Customer();
        Customer customer2 = new Customer("Malika");
        Customer customer3 = new Customer("Sabina");

        //Register constant customers for subscription
        bakery.registerObserver(customer2);
        customer2.CustomerOfBakery(bakery);
        bakery.registerObserver(customer3);
        customer3.CustomerOfBakery(bakery);

        System.out.println("***   Welcome to our bakery! If you are ready to make an order, then:   ***");
        System.out.print("Enter your name: \n");
        //create a new customer
        String CustomerName = scan.next();
        customer1.setName(CustomerName);
        System.out.println("What would you like to order? \n Cake - 1 \n Cupcakes - 2");
        int dessertType = scan.nextInt();
        System.out.println("What taste do you want? \n Vanilla - 1 \n Chocolate - 2");
        int dessertTaste = scan.nextInt();
        System.out.println("Do you want any extra decorations? (berries or candy) \n Yes - 1 \n No - 2");
        int isDecorated = scan.nextInt();
        int decorator = 0;
        if (isDecorated == 1) {
            System.out.println("What kind of decorations you want? \n Berry - 1 \n Candy - 2 \n Candy&Berry - 3");
            decorator = scan.nextInt();
        }

        IDelivery deliveryType = null;
        DeliveryFactory deliveryFactory = new DeliveryFactory();

        System.out.println("What is the delivery type? \n Tax - 1 \n Pickup - 2");
        int deliveryDecision = scan.nextInt();

        System.out.println("Do you want to pay by credit card or cash? \n Credit card - 1 \n Cash - 2");
        int paymentDecision = scan.nextInt();

        deliveryType = deliveryFactory.getDelivery(deliveryDecision);

        System.out.println("--------------------------******-------------------------------");
        System.out.println("Let's sum up your order....");

        FacadeDessert order = new FacadeDessert();

        if (dessertType == 1) {
            order.FacadeCake(dessertTaste, decorator, deliveryType);
            order.createOrderCake(paymentDecision);
        } else {
            order.FacadeCupcake(dessertTaste, decorator, deliveryType);
            order.createOrderCupcake(paymentDecision);
        }
        deliveryType.delivery();

        //Bakery added a new offer for its customers
        bakery.newOffer("There is -10% on cupcakes after 6pm on weekdays. Hurry up!");

        System.out.println("--------------------------******-------------------------------");

        System.out.println("Do you want to subscribe our Bakery to know about the latest offers? \n Yes - 1 \n No - 2");
        int newSubscribe = scan.nextInt();
        if (newSubscribe == 1) {
            bakery.registerObserver(customer1);
            customer1.CustomerOfBakery(bakery);
            System.out.println("You subscribed successfully");
        } else if (newSubscribe == 2) {
            System.out.println("Thank you for your order!");
            return;
        }

        //Bakery subscription
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Bakery is notifying subscribed customers...");
        bakery.notifyObservers();
        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("Dear Customer! You can always unsubscribe. Do you want to stay and get updates? \n Yes - 1 \n No - 2");
        int checkSubscription = scan.nextInt();
        scan.nextLine();
        if (checkSubscription == 1) {
            System.out.println("We are glad to have you as a part of our family!");
        } else if (checkSubscription == 2) {
            System.out.println("Enter your name to unsubscribe: \n");
            String UnsubscriberName = scan.nextLine();
            if (bakery.FindByName(UnsubscriberName) == null) {
                System.out.println("Your name is not in our database");
            } else {
                bakery.removeObserver(bakery.FindByName(UnsubscriberName));
                System.out.println("You unsubscribed successfully.");
            }
        }

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Bakery is checking its subscribed customers...");
        bakery.getAllCustomers();
        System.out.println("--------------------------------------------------------------------------------");

    }
}

