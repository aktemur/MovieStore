public abstract class PriceCode {
    public final double getPrice(int daysRented) {
        double amount = basePrice();
        if (daysRented > extraChargeThreshold())
            amount += (daysRented - extraChargeThreshold()) * extraChargePerDay();
        return amount;
    }

    protected abstract double basePrice();

    protected abstract int extraChargeThreshold();

    protected abstract double extraChargePerDay();

    public int getPoints(int daysRented) {
        return 1;
    }
}
