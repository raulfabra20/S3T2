package n3;

import n3.models.*;

import java.util.ArrayList;

public class ShoeStore {

    public static void storeApp(){
        ArrayList<Product> catalog = new ArrayList<>();
        PaymentGateway paymentGateway = new PaymentGateway();

        Client client1 = new Client();
        Client client2 = new Client();
        Client client3 = new Client();

        Product product1 = new Product("1", "Converse,Black, 42", 60);
        Product product2 = new Product("2", "Adidas, Gezelle, 40", 100);
        Product product3 = new Product("3", "Nike, Uptempo, 39", 150);
        Product product4 = new Product("4", "Nike, Airmax, 40", 90);
        Product product5 = new Product("5", "Buffalo, Black, 42", 170);

        catalog.add(product1);
        catalog.add(product2);
        catalog.add(product3);
        catalog.add(product4);
        catalog.add(product5);

        //client1 purchase:
        System.out.println("Client 1:");
        client1.addProduct(product2);
        client1.addProduct(product5);
        client1.addProduct(product4);

        client1.getNameProducts();
        client1.getPriceProducts();
        PaymentMethod bankAccountMethod =
                new BankAccountDebt("123456789", "Rocío Carmona Gutierrez");
        paymentGateway.executePayment(bankAccountMethod);

        //client2 purchase:
        System.out.println("Client 2:");
        client2.addProduct(product2);
        client2.addProduct(product3);

        client2.getNameProducts();
        client2.getPriceProducts();
        PaymentMethod creditCardMethod =
                new CreditCardPayment("Germán Méndez Soler", "4587125689365",
                        "12/27", 874);
        paymentGateway.executePayment(creditCardMethod);

        //client3 purchase:
        System.out.println("Client 3:");
        client3.addProduct(product1);
        client3.addProduct(product3);
        client3.addProduct(product5);

        client3.getNameProducts();
        client3.getPriceProducts();
        PaymentMethod payPalMethod = new PayPalPayment("123@gmail.com", "123");
        paymentGateway.executePayment(payPalMethod);
    }

}
