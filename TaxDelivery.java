package Factory;

public class TaxDelivery implements IDelivery{
    @Override
    public void delivery() {
        System.out.println("Tax Delivery");
    }

    @Override
    public int getPrice() {
        return 1000;
    }
}
