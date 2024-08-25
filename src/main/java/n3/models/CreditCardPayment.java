package n3.models;

import java.time.LocalDate;

public class CreditCardPayment implements PaymentMethod{
    private String nameOwner;
    private String cardNumber;
    private String expirationDate;
    private int CVV;

    public CreditCardPayment(String nameOwner, String cardNumber, String expirationDate, int CVV) {
        this.nameOwner = nameOwner;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.CVV = CVV;
    }

    @Override
    public void processPayment() {
        System.out.println("Payment processed and authorized by card's owner: "+nameOwner);
    }
}
