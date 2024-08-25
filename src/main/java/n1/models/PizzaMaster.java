package n1.models;

public class PizzaMaster {
    private final PizzaBuilder<Pizza> pizzaBuilder;

    public PizzaMaster(PizzaBuilder<Pizza> pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza makePizza(){
        return pizzaBuilder.build();
    }
}
