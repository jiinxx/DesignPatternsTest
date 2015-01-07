package my;

/**
 * Created by urban on 2015-01-07.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory  ingredientFactory = new NyPizzaIngredientFactory();
        if(item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("CheesePizza NY-style");
        }
        return pizza;
    }
}
