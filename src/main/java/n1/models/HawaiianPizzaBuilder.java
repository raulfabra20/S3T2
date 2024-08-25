package n1.models;

public class HawaiianPizzaBuilder implements PizzaBuilder{
    private String size;
    private String dough;
    private String toppings = "Pineapple, Ham";

    @Override
    public HawaiianPizzaBuilder setSize(String optionSize){
        this.size = optionSize;
        return this;
    }

    @Override
    public HawaiianPizzaBuilder setDough(String optionDough){
        this.dough = optionDough;
        return this;
    }

    @Override
    public Pizza build(){
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
