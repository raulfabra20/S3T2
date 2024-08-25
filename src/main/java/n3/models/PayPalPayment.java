package n3.models;

public class PayPalPayment implements PaymentMethod{
    private String mail;
    private String password;

    public PayPalPayment(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }


    @Override
    public void processPayment() {
        System.out.println("Payment processed. Check the receipt on the mail account: "+mail);
    }
}
