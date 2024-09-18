package n3.models;

import java.util.ArrayList;

public class Ticket {

    private ArrayList<Shoe> shoes;

    public Ticket() {
        this.shoes = new ArrayList<>();
    }

    public void addProduct(Shoe shoe){
        shoes.add(shoe);
    }

    public void removeProduct(Shoe shoe){
        shoes.remove(shoe);
    }

    public void getNameProducts(){
        System.out.println("Product/s added to the cart: ");
        shoes.forEach(p -> System.out.println(p.getName()));
    }

    public void getPriceProducts(){
       int totalPrice = 0;
        for(Shoe shoe : shoes){
            totalPrice += shoe.getPrice();
        }
        System.out.println("Total price : "+totalPrice+" €");
    }
}
