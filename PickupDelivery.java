package Factory;

public class PickupDelivery implements IDelivery{
    @Override
    public void delivery() {
        System.out.println("Pickup delivery");
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
