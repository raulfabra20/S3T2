package n3.models;

public class PaymentGateway {

    public void executePayment(PaymentMethod paymentMethod){
        paymentMethod.processPayment();
    }
}
