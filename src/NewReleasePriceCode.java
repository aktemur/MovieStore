public class NewReleasePriceCode extends PriceCode {
    @Override
    protected double basePrice() {
        return 0;
    }

    @Override
    protected int extraChargeThreshold() {
        return 0;
    }

    @Override
    protected double extraChargePerDay() {
        return 3;
    }

    @Override
    public int getPoints(int daysRented) {
        return (daysRented > 1)? 2 : 1;
    }
}
