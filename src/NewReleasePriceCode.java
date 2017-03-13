public class NewReleasePriceCode extends PriceCode {
    @Override
    public double getPrice(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int getPoints(int daysRented) {
        return (daysRented > 1)? 2 : 1;
    }
}
