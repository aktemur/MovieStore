public class ChildrensPriceCode extends PriceCode {
    @Override
    protected double basePrice() {
        return 1.5;
    }

    @Override
    protected int extraChargeThreshold() {
        return 3;
    }

    @Override
    protected double extraChargePerDay() {
        return 1.5;
    }
}
