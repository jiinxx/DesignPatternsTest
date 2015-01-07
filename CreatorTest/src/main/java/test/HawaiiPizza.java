package test;


/**
 * Created by urban on 2015-01-01.
 */
public class HawaiiPizza extends Pizza {

    public HawaiiPizza(HawaiiPizzaFactory hawaiiPizzaFactory) {
        
    }

    public class HawaiiPizzaFactory{

    public HawaiiPizzaFactory withPinapple(){
        return this;
    }

    public void build(){
       // return new HawaiiPizza(this);
    }
}


}
