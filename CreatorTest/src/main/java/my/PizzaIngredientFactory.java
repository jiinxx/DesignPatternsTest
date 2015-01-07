package my;


import headfirst.designpatterns.factory.pizzaaf.*;


public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPeperoni();
    Clams createClams();

}
