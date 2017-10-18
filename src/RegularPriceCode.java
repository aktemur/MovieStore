public class RegularPriceCode extends PriceCode {
    @Override
    protected double basePrice() {
        return 2;
    }

    @Override
    protected int extraChargeThreshold() {
        return 2;
    }

    @Override
    protected double extraChargePerDay() {
        return 1.5;
    }
}
