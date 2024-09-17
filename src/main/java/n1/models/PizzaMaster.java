package n1.models;

public class PizzaMaster {
    private final PizzaBuilder pizzaBuilder;

    public PizzaMaster(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza makePizza(){
        return pizzaBuilder.build();
    }
}
