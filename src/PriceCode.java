public abstract class PriceCode {
    public abstract double getPrice(int daysRented);

    public int getPoints(int daysRented) {
        return 1;
    }
}
