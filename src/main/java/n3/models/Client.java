package n3.models;

import java.util.ArrayList;

public class Client {

    private ArrayList<Product> products;

    public Client() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public void getNameProducts(){
        System.out.println("Product/s added to the cart: ");
        products.forEach(p -> System.out.println(p.getName()));
    }

    public void getPriceProducts(){
       int totalPrice = 0;
        for(Product  product : products){
            totalPrice += product.getPrice();
        }
        System.out.println("Total price : "+totalPrice+" €");
    }
}
