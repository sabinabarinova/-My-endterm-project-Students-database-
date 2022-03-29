package Observer;

import java.util.ArrayList;
import java.util.List;

public class Bakery implements Subject {
    private final List<Observer> customers;
    private String offer;

    public Bakery(){
        customers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.customers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.customers.remove(o);
    }

    public Observer FindByName(String name) {
        for(Observer o: customers){
            if(o.getName().equals(name)){
                return o;
            }
        }
        return null;
    }

    @Override
    public void newOffer(String offer){
        this.offer = offer;
    }

    public String getOffer() {
        return offer;
    }

    @Override
    public void notifyObservers() {
        for (Observer user:customers) {
            user.update();
        }
    }
    public void getAllCustomers(){
        for (Observer o : customers){
            System.out.println(o.getName());
        }
    }
}
