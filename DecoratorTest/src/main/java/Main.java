/**
 * Created by urban on 2014-12-26.
 */
public class Main {
    public static void main(String[] args) {
        Beverage espresso = new Mocha(new Espresso());
        System.out.println(espresso.cost());

    }
}
