package n1.models;

public interface PizzaBuilder {
   public PizzaBuilder  setSize(String optionSize);
   public PizzaBuilder setDough(String optionDough);
   Pizza build();

   String getSize();
   String getDough();
   String getToppings();
}
