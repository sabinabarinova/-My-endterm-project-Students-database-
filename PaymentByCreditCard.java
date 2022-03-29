package Strategy;

import Strategy.Payment;

public class PaymentByCreditCard implements Payment {

    @Override
    public void pay(int paymentAmount) {
        double bonus = paymentAmount * 0.05;
        System.out.println("Payable amount using Credit Card: " + paymentAmount + ". Your bonus: " + bonus);
    }
}
