/**
 * Created by urban on 2014-12-26.
 */
public class Mocha extends CondimentDecoratori {

    private final Beverage bevarage;

    public Mocha(Beverage beverage) {
        this.bevarage = beverage;
    }

    @Override
    public String getDescription() {
        return bevarage.getDescription() +", Mocha";
    }

    @Override
    public double cost() {
        return .20 + bevarage.cost();
    }
}
