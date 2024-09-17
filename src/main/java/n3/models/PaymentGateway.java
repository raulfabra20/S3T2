package n3.models;

public class PaymentGateway {

    public void executePayment(PaymentMethod paymentMethod){
        System.out.println("Processing the payment.");
        paymentMethod.processPayment();
    }
}
