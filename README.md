    This project represents Bakery application, which customer can use to make an order.
    Bakery has cakes and cupcakes in asertment, also there are twp tastes of desserts: vanilla and chocolate.
    Customer can decorate desserts with berry, candy or both of them.
    Customer can can pay online in advance, and is able to inform if he/she will get order by themselves or send a car.
    Bakery offers customer subscription to get notifications about special offers.

Patterns that were used in this project:
1) Bridge
2) Decorator
3) Facade
4) Observer
5) Strategy
6) Factory

Bridge pattern is applied as following:
Bakery has two different types of bakings: cakes and cupcakes; has two tastes: vanilla and chocolate.
Customer can combine them and create dessert that he/she wants.
Classes that were used: Cake.java, Cupcake.java, VanillaTaste.java, ChocolateTaste.java, abstract class Dessert.java,
interface DessertTastes.java.

Decorator pattern is applied as following:
Bakery offers customers to decorate dessert either with berries, candies or both. Price of the dessert changes
according to these decorations.
Classes that were used: Cake.java, Cupcake.java, ExtraBerry.java, ExtraCandy.java, abstract class DessertDecorator
and interface DessertInterface.java.

Facade pattern is applied as following:
FacadeDessert simplifies our main class during creation of final order, because according to choice of customer
to decorate dessert or not we create twp different instances of desserts: Dessert object or DessertDecorator object.
In FacadeDessert.java we have all types of both classes and according to the choice of customer FacadeDessert.java
creates and returns us particular object.

Observer pattern is applied as following:
After making an order customer is offered to get subscription to get messages about all the new special offers
of Bakery. Also, if customer is subscriber he/she can unsubscribe and not get any notification further.
Classes that were used: Customer.java, Bakery.java, interfaces Subject.java, Observer.java.
