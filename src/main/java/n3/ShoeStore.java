package n3;

import n3.models.*;

import java.util.ArrayList;

public class ShoeStore {

    public static void storeApp(){
        ArrayList<Shoe> catalog = new ArrayList<>();
        PaymentGateway paymentGateway = new PaymentGateway();

        Ticket ticket1 = new Ticket();
        Ticket ticket2 = new Ticket();
        Ticket ticket3 = new Ticket();

        Shoe shoe1 = new Shoe("1", "Converse,Black, 42", 60);
        Shoe shoe2 = new Shoe("2", "Adidas, Gezelle, 40", 100);
        Shoe shoe3 = new Shoe("3", "Nike, Uptempo, 39", 150);
        Shoe shoe4 = new Shoe("4", "Nike, Airmax, 40", 90);
        Shoe shoe5 = new Shoe("5", "Buffalo, Black, 42", 170);

        catalog.add(shoe1);
        catalog.add(shoe2);
        catalog.add(shoe3);
        catalog.add(shoe4);
        catalog.add(shoe5);

        //client1 purchase:
        System.out.println("Client 1:");
        ticket1.addProduct(shoe2);
        ticket1.addProduct(shoe5);
        ticket1.addProduct(shoe4);

        ticket1.getNameProducts();
        ticket1.getPriceProducts();
        PaymentMethod bankAccountMethod =
                new BankAccountDebt("123456789", "Rocío Carmona Gutierrez");
        paymentGateway.executePayment(bankAccountMethod);

        //client2 purchase:
        System.out.println("Client 2:");
        ticket2.addProduct(shoe2);
        ticket2.addProduct(shoe3);

        ticket2.getNameProducts();
        ticket2.getPriceProducts();
        PaymentMethod creditCardMethod =
                new CreditCardPayment("Germán Méndez Soler", "4587125689365",
                        "12/27", 874);
        paymentGateway.executePayment(creditCardMethod);

        //client3 purchase:
        System.out.println("Client 3:");
        ticket3.addProduct(shoe1);
        ticket3.addProduct(shoe3);
        ticket3.addProduct(shoe5);

        ticket3.getNameProducts();
        ticket3.getPriceProducts();
        PaymentMethod payPalMethod = new PayPalPayment("123@gmail.com", "123");
        paymentGateway.executePayment(payPalMethod);
    }

}
