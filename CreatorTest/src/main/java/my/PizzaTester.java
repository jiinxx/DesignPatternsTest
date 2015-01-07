package my;

/**
 * Created by urban on 2015-01-07.
 */
public class PizzaTester {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza);
    }
}
