package Observer;

public class Customer implements Observer {
    private String name;
    private Subject bakery = new Bakery();

    public Customer(String name){
        this.name=name;
    }
    public Customer() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void CustomerOfBakery(Bakery bakery) {
        this.bakery = bakery;
    }

    @Override
    public void update() {
        System.out.println("Good day, " + name + "!" + " We have new offer for you: " + bakery.getOffer());
    }
}
