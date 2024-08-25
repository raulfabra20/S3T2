package n1.models;

public interface PizzaBuilder<T> {
   public PizzaBuilder<T>  setSize(String optionSize);
   public PizzaBuilder<T> setDough(String optionDough);
   T build();

   String getSize();
   String getDough();
   String getToppings();
}
