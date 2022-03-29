package Strategy;

import Strategy.Payment;

public class PaymentByCash implements Payment {

    @Override
    public void pay(int paymentAmount) {
        System.out.println("Payable amount using Cash: " + paymentAmount);
    }
}
