package n1.models;

public class VegetarianPizzaBuilder implements PizzaBuilder{
    private String size;
    private String dough;
    private String toppings = "Onion, Eggplant, Red Pepper, Zucchini, Black olives";

    @Override
    public VegetarianPizzaBuilder setSize(String optionSize){
        this.size = optionSize;
        return this;
    }

    @Override
    public VegetarianPizzaBuilder setDough(String optionDough){
        this.dough = optionDough;
        return this;
    }


    @Override
    public Pizza build() {
        return new Pizza(this);
    }

    public String getSize() {
        return size;
    }

    public String getDough() {
        return dough;
    }

    public String getToppings() {
        return toppings;
    }
}