package Factory;

public class DeliveryFactory {
    public IDelivery getDelivery(int decision){
        IDelivery iDelivery = null;

        switch(decision){
            case 1 -> iDelivery = new TaxDelivery();
            case 2 -> iDelivery = new PickupDelivery();
        }

        return iDelivery;
    }
}
