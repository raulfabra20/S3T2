package n1.models;

public class Pizza {
    private final String size;
    private final String dough;
    private final String toppings;

    protected Pizza(PizzaBuilder builder) {
        this.size = builder.getSize();
        this.dough = builder.getDough();
        this.toppings = builder.getToppings();
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

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", dough='" + dough + '\'' +
                ", toppings='" + toppings + '\'' +
                '}';
    }

}
