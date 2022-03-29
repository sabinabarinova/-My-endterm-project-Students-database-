package Strategy;

import Strategy.Payment;

public class PaymentStrategy {

    private Payment payment;

    public PaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }

    public void paymentAmount(int amount) {
        payment.pay(amount);
    }
}
